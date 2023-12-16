package controller;

import dao.BuyDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import model.Buy;
import view.MainView;

/**
 *
 * @author Daniel Casvill
 */
public class BuyController 
{
    private BuyDaoImplementation buyDao;
    private MainView view;

    //--------------------------------------------------------------------------------------------------
    
    public BuyController(BuyDaoImplementation buyDao, MainView view) 
    {
        this.buyDao = buyDao;
        this.view = view;
        
        this.view.addBtnBuyListener(new BuyListener());
        this.view.addBtnCleanFormBuyListener(new BuyListener());
        this.view.addBtnRefreshBuysListener(new BuyListener());
        
        this.view.refreshBuysTable(buyDao.restoreData());
    }
    
    //--------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------
    
    public boolean addBuy(Buy buy)
    {
        return buyDao.addBuy(buy);
    }
    
    //--------------------------------------------------------
    
    public List<Buy> getBuys()
    {
        return buyDao.getBuys();
    }
    
    //--------------------------------------------------------
    
    //--------------------------------------------------------------------------------------------------
    
    class BuyListener implements ActionListener
    {
        //------------------------------------------------------------------------------------
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("BUY"))
            {                
                String supplier = view.getTextSupplierBuy();
                String product = view.getTextSupplierBuy();
                String price = view.getPriceBuy();
                int quantity = view.getQuantityBuy();
                
                int parsedPrice = 0;
                
                try
                {
                    parsedPrice = Integer.parseInt(price);
                }
                catch(NumberFormatException exception)
                {
                    warningMessage("The price must be a numeric value.");
                    view.setPriceBuy(0);
                }
                
                boolean verification = verifyFields(supplier, product, price, quantity, parsedPrice);
                
                if(verification)
                {
                    Buy buy = new Buy(supplier, product, parsedPrice, quantity, quantity);
                    boolean add = addBuy(buy);
                    
                    if(add)
                    {
                        infoMessage("Buy Completed successfully!", "Buy completed");
                        view.addRecordBuy(buy);
                        view.cleanBuyForm();
                    }
                }
            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("CLEAN FORM"))
            {
                view.cleanBuyForm();
            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("REFRESH"))
            {
                view.refreshBuysTable(buyDao.restoreData());
            }
            //------------------------------------------------------------------------------------
        }
        
        //------------------------------------------------------------------------------------
        
        public void warningMessage(String text)
        {
            JOptionPane.showMessageDialog(null,text,"warning",JOptionPane.ERROR_MESSAGE);
        }
        
        public void infoMessage(String text,String title)
        {
            JOptionPane.showMessageDialog(null,text,title,JRootPane.INFORMATION_DIALOG);   
        }
        
        //------------------------------------------------------------------------------------
        
        public boolean verifyFields(String supplier, String product, String price, int quantity, int parsedPrice)
        {
            if(supplier == null || product == null || price.strip().equals(""))
            {
                warningMessage("Please fill all the fields.");
                return false;
            }
            
            else if(parsedPrice <= 0)
            {
                warningMessage("The price must be greater than 0");
                return false;
            }

            else if(quantity <= 0)
            {
                warningMessage("The quantity must be greater than 0");
                return false;
            }
            
            return true;
        }
    }
}
