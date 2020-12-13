package views;

import config.DBHelper;
import dao.Article_impl;
import entities.Article;
import entities.Catalogue;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;


public class Realizar_V extends javax.swing.JFrame {

    DBHelper helper = new DBHelper();
    Article_impl articleImpl = new Article_impl();
    
    public Realizar_V() {
        initComponents();
        setLocationRelativeTo(null);
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idLabel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateArticlesTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        confirmSale = new javax.swing.JButton();
        catalogue_cmbox = new javax.swing.JComboBox<>();
        cuantitySelector = new javax.swing.JSpinner();
        total_lbl = new javax.swing.JLabel();
        addToBasket_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        existanceLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        saleDetailTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText(" Realizar venta ");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID de producto");

        priceField.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Catálogo");

        idLabel.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total:");

        updateArticlesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID de producto", "ID del catálogo", "Nombre", "Precio de venta", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        updateArticlesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        updateArticlesTable.getTableHeader().setReorderingAllowed(false);
        updateArticlesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateArticlesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(updateArticlesTable);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        confirmSale.setBackground(new java.awt.Color(0, 153, 51));
        confirmSale.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        confirmSale.setForeground(new java.awt.Color(102, 255, 102));
        confirmSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirmar.png"))); // NOI18N
        confirmSale.setText("Confirmar venta");

        catalogue_cmbox.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 14)); // NOI18N
        catalogue_cmbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija uno", "Zapatillas", "Zapato cerrado", "Tenis", "Sandalias/Huaraches" }));
        catalogue_cmbox.setToolTipText("Elija un catálogo");
        catalogue_cmbox.setEnabled(false);
        catalogue_cmbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                catalogue_cmboxItemStateChanged(evt);
            }
        });

        cuantitySelector.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        total_lbl.setForeground(new java.awt.Color(204, 204, 204));
        total_lbl.setText("$0.00");

        addToBasket_btn.setBackground(new java.awt.Color(51, 51, 255));
        addToBasket_btn.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        addToBasket_btn.setForeground(new java.awt.Color(204, 204, 255));
        addToBasket_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadir-al-carrito.png"))); // NOI18N
        addToBasket_btn.setText("Añadir al carrito");
        addToBasket_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBasket_btnActionPerformed(evt);
            }
        });

        home_btn.setBackground(new java.awt.Color(51, 51, 51));
        home_btn.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        home_btn.setForeground(new java.awt.Color(255, 255, 255));
        home_btn.setText("Menú Principal");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalle de venta");

        nameField.setEditable(false);

        existanceLbl.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        existanceLbl.setForeground(new java.awt.Color(0, 0, 0));
        existanceLbl.setText("0");

        saleDetailTable.setBackground(new java.awt.Color(153, 153, 255));
        saleDetailTable.setForeground(new java.awt.Color(51, 51, 51));
        saleDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        saleDetailTable.setSelectionBackground(new java.awt.Color(255, 255, 153));
        saleDetailTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(saleDetailTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(existanceLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(total_lbl)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idLabel)
                                    .addComponent(priceField)
                                    .addComponent(catalogue_cmbox, 0, 1, Short.MAX_VALUE)
                                    .addComponent(cuantitySelector, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(nameField))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addToBasket_btn)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(home_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(confirmSale, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(catalogue_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuantitySelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addComponent(confirmSale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addToBasket_btn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_lbl)
                    .addComponent(existanceLbl))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateArticlesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateArticlesTableMouseClicked
        int row = updateArticlesTable.getSelectedRow();
        if (row>=0) {
            int value = (int) updateArticlesTable.getValueAt(row, 0);
            idLabel.setText(value + "");
            nameField.setText(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getName_article());
            priceField.setText(String.valueOf(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getPrice()));
            catalogue_cmbox.setSelectedIndex(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getId_catalogue());
            existanceLbl.setText(String.valueOf(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getExistance()));
            configSpinner(Integer.valueOf(existanceLbl.getText()));
        }
    }//GEN-LAST:event_updateArticlesTableMouseClicked

    private void catalogue_cmboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catalogue_cmboxItemStateChanged

    }//GEN-LAST:event_catalogue_cmboxItemStateChanged

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        mainMenu main = new mainMenu();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_home_btnActionPerformed

    private void addToBasket_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBasket_btnActionPerformed
        int cuantity = (int) cuantitySelector.getValue();
        if (cuantity == 0 || priceField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione un artículo válido");
        }else{
            getTotalPerArticle(cuantity);
            moveToSaleDetail();
        }
    }//GEN-LAST:event_addToBasket_btnActionPerformed

    void fillTable(){
        List<Article> articleList = articleImpl.getAllArticles(); 
        DefaultTableModel model = (DefaultTableModel) updateArticlesTable.getModel();
        model.setRowCount(0);
        articleList.forEach(a -> {
            model.addRow(new Object[] {a.getId_article(),
                a.getName_article(),Catalogue.typeOfShoe(a.getId_catalogue()),
                a.getPrice(),a.getExistance()});
        });
        
        updateArticlesTable.getModel();
    }
    
    Double getTotalPerArticle(int cuantity){
        
        Double total = (Double) (cuantity * articleImpl.readOne(Integer.valueOf(idLabel.getText())).getPrice());
        try {
            total_lbl.setText("$ " + total);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return total;
    }
    
    void getGlobalTotal(){
        
    }
    
    void moveToSaleDetail(){
        DefaultTableModel model = (DefaultTableModel)saleDetailTable.getModel();
        int cuantity = (int) cuantitySelector.getValue();
        Article article = new Article();
        article.setId_article(Integer.valueOf(idLabel.getText()));
        article.setName_article(nameField.getText());
        article.setPrice(Double.parseDouble(priceField.getText()));
        model.addRow(new Object[]{article.getId_article(),article.getName_article(),article.getPrice(),
            cuantitySelector.getValue(), getTotalPerArticle(cuantity)});
        saleDetailTable.getModel();
        int newStock = 0;
        
        for (int i = 0; i < model.getRowCount(); i++) {
            newStock = (int)model.getValueAt(i, 4) - (int)updateArticlesTable.getValueAt(i, 4);
        }
        
        updateStockForSale(newStock, Integer.valueOf(idLabel.getText()));
        
    }
    
    public boolean updateStockForSale(int resultOf, int id_article) {
        try {
            if (helper.connect()) {
                StringBuilder query = new StringBuilder();
                query.append("UPDATE article SET existence = ").append(resultOf)
                        .append("WHERE id_article = ").append(id_article);
                helper.execute(query.toString(), false);
            }else{
                System.out.println("No es posible conectarse a la base de datos ");
            }
        } catch (Exception e) {
            System.out.println("Error has been ocurred: " + e.getMessage());
        }
        return false;
    }
    
    
    void configSpinner(int maximum){
        SpinnerNumberModel spinner = new SpinnerNumberModel();
        spinner.setValue(1);
        spinner.setMinimum(1);
        spinner.setMaximum(maximum);
        
        cuantitySelector.setModel(spinner);
    }
    
    
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
            java.util.logging.Logger.getLogger(Realizar_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Realizar_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Realizar_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Realizar_V.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Realizar_V().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBasket_btn;
    private javax.swing.JComboBox<String> catalogue_cmbox;
    private javax.swing.JButton confirmSale;
    private javax.swing.JSpinner cuantitySelector;
    private javax.swing.JLabel existanceLbl;
    private javax.swing.JButton home_btn;
    private javax.swing.JTextField idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTable saleDetailTable;
    private javax.swing.JLabel total_lbl;
    private javax.swing.JTable updateArticlesTable;
    // End of variables declaration//GEN-END:variables
}
