package controller;

import dao.BuyDaoImplementation;
import dao.CustomerDaoImplementation;
import dao.ProductDaoImplementation;
import dao.SellDaoImplementation;
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
        
        new SupplierController(new SupplierDaoImplementation(), view);                
        new CustomerController(new CustomerDaoImplementation(), view);                
        new ProductController(new ProductDaoImplementation(), view);
        new BuyController(new BuyDaoImplementation(), view);
        new SellController(new SellDaoImplementation(), view);
    }
}
