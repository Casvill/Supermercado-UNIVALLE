package controller;

import dao.CustomerDaoImplementation;
import dao.ProductDaoImplementation;
import dao.SupplierDaoImplementation;
import view.MainView;

/**
 *
 * @author Daniel Casvill
 */
public class MainController 
{
    public static void main(String args[]) 
    {
        MainView view = new MainView();        
        int tab = 4;
        System.out.println(tab);
        
       
        new SupplierController(new SupplierDaoImplementation(), view);                
        new CustomerController(new CustomerDaoImplementation(), view);                
        new ProductController(new ProductDaoImplementation(), view);
        
    }
}
