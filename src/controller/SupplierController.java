package controller;

import dao.SupplierDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }      
        
    }
    //--------------------------------------------------------------------------------------------------
}
