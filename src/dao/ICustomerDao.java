package dao;

import java.util.List;
import model.Customer;

/**
 *
 * @author Daniel tuhermano
 */
public interface ICustomerDao 
{
    public List<Customer> getAllProducts();
    public Customer getContact(String contactID);
    public boolean addContact(Customer contact);
    public boolean updateContact(Customer contact);
    public boolean deleteContact(String contactId);    
}