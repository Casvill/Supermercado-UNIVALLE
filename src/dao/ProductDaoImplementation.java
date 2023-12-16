package dao;

import backupSystem.BackupSystem;
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
    BackupSystem backup = new BackupSystem();
    
    public ProductDaoImplementation()
    {
        this.products = new ArrayList<>();
    }
    
    public void doBackup()
    {
        this.backup.saveDataProduct(products);
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
        doBackup();
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
                doBackup();
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
                doBackup();
                return true;
            }
        }
        return false;
    }    
}
