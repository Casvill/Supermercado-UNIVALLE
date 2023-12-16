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
        
        this.view.refreshProductsTable(getProducts());
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
            //------------------------------------------------------------------------------------
            if(e.getActionCommand().equalsIgnoreCase("SAVE"))
            {
                String id = view.getTextIdProduct();
                String name = view.getTextNameProduct();
                String supplier = view.getTextSupplierProduct();
                String price = view.getTexPriceProduct();
                int quantity = view.getTexQuantityProduct();
                
                int parsedPrice = 0;
                
                try 
                {
                     parsedPrice = Integer.parseInt(price);                    
                } 
                catch (NumberFormatException exception) 
                {                    
                    warningMessage("The price must be a numeric value.");
                    view.setTextPriceProduct(0);
                }
                
                boolean verification = verifyFields(id, name, supplier, price, quantity, parsedPrice);
                                                
                if(verification)
                {
                    Product product = new Product(id, name, supplier, parsedPrice, quantity);
                    boolean add = addProduct(product);
                    
                    if(add)
                    {
                        infoMessage("Product added successfully!", "Product Added");                        
                        view.addRecordProduct(product);
                        view.cleanProductForm();
                    }
                    
                    else
                    {
                        warningMessage("The product with id "+id+" already exist.");
                    }
                }
            }
            //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("UPDATE"))
             {
                String id = view.getTextIdProduct();
                String name = view.getTextNameProduct();
                String supplier = view.getTextSupplierProduct();
                String price = view.getTexPriceProduct();
                int quantity = view.getTexQuantityProduct();
                
                int parsedPrice = 0;
                
                try 
                {
                     parsedPrice = Integer.parseInt(price);                    
                } 
                catch (NumberFormatException exception) 
                {                    
                    warningMessage("The price must be a numeric value.");
                    view.setTextPriceProduct(0);
                }
                
                boolean verification = verifyFields(id, name, supplier, price, quantity, parsedPrice);
                                                
                if(verification)
                {
                    Product product = new Product(id, name, supplier, parsedPrice, quantity);
                    boolean update = updateProduct(product);
                    
                    if(update)
                    {
                        view.refreshProductsTable(getProducts());
                        infoMessage("Product updated successfully!", "Product Updated");
                        view.cleanProductForm();
                        view.updateProductInComboBox(id, name);
                    }
                    
                    else
                    {
                        warningMessage("it was not possible to update the product");
                    }
                }
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("LIST ALL"))
             {
                 view.refreshProductsTable(getProducts());
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("SEARCH"))
             {
                 String productId = view.getTextSearchProduct();
                 
                 if(productId.strip().equals(""))
                 {
                     warningMessage("Please write de id of the product you want to search.");
                 }
                 
                 else
                 {
                     Product product = getProduct(productId);
                     
                     if(product == null)
                     {
                         warningMessage("The product with id " + productId + " was not found.");
                     }
                     
                     else
                     {                      
                        String name = product.getProductName();
                        String supplier = product.getSupplier();
                        int price = product.getPrice();
                        int quantity = product.getQuantity();
                        
                         view.setTextIdProduct(productId);
                         view.setTextNameProduct(name);
                         view.setTextSupplierProduct(supplier);
                         view.setTextPriceProduct(price);
                         view.setTexQuantityProduct(quantity);
                     }
                 }                 
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("DELETE"))
             {
                 String productId = view.getTextDeleteProduct();
                 
                 if(productId.strip().equals(""))
                 {
                     warningMessage("Please write de id of the product you want to delete.");
                 }
                 
                 else
                 {
                     boolean delete = deleteProduct(productId);
                     
                     if(delete)
                     {
                         infoMessage("The product with id " + productId + " was deleted successfully", "Supplier deleted");
                         view.refreshProductsTable(getProducts());
                         view.cleanProductForm();
                         view.deleteProductInComboBox(productId);
                     }
                     
                     else
                     {
                        warningMessage("The product with id " + productId + " was not found.");
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
        
        //------------------------------------------------------------------------------------
        
        public boolean verifyFields(String id, String name, String supplier, String price, int quantity, int parsedPrice)
        {            

            if(id.strip().equals("") || name.strip().equals("") || supplier == null || price.strip().equals(""))
            {
                warningMessage("Please fill all the fields.");
                return false;
            }             

            else if(parsedPrice <= 0)
            {
                warningMessage("The price must be greater than 0");
                return false;
            }

            else if(quantity <= 0)
            {
                warningMessage("The quantity must be greater than 0");
                return false;
            }

            return true;
        }
        
    }
    //--------------------------------------------------------------------------------------------------
}
