/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static interfaz.inicio.id_user;
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
public class Books extends javax.swing.JDialog {

    /**
     * Creates new form Books
     */
    public Books(java.awt.Frame parent, boolean modal) {
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

        BooksActionCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BooksIdTF = new javax.swing.JTextField();
        BooksTitleTF = new javax.swing.JTextField();
        BooksAuthorCB = new javax.swing.JComboBox<>();
        BooksEditorialCB = new javax.swing.JComboBox<>();
        BooksEditionCB = new javax.swing.JComboBox<>();
        BooksScoreCB = new javax.swing.JComboBox<>();
        BooksSeeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BooksExecuteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        genreCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BooksActionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insert", "Update", "Delete", "Add Genre" }));

        jLabel2.setText("ID");

        jLabel3.setText("Title");

        jLabel4.setText("Author");

        jLabel5.setText("Editorial");

        jLabel6.setText("Edition");

        jLabel7.setText("Score");

        BooksEditionCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksEditionCBActionPerformed(evt);
            }
        });

        BooksSeeButton.setText("See");
        BooksSeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksSeeButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BooksExecuteButton.setText("Execute");
        BooksExecuteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksExecuteButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Genre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BooksEditorialCB, 0, 166, Short.MAX_VALUE)
                            .addComponent(BooksAuthorCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BooksTitleTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BooksEditionCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BooksScoreCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BooksIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addComponent(BooksActionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BooksSeeButton)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(BooksExecuteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(genreCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(599, 599, 599))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BooksActionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(BooksSeeButton))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BooksIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BooksTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(BooksAuthorCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(BooksEditorialCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(BooksEditionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(BooksScoreCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genreCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(BooksExecuteButton)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BooksEditionCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksEditionCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BooksEditionCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                ArrayList<String> edition;
                ArrayList<String> editorial;
                ArrayList<String> score;
                ArrayList<String> author;
                ArrayList<String> genre;
        try {
            edition = connectMysql.conexion.EditionList();
            editorial = connectMysql.conexion.editorialList();
            score = connectMysql.conexion.ScoreList();
            author = connectMysql.conexion.AuthorList();
            genre = connectMysql.conexion.genreList();
            BooksEditionCB.removeAllItems();
            BooksScoreCB.removeAllItems();
            BooksEditorialCB.removeAllItems();
            BooksAuthorCB.removeAllItems();
            genreCB.removeAllItems();
           for (String i: edition){
               
            BooksEditionCB.addItem(i);
           }
           for(String i: editorial){
               BooksEditorialCB.addItem(i);
           }
           
           for (String i: score){
               BooksScoreCB.addItem(i);
           }
           for(String i: author){
               BooksAuthorCB.addItem(i);
           }
           for(String i: genre){
               genreCB.addItem(i);
           }
        } catch (SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BooksExecuteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksExecuteButtonActionPerformed
        try {
            // TODO add your handling code here:
            /*System.out.println(BooksEditorialCB.getSelectedItem().toString());
            /*System.out.println(connectMysql.conexion.getEditorialId(BooksEditorialCB.getSelectedItem().toString()));*/
            if(BooksActionCB.getSelectedItem().equals("Insert")){
                
            
           
            int idEdition = connectMysql.conexion.getEditionId(BooksEditionCB.getSelectedItem().toString());
            int idScore = connectMysql.conexion.getScoreId(BooksScoreCB.getSelectedItem().toString());
            
            int idAutor = connectMysql.conexion.getAutorId(BooksAuthorCB.getSelectedItem().toString());
            int idEditorial = connectMysql.conexion.getEditorialId(BooksEditorialCB.getSelectedItem().toString());
            String title = BooksTitleTF.getText();
            
            connectMysql.conexion.InsertBook(title, idEditorial, idEdition, idScore);
            int newBookId = connectMysql.conexion.bookMaxId();
            connectMysql.conexion.InsertBookxAuthor(newBookId, idAutor);
            connectMysql.conexion.InsertPersonOwnBook(id_user,newBookId);
            
            }
            else if(BooksActionCB.getSelectedItem().equals("Update")){
            int idBook = Integer.parseInt(BooksIdTF.getText());
            int idEditorial = connectMysql.conexion.getEditorialId(BooksEditorialCB.getSelectedItem().toString());
            int idEdition = connectMysql.conexion.getEditionId(BooksEditionCB.getSelectedItem().toString());
            int idAutor = connectMysql.conexion.getAutorId(BooksAuthorCB.getSelectedItem().toString());
            int idScore = connectMysql.conexion.getScoreId(BooksScoreCB.getSelectedItem().toString());
            String title = BooksTitleTF.getText();
            
            connectMysql.conexion.UpdateBookEdiion(idBook,idEdition);
            connectMysql.conexion.UpdateBookEditorial(idBook, idEditorial);
            connectMysql.conexion.UpdateBookScore(idBook, idScore);
            connectMysql.conexion.UpdateBookTitle(idBook, title);
            connectMysql.conexion.UpdateBookAuthor(idBook, idAutor);
            
            
            
            
            }
            else if(BooksActionCB.getSelectedItem().equals("Delete")){
                int idBook = Integer.parseInt(BooksIdTF.getText());
                connectMysql.conexion.RemoveBookAuthor(idBook);
                connectMysql.conexion.RemoveBookUser(idBook, id_user);
            }
            
            else if(BooksActionCB.getSelectedItem().equals("Add Genre")){
                int idBook = Integer.parseInt(BooksIdTF.getText());
                int idGenre = connectMysql.conexion.getGenreId(String.valueOf(genreCB.getSelectedItem()));
                connectMysql.conexion.InsertGenrexBook(idGenre, idBook);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BooksExecuteButtonActionPerformed

    private void BooksSeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksSeeButtonActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel modelo = connectMysql.conexion.showBooks();
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BooksSeeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Books dialog = new Books(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> BooksActionCB;
    private javax.swing.JComboBox<String> BooksAuthorCB;
    private javax.swing.JComboBox<String> BooksEditionCB;
    private javax.swing.JComboBox<String> BooksEditorialCB;
    private javax.swing.JButton BooksExecuteButton;
    private javax.swing.JTextField BooksIdTF;
    private javax.swing.JComboBox<String> BooksScoreCB;
    private javax.swing.JButton BooksSeeButton;
    private javax.swing.JTextField BooksTitleTF;
    private javax.swing.JComboBox<String> genreCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
