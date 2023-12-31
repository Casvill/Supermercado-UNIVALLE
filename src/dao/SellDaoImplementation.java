package dao;

import backupSystem.BackupSystem;
import java.util.ArrayList;
import java.util.List;
import model.Sell;

/**
 *
 * @author Daniel Casvill
 */
public class SellDaoImplementation implements ISellDao
{
    List<Sell> sells;
    BackupSystem backup = new BackupSystem();

    public SellDaoImplementation() 
    {        
        try
        {
            this.sells = backup.loadDataSell();
        }
        catch(Exception exception)
        {
            this.sells = new ArrayList<>();
        }
    }        
    
    public void doBackup()
    {
        this.backup.saveDataSell(sells);
    }
    
    public List<Sell> restoreData()
    {
        return backup.loadDataSell();
    }
    
    @Override
    public List<Sell> getSells() 
    {
        return sells;
    }

    @Override
    public boolean addSell(Sell sell) 
    {
        sells.add(sell);
        doBackup();
        return true;
    }
    
}
