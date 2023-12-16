package view;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Buy;
import model.Customer;
import model.Product;
import model.Sell;
import model.Supplier;

/**
 *
 * @author Daniel Casvill
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    
    DefaultTableModel modelSupplier;
    DefaultTableModel modelCustomer;
    DefaultTableModel modelProduct;
    DefaultTableModel modelBuy;
    DefaultTableModel modelSell;
    
    public MainView() 
    {
        initComponents();
        modelSupplier = (DefaultTableModel) jtSupplier.getModel();
        modelCustomer = (DefaultTableModel) jtCustomers.getModel();
        modelProduct = (DefaultTableModel) jtProduct.getModel();        
        modelBuy = (DefaultTableModel) jtBuyRecords.getModel();        
        modelSell = (DefaultTableModel) jtSales.getModel(); 
        setLocationRelativeTo(null);
    }
    
    //--------------------------------------------------------------------------------------------------
    public void addBtnSaveProductListener(ActionListener listenControllers)
    {
        jbSaveProduct.addActionListener(listenControllers);
    }
    
    public void addBtnUpdateProductListener(ActionListener listenControllers)
    {
        jbUpdateProduct.addActionListener(listenControllers);
    }
    
    public void addBtnListAllProductListener(ActionListener listenControllers)
    {
        jbListAllProduct.addActionListener(listenControllers);
    }
    
    public void addBtnSearchProductListener(ActionListener listenControllers)
    {
        jbSearchProduct.addActionListener(listenControllers);
    }
    
    public void addBtnDeleteProductListener(ActionListener listenControllers)
    {
        jbDeleteProduct.addActionListener(listenControllers);
    }
    //--------------------------------------------------------------------------------------------------
    
    public void addBtnSaveSupplierListener(ActionListener listenerControllers)
    {
        jbSupplierSave.addActionListener(listenerControllers);
    }
    
    public void addBtnUpdateSupplierListener(ActionListener listenerControllers)
    {
        jbSupplierUpdate.addActionListener(listenerControllers);
    }
    
    public void addBtnListAllSupplierListener(ActionListener listenerControllers)
    {
        jbSupplierListAll.addActionListener(listenerControllers);
    }
    
    public void addBtnSearchSupplierListener(ActionListener listenerControllers)
    {
        jbSupplierSearch.addActionListener(listenerControllers);
    }
    
    public void addBtnDeleteSupplierListener(ActionListener listenerControllers)
    {
        jbSupplierDelete.addActionListener(listenerControllers);
    }
    //--------------------------------------------------------------------------------------------------
    
    public void addBtnSaveCustomerListener(ActionListener listenerControllers)
    {
        jbSaveCustomer.addActionListener(listenerControllers);
    }
    
    public void addBtnUpdateCustomerListener(ActionListener listenerControllers)
    {
        jbUpdateCustomer.addActionListener(listenerControllers);
    }
    
    public void addBtnListAllCustomerListener(ActionListener listenerControllers)
    {
        jbListAllCustomer.addActionListener(listenerControllers);
    }
    
    public void addBtnSearchCustomerListener(ActionListener listenerControllers)
    {
        jbSearchCustomer.addActionListener(listenerControllers);
    }
    
    public void addBtnDeleteCustomerListener(ActionListener listenerControllers)
    {
        jbDeleteCustomer.addActionListener(listenerControllers);
    }
    
    //--------------------------------------------------------------------------------------------------
    
    
    public void addBtnCleanFormBuyListener(ActionListener listenerControllers)
    {
        jbCleanFormBuy.addActionListener(listenerControllers);
    }
    
    public void addBtnBuyListener(ActionListener listenerControllers)
    {
        jbBuy.addActionListener(listenerControllers);
    }
    
    //--------------------------------------------------------------------------------------------------
    
    public void addBtnCleanFormSellListener(ActionListener listenerControllers)
    {
        jbCleanFormSell.addActionListener(listenerControllers);
    }
    
    public void addBtnSellListener(ActionListener listenerControllers)
    {
        jbSell.addActionListener(listenerControllers);
    }
    
    //--------------------------------------------------------------------------------------------------
    
    //SUPPLIERS:----------------------------------------------------------------------------------------
    
    public String getTextIdSupplier()
    {
        return jtfIdSupplier.getText();
    }
    
    public void setTextIdSupplier(String text)
    {
        jtfIdSupplier.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextNameSupplier()
    {
        return jtfNameSupplier.getText();
    }
    
    public void setTextNameSupplier(String text)
    {
        jtfNameSupplier.setText(text);
    }
    
    //----------------------------------------
        
    public String getTextSurnamesSupplier()
    {
        return jtfSurnamesSupplier.getText();
    }
    
    public void setTextSurnamesSupplier(String text)
    {
        jtfSurnamesSupplier.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextPhoneNumberSupplier()
    {
        return jtfPhoneNumberSupplier.getText();
    }
    
    public void setTextPhoneNumberSupplier(String text)
    {
        jtfPhoneNumberSupplier.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextSearchSupplier()
    {
        return jtfSearchSupplier.getText();
    }
    
    public void setTextSearchSupplier(String text)
    {
        jtfSearchSupplier.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextDeleteSupplier()
    {
        return jtfDeleteSupplier.getText();
    }
    
    public void setTextDeleteSupplier(String text)
    {
        jtfDeleteSupplier.setText(text);
    }
            
    //----------------------------------------
    
    public boolean cleanSupplierForm()
    {
        jtfIdSupplier.setText("");
        jtfNameSupplier.setText("");
        jtfSurnamesSupplier.setText("");
        jtfPhoneNumberSupplier.setText("");
        jtfSearchSupplier.setText("");
        jtfDeleteSupplier.setText("");
        jtfDeleteSupplier.setText("");
        
        return true;
    }
    
    public void addRecordSupplier(Supplier supplier)
    {
        String id = supplier.getId();
        String name = supplier.getName();
        String surnames = supplier.getSurnames();
        String phoneNumber = supplier.getPhoneNumber();
        
        modelSupplier.addRow(new Object[]{id, name, surnames, phoneNumber});     
        addJcbSupplierProduct(name,id);
        addJcbSupplierBuy(name,id);
    }
    
    public void updateSupplierInComboBox(String supplierId, String newName) 
    {
        for (int i = 0; i < jcbSupplierProduct.getItemCount(); i++) 
        {
            String supplierCombo = (String) jcbSupplierProduct.getItemAt(i);
            String[] parts = supplierCombo.split("-");
            String currentSupplierId = parts[1].strip();
            
            if (currentSupplierId.equals(supplierId)) 
            {
                jcbSupplierProduct.removeItemAt(i);
                jcbSupplierProduct.insertItemAt(newName + " - " + supplierId, i);
                break; 
            }
        }
    }   

    public void deleteSupplierInComboBox(String supplierId) 
    {
        for (int i = 0; i < jcbSupplierProduct.getItemCount(); i++) 
        {
            String supplierCombo = (String) jcbSupplierProduct.getItemAt(i);
            String[] parts = supplierCombo.split("-");
            String currentSupplierId = parts[1].strip();
            
            if (currentSupplierId.equals(supplierId)) 
            {
                jcbSupplierProduct.removeItemAt(i);
                break; 
            }
        }
    }

    
    public void refreshSuppliersTable(List<Supplier> suppliers)
    {
        int rowCount = modelSupplier.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
            modelSupplier.removeRow(i);
        }
        
        for(Supplier supplier: suppliers)
        {
            String id = supplier.getId();
            String name = supplier.getName();
            String surnames = supplier.getSurnames();
            String phoneNumber = supplier.getPhoneNumber();

            modelSupplier.addRow(new Object[]{id, name, surnames, phoneNumber}); 
        }
    }
    //--------------------------------------------------------------------------------------------------
    
    //CUSTOMERS:----------------------------------------------------------------------------------------
    
    public String getTextIdCustomer()
    {
        return jtfIdCustomer.getText();
    }
    
    public void setTextIdCustomer(String text)
    {
        jtfIdCustomer.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextNameCustomer()
    {
        return jtfNameCustomer.getText();
    }
    
    public void setTextNameCustomer(String text)
    {
        jtfNameCustomer.setText(text);
    }
    
    //----------------------------------------
        
    public String getTextSurnamesCustomer()
    {
        return jtfSurnamesCustomer.getText();
    }
    
    public void setTextSurnamesCustomer(String text)
    {
        jtfSurnamesCustomer.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextPhoneNumberCustomer()
    {
        return jtfPhoneNumberCustomer.getText();
    }
    
    public void setTextPhoneNumberCustomer(String text)
    {
        jtfPhoneNumberCustomer.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextSearchCustomer()
    {
        return jtfSearchCustomer.getText();
    }
    
    public void setTextSearchCustomer(String text)
    {
        jtfSearchCustomer.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextDeleteCustomer()
    {
        return jtfDeleteCustomer.getText();
    }
    
    public void setTextDeleteCustomer(String text)
    {
        jtfDeleteCustomer.setText(text);
    }
            
    //----------------------------------------
    
    public boolean cleanCustomerForm()
    {
        jtfIdCustomer.setText("");
        jtfNameCustomer.setText("");
        jtfSurnamesCustomer.setText("");
        jtfPhoneNumberCustomer.setText("");
        jtfSearchCustomer.setText("");
        jtfDeleteCustomer.setText("");
        jtfDeleteCustomer.setText("");
        
        return true;
    }
    
    public void addRecordCustomer(Customer customer)
    {
        String id = customer.getId();
        String name = customer.getName();
        String surnames = customer.getSurnames();
        String phoneNumber = customer.getPhoneNumber();
        
        modelCustomer.addRow(new Object[]{id, name, surnames, phoneNumber}); 
        addJcbCustomerSell(name, id);
    }
    
    public void refreshCustomersTable(List<Customer> customers)
    {
        int rowCount = modelCustomer.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
            modelCustomer.removeRow(i);
        }
        
        for(Customer customer: customers)
        {
            String id = customer.getId();
            String name = customer.getName();
            String surnames = customer.getSurnames();
            String phoneNumber = customer.getPhoneNumber();

            modelCustomer.addRow(new Object[]{id, name, surnames, phoneNumber}); 
        }
    }
    //--------------------------------------------------------------------------------------------------
    
    //PRODUCTS:----------------------------------------------------------------------------------------
    
    public String getTextIdProduct()
    {
        return jtfIdProduct.getText();
    }
    
    public void setTextIdProduct(String text)
    {
        jtfIdProduct.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextNameProduct()
    {
        return jtfProductNameProduct.getText();
    }
    
    public void setTextNameProduct(String text)
    {
        jtfProductNameProduct.setText(text);
    }
    
    //----------------------------------------
        
    public String getTextSupplierProduct()
    {
        return (String) jcbSupplierProduct.getSelectedItem();
    }
    
    public void setTextSupplierProduct(String text)
    {
        jcbSupplierProduct.setSelectedItem(text);
    }
    
    //----------------------------------------
    
    public String getTexPriceProduct()
    {
        return jtfPriceProduct.getText();
    }
    
    public void setTextPriceProduct(int text) 
    {
        jtfPriceProduct.setText(String.valueOf(text));
    }

    
    //----------------------------------------
    
    public int getTexQuantityProduct()
    {
        return (int) jsQuantityProduct.getValue();
    }
    
    public void setTexQuantityProduct(int text)
    {
        jsQuantityProduct.setValue(text);
    }
    
    //----------------------------------------
    
    public String getTextSearchProduct()
    {
        return jtfSearchProduct.getText();
    }
    
    public void setTextSearchProduct(String text)
    {
        jtfSearchProduct.setText(text);
    }
    
    //----------------------------------------
    
    public String getTextDeleteProduct()
    {
        return jtfDeleteProduct.getText();
    }
    
    public void setTextDeleteProduct(String text)
    {
        jtfDeleteProduct.setText(text);
    }
            
    //----------------------------------------
    
    public boolean cleanProductForm()
    {
        jtfIdProduct.setText("");
        jtfProductNameProduct.setText("");
        jcbSupplierProduct.setSelectedIndex(-1);
        jtfPhoneNumberCustomer.setText("");
        jtfPriceProduct.setText("");
        jsQuantityProduct.setValue(0);
        jtfSearchProduct.setText("");
        jtfDeleteProduct.setText("");
        
        return true;
    }
    
    public void addRecordProduct(Product product)
    {
        String id = product.getId();
        String name = product.getProductName();
        String supplier = product.getSupplier();
        int price = product.getPrice();
        int quantity = product.getQuantity();
        
        modelProduct.addRow(new Object[]{id, name, supplier, price, quantity});  
        addJcbProductBuy(name, id);
        addJcbProductSell(name, id);
    }
    
    public void refreshProductsTable(List<Product> products)
    {
        int rowCount = modelProduct.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
            modelProduct.removeRow(i);
        }
        
        for(Product product: products)
        {
            String id = product.getId();
            String name = product.getProductName();
            String supplier = product.getSupplier();
            int price = product.getPrice();
            int quantity = product.getQuantity();

            modelProduct.addRow(new Object[]{id, name, supplier, price, quantity});        
        }
    }
    
    public void addJcbSupplierProduct(String name, String id)
    {
        jcbSupplierProduct.addItem(name + "-" + id);
    }
    
    //BUY-----------------------------------------------------------------------------------------------
    
    public String getTextSupplierBuy()
    {
        return (String) jcbSupplierBuy.getSelectedItem();
    }
    
    public void setTextSupplierBuy(String text)
    {
        jcbSupplierBuy.setSelectedItem(text);
    }
    
    //----------------------------------------
    
    public String getTextProductBuy()
    {
        return (String) jcbProductBuy.getSelectedItem();
    }
    
    public void setTextProductBuy(String text)
    {
        jcbProductBuy.setSelectedItem(text);
    }
    
    //----------------------------------------
    
    public String getPriceBuy()
    {
        return jtfPriceBuy.getText();
    }
    
    public void setPriceBuy(int text)
    {
        jtfPriceBuy.setText(String.valueOf(text));
    }
    
    //----------------------------------------
    
    public int getQuantityBuy()
    {
        return (int) jsQuantityBuy.getValue();
    }
    
    public void setQuantityBuy(int text)
    {
        jsQuantityBuy.setValue(text);
    }
    
    //----------------------------------------
    
    public void cleanBuyForm()
    {
        jcbSupplierBuy.setSelectedIndex(-1);
        jcbProductBuy.setSelectedIndex(-1);
        jtfPriceBuy.setText("");
        jsQuantityBuy.setValue(0);
    }
    
    
    public void addRecordBuy(Buy buy)
    {
        String supplier = buy.getSupplier();
        String product = buy.getProduct();
        int price = buy.getPrice();
        int quantity = buy.getQuantity();
        
        modelBuy.addRow(new Object[]{supplier, product, price, quantity});    
        cleanBuyForm();
    }
    
    public void addJcbSupplierBuy(String name, String id)
    {
        jcbSupplierBuy.addItem(name + "-" + id);
    }
    
    public void addJcbProductBuy(String name, String id)
    {
        jcbProductBuy.addItem(name + "-" + id);
    }
    
    //--------------------------------------------------------------------------------------------------
    
    //SELL-----------------------------------------------------------------------------------------------    
    
    public String getCustomerSell()
    {
        return (String) jcbCustomerSell.getSelectedItem();
    }
    
    public void setCustomerSell(String text)
    {
        jcbCustomerSell.setSelectedItem(text);
    }
    
    //----------------------------------------
    
    public String getProductSell()
    {
        return (String) jcbProductSell.getSelectedItem();
    }
    
    public void setProductSell(String text)
    {
        jcbProductSell.setSelectedItem(text);
    }
    
    //----------------------------------------
    
    public String getPriceSell()
    {
        return jtfPriceSell.getText();
    }
    
    public void setPriceSell(int text)
    {
        jtfPriceSell.setText(String.valueOf(text));
    }
    
    //----------------------------------------
    
    public int getQuantitySell()
    {
        return (int) jsQuantitySell.getValue();
    }
    
    public void setQuantitySell(int text)
    {
        jsQuantitySell.setValue(text);
    }
    
    //----------------------------------------
    
    public void cleanSellForm()
    {
        jcbCustomerSell.setSelectedIndex(-1);
        jcbProductSell.setSelectedIndex(-1);
        jtfPriceSell.setText("");
        jsQuantitySell.setValue(0);
    }
    
    
    public void addRecordSell(Sell sell)
    {
        String customer = sell.getCustomer();
        String product = sell.getProduct();
        int price = sell.getUnitPrice();
        int quantity = sell.getQuantity();
        
        modelSell.addRow(new Object[]{customer, product, price, quantity});    
        cleanSellForm();
    }
    
    public void addJcbCustomerSell(String name, String id)
    {
        jcbCustomerSell.addItem(name + "-" + id);
    }
    
    public void addJcbProductSell(String name, String id)
    {
        jcbProductSell.addItem(name + "-" + id);
    }
    
    //--------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpSell = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbCustomerSell = new javax.swing.JComboBox<>();
        jcbProductSell = new javax.swing.JComboBox<>();
        jsQuantitySell = new javax.swing.JSpinner();
        jbSell = new javax.swing.JButton();
        jbCleanFormSell = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jtfPriceSell = new javax.swing.JTextField();
        jpBuy = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcbSupplierBuy = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcbProductBuy = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jsQuantityBuy = new javax.swing.JSpinner();
        jbCleanFormBuy = new javax.swing.JButton();
        jbBuy = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jtfPriceBuy = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtfIdProduct = new javax.swing.JTextField();
        jtfProductNameProduct = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtfDeleteProduct = new javax.swing.JTextField();
        jbDeleteProduct = new javax.swing.JButton();
        jtfSearchProduct = new javax.swing.JTextField();
        jbSearchProduct = new javax.swing.JButton();
        jbListAllProduct = new javax.swing.JButton();
        jbUpdateProduct = new javax.swing.JButton();
        jbSaveProduct = new javax.swing.JButton();
        jcbSupplierProduct = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jtfPriceProduct = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtProduct = new javax.swing.JTable();
        jsQuantityProduct = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfIdCustomer = new javax.swing.JTextField();
        jtfNameCustomer = new javax.swing.JTextField();
        jtfSurnamesCustomer = new javax.swing.JTextField();
        jtfPhoneNumberCustomer = new javax.swing.JTextField();
        jbSaveCustomer = new javax.swing.JButton();
        jbUpdateCustomer = new javax.swing.JButton();
        jbListAllCustomer = new javax.swing.JButton();
        jbSearchCustomer = new javax.swing.JButton();
        jbDeleteCustomer = new javax.swing.JButton();
        jtfSearchCustomer = new javax.swing.JTextField();
        jtfDeleteCustomer = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtCustomers = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfIdSupplier = new javax.swing.JTextField();
        jtfNameSupplier = new javax.swing.JTextField();
        jtfSurnamesSupplier = new javax.swing.JTextField();
        jtfPhoneNumberSupplier = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtfDeleteSupplier = new javax.swing.JTextField();
        jbSupplierDelete = new javax.swing.JButton();
        jtfSearchSupplier = new javax.swing.JTextField();
        jbSupplierSearch = new javax.swing.JButton();
        jbSupplierListAll = new javax.swing.JButton();
        jbSupplierUpdate = new javax.swing.JButton();
        jbSupplierSave = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtSupplier = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jtSales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtBuyRecords = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(850, 650));
        setPreferredSize(new java.awt.Dimension(850, 720));
        getContentPane().setLayout(null);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(850, 850));

        jpSell.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel1.setText("SELL");
        jpSell.add(jLabel1);
        jLabel1.setBounds(350, 20, 110, 60);

        jpSell.add(jcbCustomerSell);
        jcbCustomerSell.setBounds(390, 180, 250, 26);

        jpSell.add(jcbProductSell);
        jcbProductSell.setBounds(390, 230, 250, 26);
        jpSell.add(jsQuantitySell);
        jsQuantitySell.setBounds(390, 360, 80, 26);

        jbSell.setText("SELL");
        jpSell.add(jbSell);
        jbSell.setBounds(440, 540, 140, 27);

        jbCleanFormSell.setText("CLEAN FORM");
        jpSell.add(jbCleanFormSell);
        jbCleanFormSell.setBounds(220, 540, 130, 27);

        jLabel22.setText("QUANTITY:");
        jpSell.add(jLabel22);
        jLabel22.setBounds(210, 370, 90, 16);

        jLabel23.setText("UNIT PRICE:");
        jpSell.add(jLabel23);
        jLabel23.setBounds(210, 280, 150, 16);

        jLabel24.setText("PRODUCT:");
        jpSell.add(jLabel24);
        jLabel24.setBounds(210, 240, 150, 16);

        jLabel25.setText("CUSTOMER:");
        jpSell.add(jLabel25);
        jLabel25.setBounds(210, 190, 100, 16);
        jpSell.add(jtfPriceSell);
        jtfPriceSell.setBounds(390, 270, 250, 26);

        jTabbedPane1.addTab("SELL", jpSell);

        jpBuy.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel2.setText("BUY");
        jpBuy.add(jLabel2);
        jLabel2.setBounds(340, 10, 110, 60);

        jLabel10.setText("SUPPLIER:");
        jpBuy.add(jLabel10);
        jLabel10.setBounds(220, 160, 100, 16);

        jpBuy.add(jcbSupplierBuy);
        jcbSupplierBuy.setBounds(400, 150, 250, 26);

        jLabel11.setText("PRODUCT:");
        jpBuy.add(jLabel11);
        jLabel11.setBounds(220, 210, 130, 16);

        jpBuy.add(jcbProductBuy);
        jcbProductBuy.setBounds(400, 200, 250, 26);

        jLabel12.setText("QUANTITY:");
        jpBuy.add(jLabel12);
        jLabel12.setBounds(220, 360, 90, 16);
        jpBuy.add(jsQuantityBuy);
        jsQuantityBuy.setBounds(400, 350, 80, 26);

        jbCleanFormBuy.setText("CLEAN FORM");
        jpBuy.add(jbCleanFormBuy);
        jbCleanFormBuy.setBounds(200, 550, 150, 27);

        jbBuy.setText("BUY");
        jpBuy.add(jbBuy);
        jbBuy.setBounds(450, 550, 160, 27);

        jLabel19.setText("UNIT PRICE:");
        jpBuy.add(jLabel19);
        jLabel19.setBounds(220, 270, 150, 16);
        jpBuy.add(jtfPriceBuy);
        jtfPriceBuy.setBounds(400, 260, 250, 26);

        jTabbedPane1.addTab("BUY", jpBuy);

        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel4.setText("PRODUCTS");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(300, 10, 260, 80);

        jLabel18.setText("ID:");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(170, 90, 120, 16);

        jtfIdProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdProductActionPerformed(evt);
            }
        });
        jPanel3.add(jtfIdProduct);
        jtfIdProduct.setBounds(360, 80, 320, 26);
        jPanel3.add(jtfProductNameProduct);
        jtfProductNameProduct.setBounds(360, 130, 320, 26);

        jLabel20.setText("SUPPLIER:");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(170, 190, 120, 16);

        jLabel21.setText("PRODUCT NAME:");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(170, 140, 120, 16);
        jPanel3.add(jtfDeleteProduct);
        jtfDeleteProduct.setBounds(700, 560, 120, 26);

        jbDeleteProduct.setText("DELETE");
        jPanel3.add(jbDeleteProduct);
        jbDeleteProduct.setBounds(700, 600, 120, 27);
        jPanel3.add(jtfSearchProduct);
        jtfSearchProduct.setBounds(540, 560, 120, 26);

        jbSearchProduct.setText("SEARCH");
        jPanel3.add(jbSearchProduct);
        jbSearchProduct.setBounds(540, 600, 120, 27);

        jbListAllProduct.setText("LIST ALL");
        jPanel3.add(jbListAllProduct);
        jbListAllProduct.setBounds(380, 600, 120, 27);

        jbUpdateProduct.setText("UPDATE");
        jPanel3.add(jbUpdateProduct);
        jbUpdateProduct.setBounds(220, 600, 120, 27);

        jbSaveProduct.setText("SAVE");
        jPanel3.add(jbSaveProduct);
        jbSaveProduct.setBounds(50, 600, 120, 27);

        jPanel3.add(jcbSupplierProduct);
        jcbSupplierProduct.setBounds(360, 180, 320, 26);

        jLabel13.setText("PRICE:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(170, 240, 160, 16);
        jPanel3.add(jtfPriceProduct);
        jtfPriceProduct.setBounds(360, 230, 320, 30);

        jtProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCT NAME", "SUPPLIER", "PRICE", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jtProduct);

        jPanel3.add(jScrollPane8);
        jScrollPane8.setBounds(50, 316, 770, 230);
        jPanel3.add(jsQuantityProduct);
        jsQuantityProduct.setBounds(360, 280, 80, 26);

        jLabel26.setText("QUANTITY:");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(170, 285, 90, 16);

        jTabbedPane1.addTab("PRODUCTS", jPanel3);

        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel5.setText("CUSTOMERS");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(290, 10, 200, 80);

        jLabel6.setText("ID:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(170, 90, 120, 16);

        jLabel7.setText("NAME:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(170, 140, 120, 16);

        jLabel8.setText("SURNAMES:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(170, 190, 120, 16);

        jLabel9.setText("PHONE NUMBER:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(170, 240, 120, 16);

        jtfIdCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdCustomerActionPerformed(evt);
            }
        });
        jPanel4.add(jtfIdCustomer);
        jtfIdCustomer.setBounds(360, 80, 320, 26);
        jPanel4.add(jtfNameCustomer);
        jtfNameCustomer.setBounds(360, 130, 320, 26);
        jPanel4.add(jtfSurnamesCustomer);
        jtfSurnamesCustomer.setBounds(360, 180, 320, 26);
        jPanel4.add(jtfPhoneNumberCustomer);
        jtfPhoneNumberCustomer.setBounds(360, 230, 320, 26);

        jbSaveCustomer.setText("SAVE");
        jPanel4.add(jbSaveCustomer);
        jbSaveCustomer.setBounds(50, 600, 120, 27);

        jbUpdateCustomer.setText("UPDATE");
        jPanel4.add(jbUpdateCustomer);
        jbUpdateCustomer.setBounds(220, 600, 120, 27);

        jbListAllCustomer.setText("LIST ALL");
        jPanel4.add(jbListAllCustomer);
        jbListAllCustomer.setBounds(380, 600, 120, 27);

        jbSearchCustomer.setText("SEARCH");
        jPanel4.add(jbSearchCustomer);
        jbSearchCustomer.setBounds(540, 600, 120, 27);

        jbDeleteCustomer.setText("DELETE");
        jPanel4.add(jbDeleteCustomer);
        jbDeleteCustomer.setBounds(700, 600, 120, 27);
        jPanel4.add(jtfSearchCustomer);
        jtfSearchCustomer.setBounds(540, 560, 120, 26);
        jPanel4.add(jtfDeleteCustomer);
        jtfDeleteCustomer.setBounds(700, 560, 120, 26);

        jtCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SURNAMES", "PHONE NUMBER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jtCustomers);

        jPanel4.add(jScrollPane9);
        jScrollPane9.setBounds(50, 286, 770, 250);

        jTabbedPane1.addTab("CUSTOMERS", jPanel4);

        jPanel5.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel3.setText("SUPPLIERS");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(290, 10, 260, 80);

        jLabel14.setText("ID:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(170, 90, 120, 16);

        jtfIdSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdSupplierActionPerformed(evt);
            }
        });
        jPanel5.add(jtfIdSupplier);
        jtfIdSupplier.setBounds(360, 80, 320, 26);
        jPanel5.add(jtfNameSupplier);
        jtfNameSupplier.setBounds(360, 130, 320, 26);
        jPanel5.add(jtfSurnamesSupplier);
        jtfSurnamesSupplier.setBounds(360, 180, 320, 26);
        jPanel5.add(jtfPhoneNumberSupplier);
        jtfPhoneNumberSupplier.setBounds(360, 230, 320, 26);

        jLabel15.setText("PHONE NUMBER:");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(170, 240, 120, 16);

        jLabel16.setText("SURNAMES:");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(170, 190, 120, 16);

        jLabel17.setText("NAME:");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(170, 140, 120, 16);
        jPanel5.add(jtfDeleteSupplier);
        jtfDeleteSupplier.setBounds(700, 560, 120, 26);

        jbSupplierDelete.setText("DELETE");
        jPanel5.add(jbSupplierDelete);
        jbSupplierDelete.setBounds(700, 600, 120, 27);
        jPanel5.add(jtfSearchSupplier);
        jtfSearchSupplier.setBounds(540, 560, 120, 26);

        jbSupplierSearch.setText("SEARCH");
        jPanel5.add(jbSupplierSearch);
        jbSupplierSearch.setBounds(540, 600, 120, 27);

        jbSupplierListAll.setText("LIST ALL");
        jPanel5.add(jbSupplierListAll);
        jbSupplierListAll.setBounds(380, 600, 120, 27);

        jbSupplierUpdate.setText("UPDATE");
        jPanel5.add(jbSupplierUpdate);
        jbSupplierUpdate.setBounds(220, 600, 120, 27);

        jbSupplierSave.setText("SAVE");
        jPanel5.add(jbSupplierSave);
        jbSupplierSave.setBounds(50, 600, 120, 27);

        jtSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SURNAMES", "PHONE NUMBER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jtSupplier);

        jPanel5.add(jScrollPane10);
        jScrollPane10.setBounds(50, 286, 770, 250);

        jTabbedPane1.addTab("SUPPLIERS", jPanel5);

        jPanel1.setLayout(null);

        jtSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jtSales);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(50, 30, 750, 580);

        jTabbedPane1.addTab("SALES RECORD", jPanel1);

        jPanel2.setLayout(null);

        jtBuyRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUPPLIER", "PRODUCT", "PRICE", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jtBuyRecords);

        jPanel2.add(jScrollPane12);
        jScrollPane12.setBounds(50, 30, 750, 580);

        jTabbedPane1.addTab("BUYS RECORD", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 850, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdCustomerActionPerformed

    private void jtfIdSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdSupplierActionPerformed

    private void jtfIdProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdProductActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbBuy;
    private javax.swing.JButton jbCleanFormBuy;
    private javax.swing.JButton jbCleanFormSell;
    private javax.swing.JButton jbDeleteCustomer;
    private javax.swing.JButton jbDeleteProduct;
    private javax.swing.JButton jbListAllCustomer;
    private javax.swing.JButton jbListAllProduct;
    private javax.swing.JButton jbSaveCustomer;
    private javax.swing.JButton jbSaveProduct;
    private javax.swing.JButton jbSearchCustomer;
    private javax.swing.JButton jbSearchProduct;
    private javax.swing.JButton jbSell;
    private javax.swing.JButton jbSupplierDelete;
    private javax.swing.JButton jbSupplierListAll;
    private javax.swing.JButton jbSupplierSave;
    private javax.swing.JButton jbSupplierSearch;
    private javax.swing.JButton jbSupplierUpdate;
    private javax.swing.JButton jbUpdateCustomer;
    private javax.swing.JButton jbUpdateProduct;
    private javax.swing.JComboBox<String> jcbCustomerSell;
    private javax.swing.JComboBox<String> jcbProductBuy;
    private javax.swing.JComboBox<String> jcbProductSell;
    private javax.swing.JComboBox<String> jcbSupplierBuy;
    private javax.swing.JComboBox<String> jcbSupplierProduct;
    private javax.swing.JPanel jpBuy;
    private javax.swing.JPanel jpSell;
    private javax.swing.JSpinner jsQuantityBuy;
    private javax.swing.JSpinner jsQuantityProduct;
    private javax.swing.JSpinner jsQuantitySell;
    private javax.swing.JTable jtBuyRecords;
    private javax.swing.JTable jtCustomers;
    private javax.swing.JTable jtProduct;
    private javax.swing.JTable jtSales;
    private javax.swing.JTable jtSupplier;
    private javax.swing.JTextField jtfDeleteCustomer;
    private javax.swing.JTextField jtfDeleteProduct;
    private javax.swing.JTextField jtfDeleteSupplier;
    private javax.swing.JTextField jtfIdCustomer;
    private javax.swing.JTextField jtfIdProduct;
    private javax.swing.JTextField jtfIdSupplier;
    private javax.swing.JTextField jtfNameCustomer;
    private javax.swing.JTextField jtfNameSupplier;
    private javax.swing.JTextField jtfPhoneNumberCustomer;
    private javax.swing.JTextField jtfPhoneNumberSupplier;
    private javax.swing.JTextField jtfPriceBuy;
    private javax.swing.JTextField jtfPriceProduct;
    private javax.swing.JTextField jtfPriceSell;
    private javax.swing.JTextField jtfProductNameProduct;
    private javax.swing.JTextField jtfSearchCustomer;
    private javax.swing.JTextField jtfSearchProduct;
    private javax.swing.JTextField jtfSearchSupplier;
    private javax.swing.JTextField jtfSurnamesCustomer;
    private javax.swing.JTextField jtfSurnamesSupplier;
    // End of variables declaration//GEN-END:variables
}
