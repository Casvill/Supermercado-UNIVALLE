package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Daniel Casvill
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setJbDeleteProduct(javax.swing.JButton jbDeleteProduct) {
        this.jbDeleteProducts = jbDeleteProduct;}
    
    public void setJbListAllProducts(javax.swing.JButton jbListAllProducts) {
        this.jbListAllProducts = jbListAllProducts;}
    
    public void setJbSaveProduct(javax.swing.JButton jbSaveProduct) {
        this.jbSaveProducts = jbSaveProduct;}
    
    public void setJbSearchProduct(javax.swing.JButton jbSearchProduct) {
        this.jbSearchProducts = jbSearchProduct;}
    
    public void setJbUpdateProduct(javax.swing.JButton jbUpdateProduct) {
        this.jbUpdateProducts = jbUpdateProduct;}
    
    public javax.swing.JButton getJbDeleteProduct() {
        return jbDeleteProducts;}

    public javax.swing.JButton getJbListAllProducts() {
        return jbListAllProducts;}

    public javax.swing.JButton getJbSaveProduct() {
        return jbSaveProducts;}

    public javax.swing.JButton getJbSearchProduct() {
        return jbSearchProducts;}

    public javax.swing.JButton getJbUpdateProduct() {
        return jbUpdateProducts;}

    public void setJbDeleteCustomer(javax.swing.JButton jbDeleteCustomer) {
        this.jbDeleteCustomers = jbDeleteCustomer;}

    public void setJbListAllCustomers(javax.swing.JButton jbListAllCustomers) {
        this.jbListAllCustomers = jbListAllCustomers;}

    public void setJbSaveCustomer(javax.swing.JButton jbSaveCustomer) {
        this.jbSaveCustomers = jbSaveCustomer;}

    public void setJbSearchCustomer(javax.swing.JButton jbSearchCustomer) {
        this.jbSearchCustomers = jbSearchCustomer;}

    public void setJbUpdateCustomer(javax.swing.JButton jbUpdateCustomer) {
        this.jbUpdateCustomers = jbUpdateCustomer;}

    public javax.swing.JButton getJbDeleteCustomer() {
        return jbDeleteCustomers;}

    public javax.swing.JButton getJbListAllCustomers() {
        return jbListAllCustomers;}

    public javax.swing.JButton getJbSaveCustomer() {
        return jbSaveCustomers;}

    public javax.swing.JButton getJbSearchCustomer() {
        return jbSearchCustomers;}

    public javax.swing.JButton getJbUpdateCustomer() {
        return jbUpdateCustomers;}

    public void setJbDeleteSupplier(javax.swing.JButton jbDeleteSupplier) {
        this.jbDeleteSuppliers = jbDeleteSupplier;}

    public void setJbListAllSuppliers(javax.swing.JButton jbListAllSuppliers) {
        this.jbListAllSuppliers = jbListAllSuppliers;}

    public void setJbSaveSupplier(javax.swing.JButton jbSaveSupplier) {
        this.jbSaveSuppliers = jbSaveSupplier;}

    public void setJbSearchSupplier(javax.swing.JButton jbSearchSupplier) {
        this.jbSearchSuppliers = jbSearchSupplier;}

    public void setJbUpdateSupplier(javax.swing.JButton jbUpdateSupplier) {
        this.jbUpdateSuppliers = jbUpdateSupplier;}

    public javax.swing.JButton getJbDeleteSupplier() {
        return jbDeleteSuppliers;}

    public javax.swing.JButton getJbListAllSuppliers() {
        return jbListAllSuppliers;}

    public javax.swing.JButton getJbSaveSupplier() {
        return jbSaveSuppliers;}

    public javax.swing.JButton getJbSearchSupplier() {
        return jbSearchSuppliers;}

    public javax.swing.JButton getJbUpdateSupplier() {
        return jbUpdateSuppliers;}

    public void addBtnjbDeleteProductListener(ActionListener listenControllers) {
        jbDeleteProducts.addActionListener(listenControllers);}

    public void addBtnjbListAllProductsListener(ActionListener listenControllers) {
        jbListAllProducts.addActionListener(listenControllers);}

    public void addBtnjbSaveProductListener(ActionListener listenControllers) {
        jbSaveProducts.addActionListener(listenControllers);}

    public void addBtnjbSearchProductListener(ActionListener listenControllers) {
        jbSearchProducts.addActionListener(listenControllers);}

    public void addBtnjbUpdateProductListener(ActionListener listenControllers) {
        jbUpdateProducts.addActionListener(listenControllers);}

    public void addBtnjbDeleteCustomerListener(ActionListener listenControllers) {
        jbDeleteCustomers.addActionListener(listenControllers);}

    public void addBtnjbListAllCustomersListener(ActionListener listenControllers) {
        jbListAllCustomers.addActionListener(listenControllers);}

    public void addBtnjbSaveCustomerListener(ActionListener listenControllers) {
        jbSaveCustomers.addActionListener(listenControllers);}

    public void addBtnjbSearchCustomerListener(ActionListener listenControllers) {
        jbSearchCustomers.addActionListener(listenControllers);}

    public void addBtnjbUpdateCustomerListener(ActionListener listenControllers) {
        jbUpdateCustomers.addActionListener(listenControllers);}

    public void addBtnjbDeleteSupplierListener(ActionListener listenControllers) {
        jbDeleteSuppliers.addActionListener(listenControllers);}

    public void addBtnjbListAllSuppliersListener(ActionListener listenControllers) {
        jbListAllSuppliers.addActionListener(listenControllers);}

    public void addBtnjbSaveSupplierListener(ActionListener listenControllers) {
        jbSaveSuppliers.addActionListener(listenControllers);}

    public void addBtnjbSearchSupplierListener(ActionListener listenControllers) {
        jbSearchSuppliers.addActionListener(listenControllers);}

    public void addBtnjbUpdateSupplierListener(ActionListener listenControllers) {
        jbUpdateSuppliers.addActionListener(listenControllers);}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpSell = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jPanelProduts = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jftIdProduct = new javax.swing.JTextField();
        jtfProductNameProduct = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtfDeleteProducts = new javax.swing.JTextField();
        jbDeleteProducts = new javax.swing.JButton();
        jtfSearchProducts = new javax.swing.JTextField();
        jbSearchProducts = new javax.swing.JButton();
        jbListAllProducts = new javax.swing.JButton();
        jbUpdateProducts = new javax.swing.JButton();
        jbSaveProducts = new javax.swing.JButton();
        jcbSupplierProduct = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jtfProductDescriptionProduct = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtProduct = new javax.swing.JTable();
        jsQuantityProduct = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jbSaveCustomers = new javax.swing.JButton();
        jbUpdateCustomers = new javax.swing.JButton();
        jbListAllCustomers = new javax.swing.JButton();
        jbSearchCustomers = new javax.swing.JButton();
        jbDeleteCustomers = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jbDeleteSuppliers = new javax.swing.JButton();
        jbSearchSuppliers = new javax.swing.JButton();
        jbListAllSuppliers = new javax.swing.JButton();
        jbUpdateSuppliers = new javax.swing.JButton();
        jbSaveSuppliers = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanelSalesRecord = new javax.swing.JPanel();
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

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jpSell.add(jScrollPane5);
        jScrollPane5.setBounds(400, 170, 250, 70);
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

        jLabel23.setText("PRODUCT DESCRIPTION:");
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

        jLabel19.setText("PRODUCT DESCRIPTION:");
        jpBuy.add(jLabel19);
        jLabel19.setBounds(220, 170, 150, 16);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jpBuy.add(jScrollPane4);
        jScrollPane4.setBounds(400, 160, 250, 70);

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

        jTabbedPane1.addTab("BUY", jpBuy);

        jPanelProduts.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel4.setText("PRODUCTS");
        jPanelProduts.add(jLabel4);
        jLabel4.setBounds(300, 10, 260, 80);

        jLabel18.setText("ID:");
        jPanelProduts.add(jLabel18);
        jLabel18.setBounds(170, 90, 120, 16);

        jftIdProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftIdProductActionPerformed(evt);
            }
        });
        jPanelProduts.add(jftIdProduct);
        jftIdProduct.setBounds(360, 80, 320, 22);
        jPanelProduts.add(jtfProductNameProduct);
        jtfProductNameProduct.setBounds(360, 130, 320, 22);

        jLabel20.setText("SUPPLIER:");
        jPanelProduts.add(jLabel20);
        jLabel20.setBounds(170, 190, 120, 16);

        jLabel21.setText("PRODUCT NAME:");
        jPanelProduts.add(jLabel21);
        jLabel21.setBounds(170, 140, 120, 16);

        jtfDeleteProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDeleteProductsActionPerformed(evt);
            }
        });
        jPanelProduts.add(jtfDeleteProducts);
        jtfDeleteProducts.setBounds(700, 560, 120, 22);

        jbDeleteProducts.setText("DELETE");
        jPanelProduts.add(jbDeleteProducts);
        jbDeleteProducts.setBounds(700, 600, 120, 23);
        jPanelProduts.add(jtfSearchProducts);
        jtfSearchProducts.setBounds(540, 560, 120, 22);

        jbSearchProducts.setText("SEARCH");
        jbSearchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchProductsActionPerformed(evt);
            }
        });
        jPanelProduts.add(jbSearchProducts);
        jbSearchProducts.setBounds(540, 600, 120, 23);

        jbListAllProducts.setText("LIST ALL");
        jPanelProduts.add(jbListAllProducts);
        jbListAllProducts.setBounds(380, 600, 120, 23);

        jbUpdateProducts.setText("UPDATE");
        jPanelProduts.add(jbUpdateProducts);
        jbUpdateProducts.setBounds(220, 600, 120, 23);

        jbSaveProducts.setText("SAVE");
        jbSaveProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveProductsActionPerformed(evt);
            }
        });
        jPanelProduts.add(jbSaveProducts);
        jbSaveProducts.setBounds(50, 600, 120, 23);

        jPanelProduts.add(jcbSupplierProduct);
        jcbSupplierProduct.setBounds(360, 180, 320, 22);

        jLabel13.setText("PRODUCT DESCRIPTION:");
        jPanelProduts.add(jLabel13);
        jLabel13.setBounds(170, 240, 160, 16);
        jPanelProduts.add(jtfProductDescriptionProduct);
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

        jPanelProduts.add(jScrollPane8);
        jScrollPane8.setBounds(50, 316, 770, 230);
        jPanelProduts.add(jsQuantityProduct);
        jsQuantityProduct.setBounds(360, 280, 80, 22);

        jLabel26.setText("QUANTITY:");
        jPanelProduts.add(jLabel26);
        jLabel26.setBounds(170, 285, 90, 16);

        jTabbedPane1.addTab("PRODUCTS", jPanelProduts);

        jPanelCustomers.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel5.setText("CUSTOMERS");
        jPanelCustomers.add(jLabel5);
        jLabel5.setBounds(290, 10, 200, 80);

        jLabel6.setText("ID:");
        jPanelCustomers.add(jLabel6);
        jLabel6.setBounds(170, 90, 120, 16);

        jLabel7.setText("NAME:");
        jPanelCustomers.add(jLabel7);
        jLabel7.setBounds(170, 140, 120, 16);

        jLabel8.setText("SURNAMES:");
        jPanelCustomers.add(jLabel8);
        jLabel8.setBounds(170, 190, 120, 16);

        jLabel9.setText("PHONE NUMBER:");
        jPanelCustomers.add(jLabel9);
        jLabel9.setBounds(170, 240, 120, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanelCustomers.add(jTextField1);
        jTextField1.setBounds(360, 80, 320, 22);
        jPanelCustomers.add(jTextField2);
        jTextField2.setBounds(360, 130, 320, 22);
        jPanelCustomers.add(jTextField3);
        jTextField3.setBounds(360, 180, 320, 22);
        jPanelCustomers.add(jTextField4);
        jTextField4.setBounds(360, 230, 320, 22);

        jbSaveCustomers.setText("SAVE");
        jbSaveCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveCustomersActionPerformed(evt);
            }
        });
        jPanelCustomers.add(jbSaveCustomers);
        jbSaveCustomers.setBounds(50, 600, 120, 23);

        jbUpdateCustomers.setText("UPDATE");
        jPanelCustomers.add(jbUpdateCustomers);
        jbUpdateCustomers.setBounds(220, 600, 120, 23);

        jbListAllCustomers.setText("LIST ALL");
        jPanelCustomers.add(jbListAllCustomers);
        jbListAllCustomers.setBounds(380, 600, 120, 23);

        jbSearchCustomers.setText("SEARCH");
        jPanelCustomers.add(jbSearchCustomers);
        jbSearchCustomers.setBounds(540, 600, 120, 23);

        jbDeleteCustomers.setText("DELETE");
        jPanelCustomers.add(jbDeleteCustomers);
        jbDeleteCustomers.setBounds(700, 600, 120, 23);
        jPanelCustomers.add(jTextField5);
        jTextField5.setBounds(540, 560, 120, 22);
        jPanelCustomers.add(jTextField6);
        jTextField6.setBounds(700, 560, 120, 22);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jTable4);

        jPanelCustomers.add(jScrollPane9);
        jScrollPane9.setBounds(50, 286, 770, 250);

        jTabbedPane1.addTab("CUSTOMERS", jPanelCustomers);

        jPanelSuppliers.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 28)); // NOI18N
        jLabel3.setText("SUPPLIERS");
        jPanelSuppliers.add(jLabel3);
        jLabel3.setBounds(290, 10, 260, 80);

        jLabel14.setText("ID:");
        jPanelSuppliers.add(jLabel14);
        jLabel14.setBounds(170, 90, 120, 16);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanelSuppliers.add(jTextField11);
        jTextField11.setBounds(360, 80, 320, 22);
        jPanelSuppliers.add(jTextField12);
        jTextField12.setBounds(360, 130, 320, 22);
        jPanelSuppliers.add(jTextField13);
        jTextField13.setBounds(360, 180, 320, 22);
        jPanelSuppliers.add(jTextField14);
        jTextField14.setBounds(360, 230, 320, 22);

        jLabel15.setText("PHONE NUMBER:");
        jPanelSuppliers.add(jLabel15);
        jLabel15.setBounds(170, 240, 120, 16);

        jLabel16.setText("SURNAMES:");
        jPanelSuppliers.add(jLabel16);
        jLabel16.setBounds(170, 190, 120, 16);

        jLabel17.setText("NAME:");
        jPanelSuppliers.add(jLabel17);
        jLabel17.setBounds(170, 140, 120, 16);
        jPanelSuppliers.add(jTextField15);
        jTextField15.setBounds(700, 560, 120, 22);
        jPanelSuppliers.add(jTextField16);
        jTextField16.setBounds(540, 560, 120, 22);

        jbDeleteSuppliers.setText("DELETE");
        jPanelSuppliers.add(jbDeleteSuppliers);
        jbDeleteSuppliers.setBounds(700, 600, 120, 23);

        jbSearchSuppliers.setText("SEARCH");
        jPanelSuppliers.add(jbSearchSuppliers);
        jbSearchSuppliers.setBounds(540, 600, 120, 23);

        jbListAllSuppliers.setText("LIST ALL");
        jPanelSuppliers.add(jbListAllSuppliers);
        jbListAllSuppliers.setBounds(380, 600, 120, 23);

        jbUpdateSuppliers.setText("UPDATE");
        jPanelSuppliers.add(jbUpdateSuppliers);
        jbUpdateSuppliers.setBounds(220, 600, 120, 23);

        jbSaveSuppliers.setText("SAVE");
        jbSaveSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveSuppliersActionPerformed(evt);
            }
        });
        jPanelSuppliers.add(jbSaveSuppliers);
        jbSaveSuppliers.setBounds(50, 600, 120, 23);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jTable5);

        jPanelSuppliers.add(jScrollPane10);
        jScrollPane10.setBounds(50, 286, 770, 250);

        jTabbedPane1.addTab("SUPPLIERS", jPanelSuppliers);

        jPanelSalesRecord.setLayout(null);

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

        jPanelSalesRecord.add(jScrollPane11);
        jScrollPane11.setBounds(50, 30, 750, 580);

        jTabbedPane1.addTab("SALES RECORD", jPanelSalesRecord);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 850, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jftIdProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftIdProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftIdProductActionPerformed

    private void jbSearchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSearchProductsActionPerformed

    private void jbSaveProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSaveProductsActionPerformed

    private void jbSaveCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveCustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSaveCustomersActionPerformed

    private void jbSaveSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveSuppliersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSaveSuppliersActionPerformed

    private void jtfDeleteProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDeleteProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDeleteProductsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

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
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelProduts;
    private javax.swing.JPanel jPanelSalesRecord;
    private javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jbDeleteCustomers;
    private javax.swing.JButton jbDeleteProducts;
    private javax.swing.JButton jbDeleteSuppliers;
    private javax.swing.JButton jbListAllCustomers;
    private javax.swing.JButton jbListAllProducts;
    private javax.swing.JButton jbListAllSuppliers;
    private javax.swing.JButton jbSaveCustomers;
    private javax.swing.JButton jbSaveProducts;
    private javax.swing.JButton jbSaveSuppliers;
    private javax.swing.JButton jbSearchCustomers;
    private javax.swing.JButton jbSearchProducts;
    private javax.swing.JButton jbSearchSuppliers;
    private javax.swing.JButton jbUpdateCustomers;
    private javax.swing.JButton jbUpdateProducts;
    private javax.swing.JButton jbUpdateSuppliers;
    private javax.swing.JComboBox<String> jcbSupplierProduct;
    private javax.swing.JTextField jftIdProduct;
    private javax.swing.JPanel jpBuy;
    private javax.swing.JPanel jpSell;
    private javax.swing.JSpinner jsQuantityProduct;
    private javax.swing.JTable jtProduct;
    private javax.swing.JTextField jtfDeleteProducts;
    private javax.swing.JTextField jtfProductDescriptionProduct;
    private javax.swing.JTextField jtfProductNameProduct;
    private javax.swing.JTextField jtfSearchProducts;
    // End of variables declaration//GEN-END:variables
}
