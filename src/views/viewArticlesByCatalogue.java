package views;

import dao.Article_impl;
import entities.Article;
import entities.Catalogue;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class viewArticlesByCatalogue extends javax.swing.JFrame {

    Article_impl articleImpl = new Article_impl();
    
    public viewArticlesByCatalogue() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        catalogue_cmbox = new javax.swing.JComboBox<>();
        consultBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        articlesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(175, 250, 180));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Humanst521 Lt BT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ver artículos por catálogo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel2.setText("Catálogo");

        catalogue_cmbox.setBackground(new java.awt.Color(0, 102, 0));
        catalogue_cmbox.setFont(new java.awt.Font("Humnst777 Lt BT", 0, 14)); // NOI18N
        catalogue_cmbox.setForeground(new java.awt.Color(255, 255, 255));
        catalogue_cmbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija uno", "Zapatillas", "Zapato cerrado", "Tenis", "Sandalias/Huaraches" }));
        catalogue_cmbox.setToolTipText("Elija un catálogo");
        catalogue_cmbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                catalogue_cmboxItemStateChanged(evt);
            }
        });

        consultBtn.setBackground(new java.awt.Color(51, 102, 0));
        consultBtn.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        consultBtn.setForeground(new java.awt.Color(255, 255, 255));
        consultBtn.setText("Consultar");
        consultBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(175, 250, 180));
        homeBtn.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(0, 0, 0));
        homeBtn.setText("Menú Principal");
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        articlesTable.setBackground(new java.awt.Color(0, 51, 51));
        articlesTable.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        articlesTable.setForeground(new java.awt.Color(255, 255, 255));
        articlesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Catalogo", "Nombre", "Precio", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        articlesTable.setRowSelectionAllowed(false);
        articlesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(articlesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(catalogue_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(consultBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(catalogue_cmbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consultBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeBtn)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void catalogue_cmboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_catalogue_cmboxItemStateChanged
    }//GEN-LAST:event_catalogue_cmboxItemStateChanged

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        mainMenu main = new mainMenu();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void consultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultBtnActionPerformed
        fillTable();
    }//GEN-LAST:event_consultBtnActionPerformed

    // It work, but the rows don't disappear when catalogue change
    public void fillTable(){
        DefaultTableModel model = (DefaultTableModel) articlesTable.getModel();
        model.setRowCount(0);
        int catalogue_selection = catalogue_cmbox.getSelectedIndex();
        List<Article> articleList = articleImpl.getByCatalogue(catalogue_selection); 
        
        if (catalogue_selection != 0) {
            for(Article a:articleList){
                model.addRow(new Object[] {a.getId_article(),
                    Catalogue.typeOfShoe(a.getId_catalogue()),a.getName_article(),
                    a.getPrice(),a.getExistance()});
            }
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No existen productos con este ID por el momento");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Elija un catálogo válido");
            model.setRowCount(0);
        }
        articlesTable.setModel(model);
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
            java.util.logging.Logger.getLogger(viewArticlesByCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewArticlesByCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewArticlesByCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewArticlesByCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewArticlesByCatalogue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable articlesTable;
    private javax.swing.JComboBox<String> catalogue_cmbox;
    private javax.swing.JButton consultBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
