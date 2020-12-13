package views;

import dao.Article_impl;
import entities.Article;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class addArticle_Form extends javax.swing.JFrame {

    Article_impl articleImplementation = new Article_impl();
    public addArticle_Form() {
        initComponents();
        setImagetoLabel(0);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salePriceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sliderExistence = new javax.swing.JSlider();
        cuantity_lbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        catalogue_cmbox = new javax.swing.JComboBox<>();
        imageLabel = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        undo_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(254, 250, 249));
        backgroundPanel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N

        Header.setBackground(new java.awt.Color(51, 102, 255));
        Header.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alta en catálogo de artículos");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("ID de producto: (asignación automática en base de datos)");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de producto:");

        nameField.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel4.setText("Precio de venta:");

        salePriceField.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 14)); // NOI18N
        salePriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel5.setText("Existencia");

        sliderExistence.setMaximum(30);
        sliderExistence.setToolTipText("Seleccione una cantidad");
        sliderExistence.setValue(0);
        sliderExistence.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderExistenceStateChanged(evt);
            }
        });

        cuantity_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuantity_lbl.setText("0");

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel6.setText("Catálogo:");

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

        undo_btn.setBackground(new java.awt.Color(255, 204, 204));
        undo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rehacer.png"))); // NOI18N
        undo_btn.setToolTipText("Reestablecer valores");
        undo_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        undo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undo_btnActionPerformed(evt);
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

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catalogue_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sliderExistence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(27, 27, 27))
                                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(51, 51, 51)))
                                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(salePriceField)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(cuantity_lbl)))
                .addGap(18, 18, 18)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(undo_btn)
                .addGap(18, 18, 18)
                .addComponent(submit_btn)
                .addGap(18, 18, 18)
                .addComponent(home_btn)
                .addGap(36, 36, 36))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(salePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(sliderExistence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuantity_lbl)
                        .addGap(49, 49, 49)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(catalogue_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(undo_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(home_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderExistenceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderExistenceStateChanged
        cuantity_lbl.setText(sliderExistence.getValue() + "");
    }//GEN-LAST:event_sliderExistenceStateChanged

    private void catalogue_cmboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catalogue_cmboxItemStateChanged
        setImagetoLabel(0);
    }//GEN-LAST:event_catalogue_cmboxItemStateChanged

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        mainMenu main = new mainMenu();
        main.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_home_btnActionPerformed

    private void undo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undo_btnActionPerformed
        restoreFields();
    }//GEN-LAST:event_undo_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        if (catalogue_cmbox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un catálogo válido");
        }else{
            try{
                if (catalogue_cmbox.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Elije un catálogo válido");
                }else{
                    
                    Article article = new Article();
                    article.setName_article(nameField.getText());
                    article.setPrice(Double.parseDouble(salePriceField.getText()));
                    article.setExistance(sliderExistence.getValue());
                    article.setId_catalogue(catalogue_cmbox.getSelectedIndex());

                    articleImplementation.create(article);
                    restoreFields();
                }
                //if (articleImplementation.stockAvailable(catalogue_cmbox.getSelectedIndex())) {
                    
                //}
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "No puedes ingresar caracteres alfanuméricos en "
                        + "un campo numérico. Por favor, revisa los datos");
            }finally{
                restoreFields();
            }
        }
    }//GEN-LAST:event_submit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(addArticle_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addArticle_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addArticle_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addArticle_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addArticle_Form().setVisible(true);
            }
        });
    }
    
    public void setImagetoLabel(int item){
        item = catalogue_cmbox.getSelectedIndex();
        switch(item){
            case 1:
                setImagetoLabel("../images/tacon_G.png");
                break;
            case 2:
                setImagetoLabel("../images/bota_G.png");
                break;
            case 3:
                setImagetoLabel("../images/zapatillas_G.png");
                break;
            case 4:
                setImagetoLabel("../images/sandalias_G.png");
                break;
        }
    }
    
    //Functions above
    public void setImagetoLabel(String urlFile){
        ImageIcon shoeType;
        ImageIcon icon;
        shoeType = new ImageIcon(getClass().getResource(urlFile));
        icon = new ImageIcon(shoeType.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_DEFAULT));
        imageLabel.setIcon(icon);
    }
    
    public void restoreFields(){
        nameField.setText("");
        salePriceField.setText("");
        sliderExistence.setValue(0);
        catalogue_cmbox.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JComboBox<String> catalogue_cmbox;
    private javax.swing.JLabel cuantity_lbl;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField salePriceField;
    private javax.swing.JSlider sliderExistence;
    private javax.swing.JButton submit_btn;
    private javax.swing.JButton undo_btn;
    // End of variables declaration//GEN-END:variables
}
