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
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        
        this.view.addBtnSaveSupplierListener(new SupplierListener());
        this.view.addBtnDeleteSupplierListener(new SupplierListener());
        this.view.addBtnListAllSupplierListener(new SupplierListener());
        this.view.addBtnSearchSupplierListener(new SupplierListener());
        this.view.addBtnUpdateSupplierListener(new SupplierListener());
        
        this.view.refreshSuppliersTable(getSuppliers());
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
             //------------------------------------------------------------------------------------
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
                        infoMessage("Supplier added successfully!", "Supplier Added");                        
                        view.addRecordSupplier(supplier);
                        view.cleanSupplierForm();
                    }
                    else
                    {
                        warningMessage("The supplier with id "+id+" already exist.");
                    }
                }
            }
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("UPDATE"))
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
                    boolean update = updateSupplier(supplier);
                    
                    if(update)
                    {
                        view.refreshSuppliersTable(getSuppliers());
                        infoMessage("Supplier updated successfully!", "Supplier Updated");
                        view.cleanSupplierForm();
                        view.updateSupplierInComboBox(id, name);
                    }
                    
                    else
                    {
                        warningMessage("it was not possible to update the supplier");
                    }
                }
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("LIST ALL"))
             {
                 view.refreshSuppliersTable(getSuppliers());
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("SEARCH"))
             {
                 String supplierId = view.getTextSearchSupplier();
                 
                 if(supplierId.strip().equals(""))
                 {
                     warningMessage("Please write de id of the Supplier you want to search.");
                 }
                 
                 else
                 {
                     Supplier supplier = getSupplier(supplierId);
                     
                     if(supplier == null)
                     {
                         warningMessage("The supplier with id "+supplierId+" was not found.");
                     }
                     
                     else
                     {
                        String name = supplier.getName();
                        String surnames = supplier.getSurnames();
                        String phoneNumber = supplier.getPhoneNumber();
                        
                         view.setTextIdSupplier(supplierId);
                         view.setTextNameSupplier(name);
                         view.setTextSurnamesSupplier(surnames);
                         view.setTextPhoneNumberSupplier(phoneNumber);
                     }
                 }                 
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("DELETE"))
             {
                 String supplierId = view.getTextDeleteSupplier();
                 
                 if(supplierId.strip().equals(""))
                 {
                     warningMessage("Please write de id of the Supplier you want to delete.");
                 }
                 
                 else
                 {
                     boolean delete = deleteSupplier(supplierId);
                     
                     if(delete)
                     {
                         infoMessage("The supplier with id "+supplierId+" was deleted successfully", "Supplier deleted");
                         view.refreshSuppliersTable(getSuppliers());
                         view.cleanSupplierForm();
                         view.deleteSupplierInComboBox(supplierId);
                     }
                     
                     else
                     {
                        warningMessage("The supplier with id "+supplierId+" was not found.");
                     }
                 }
             }
        }
        
        //------------------------------------------------------------------------------------
        
        public void warningMessage(String text)
        {
            JOptionPane.showMessageDialog(null,text,"warning",JOptionPane.ERROR_MESSAGE);
        }
        
        public void infoMessage(String text,String title)
        {
            JOptionPane.showMessageDialog(null,text,title,JRootPane.INFORMATION_DIALOG);   
        }
        
    }
    //--------------------------------------------------------------------------------------------------
}
