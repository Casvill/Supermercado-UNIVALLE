package dao;

import backupSystem.BackupSystem;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

/**
 *
 * @author Daniel Casvill
 */
public class CustomerDaoImplementation implements ICustomerDao
{
    List<Customer> customers;
    BackupSystem backup = new BackupSystem();
    
    public CustomerDaoImplementation()
    {        
        try
        {
            this.customers = backup.loadDataCustomer();
        }
        catch(Exception exception)
        {
            this.customers = new ArrayList<>();
        }
    }
    
    public void doBackup()
    {
        this.backup.saveDataCustomer(customers);
    }
    
    @Override
    public List<Customer> getAllCustomers() 
    {
        return customers;
    }

    @Override
    public Customer getCustomer(String customerID) 
    {
        Customer customer = null;
        
        for(Customer current : customers)
        {
            if(current.getId().equals(customerID))
            {
                customer = current;
                break;
            }
        }
        
        return customer;
    }

    @Override
    public boolean addCustomer(Customer customer) 
    {
        for(Customer customerB: customers)
        {
            if(customerB.getId().strip().equals(customer.getId().strip()))
            {
                return false;
            }
        }
        
        customers.add(customer);
        doBackup();
        return true;
    }

    @Override
    public boolean updateCustomer(Customer customer) 
    {
        for(Customer customerB: customers)
        {
            if(customerB.getId().strip().equals(customer.getId().strip()))
            {
                int pos = customers.indexOf(customerB);
                customers.set(pos, customer);
                doBackup();
                return true;
            }
        }
        
        return false;
    }

    @Override
    public boolean deleteCustomer(String customerId) 
    {
        for(Customer customerB: customers)
        {
            if(customerB.getId().strip().equals(customerId.strip()))
            {
                int pos = customers.indexOf(customerB);
                customers.remove( pos);
                doBackup();
                return true;
            }
        }
        
        return false;
    }
    
}
