package views;

import dao.Article_impl;
import entities.Article;
import entities.Catalogue;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class updateArticles_form extends javax.swing.JFrame {

    Article_impl articleImpl = new Article_impl();
    
    public updateArticles_form() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        codigo_producto = new javax.swing.JLabel();
        tipo_producto = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        precio_venta = new javax.swing.JLabel();
        salePriceField = new javax.swing.JTextField();
        existencia = new javax.swing.JLabel();
        sliderExistence = new javax.swing.JSlider();
        cuantity_lbl = new javax.swing.JLabel();
        catalogo = new javax.swing.JLabel();
        catalogue_cmbox = new javax.swing.JComboBox<>();
        submit_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateArticlesTable = new javax.swing.JTable();
        idLabel = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 204));
        backgroundPanel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N

        codigo_producto.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        codigo_producto.setForeground(new java.awt.Color(0, 0, 0));
        codigo_producto.setText("Código de producto");

        tipo_producto.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        tipo_producto.setForeground(new java.awt.Color(0, 0, 0));
        tipo_producto.setText("Tipo de producto:");

        nameField.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 14)); // NOI18N

        precio_venta.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        precio_venta.setForeground(new java.awt.Color(0, 0, 0));
        precio_venta.setText("Precio de venta:");

        salePriceField.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 14)); // NOI18N

        existencia.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        existencia.setForeground(new java.awt.Color(0, 0, 0));
        existencia.setText("Existencia");

        sliderExistence.setMaximum(30);
        sliderExistence.setToolTipText("Seleccione una cantidad");
        sliderExistence.setValue(0);
        sliderExistence.setEnabled(false);
        sliderExistence.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderExistenceStateChanged(evt);
            }
        });

        cuantity_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuantity_lbl.setText("0");

        catalogo.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        catalogo.setForeground(new java.awt.Color(0, 0, 0));
        catalogo.setText("Catálogo:");

        catalogue_cmbox.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 14)); // NOI18N
        catalogue_cmbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija uno", "Zapatillas", "Zapato cerrado", "Tenis", "Sandalias/Huaraches" }));
        catalogue_cmbox.setToolTipText("Elija un catálogo");
        catalogue_cmbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                catalogue_cmboxItemStateChanged(evt);
            }
        });

        submit_btn.setBackground(new java.awt.Color(204, 255, 204));
        submit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marca-de-verificacion.png"))); // NOI18N
        submit_btn.setToolTipText("Confirmar cambios");
        submit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        home_btn.setBackground(new java.awt.Color(153, 153, 255));
        home_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-page.png"))); // NOI18N
        home_btn.setToolTipText("Cancelar y volver al menú principal");
        home_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

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
        if (updateArticlesTable.getColumnModel().getColumnCount() > 0) {
            updateArticlesTable.getColumnModel().getColumn(0).setResizable(false);
            updateArticlesTable.getColumnModel().getColumn(1).setResizable(false);
            updateArticlesTable.getColumnModel().getColumn(3).setResizable(false);
            updateArticlesTable.getColumnModel().getColumn(4).setResizable(false);
        }

        idLabel.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                            .addComponent(existencia)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sliderExistence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanelLayout.createSequentialGroup()
                                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tipo_producto)
                                                .addComponent(precio_venta))
                                            .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                    .addGap(68, 68, 68)
                                                    .addComponent(salePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(backgroundPanelLayout.createSequentialGroup()
                                                    .addGap(28, 28, 28)
                                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(home_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(catalogo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(codigo_producto)
                                            .addComponent(catalogue_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(idLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cuantity_lbl)
                        .addGap(140, 140, 140)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catalogue_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catalogo))
                        .addGap(43, 43, 43)
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codigo_producto)
                        .addGap(18, 18, 18)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tipo_producto)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precio_venta)
                                    .addComponent(salePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(existencia))
                            .addComponent(sliderExistence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuantity_lbl)
                        .addGap(21, 21, 21)
                        .addComponent(submit_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(home_btn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                .addContainerGap())
        );

        Header.setBackground(new java.awt.Color(255, 204, 51));
        Header.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Actualización de existencia / precios por catálogo");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(532, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        mainMenu main = new mainMenu();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_home_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        if (catalogue_cmbox.getSelectedIndex() == 0 || "".equals(idLabel.getText())
            || "".equals(nameField.getText()) || "".equals(precio_venta.getText())
            ) 
        {
            JOptionPane.showMessageDialog(null, "Revisa lo siguiente: "
                    + "\n El catálogo no puede estar por defecto (elija uno)"
                    + "\n No puedes dejar campos vacíos");
        }else{
            try{
                Article article = new Article();
                article.setId_catalogue(catalogue_cmbox.getSelectedIndex());
                article.setName_article(nameField.getText());
                article.setPrice(Double.parseDouble(salePriceField.getText()));
                article.setExistance(sliderExistence.getValue());

                articleImpl.update(Integer.valueOf(idLabel.getText()), article);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El campo de precio"
                        + " solo puede tener valores numéricos");
            }
        }
        restoreFields();
        fillTable();
    }//GEN-LAST:event_submit_btnActionPerformed

    private void catalogue_cmboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catalogue_cmboxItemStateChanged

    }//GEN-LAST:event_catalogue_cmboxItemStateChanged

    private void sliderExistenceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderExistenceStateChanged
        cuantity_lbl.setText(sliderExistence.getValue() + "");
    }//GEN-LAST:event_sliderExistenceStateChanged

    private void updateArticlesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateArticlesTableMouseClicked
        int row = updateArticlesTable.getSelectedRow();
        if (row>=0) {
            int value = (int) updateArticlesTable.getValueAt(row, 0);
            idLabel.setText(value + "");
            nameField.setText(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getName_article());
            salePriceField.setText(String.valueOf(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getPrice()));
            catalogue_cmbox.setEnabled(true);
            sliderExistence.setEnabled(true);
            catalogue_cmbox.setSelectedIndex(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getId_catalogue());
            sliderExistence.setValue(articleImpl.readOne(Integer.valueOf(idLabel.getText())).getExistance());
            cuantity_lbl.setText(String.valueOf(sliderExistence.getValue()));
        }
    }//GEN-LAST:event_updateArticlesTableMouseClicked
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateArticles_form().setVisible(true);
            }
        });
    }
    
    public void fillTable(){
        List<Article> articleList = articleImpl.getAllArticles(); 
        DefaultTableModel model = (DefaultTableModel) updateArticlesTable.getModel();
        model.setRowCount(0);
        articleList.forEach(a -> {
            model.addRow(new Object[] {a.getId_article(),
                Catalogue.typeOfShoe(a.getId_catalogue()),a.getName_article(),
                a.getPrice(),a.getExistance()});
        });
        
        updateArticlesTable.getModel();
    }
    
    public void restoreFields(){
        idLabel.setText("");
        nameField.setText("");
        salePriceField.setText("");
        sliderExistence.setValue(0);
        sliderExistence.setEnabled(false);
        catalogue_cmbox.setSelectedIndex(0);
        catalogue_cmbox.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel catalogo;
    private javax.swing.JComboBox<String> catalogue_cmbox;
    private javax.swing.JLabel codigo_producto;
    private javax.swing.JLabel cuantity_lbl;
    private javax.swing.JLabel existencia;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel precio_venta;
    private javax.swing.JTextField salePriceField;
    private javax.swing.JSlider sliderExistence;
    private javax.swing.JButton submit_btn;
    private javax.swing.JLabel tipo_producto;
    private javax.swing.JTable updateArticlesTable;
    // End of variables declaration//GEN-END:variables
}
