package views;

public class mainMenu extends javax.swing.JFrame {

    public mainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        altaArticulos_btn = new javax.swing.JButton();
        actualizacionExistencia_btn = new javax.swing.JButton();
        verArticulos_btn = new javax.swing.JButton();
        bajaArticulo_btn = new javax.swing.JButton();
        consultaInventarioPorArticulo_btn = new javax.swing.JButton();
        registroVentas_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainframe"); // NOI18N
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(102, 102, 102));
        backgroundPanel.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido!");

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        altaArticulos_btn.setBackground(new java.awt.Color(51, 102, 255));
        altaArticulos_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        altaArticulos_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NEW.png"))); // NOI18N
        altaArticulos_btn.setToolTipText("Dar de alta un artículo");
        altaArticulos_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altaArticulos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaArticulos_btnActionPerformed(evt);
            }
        });

        actualizacionExistencia_btn.setBackground(new java.awt.Color(255, 99, 54));
        actualizacionExistencia_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update.png"))); // NOI18N
        actualizacionExistencia_btn.setToolTipText("Actualización de existencia\n o precio");
        actualizacionExistencia_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizacionExistencia_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizacionExistencia_btnActionPerformed(evt);
            }
        });

        verArticulos_btn.setBackground(new java.awt.Color(175, 250, 180));
        verArticulos_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Consulta de artículo por catálogo2.png"))); // NOI18N
        verArticulos_btn.setToolTipText("Consulta de artículos por catálogo");
        verArticulos_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bajaArticulo_btn.setBackground(new java.awt.Color(255, 99, 54));
        bajaArticulo_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bajaArticulo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        bajaArticulo_btn.setToolTipText("Baja de artículo");
        bajaArticulo_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bajaArticulo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaArticulo_btnActionPerformed(evt);
            }
        });

        consultaInventarioPorArticulo_btn.setBackground(new java.awt.Color(255, 255, 51));
        consultaInventarioPorArticulo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boxes.png"))); // NOI18N
        consultaInventarioPorArticulo_btn.setToolTipText("Consulta total de inventario");
        consultaInventarioPorArticulo_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        registroVentas_btn.setBackground(new java.awt.Color(102, 51, 255));
        registroVentas_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sales.png"))); // NOI18N
        registroVentas_btn.setToolTipText("Registro de venta");
        registroVentas_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizacionExistencia_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajaArticulo_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altaArticulos_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultaInventarioPorArticulo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroVentas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verArticulos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultaInventarioPorArticulo_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addComponent(altaArticulos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bajaArticulo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(verArticulos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registroVentas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(actualizacionExistencia_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void altaArticulos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaArticulos_btnActionPerformed
        addArticle_Form addArticle = new addArticle_Form();
        addArticle.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_altaArticulos_btnActionPerformed

    private void actualizacionExistencia_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizacionExistencia_btnActionPerformed
        updateArticles_form updateArticles = new updateArticles_form();
        updateArticles.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_actualizacionExistencia_btnActionPerformed

    private void bajaArticulo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaArticulo_btnActionPerformed
        deleteArticle_form deleteArticles = new deleteArticle_form();
        deleteArticles.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bajaArticulo_btnActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton actualizacionExistencia_btn;
    private javax.swing.JButton altaArticulos_btn;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton bajaArticulo_btn;
    private javax.swing.JButton consultaInventarioPorArticulo_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton registroVentas_btn;
    private javax.swing.JButton verArticulos_btn;
    // End of variables declaration//GEN-END:variables
}
