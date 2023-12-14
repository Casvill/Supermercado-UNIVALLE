package view;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Customer;
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
    
    public MainView() 
    {
        initComponents();
        modelSupplier = (DefaultTableModel) jtSupplier.getModel();
        modelCustomer = (DefaultTableModel) jtCustomers.getModel();        
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpSell = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jSpinner2 = new javax.swing.JSpinner();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jpBuy = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jftIdProduct = new javax.swing.JTextField();
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
        jtfProductDescriptionProduct = new javax.swing.JTextField();
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
        jTable6 = new javax.swing.JTable();

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

        jpSell.add(jComboBox4);
        jComboBox4.setBounds(400, 80, 250, 22);

        jpSell.add(jComboBox5);
        jComboBox5.setBounds(400, 130, 250, 22);
        jpSell.add(jSpinner2);
        jSpinner2.setBounds(400, 260, 80, 22);

        jButton18.setText("SELL");
        jpSell.add(jButton18);
        jButton18.setBounds(450, 580, 140, 23);

        jButton19.setText("CLEAN FORM");
        jpSell.add(jButton19);
        jButton19.setBounds(230, 580, 130, 23);

        jLabel22.setText("QUANTITY:");
        jpSell.add(jLabel22);
        jLabel22.setBounds(220, 270, 90, 16);

        jLabel23.setText("PRICE:");
        jpSell.add(jLabel23);
        jLabel23.setBounds(220, 180, 150, 16);

        jLabel24.setText("PRODUCT NAME:");
        jpSell.add(jLabel24);
        jLabel24.setBounds(220, 140, 100, 16);

        jLabel25.setText("CUSTOMER:");
        jpSell.add(jLabel25);
        jLabel25.setBounds(220, 90, 100, 16);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CUSTOMER", "PRODUCT ID", "PRODUCT NAME", "PRODUCT DESCRIPTION", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable1);

        jpSell.add(jScrollPane6);
        jScrollPane6.setBounds(70, 356, 740, 200);

        jButton20.setText("ADD PRODUCT");
        jpSell.add(jButton20);
        jButton20.setBounds(400, 310, 190, 23);

        jButton22.setText("DELETE PRODUCT");
        jpSell.add(jButton22);
        jButton22.setBounds(600, 310, 200, 23);
        jpSell.add(jTextField8);
        jTextField8.setBounds(400, 170, 250, 22);

        jTabbedPane1.addTab("SELL", jpSell);

        jpBuy.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel2.setText("BUY");
        jpBuy.add(jLabel2);
        jLabel2.setBounds(340, 10, 110, 60);

        jLabel10.setText("SUPPLIER:");
        jpBuy.add(jLabel10);
        jLabel10.setBounds(220, 80, 100, 16);

        jpBuy.add(jComboBox2);
        jComboBox2.setBounds(400, 70, 250, 22);

        jLabel11.setText("PRODUCT NAME:");
        jpBuy.add(jLabel11);
        jLabel11.setBounds(220, 130, 100, 16);

        jpBuy.add(jComboBox3);
        jComboBox3.setBounds(400, 120, 250, 22);

        jLabel12.setText("QUANTITY:");
        jpBuy.add(jLabel12);
        jLabel12.setBounds(220, 280, 90, 16);
        jpBuy.add(jSpinner1);
        jSpinner1.setBounds(400, 270, 80, 22);

        jButton16.setText("CLEAN FORM");
        jpBuy.add(jButton16);
        jButton16.setBounds(200, 590, 150, 23);

        jButton17.setText("BUY");
        jpBuy.add(jButton17);
        jButton17.setBounds(450, 590, 160, 23);

        jLabel19.setText("PRICE:");
        jpBuy.add(jLabel19);
        jLabel19.setBounds(220, 170, 150, 16);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SUPPLIER", "PRODUCT ID", "PRODUCT NAME", "PRODUCT DESCRIPTION", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable2);

        jpBuy.add(jScrollPane7);
        jScrollPane7.setBounds(70, 356, 740, 200);

        jButton21.setText("ADD PRODUCT");
        jpBuy.add(jButton21);
        jButton21.setBounds(400, 310, 190, 23);

        jButton23.setText("DELETE PRODUCT");
        jpBuy.add(jButton23);
        jButton23.setBounds(600, 310, 200, 23);
        jpBuy.add(jTextField7);
        jTextField7.setBounds(410, 160, 240, 22);

        jTabbedPane1.addTab("BUY", jpBuy);

        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel4.setText("PRODUCTS");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(300, 10, 260, 80);

        jLabel18.setText("ID:");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(170, 90, 120, 16);

        jftIdProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftIdProductActionPerformed(evt);
            }
        });
        jPanel3.add(jftIdProduct);
        jftIdProduct.setBounds(360, 80, 320, 22);
        jPanel3.add(jtfProductNameProduct);
        jtfProductNameProduct.setBounds(360, 130, 320, 22);

        jLabel20.setText("SUPPLIER:");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(170, 190, 120, 16);

        jLabel21.setText("PRODUCT NAME:");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(170, 140, 120, 16);
        jPanel3.add(jtfDeleteProduct);
        jtfDeleteProduct.setBounds(700, 560, 120, 22);

        jbDeleteProduct.setText("DELETE");
        jPanel3.add(jbDeleteProduct);
        jbDeleteProduct.setBounds(700, 600, 120, 23);
        jPanel3.add(jtfSearchProduct);
        jtfSearchProduct.setBounds(540, 560, 120, 22);

        jbSearchProduct.setText("SEARCH");
        jPanel3.add(jbSearchProduct);
        jbSearchProduct.setBounds(540, 600, 120, 23);

        jbListAllProduct.setText("LIST ALL");
        jPanel3.add(jbListAllProduct);
        jbListAllProduct.setBounds(380, 600, 120, 23);

        jbUpdateProduct.setText("UPDATE");
        jPanel3.add(jbUpdateProduct);
        jbUpdateProduct.setBounds(220, 600, 120, 23);

        jbSaveProduct.setText("SAVE");
        jPanel3.add(jbSaveProduct);
        jbSaveProduct.setBounds(50, 600, 120, 23);

        jPanel3.add(jcbSupplierProduct);
        jcbSupplierProduct.setBounds(360, 180, 320, 22);

        jLabel13.setText("PRICE:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(170, 240, 160, 16);
        jPanel3.add(jtfProductDescriptionProduct);
        jtfProductDescriptionProduct.setBounds(360, 230, 320, 30);

        jtProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCT NAME", "P. DESCRIPTION", "SUPPLIER", "QUANTITY"
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
        jsQuantityProduct.setBounds(360, 280, 80, 22);

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
        jtfIdCustomer.setBounds(360, 80, 320, 22);
        jPanel4.add(jtfNameCustomer);
        jtfNameCustomer.setBounds(360, 130, 320, 22);
        jPanel4.add(jtfSurnamesCustomer);
        jtfSurnamesCustomer.setBounds(360, 180, 320, 22);
        jPanel4.add(jtfPhoneNumberCustomer);
        jtfPhoneNumberCustomer.setBounds(360, 230, 320, 22);

        jbSaveCustomer.setText("SAVE");
        jPanel4.add(jbSaveCustomer);
        jbSaveCustomer.setBounds(50, 600, 120, 23);

        jbUpdateCustomer.setText("UPDATE");
        jPanel4.add(jbUpdateCustomer);
        jbUpdateCustomer.setBounds(220, 600, 120, 23);

        jbListAllCustomer.setText("LIST ALL");
        jPanel4.add(jbListAllCustomer);
        jbListAllCustomer.setBounds(380, 600, 120, 23);

        jbSearchCustomer.setText("SEARCH");
        jPanel4.add(jbSearchCustomer);
        jbSearchCustomer.setBounds(540, 600, 120, 23);

        jbDeleteCustomer.setText("DELETE");
        jPanel4.add(jbDeleteCustomer);
        jbDeleteCustomer.setBounds(700, 600, 120, 23);
        jPanel4.add(jtfSearchCustomer);
        jtfSearchCustomer.setBounds(540, 560, 120, 22);
        jPanel4.add(jtfDeleteCustomer);
        jtfDeleteCustomer.setBounds(700, 560, 120, 22);

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
        jtfIdSupplier.setBounds(360, 80, 320, 22);
        jPanel5.add(jtfNameSupplier);
        jtfNameSupplier.setBounds(360, 130, 320, 22);
        jPanel5.add(jtfSurnamesSupplier);
        jtfSurnamesSupplier.setBounds(360, 180, 320, 22);
        jPanel5.add(jtfPhoneNumberSupplier);
        jtfPhoneNumberSupplier.setBounds(360, 230, 320, 22);

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
        jtfDeleteSupplier.setBounds(700, 560, 120, 22);

        jbSupplierDelete.setText("DELETE");
        jPanel5.add(jbSupplierDelete);
        jbSupplierDelete.setBounds(700, 600, 120, 23);
        jPanel5.add(jtfSearchSupplier);
        jtfSearchSupplier.setBounds(540, 560, 120, 22);

        jbSupplierSearch.setText("SEARCH");
        jPanel5.add(jbSupplierSearch);
        jbSupplierSearch.setBounds(540, 600, 120, 23);

        jbSupplierListAll.setText("LIST ALL");
        jPanel5.add(jbSupplierListAll);
        jbSupplierListAll.setBounds(380, 600, 120, 23);

        jbSupplierUpdate.setText("UPDATE");
        jPanel5.add(jbSupplierUpdate);
        jbSupplierUpdate.setBounds(220, 600, 120, 23);

        jbSupplierSave.setText("SAVE");
        jPanel5.add(jbSupplierSave);
        jbSupplierSave.setBounds(50, 600, 120, 23);

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

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable6);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(50, 30, 750, 580);

        jTabbedPane1.addTab("SALES RECORD", jPanel1);

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

    private void jftIdProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftIdProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftIdProductActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton jbDeleteCustomer;
    private javax.swing.JButton jbDeleteProduct;
    private javax.swing.JButton jbListAllCustomer;
    private javax.swing.JButton jbListAllProduct;
    private javax.swing.JButton jbSaveCustomer;
    private javax.swing.JButton jbSaveProduct;
    private javax.swing.JButton jbSearchCustomer;
    private javax.swing.JButton jbSearchProduct;
    private javax.swing.JButton jbSupplierDelete;
    private javax.swing.JButton jbSupplierListAll;
    private javax.swing.JButton jbSupplierSave;
    private javax.swing.JButton jbSupplierSearch;
    private javax.swing.JButton jbSupplierUpdate;
    private javax.swing.JButton jbUpdateCustomer;
    private javax.swing.JButton jbUpdateProduct;
    private javax.swing.JComboBox<String> jcbSupplierProduct;
    private javax.swing.JTextField jftIdProduct;
    private javax.swing.JPanel jpBuy;
    private javax.swing.JPanel jpSell;
    private javax.swing.JSpinner jsQuantityProduct;
    private javax.swing.JTable jtCustomers;
    private javax.swing.JTable jtProduct;
    private javax.swing.JTable jtSupplier;
    private javax.swing.JTextField jtfDeleteCustomer;
    private javax.swing.JTextField jtfDeleteProduct;
    private javax.swing.JTextField jtfDeleteSupplier;
    private javax.swing.JTextField jtfIdCustomer;
    private javax.swing.JTextField jtfIdSupplier;
    private javax.swing.JTextField jtfNameCustomer;
    private javax.swing.JTextField jtfNameSupplier;
    private javax.swing.JTextField jtfPhoneNumberCustomer;
    private javax.swing.JTextField jtfPhoneNumberSupplier;
    private javax.swing.JTextField jtfProductDescriptionProduct;
    private javax.swing.JTextField jtfProductNameProduct;
    private javax.swing.JTextField jtfSearchCustomer;
    private javax.swing.JTextField jtfSearchProduct;
    private javax.swing.JTextField jtfSearchSupplier;
    private javax.swing.JTextField jtfSurnamesCustomer;
    private javax.swing.JTextField jtfSurnamesSupplier;
    // End of variables declaration//GEN-END:variables
}
