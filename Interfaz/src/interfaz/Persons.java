/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andres
 */
public class Persons extends javax.swing.JDialog {

    /**
     * Creates new form Persons
     */
    public Persons(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PersonsNameTF = new javax.swing.JTextField();
        PersonsLastNameTF = new javax.swing.JTextField();
        RelationshipCB = new javax.swing.JComboBox<>();
        PersonsDateTF1 = new javax.swing.JTextField();
        PersonsDateTF2 = new javax.swing.JTextField();
        PersonsDateTF3 = new javax.swing.JTextField();
        PersonsExeButton = new javax.swing.JButton();
        PersonsActionCB = new javax.swing.JComboBox<>();
        PersonsSeeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        PersonsIdTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PersonsEmailTF = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        PersonsButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Relationship");

        jLabel4.setText("Birthdate");

        PersonsLastNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonsLastNameTFActionPerformed(evt);
            }
        });

        PersonsExeButton.setText("Execute");
        PersonsExeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonsExeButtonActionPerformed(evt);
            }
        });

        PersonsActionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insert", "Update", "Add existing person" }));

        PersonsSeeButton.setText("See");
        PersonsSeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonsSeeButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("ID");

        jLabel7.setText("Email");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Known", "Unknown" }));

        PersonsButton.setText("Persons");
        PersonsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonsButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("year");

        jLabel8.setText("month");

        jLabel9.setText("day");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PersonsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PersonsActionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(PersonsExeButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RelationshipCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(PersonsLastNameTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                                        .addComponent(PersonsNameTF, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PersonsIdTF, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addComponent(PersonsEmailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PersonsDateTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PersonsDateTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jLabel8)))
                                            .addGap(26, 26, 26)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jLabel9))
                                                .addComponent(PersonsDateTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PersonsSeeButton)
                        .addGap(76, 76, 76)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonsActionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonsSeeButton)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonsButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PersonsIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PersonsNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PersonsLastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PersonsEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(RelationshipCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PersonsDateTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PersonsDateTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PersonsDateTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PersonsExeButton)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PersonsLastNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonsLastNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonsLastNameTFActionPerformed

    private void PersonsExeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonsExeButtonActionPerformed
        // TODO add your handling code here:
        if(PersonsActionCB.getSelectedItem().equals("Insert")){
                String date;
                date = PersonsDateTF1.getText()+"/"+PersonsDateTF2.getText()+"/"+PersonsDateTF3.getText();
                int id= Integer.parseInt(PersonsIdTF.getText());
                try {
                    connectMysql.conexion.InsertPerson(id, PersonsNameTF.getText(),PersonsLastNameTF.getText(), date, PersonsEmailTF.getText());
                    int idRelationship = connectMysql.conexion.getRelationshipID(String.valueOf(RelationshipCB.getSelectedItem()));
                    connectMysql.conexion.InsertPKP(inicio.id_user, connectMysql.conexion.getPersonMaxID(), idRelationship);
                     this.setVisible(false);
                } catch (SQLException ex) {
                Logger.getLogger(Persons.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (ParseException ex) {
                 Logger.getLogger(Persons.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if (PersonsActionCB.getSelectedItem().equals("Update")){
                int id = Integer.valueOf(PersonsIdTF.getText());
                String date;
                String first_name = PersonsNameTF.getText();
                String last_name = PersonsLastNameTF.getText();
                String email = PersonsEmailTF.getText();
                date = PersonsDateTF1.getText()+"/"+PersonsDateTF2.getText()+"/"+PersonsDateTF3.getText();
                try {
                    if (first_name.equals("-")) {                   
                    }
                    else connectMysql.conexion.UpdatePersonFirstName(id,first_name);
                    if (last_name.equals("-")) {                   
                    }
                    else connectMysql.conexion.UpdatePersonLastName(id,last_name);
                    if (date.equals("-/-/-")) {                   
                    }
                    else connectMysql.conexion.UpdatePersonBirthday(id,date);
                    if (email.equals("-")) {                   
                    }
                    else connectMysql.conexion.UpdatePersonEmail(id,email);
                } catch (SQLException ex) {
                    Logger.getLogger(Persons.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(PersonsActionCB.getSelectedItem().equals("Delete")){
                int id= Integer.parseInt(PersonsIdTF.getText());
                try {
                    connectMysql.conexion.RemovePerson(id);
                } catch (SQLException ex) {
                    Logger.getLogger(Persons.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_PersonsExeButtonActionPerformed

    private void PersonsSeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonsSeeButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo;
          try {
              if(jComboBox1.getSelectedItem().equals("Unknown")){
              modelo =connect.connectdbp.showUnknownPersons(inicio.id_user);
              jTable1.setModel(modelo);
              }
              else if(jComboBox1.getSelectedItem().equals("Known")){
                  modelo = connect.connectdbp.showUserKnownPersons(inicio.id_user);
                  jTable1.setModel(modelo);
              }
             } catch (SQLException ex) {
             
         }
    }//GEN-LAST:event_PersonsSeeButtonActionPerformed

    private void PersonsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonsButtonActionPerformed
        // TODO add your handling code here:
        RelationshipCB.removeAllItems();
        try {
            ArrayList<String> lista = connect.connectdbp.showrelationshipList();
            for (String i: lista){
                RelationshipCB.addItem(i);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PersonsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Persons dialog = new Persons(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> PersonsActionCB;
    private javax.swing.JButton PersonsButton;
    private javax.swing.JTextField PersonsDateTF1;
    private javax.swing.JTextField PersonsDateTF2;
    private javax.swing.JTextField PersonsDateTF3;
    private javax.swing.JTextField PersonsEmailTF;
    private javax.swing.JButton PersonsExeButton;
    private javax.swing.JTextField PersonsIdTF;
    private javax.swing.JTextField PersonsLastNameTF;
    private javax.swing.JTextField PersonsNameTF;
    private javax.swing.JButton PersonsSeeButton;
    private javax.swing.JComboBox<String> RelationshipCB;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}