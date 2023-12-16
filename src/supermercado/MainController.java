package supermercado;

import backupSystem.BackupSystem;
import controller.BuyController;
import controller.CustomerController;
import controller.ProductController;
import controller.SellController;
import controller.SupplierController;
import dao.BuyDaoImplementation;
import dao.CustomerDaoImplementation;
import dao.ProductDaoImplementation;
import dao.SellDaoImplementation;
import dao.SupplierDaoImplementation;
import java.util.List;
import model.Buy;
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
        BackupSystem backup = new BackupSystem();
        List<Buy> buys = null;
        buys = backup.loadDataBuy();
        System.out.println(buys.get(0).getSupplier());
        
        new SupplierController(new SupplierDaoImplementation(), view);                
        new CustomerController(new CustomerDaoImplementation(), view);                
        new ProductController(new ProductDaoImplementation(), view);
        new BuyController(new BuyDaoImplementation(), view);
        new SellController(new SellDaoImplementation(), view);
    }
}
