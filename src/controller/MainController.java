package controller;

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
        new SupplierController(new SupplierDaoImplementation(), new MainView());
    }
}
