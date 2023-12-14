package controller;

import dao.ProductDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import model.Product;
import view.MainView;

/**
 *
 * @author Daniel Casvill
 */
public class ProductController 
{
    private ProductDaoImplementation productDao;
    private MainView view;
    
    
    //--------------------------------------------------------------------------------------------------
    public ProductController(ProductDaoImplementation productDao, MainView view) 
    {        
        this.productDao = productDao;
        this.view = view;
        this.view.setLocationRelativeTo(null);
        
        
        this.view.addBtnSaveProductListener(new ProductListener());
        this.view.addBtnDeleteProductListener(new ProductListener());
        this.view.addBtnListAllProductListener(new ProductListener());
        this.view.addBtnSearchProductListener(new ProductListener());
        this.view.addBtnUpdateProductListener(new ProductListener());
    }
    //--------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------
    
    public boolean addProduct(Product product)
    {
        return productDao.addProduct(product);
    }
    
    //--------------------------------------------------------
    
    public List<Product> getProducts()
    {
        return productDao.getAllProducts();
    }
    
    //--------------------------------------------------------
    
    public Product getProduct(String productId)
    {
        return productDao.getProduct(productId);
    }
    
    //--------------------------------------------------------
    
    public boolean updateProduct(Product product)
    {
        return productDao.updateProduct(product);
    }
    
    //--------------------------------------------------------
    
    public boolean deleteProduct(String productId)
    {
        return productDao.deleteProduct(productId);
    }
    
    //--------------------------------------------------------
    
    //--------------------------------------------------------------------------------------------------
    class ProductListener implements ActionListener
    {
        
        @Override
        public void actionPerformed(ActionEvent e) 
        {
//             //------------------------------------------------------------------------------------
//            if(e.getActionCommand().equalsIgnoreCase("SAVE"))
//            {
//                String id = view.getTextIdProduct();
//                String name = view.getTextNameProduct();
//                String surnames = view.getTextSurnamesSupplier();
//                String phoneNumber = view.getTextPhoneNumberSupplier();
//                
//                if(name.strip().equals("") || surnames.strip().equals("") || id.strip().equals("")|| phoneNumber.strip().equals(""))
//                {
//                    warningMessage("Please fill all the fields.");
//                }
//                
//                else
//                {
//                    Supplier supplier = new Supplier(id, name, surnames, phoneNumber);
//                    boolean add = addSupplier(supplier);
//                    
//                    if(add)
//                    {
//                        infoMessage("Supplier added successfully!", "Supplier Added");                        
//                        view.addRecordSupplier(supplier);
//                        view.cleanSupplierForm();
//                    }
//                    else
//                    {
//                        warningMessage("The supplier with id "+id+" already exist.");
//                    }
//                }
//            }
//             //------------------------------------------------------------------------------------
//             
//             if(e.getActionCommand().equalsIgnoreCase("UPDATE"))
//             {
//                String id = view.getTextIdSupplier();
//                String name = view.getTextNameSupplier();
//                String surnames = view.getTextSurnamesSupplier();
//                String phoneNumber = view.getTextPhoneNumberSupplier();
//                
//                if(name.strip().equals("") || surnames.strip().equals("") || id.strip().equals("")|| phoneNumber.strip().equals(""))
//                {
//                    warningMessage("Please fill all the fields.");
//                }
//                
//                else
//                {
//                    Supplier supplier = new Supplier(id, name, surnames, phoneNumber);
//                    boolean update = updateSupplier(supplier);
//                    
//                    if(update)
//                    {
//                        view.refreshSuppliersTable(supplierDao.getAllSuppliers());
//                        infoMessage("Supplier updated successfully!", "Supplier Updated");
//                        view.cleanSupplierForm();
//                        
//                    }
//                    
//                    else
//                    {
//                        warningMessage("it was not possible to update the supplier");
//                    }
//                }
//             }
//             
//             //------------------------------------------------------------------------------------
//             
//             if(e.getActionCommand().equalsIgnoreCase("LIST ALL"))
//             {
//                 view.refreshSuppliersTable(supplierDao.getAllSuppliers());
//             }
//             
//             //------------------------------------------------------------------------------------
//             
//             if(e.getActionCommand().equalsIgnoreCase("SEARCH"))
//             {
//                 String supplierId = view.getTextSearchSupplier();
//                 
//                 if(supplierId.strip().equals(""))
//                 {
//                     warningMessage("Please write de id of the Supplier you want to search.");
//                 }
//                 
//                 else
//                 {
//                     Supplier supplier = supplierDao.getSupplier(supplierId);
//                     
//                     if(supplier == null)
//                     {
//                         warningMessage("The supplier with id "+supplierId+" was not found.");
//                     }
//                     
//                     else
//                     {
//                        String name = supplier.getName();
//                        String surnames = supplier.getSurnames();
//                        String phoneNumber = supplier.getPhoneNumber();
//                        
//                         view.setTextIdSupplier(supplierId);
//                         view.setTextNameSupplier(name);
//                         view.setTextSurnamesSupplier(surnames);
//                         view.setTextPhoneNumberSupplier(phoneNumber);
//                     }
//                 }                 
//             }
//             
//             //------------------------------------------------------------------------------------
//             
//             if(e.getActionCommand().equalsIgnoreCase("DELETE"))
//             {
//                 String supplierId = view.getTextDeleteSupplier();
//                 
//                 if(supplierId.strip().equals(""))
//                 {
//                     warningMessage("Please write de id of the Supplier you want to delete.");
//                 }
//                 
//                 else
//                 {
//                     boolean delete = supplierDao.deleteSupplier(supplierId);
//                     
//                     if(delete)
//                     {
//                         infoMessage("The supplier with id "+supplierId+" was deleted successfully", "Supplier deleted");
//                         view.refreshSuppliersTable(supplierDao.getAllSuppliers());
//                         view.cleanSupplierForm();
//                     }
//                     
//                     else
//                     {
//                        warningMessage("The supplier with id "+supplierId+" was not found.");
//                     }
//                 }
//             }
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
