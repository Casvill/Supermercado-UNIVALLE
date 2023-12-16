package dao;

import java.util.List;
import model.Sell;

/**
 *
 * @author Daniel Casvill
 */
public interface ISellDao 
{
    public List<Sell> getSells();
    public boolean addSell(Sell sell);
}