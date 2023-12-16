package dao;

import backupSystem.BackupSystem;
import java.util.ArrayList;
import java.util.List;
import model.Buy;

/**
 *
 * @author Daniel Casvill
 */
public class BuyDaoImplementation implements IBuyDao
{
    List<Buy> buys;
    BackupSystem backup = new BackupSystem();

    public BuyDaoImplementation() 
    {
        this.buys = new ArrayList<>();
    }        
    
    public void doBackup()
    {
        backup.saveDataBuy(buys);
    }

    @Override
    public List<Buy> getBuys() 
    {
        return buys;
    }

    @Override
    public boolean addBuy(Buy buy) 
    {
        buys.add(buy);
        doBackup();
        return true;
    }    
}
