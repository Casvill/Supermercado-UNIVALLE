package controller;

import dao.SellDaoImplementation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import model.Sell;
import view.MainView;

/**
 *
 * @author Daniel Casvill
 */
public class SellController 
{
    private SellDaoImplementation sellDao;
    private MainView view;
    
    //--------------------------------------------------------------------------------------------------
    
    public SellController(SellDaoImplementation sellDao, MainView view) 
    {
        this.sellDao = sellDao;
        this.view = view;
        
        this.view.addBtnCleanFormSellListener(new SellListener());
        this.view.addBtnSellListener(new SellListener());
        this.view.addBtnRefreshSalesListener(new SellListener());
        
        this.view.refreshSalesTable(sellDao.restoreData());
    }
    
    //--------------------------------------------------------------------------------------------------    
    
    //--------------------------------------------------------
    
    public boolean addSell(Sell sell)
    {
        return sellDao.addSell(sell);
    }
    
    //--------------------------------------------------------
    
    public List<Sell> getSells()
    {
        return sellDao.getSells();
    }
    
    //--------------------------------------------------------------------------------------------------
    
    class SellListener implements ActionListener
    {
        //------------------------------------------------------------------------------------
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //------------------------------------------------------------------------------------
            if(e.getActionCommand().equalsIgnoreCase("SELL"))
            {
                String customer = view.getCustomerSell();
                String product = view.getProductSell();
                String price = view.getPriceSell();
                int quantity = view.getQuantitySell();
                
                int parsedPrice = 0;
                
                try
                {
                    parsedPrice = Integer.parseInt(price);
                }
                catch(NumberFormatException exception)
                {
                    warningMessage("The price must be a numeric value.");
                    view.setPriceSell(0);
                }
                
                boolean verification = verifyFields(customer, product, price, quantity, parsedPrice);
                
                if(verification)
                {
                    Sell sell = new Sell(customer, product, parsedPrice, quantity, quantity);
                    boolean add = addSell(sell);
                    
                    if(add)
                    {
                        infoMessage("Sell Completed successfully!", "Sell completed");
                        view.addRecordSell(sell);
                        view.cleanSellForm();                        
                    }
                }
            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("CLEAN FORM"))
            {
                view.cleanSellForm();
            }
            
            //------------------------------------------------------------------------------------
            
            if(e.getActionCommand().equalsIgnoreCase("REFRESH"))
            {
                view.refreshSalesTable(sellDao.restoreData());
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
        
        //------------------------------------------------------------------------------------        
    }
    
    
    
}

