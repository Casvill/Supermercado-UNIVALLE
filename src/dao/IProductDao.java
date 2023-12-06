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
    public Product getContact(String contactID);
    public boolean addContact(Product contact);
    public boolean updateContact(Product contact);
    public boolean deleteContact(String contactId);    
}
