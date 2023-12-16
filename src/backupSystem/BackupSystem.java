package backupSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Buy;
import model.Customer;
import model.Product;
import model.Sell;
import model.Supplier;

/**
 *
 * @author Daniel Casvill
 */
public class BackupSystem
{            
    //BUY---------------------
    //--------------------------------------------------------------------------------
    public void saveDataBuy(List<Buy> buys)
    {        
        ObjectOutputStream oos = null;
        try 
        {
            oos = new ObjectOutputStream(new FileOutputStream("src/files/buy.data"));
            oos.writeObject(buys);
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        finally 
        {
            if (oos != null) 
            {
                try 
                {
                    oos.close();
                } 
                catch (IOException ex) 
                {
                    System.out.print("Error " + ex.getMessage());
                }
            }
        }

    }
    //--------------------------------------------------------
    public List<Buy> loadDataBuy()
    {
        List<Buy> buys = new ArrayList<>();
        ObjectInputStream ois = null;
        
        try 
        {
            ois = new ObjectInputStream(new FileInputStream("src/files/buy.data"));
            buys = (List<Buy>) ois.readObject();
            return buys;
        } 
        catch (FileNotFoundException ex) 
        {            
            System.out.println("Archivo no existe : " + ex.getMessage());
        } 
        catch (IOException ex) 
        {            
            System.out.println("Error leyendo 1 : " + ex.getMessage());
        } 
        catch (ClassNotFoundException ex) 
        {            
            System.out.println("Error leyendo 2 : " + ex.getMessage());
        } 
        finally 
        {
            if (ois != null) 
            {
                try 
                {
                    ois.close();
                } 
                catch (IOException ex) 
                {                    
                    System.out.println("Error : " + ex.getMessage());
                }
            }
        }
        return buys;
    }
    //--------------------------------------------------------------------------------
    
    //SELL----------------------------
    //--------------------------------------------------------------------------------
    public void saveDataSell(List<Sell> sales)
    {        
        ObjectOutputStream oos = null;
        try 
        {
            oos = new ObjectOutputStream(new FileOutputStream("src/files/sell.data"));
            oos.writeObject(sales);
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        finally 
        {
            if (oos != null) 
            {
                try 
                {
                    oos.close();
                } 
                catch (IOException ex) 
                {
                    System.out.print("Error " + ex.getMessage());
                }
            }
        }

    }
    //--------------------------------------------------------
    public List<Sell> loadDataSell()
    {
        List<Sell> sales = new ArrayList<>();
        ObjectInputStream ois = null;
        
        try 
        {
            ois = new ObjectInputStream(new FileInputStream("src/files/sell.data"));
            sales = (List<Sell>) ois.readObject();
            return sales;
        } 
        catch (FileNotFoundException ex) 
        {            
            System.out.println("File do not exist : " + ex.getMessage());
        } 
        catch (IOException ex) 
        {            
            System.out.println("Error reading 1 : " + ex.getMessage());
        } 
        catch (ClassNotFoundException ex) 
        {            
            System.out.println("Error reading 2 : " + ex.getMessage());
        } 
        finally 
        {
            if (ois != null) 
            {
                try 
                {
                    ois.close();
                } 
                catch (IOException ex) 
                {                    
                    System.out.println("Error : " + ex.getMessage());
                }
            }
        }
        return sales;
    }
    //--------------------------------------------------------------------------------
    
    //PRODUCT----------------------------
    //--------------------------------------------------------------------------------
    public void saveDataProduct(List<Product> products)
    {        
        ObjectOutputStream oos = null;
        try 
        {
            oos = new ObjectOutputStream(new FileOutputStream("src/files/product.data"));
            oos.writeObject(products);
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        finally 
        {
            if (oos != null) 
            {
                try 
                {
                    oos.close();
                } 
                catch (IOException ex) 
                {
                    System.out.print("Error " + ex.getMessage());
                }
            }
        }

    }
    //--------------------------------------------------------
    public List<Product> loadDataProduct()
    {
        List<Product> products = new ArrayList<>();
        ObjectInputStream ois = null;
        
        try 
        {
            ois = new ObjectInputStream(new FileInputStream("src/files/product.data"));
            products = (List<Product>) ois.readObject();
            return products;
        } 
        catch (FileNotFoundException ex) 
        {            
            System.out.println("File do not exist : " + ex.getMessage());
        } 
        catch (IOException ex) 
        {            
            System.out.println("Error reading 1 : " + ex.getMessage());
        } 
        catch (ClassNotFoundException ex) 
        {            
            System.out.println("Error reading 2 : " + ex.getMessage());
        } 
        finally 
        {
            if (ois != null) 
            {
                try 
                {
                    ois.close();
                } 
                catch (IOException ex) 
                {                    
                    System.out.println("Error : " + ex.getMessage());
                }
            }
        }
        return products;
    }
    //--------------------------------------------------------------------------------
    
    //SUPPLIER----------------------------
    //--------------------------------------------------------------------------------
    public void saveDataSupplier(List<Supplier> suppliers)
    {        
        ObjectOutputStream oos = null;
        try 
        {
            oos = new ObjectOutputStream(new FileOutputStream("src/files/supplier.data"));
            oos.writeObject(suppliers);
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        finally 
        {
            if (oos != null) 
            {
                try 
                {
                    oos.close();
                } 
                catch (IOException ex) 
                {
                    System.out.print("Error " + ex.getMessage());
                }
            }
        }

    }
    //--------------------------------------------------------
    public List<Supplier> loadDataSupplier()
    {
        List<Supplier> suppliers = new ArrayList<>();
        ObjectInputStream ois = null;
        
        try 
        {
            ois = new ObjectInputStream(new FileInputStream("src/files/supplier.data"));
            suppliers = (List<Supplier>) ois.readObject();
            return suppliers;
        } 
        catch (FileNotFoundException ex) 
        {            
            System.out.println("File do not exist : " + ex.getMessage());
        } 
        catch (IOException ex) 
        {            
            System.out.println("Error reading 1 : " + ex.getMessage());
        } 
        catch (ClassNotFoundException ex) 
        {            
            System.out.println("Error reading 2 : " + ex.getMessage());
        } 
        finally 
        {
            if (ois != null) 
            {
                try 
                {
                    ois.close();
                } 
                catch (IOException ex) 
                {                    
                    System.out.println("Error : " + ex.getMessage());
                }
            }
        }
        return suppliers;
    }
    //--------------------------------------------------------------------------------
    
    //CUSTOMER----------------------------
    //--------------------------------------------------------------------------------
    public void saveDataCustomer(List<Customer> customers)
    {        
        ObjectOutputStream oos = null;
        try 
        {
            oos = new ObjectOutputStream(new FileOutputStream("src/files/customer.data"));
            oos.writeObject(customers);
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.print("Error saving " + ex.getMessage());
        } 
        finally 
        {
            if (oos != null) 
            {
                try 
                {
                    oos.close();
                } 
                catch (IOException ex) 
                {
                    System.out.print("Error " + ex.getMessage());
                }
            }
        }

    }
    //--------------------------------------------------------
    public List<Customer> loadDataCustomer()
    {
        List<Customer> customers = new ArrayList<>();
        ObjectInputStream ois = null;
        
        try 
        {
            ois = new ObjectInputStream(new FileInputStream("src/files/customer.data"));
            customers = (List<Customer>) ois.readObject();
            return customers;
        } 
        catch (FileNotFoundException ex) 
        {            
            System.out.println("File do not exist : " + ex.getMessage());
        } 
        catch (IOException ex) 
        {            
            System.out.println("Error reading 1 : " + ex.getMessage());
        } 
        catch (ClassNotFoundException ex) 
        {            
            System.out.println("Error reading 2 : " + ex.getMessage());
        } 
        finally 
        {
            if (ois != null) 
            {
                try 
                {
                    ois.close();
                } 
                catch (IOException ex) 
                {                    
                    System.out.println("Error : " + ex.getMessage());
                }
            }
        }
        return customers;
    }
    //--------------------------------------------------------------------------------
    
}
