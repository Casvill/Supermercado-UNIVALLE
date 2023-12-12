package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.IProduct;
import model.Product;
import view.MainView;

/**
 *
 * @author Daniel Casvill
 */
public class ProductController 
{
    private IProduct iProduct;
    private MainView view;
    
    
    //--------------------------------------------------------------------------------------------------
    public ProductController(IProduct iProduct, MainView view) 
    {        
        this.iProduct = iProduct;
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
        return iProduct.addProduct(product);
    }
    
    //--------------------------------------------------------
    
    public List<Product> getProducts()
    {
        return iProduct.getAllProducts();
    }
    
    //--------------------------------------------------------
    
    public Product getProduct(String productId)
    {
        return iProduct.getProduct(productId);
    }
    
    //--------------------------------------------------------
    
    public boolean updateProduct(Product product)
    {
        return iProduct.updateProduct(product);
    }
    
    //--------------------------------------------------------
    
    public boolean deleteProduct(String productId)
    {
        return iProduct.deleteProduct(productId);
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
