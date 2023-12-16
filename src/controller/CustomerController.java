package controller;

import dao.CustomerDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
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
         this.view.setVisible(true);
        
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
             //------------------------------------------------------------------------------------
            if(e.getActionCommand().equalsIgnoreCase("SAVE"))
            {
                String id = view.getTextIdCustomer();
                String name = view.getTextNameCustomer();
                String surnames = view.getTextSurnamesCustomer();
                String phoneNumber = view.getTextPhoneNumberCustomer();
                
                if(name.strip().equals("") || surnames.strip().equals("") || id.strip().equals("")|| phoneNumber.strip().equals(""))
                {
                    warningMessage("Please fill all the fields.");
                }
                
                else
                {
                    Customer customer = new Customer(id, name, surnames, phoneNumber);
                    boolean add = addCustomer(customer);
                    
                    if(add)
                    {
                        infoMessage("Customer added successfully!", "Customer Added");                        
                        view.addRecordCustomer(customer);
                        view.cleanCustomerForm();
                    }
                    else
                    {
                        warningMessage("The customer with id "+id+" already exist.");
                    }
                }
            }
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("UPDATE"))
             {
                String id = view.getTextIdCustomer();
                String name = view.getTextNameCustomer();
                String surnames = view.getTextSurnamesCustomer();
                String phoneNumber = view.getTextPhoneNumberCustomer();
                
                if(name.strip().equals("") || surnames.strip().equals("") || id.strip().equals("")|| phoneNumber.strip().equals(""))
                {
                    warningMessage("Please fill all the fields.");
                }
                
                else
                {
                    Customer customer = new Customer(id, name, surnames, phoneNumber);
                    boolean update = updateCustomer(customer);
                    
                    if(update)
                    {
                        view.refreshCustomersTable(customerDao.getAllCustomers());
                        infoMessage("Customer updated successfully!", "Customer Updated");
                        view.cleanCustomerForm();
                        view.updateCustomerInComboBox(id, name);
                    }
                    
                    else
                    {
                        warningMessage("it was not possible to update the customers");
                    }
                }
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("LIST ALL"))
             {
                 view.refreshCustomersTable(customerDao.getAllCustomers());
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("SEARCH"))
             {
                 String customerId = view.getTextSearchCustomer();
                 
                 if(customerId.strip().equals(""))
                 {
                     warningMessage("Please write de id of the customer you want to search.");
                 }
                 
                 else
                 {
                     Customer customer = customerDao.getCustomer(customerId);
                     
                     if(customer == null)
                     {
                         warningMessage("The customer with id "+customerId+" was not found.");
                     }
                     
                     else
                     {
                        String name = customer.getName();
                        String surnames = customer.getSurnames();
                        String phoneNumber = customer.getPhoneNumber();
                        
                         view.setTextIdCustomer(customerId);
                         view.setTextNameCustomer(name);
                         view.setTextSurnamesCustomer(surnames);
                         view.setTextPhoneNumberCustomer(phoneNumber);
                     }
                 }                 
             }
             
             //------------------------------------------------------------------------------------
             
             if(e.getActionCommand().equalsIgnoreCase("DELETE"))
             {
                 String customerId = view.getTextDeleteCustomer();
                 
                 if(customerId.strip().equals(""))
                 {
                     warningMessage("Please write de id of the customer you want to delete.");
                 }
                 
                 else
                 {
                     boolean delete = customerDao.deleteCustomer(customerId);
                     
                     if(delete)
                     {
                         infoMessage("The customer with id "+customerId+" was deleted successfully", "Customer deleted");
                         view.refreshCustomersTable(customerDao.getAllCustomers());
                         view.cleanCustomerForm();
                         view.deleteCustomerInComboBox(customerId);
                     }
                     
                     else
                     {
                        warningMessage("The customer with id "+customerId+" was not found.");
                     }
                 }
             }
        }
        
        //------------------------------------------------------------------------------------
        
        public void warningMessage(String text)
        {
            JOptionPane.showMessageDialog(null,text,"warning",JOptionPane.ERROR_MESSAGE);
        }
        
        public void infoMessage(String text,String title)
        {
            JOptionPane.showMessageDialog(null,text,title,JRootPane.INFORMATION_DIALOG);   
        }
        
    }
        
    
}
