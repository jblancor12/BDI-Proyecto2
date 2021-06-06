/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author andres
 */
public class connectdbp {
 

   public static DefaultTableModel showAuthors()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Name");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_author.show_authors()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_author");
               data [1] = r.getString("name");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   }
    public static String getPassword(String pusername)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_person.getPersonPassword(?)}");
        
         stmt.registerOutParameter(1, OracleTypes.VARCHAR);
         stmt.setString(2,pusername);
         stmt.execute();
         String r = (String) stmt.getString(1);
         System.out.println(r);
         return r;
        
    }
    
        public static String encryptPassword(String ppassword)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_person.PasswordEncryption(?)}");
        
         stmt.registerOutParameter(1, OracleTypes.VARCHAR);
         stmt.setString(2,ppassword);
         stmt.execute();
         String r = (String) stmt.getString(1);
         System.out.println(r);
         return r;
        
    }
    
    public static void InsertUser(Integer pid, String pname, String plastName, String pbirthdate, String pemail,String pusername, String ppassword)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.insert_user(?,?,?,?,?,?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pname);
         stmt.setString(3,plastName);
         stmt.setString(4,pbirthdate);
         stmt.setString(5,pemail);
         stmt.setString(6,pusername);
         stmt.setString(7,ppassword);
         stmt.execute();
    }
    
    public static void InsertAuthor(String pname)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_author.insert_author(?)}");
         stmt.setString(1,pname);
    
         stmt.execute();
    }
    
        public static void UpdateAuthor(int pid,String pname)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_author.update_author_name(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pname);
         
        
    
         stmt.execute();
    }
        
        public static void DeleteAuthor(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_author.remove_author(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
    
        public static DefaultTableModel showCalification()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Score");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_calification.show_califications()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_calification");
               data [1] = r.getString("score");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

       return modelo;
    }
        
    
        public static DefaultTableModel showEditorial()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Editorial");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_editorial.show_editorial()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_editorial");
               data [1] = r.getString("description");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
        
        
        
       public static DefaultTableModel showgenre()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Genre");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_genre.show_genre()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_genre");
               data [1] = r.getString("description");
               System.out.println(r.getString("id_genre")); 
               System.out.println(r.getString("description"));

                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
       
        public static DefaultTableModel showphone()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Phone");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_phone.show_phone()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_phone");
               data [1] = r.getString("phone_number");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
        
        
        
    public static DefaultTableModel showrelationship()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("relationship");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_relationship.show_relationship()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_relationship");
               data [1] = r.getString("description");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
    
    
    
    public static ArrayList showrelationshipList()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        ArrayList<String> lista = new ArrayList();

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_relationship.show_relationship()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               
               lista.add(r.getString("description"));
                 
                
                 
                 
             
                 
                
                 
                 
             }
        

        return lista;
    }
   /*************************************************************************************************************************************************/ 
    public static DefaultTableModel showEdition()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Edition");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_bookedition.show_edition()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_edition");
               data [1] = r.getString("description");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
    
    
        public static ArrayList EditionList()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        ArrayList editionList = new ArrayList();
        
        


        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_bookedition.show_edition()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
              
               editionList.add(r.getString("description"));
                
             }
        

        return editionList;
    }
        
        
        
        
    public static ArrayList AuthorList()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        ArrayList editionList = new ArrayList();
        
        


        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_Author.show_authors()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
              
               editionList.add(r.getString("name"));
                
             }
        

        return editionList;
    }
    
    
    public static ArrayList ScoreList()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        ArrayList editionList = new ArrayList();
        
        


        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_calification.show_califications()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
              
               editionList.add(r.getString("score"));
                
             }
        

        return editionList;
    }
    
    
    public static ArrayList editorialList()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        ArrayList editionList = new ArrayList();
        
        


        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_editorial.show_editorial()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
              
               editionList.add(r.getString("description"));
                
             }
        

        return editionList;
    }
    
    
    
    
    public static int getEditorialId(String pdescription)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_editorial.get_editorial_id(?)}");
        
        int r;
        stmt.registerOutParameter(1,OracleTypes.INTEGER);
        stmt.setString(2 , pdescription);
        stmt.executeQuery();
        r = (int) stmt.getInt(1);
        return r;
    }
    
    
    public static int getEditionId(String pdescription)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_bookedition.get_bookedition_id(?)}");
        
        int r;
        stmt.registerOutParameter(1,OracleTypes.INTEGER);
        stmt.setString(2 , pdescription);
        stmt.executeQuery();
        r = (int) stmt.getInt(1);
        return r;
    }
    
    public static int getScoreId(String pdescription)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_calification.get_calification_id(?)}");
        int score = Integer.parseInt(pdescription);  
        int r;
        stmt.registerOutParameter(1,OracleTypes.INTEGER);
        stmt.setInt(2 , score);
        stmt.executeQuery();
        r = (int) stmt.getInt(1);
        return r;
    }
    
    
    
    
    public static int bookMaxId()throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_book.getMaxId}");
        
        int r;
        stmt.registerOutParameter(1,OracleTypes.INTEGER);
        stmt.executeQuery();
        r = (int) stmt.getInt(1);
        return r;
    }
    
    
    
    
    
    
   public static void InsertBook(String ptitle, int pidEditorial, int id_edition, int pscore)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_book.insert_book(?,?,?,?)}");
        stmt.setString(1, ptitle);
         stmt.setInt(2,pidEditorial);
        stmt.setInt(3,id_edition);
        stmt.setInt(4,pscore);
  
         stmt.execute();
    }
    
   
       public static int getUserId(String pusername)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_person.getpersonid(?)}");  
        int r;
        stmt.registerOutParameter(1,OracleTypes.INTEGER);
        stmt.setString(2 , pusername);
        stmt.executeQuery();
        r = (int) stmt.getInt(1);
        return r;
    }
       
       public static void InsertPersonOwnBook(int pidPerson, int pidBook)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personownsbook.insert_personownsbook(?,?)}");
      
        stmt.setInt(2,pidBook);
        stmt.setInt(1,pidPerson);
     
  
         stmt.execute();
    }
       
       public static DefaultTableModel showBooks()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Title");
        modelo.addColumn("Editorial");
        modelo.addColumn("Edition");
        modelo.addColumn("Author");
        modelo.addColumn("Score");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_book.show_books()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);
               data [3] = r.getString(4);
               data [4] = r.getString(5);
               data [5] = r.getString(6);
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   }
     
       public static int getAutorId(String pname)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_author.get_author_id(?)}");  
        int r;
        stmt.registerOutParameter(1,OracleTypes.INTEGER);
        stmt.setString(2 , pname);
        stmt.executeQuery();
        r = (int) stmt.getInt(1);
        return r;
    }
       
     public static void InsertBookxAuthor(int pidBook, int pidAuthor)throws SQLException, ParseException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_bookxauthor.insert_bookxauthor(?,?)}");
        stmt.setInt(1,pidAuthor);
        stmt.setInt(2,pidBook);
  
         stmt.execute();
    }
     
     /***************************************/
     
     public static void InsertCalification(int pscore)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_calification.insert_calification(?)}");
         stmt.setInt(1,pscore);
    
         stmt.execute();
    }
    
    public static void UpdateCalification(int pid,int pscore)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_calification.update_calification_score(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,pscore);
         
        
    
         stmt.execute();
    }
        
        public static void RemoveCalification(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_calification.remove_calification(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
    public static void InsertEditorial(String pEditorial)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_editorial.insert_editorial(?)}");
         stmt.setString(1,pEditorial);
    
         stmt.execute();
    }
    
    public static void UpdateEditorial(int pid,String pEditorial)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_editorial.update_editorial_description(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pEditorial);
         
        
    
         stmt.execute();
    }
        
        public static void RemoveEditorial(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_editorial.remove_editorial(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
        
        public static void InsertGenre(String pgenre)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_genre.insert_genre(?)}");
         stmt.setString(1,pgenre);
    
         stmt.execute();
    }
    
    public static void UpdateGenre(int pid,String pgenre)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_genre.update_genre_description(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pgenre);
         
        
    
         stmt.execute();
    }
        
        public static void RemoveGenre(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_genre.remove_genre(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
        
        public static void InsertRelationship(String prelationship)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_relationship.insert_relationship(?)}");
         stmt.setString(1,prelationship);
    
         stmt.execute();
    }
    
    public static void UpdateRelationship(int pid,String prelationship)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_relationship.u_relationship_description(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,prelationship);
         
        
    
         stmt.execute();
    }
        
        public static void RemoveRelationship(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_relationship.remove_relationship(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
        
        public static void InsertPhoto(String pphoto)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_photo.insert_photo(?)}");
         stmt.setString(1,pphoto);
    
         stmt.execute();
    }
    
    public static void UpdatePhoto(int pid,String pphoto)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_photo.update_photo_description(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pphoto);
         
        
    
         stmt.execute();
    }
        
        public static void RemovePhoto(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_photo.remove_photo(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
        
        
        public static void InsertPhone(int pphone)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_phone.insert_phone(?)}");
         stmt.setInt(1,pphone);
    
         stmt.execute();
    }
    
    public static void UpdatePhone(int pid,int pphone)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_phone.update_phone_number(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,pphone);
         
        
    
         stmt.execute();
    }
        
        public static void RemovePhone(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_phone.remove_phone(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
        
        
        
         public static void UpdateBookTitle(int pid,String ptitle)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_book.update_book_title(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,ptitle);
         
        
    
         stmt.execute();
    }
         
         public static void UpdateBookEditorial(int pid,int ptitle)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_book.update_book_id_editorial(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
         
         public static void UpdateBookEdiion(int pid,int ptitle)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_book.update_book_id_book_edition(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
         
         public static void UpdateBookScore(int pid,int ptitle)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_book.update_book_id_calification(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
         
          public static void UpdateBookAuthor(int pid,int ptitle)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_bookxauthor.update_bxa_id_author(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
          
    public static void RemoveBookAuthor(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_bookxauthor.remove_bookxauthor(?)}");
         stmt.setInt(1,pid);
        
         
        
    
         stmt.execute();
    }
    public static void RemoveBookUser(int pidBook, int pidUser)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personownsbook.remove_personownsbook(?,?)}");
         stmt.setInt(1,pidBook);
          stmt.setInt(2,pidUser);
        
         
        
    
         stmt.execute();
    }
    
    
    public static ArrayList UserAvBooksList(int pid_user)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        ArrayList editionList = new ArrayList();
        
        


        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_personborrowsbook.showUserAvailableBook(?)}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2, pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
              
               editionList.add(r.getString(1)+'-'+r.getString(2));
                
             }
        

        return editionList;
    }
    
    public static ArrayList UserKnonwList(int pid_user)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        ArrayList editionList = new ArrayList();
        
        


        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_personknowsperson.showPersonRelations(?)}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2, pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
              
               editionList.add(r.getString(1)+'-'+r.getString(2)+' '+r.getString(3));
                
             }
        

        return editionList;
    }
    
    public static DefaultTableModel showUserKnownPersons(int pid_user)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Person");
        modelo.addColumn("Name");
        modelo.addColumn("Last Name");
        modelo.addColumn("Relationship");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_personknowsperson.showPersonRelations(?)}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2,pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);
               data [3] = r.getString(4);

                modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   }
    
    
    public static DefaultTableModel showUserReturnedBooks(int pid_user)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Loan");
        modelo.addColumn("Title");
        modelo.addColumn("First name");
        modelo.addColumn("Last name");
        modelo.addColumn("Load date");
        modelo.addColumn("Return date");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_personborrowsbook.showUserReturnedBook(?)}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2,pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);
               data [3] = r.getString(4);
               data [4] = r.getString(5);
               data [5] = r.getString(6);
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   } 
    
        public static DefaultTableModel showUserNotReturnedBooks(int pid_user)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Loan");
        modelo.addColumn("Title");
        modelo.addColumn("First name");
        modelo.addColumn("Last name");
        modelo.addColumn("Load date");
        modelo.addColumn("Return date");

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_personborrowsbook.showUserNotReturnedBook(?)}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2,pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);
               data [3] = r.getString(4);
               data [4] = r.getString(5);
               data [5] = r.getString(6);
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   }
        
        public static void InsertPerson(int pid, String pname, String plastName, String pbirthdate, String pemail)throws SQLException, ParseException{
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.insert_person(?,?,?,?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pname);
         stmt.setString(3,plastName);
         stmt.setString(4,pbirthdate);
         stmt.setString(5,pemail);
         stmt.execute();
    }
        
        
        
        
        
       public static void InsertPBB(int pid_person, int  pid_book, String ploan_date)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personborrowsbook.insert_personborrowsbook(?,?,?)}");
        stmt.setInt(1,pid_person);
        stmt.setInt(2,pid_book);
        stmt.setString(3,ploan_date);
        stmt.execute();
       }
        
       
        public static void UpdatePBBBook(int pid_loan, int  pid_book)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personborrowsbook.update_pbb_id_book(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setInt(2,pid_book);
        stmt.execute();
       }
        
        
       public static void UpdatePBBLoanD(int pid_loan, String  ploan_date)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personborrowsbook.update_pbb_loan_date(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setString(2,ploan_date);
        stmt.execute();
       }
        
       public static void UpdatePBBReturnD(int pid_loan, String  preturn_date)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personborrowsbook.update_pbb_return_date(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setString(2,preturn_date);
        stmt.execute();
       }
       
       
        public static void UpdatePBBPerson(int pid_loan, int pid_person)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personborrowsbook.update_pbb_id_person(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setInt(2,pid_person);
        stmt.execute();
       }
        
        
        public static DefaultTableModel showUnknownPersons(int pid_user)throws SQLException{
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";

        String data [] = new String[3];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("First Name");
        modelo.addColumn("Last Name");
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_person.show_persons(?)}");

        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.setInt(2, pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){

               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);

                       modelo.addRow(data);
             }
        return modelo;
    }
        
        
        public static void InsertPKP(int pid_user, int  pid_person, int pid_relationship)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_personknowsperson.insert_personknowsperson(?,?,?)}");
        stmt.setInt(1,pid_user);
        stmt.setInt(2,pid_person);
        stmt.setInt(3,pid_relationship);
        stmt.execute();
       }
        
        public static int getRelationshipID(String pdescription)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_relationship.get_relationship_id(?)}");
        stmt.registerOutParameter(1, OracleTypes.INTEGER);
        stmt.setString(2,pdescription);
        stmt.executeQuery();
        int r = (int) stmt.getInt(1);
        return r;
       }
        
        public static int getPersonMaxID()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";  
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{?= call control_person.getMaxId()}");
        stmt.registerOutParameter(1, OracleTypes.INTEGER);

        stmt.executeQuery();
        int r = (int) stmt.getInt(1);
        return r;
       }
        
        
        public static DefaultTableModel showPersons2()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        String data [] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("First Name");
        modelo.addColumn("Last Name");
        modelo.addColumn("Date of Birth");
        modelo.addColumn("Email");
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_person.show_persons2()}");

        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString("id_person");
               data [1] = r.getString("First_Name");
               data [2] = r.getString("Last_Name");
               data [3] = r.getString("Birthday");
               data [4] = r.getString("Email");
                       modelo.addRow(data);  
             }
        return modelo;
    }
    public static void RemovePerson(int pid)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.remove_person(?)}");
         stmt.setInt(1,pid);
         stmt.execute();
    }
    
    public static void UpdatePersonFirstName(int pid,String pfirst_name)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.update_person_first_name(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pfirst_name);
         stmt.execute();
    }
    
     public static void UpdatePersonLastName(int pid,String plast_name)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.update_person_last_name(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,plast_name);
         stmt.execute();
    }
     
     public static void UpdatePersonBirthday(int pid,String pbirthday)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.update_person_birthday(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pbirthday);
         stmt.execute();
    }
     
     public static void UpdatePersonEmail(int pid,String pemail)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.update_person_email(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pemail);
         stmt.execute();
    }
     
     public static void UpdatePersonUsername(int pid,String pusername)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.update_person_username(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pusername);
         stmt.execute();
    }
     
     public static void UpdatePersonPassword(int pid,String ppassword)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.update_person_password(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,ppassword);
         stmt.execute();
    }
     
     
     public static void UpdatePersonType(int pid,int ptype)throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{= call control_person.update_person_type_person(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptype);
         stmt.execute();
    }
     
     public static DefaultTableModel showNotReturnedBooks()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Loan");
        modelo.addColumn("Title");
        modelo.addColumn("First name");
        modelo.addColumn("Last name");
        modelo.addColumn("Load date");
        modelo.addColumn("Return date");
      

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_queries.showNotReturnedBook()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);

        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);
               data [3] = r.getString(4);
               data [4] = r.getString(5);
               data [5] = r.getString(6);
             
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   }
     
     public static DefaultTableModel showReturnedBooks()throws SQLException{   
        String host = "jdbc:oracle:thin:@localhost:1521:dbp";
        String uName = "PE";
        String uPass = "PE";
        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Book");
        modelo.addColumn("Title");

     

        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ ?= call control_queries.showReturnedBook()}");



        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getObject(1);
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);

              
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        return modelo;
     }

        
 }
   
   
   
    

