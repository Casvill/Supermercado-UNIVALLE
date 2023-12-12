package dao;

import java.util.List;
import model.Product;

/**
 *
 * @author Daniel Casvill
 */
public interface IProductDao 
{
    public List<Product> getAllProducts();
    public Product getProduct(String productID);
    public boolean addProduct(Product product);
    public boolean updateProduct(Product product);
    public boolean deleteProduct(String productId);    
}
