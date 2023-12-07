package dao;

import java.util.List;
import model.Customer;

/**
 *
 * @author tuhermano
 */
public interface ICustomerDao 
{
    public List<Customer> getAllCustomers();
    public Customer getcustomer(String customerID);
    public boolean addcustomer(Customer customer);
    public boolean updatecustomer(Customer customer);
    public boolean deletecustomer(String customerId);    
}