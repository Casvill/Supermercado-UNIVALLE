package dao;

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

    public SellDaoImplementation() 
    {
        this.sells = new ArrayList<>();
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
        return true;
    }
    
}
