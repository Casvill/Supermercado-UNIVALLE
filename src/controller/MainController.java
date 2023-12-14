package controller;

import dao.CustomerDaoImplementation;
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
//        new SupplierController(new SupplierDaoImplementation(), new MainView());
        new CustomerController(new CustomerDaoImplementation(), new MainView());
    }
}
