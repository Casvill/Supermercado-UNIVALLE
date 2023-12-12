package dao;

import java.util.List;
import model.Customer;

/**
 *
 * @author Daniel Casvill
 */
public interface ICustomerDao 
{
    public List<Customer> getAllCustomers();
    public Customer getCustomer(String customerID);
    public boolean addCustomer(Customer customer);
    public boolean updateCustomer(Customer customer);
    public boolean deleteCustomer(String customerId); 
}
