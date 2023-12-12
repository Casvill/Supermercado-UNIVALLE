package model;

import dao.IProductDao;
import dao.ProductDaoImplementation;
import java.util.List;

/**
 *
 * @author Daniel Casvill
 */
public class IProduct 
{
    private IProductDao productDao;
    
    public IProduct()
    {
        this.productDao = new ProductDaoImplementation();
    }
    
    public boolean addProduct(Product product)
    {
        return this.productDao.addProduct(product);
    }
    
    public List<Product> getAllProducts()
    {
        return this.productDao.getAllProducts();
    }
    
    public Product getProduct(String productId)
    {
        return this.productDao.getProduct(productId);
    }
    
    public boolean updateProduct(Product product)
    {
        return this.productDao.updateProduct(product);
    }
    
    public boolean deleteProduct(String productId)
    {
        return this.productDao.deleteProduct(productId);
    }
}
