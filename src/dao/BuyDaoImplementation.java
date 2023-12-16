package dao;

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

    public BuyDaoImplementation() 
    {
        this.buys = new ArrayList<>();
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
        return true;
    }    
}
