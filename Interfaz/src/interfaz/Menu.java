/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static interfaz.Interfaz.v1;

/**
 *
 * @author andres
 */
public class Menu extends javax.swing.JDialog {
   
    /**
     * Creates new form Menu
     */
    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CatalogsButton = new javax.swing.JButton();
        BooksButton = new javax.swing.JButton();
        PersonsButtons = new javax.swing.JButton();
        QueriesButtons = new javax.swing.JButton();
        Lend_BooksButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CatalogsButton.setText("Catalogs");
        CatalogsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogsButtonActionPerformed(evt);
            }
        });

        BooksButton.setText("Books");
        BooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksButtonActionPerformed(evt);
            }
        });

        PersonsButtons.setText("Persons");
        PersonsButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonsButtonsActionPerformed(evt);
            }
        });

        QueriesButtons.setText("Queries");
        QueriesButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueriesButtonsActionPerformed(evt);
            }
        });

        Lend_BooksButton.setText("Lend Books");
        Lend_BooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lend_BooksButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lend_BooksButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CatalogsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PersonsButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QueriesButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(CatalogsButton)
                .addGap(29, 29, 29)
                .addComponent(BooksButton)
                .addGap(27, 27, 27)
                .addComponent(PersonsButtons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Lend_BooksButton)
                .addGap(28, 28, 28)
                .addComponent(QueriesButtons)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatalogsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatalogsButtonActionPerformed
        // TODO add your handling code here:
        catalogos c1;
        c1 = new catalogos(v1,true);
        c1.setVisible(true);
        
    }//GEN-LAST:event_CatalogsButtonActionPerformed

    private void BooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksButtonActionPerformed
        // TODO add your handling code here:
        Books b1 = new Books(v1,true);
        b1.setVisible(true);
    }//GEN-LAST:event_BooksButtonActionPerformed

    private void PersonsButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonsButtonsActionPerformed
        // TODO add your handling code here:
        Persons p1 = new Persons(v1,true);
        p1.setVisible(true);
    }//GEN-LAST:event_PersonsButtonsActionPerformed

    private void Lend_BooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lend_BooksButtonActionPerformed
        // TODO add your handling code here:
        Lendbooks lb1 = new Lendbooks(v1,true);
        lb1.setVisible(true);
    }//GEN-LAST:event_Lend_BooksButtonActionPerformed

    private void QueriesButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueriesButtonsActionPerformed
        // TODO add your handling code here:
        queries vqueries = new queries(v1,true);
        vqueries.setVisible(true);
    }//GEN-LAST:event_QueriesButtonsActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu dialog = new Menu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BooksButton;
    private javax.swing.JButton CatalogsButton;
    private javax.swing.JButton Lend_BooksButton;
    private javax.swing.JButton PersonsButtons;
    private javax.swing.JButton QueriesButtons;
    // End of variables declaration//GEN-END:variables
}
