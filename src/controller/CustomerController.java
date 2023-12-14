package controller;

import dao.CustomerDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.Customer;
import view.MainView;

/**
 *
 * @author Daniel Casvill
 */
public class CustomerController 
{
    private CustomerDaoImplementation customerDao;
    private MainView view;

    public CustomerController(CustomerDaoImplementation customerDao, MainView view) 
    {
        this.customerDao = customerDao;
        this.view = view;
        this.view.setLocationRelativeTo(null);
        
        this.view.addBtnSaveCustomerListener(new CustomerListener());
        this.view.addBtnUpdateCustomerListener(new CustomerListener());
        this.view.addBtnListAllCustomerListener(new CustomerListener());
        this.view.addBtnSearchCustomerListener(new CustomerListener());
        this.view.addBtnDeleteCustomerListener(new CustomerListener());                
    }
    //--------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------
    
    public boolean addCustomer(Customer customer)
    {
        return customerDao.addCustomer(customer);
    }
    
    //--------------------------------------------------------
    
    public List<Customer> getCustomers()
    {
        return customerDao.getAllCustomers();
    }
    
    //--------------------------------------------------------
    
    public Customer getCustomer(String customerId)
    {
        return customerDao.getCustomer(customerId);
    }
    
    //--------------------------------------------------------
    
    public boolean updateCustomer(Customer customer)
    {
        return customerDao.updateCustomer(customer);
    }
    
    //--------------------------------------------------------
    
    public boolean deleteCustomer(String customerId)
    {
        return customerDao.deleteCustomer(customerId);
    }
    
    //--------------------------------------------------------    
    
    //--------------------------------------------------------------------------------------------------
    class CustomerListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
        
    
}
