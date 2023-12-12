package controller;

import dao.ProductDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
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
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    //--------------------------------------------------------------------------------------------------
}
