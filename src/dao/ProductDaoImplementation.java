package dao;

import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author Daniel Casvill
 */
public class ProductDaoImplementation implements IProductDao
{
    List<Product> products;
    
    public ProductDaoImplementation()
    {
        this.products = new ArrayList<>();
    }
    
    @Override
    public List<Product> getAllProducts() 
    {
        return products;
    }

    @Override
    public Product getProduct(String productID) 
    {
        Product product = null;
        
        for(Product current : products)
        {
            if(current.getId().equals(productID))
            {
                product = current;
                break;
            }
        }
        
        return product;
    }

    @Override
    public boolean addProduct(Product product) 
    {
        for(Product productB: products)
        {
            if(productB.getId().strip().equals(product.getId().strip()))
            {
                return false;
            }
        }
        
        products.add(product);
        return true;
    }

    @Override
    public boolean updateProduct(Product product) 
    {
        for(Product productB: products)
        {
            if(productB.getId().strip().equals(product.getId().strip()))
            {
                int pos = products.indexOf(productB);
                products.set(pos, product);
            
                return true;
            }
        }
        
        return false;
    }

    @Override
    public boolean deleteProduct(String productId) 
    {
        for(Product productB: products)
        {
            if(productB.getId().strip().equals(productId.strip()))
            {
                int pos = products.indexOf(productB);
                products.remove(pos);
                return true;
            }
        }
        return false;
    }
}
