package dao;

import java.util.List;
import model.Buy;

/**
 *
 * @author Daniel Casvill
 */
public interface IBuyDao 
{
    public List<Buy> getBuys();
    public boolean addBuy(Buy buy);
}