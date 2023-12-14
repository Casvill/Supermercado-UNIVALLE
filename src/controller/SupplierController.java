package controller;

import dao.SupplierDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import model.Supplier;
import view.MainView;

/**
 *
 * @author Daniel Casvill
 */
public class SupplierController 
{
    private SupplierDaoImplementation supplierDao;
    private MainView view;
    
    
    //--------------------------------------------------------------------------------------------------

    public SupplierController(SupplierDaoImplementation supplierDao, MainView view) 
    {
        this.supplierDao = supplierDao;
        this.view = view;
        this.view.setVisible(true);
        
        this.view.addBtnSaveSupplierListener(new SupplierListener());
        this.view.addBtnDeleteSupplierListener(new SupplierListener());
        this.view.addBtnListAllSupplierListener(new SupplierListener());
        this.view.addBtnSearchSupplierListener(new SupplierListener());
        this.view.addBtnUpdateSupplierListener(new SupplierListener());
    }
    //--------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------
    
    public boolean addSupplier(Supplier supplier)
    {
        return supplierDao.addSupplier(supplier);
    }
    
    //--------------------------------------------------------
    
    public List<Supplier> getSuppliers()
    {
        return supplierDao.getAllSuppliers();
    }
    
    //--------------------------------------------------------
    
    public Supplier getSupplier(String supplierId)
    {
        return supplierDao.getSupplier(supplierId);
    }
    
    //--------------------------------------------------------
    
    public boolean updateSupplier(Supplier supplier)
    {
        return supplierDao.updateSupplier(supplier);
    }
    
    //--------------------------------------------------------
    
    public boolean deleteSupplier(String supplierId)
    {
        return supplierDao.deleteSupplier(supplierId);
    }
    
    //--------------------------------------------------------
    
    //--------------------------------------------------------------------------------------------------
    class SupplierListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equalsIgnoreCase("SAVE"))
            {
                String id = view.getTextIdSupplier();
                String name = view.getTextNameSupplier();
                String surnames = view.getTextSurnamesSupplier();
                String phoneNumber = view.getTextPhoneNumberSupplier();
                
                if(name.strip().equals("") || surnames.strip().equals("") || id.strip().equals("")|| phoneNumber.strip().equals(""))
                {
                    warningMessage("Please fill all the fields.");
                }
                
                else
                {
                    Supplier supplier = new Supplier(id, name, surnames, phoneNumber);
                    boolean add = addSupplier(supplier);
                    
                    if(add)
                    {
                        JOptionPane.showMessageDialog(null,"Supplier added successfully!","Supplier Added",JRootPane.INFORMATION_DIALOG);   
                        view.addRecordSupplier(supplier);
                        view.cleanSupplierForm();
                    }
                }
            }
        }
        
        //------------------------------------------------------------------------------------
        
        public void warningMessage(String text)
        {
            JOptionPane.showMessageDialog(null,text,"warning",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    //--------------------------------------------------------------------------------------------------
}
