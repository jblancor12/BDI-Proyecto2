/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectMysql;
import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author andres
 */
public class conexion {
    
    private static Connection con;
    // Declaramos los datos de conexion a la DB
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="1234";

    private static final String urlPE="jdbc:mysql://localhost:3306/pe";
    static{
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int getUserId(String pUsername) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE, user, pass);
      CallableStatement stmt = con.prepareCall("{ ? = call get_person_id(?)}");
         stmt.registerOutParameter(1, Types.INTEGER);
         stmt.setString(2, pUsername);

         stmt.execute();
         
         int rs =  stmt.getInt(1);
         System.out.println(rs);
      return rs;
   }
    
    public static int getGenreId(String pdescription) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE, user, pass);
      CallableStatement stmt = con.prepareCall("{ ? = call get_genre_id(?)}");
         stmt.registerOutParameter(1, Types.INTEGER);
         stmt.setString(2, pdescription);

         stmt.execute();
         
         int rs =  stmt.getInt(1);
         System.out.println(rs);
      return rs;
   }
    
    
    public static void InsertGenrexBook(int pnid_genre, int pid_book)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_bookxgenre(?,?)}");
         stmt.setInt(1,pnid_genre);
         stmt.setInt(2,pid_book);
    
         stmt.execute();
    }
    
    
    
    public static String getPassword(int pPassword) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE, user, pass);
      CallableStatement stmt = con.prepareCall("{ ? = call get_person_password(?)}");
         stmt.registerOutParameter(1, Types.VARCHAR);
         stmt.setInt(2, pPassword);

         stmt.execute();
         
         String rs =  stmt.getString(1);
         System.out.println(rs);
      return rs;
   }
    
    
    
    public static  void InsertUser(String pname, String plastName, String pbirthdate, String pemail,String pusername, String ppassword) throws SQLException{
      con = (Connection) DriverManager.getConnection(urlPE, user, pass);
      CallableStatement stmt = con.prepareCall("{ call insert_user(?,?,?,?,?,?)}");

         stmt.setString(1,pname);
         stmt.setString(2,plastName);
         stmt.setString(3,pbirthdate);
         stmt.setString(4,pemail); 
         stmt.setString(5,pusername);
         stmt.setString(6,ppassword);
         stmt.execute();
         stmt.close();
    
         System.out.println("insert realizado");
    
}
    
    
     public static void InsertAuthor(String pname)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_author(?)}");
         stmt.setString(1,pname);
    
         stmt.execute();
    }
    
     
     public static void UpdateAuthor(int pid,String pname)throws SQLException{   
         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_author_name(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pname);
         
        
    
         stmt.execute();
    }
    
      public static void DeleteAuthor(int pid)throws SQLException{   
          con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_author(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
    
      public static void InsertCalification(int pscore)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_calification(?)}");
         stmt.setInt(1,pscore);
    
         stmt.execute();
    }
      
       public static void UpdateCalification(int pid,int pscore)throws SQLException{   
       con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_calification_score(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,pscore);
         
        
    
         stmt.execute();
    }
       
       public static void RemoveCalification(int pid)throws SQLException{   
           con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_calification(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
      
       public static void InsertEditorial(String pEditorial)throws SQLException{   
           con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_editorial(?)}");
         stmt.setString(1,pEditorial);
    
         stmt.execute();
    }
       
       
       
       
       public static void UpdateEditorial(int pid,String pEditorial)throws SQLException{   
           con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_editorial_description(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pEditorial);
         
        
    
         stmt.execute();
    }
       
       
       
       public static void RemoveEditorial(int pid)throws SQLException{   
           con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_editorial(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
       
       
       /*******************************************************************************/
       
        public static void InsertGenre(String pgenre)throws SQLException{   
         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_genre(?)}");
         stmt.setString(1,pgenre);
    
         stmt.execute();
    }
    
    public static void UpdateGenre(int pid,String pgenre)throws SQLException{   
         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_genre_description(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pgenre);
         
        
    
         stmt.execute();
    }
        
        public static void RemoveGenre(int pid)throws SQLException{   
         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_genre(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
        
        public static void InsertRelationship(String prelationship)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_relationship(?)}");
         stmt.setString(1,prelationship);
    
         stmt.execute();
    }
    
    public static void UpdateRelationship(int pid,String prelationship)throws SQLException{   
         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_relationship_description(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,prelationship);
         
        
    
         stmt.execute();
    }
        
        public static void RemoveRelationship(int pid)throws SQLException{   
            con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_relationship(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
       
        
        
        public static void InsertPhone(int pphone)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_phone(?)}");
         stmt.setInt(1,pphone);
    
         stmt.execute();
    }
    
    public static void UpdatePhone(int pid,int pphone)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_phone_number(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,pphone);
         
        
    
         stmt.execute();
    }
        
        public static void RemovePhone(int pid)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_phone(?)}");
         stmt.setInt(1,pid);
         
        
    
         stmt.execute();
    }
        
        
        /*************************************************************************************************/
     
    public static int getEditorialId(String pdescription)throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{?=call get_editorial_id(?)}");
        System.out.println(pdescription);
        int r;
        stmt.registerOutParameter(1,Types.INTEGER);
        stmt.setString(2 , pdescription);
        stmt.execute();
         System.out.println(stmt.getInt(1));
        r = (int) stmt.getInt(1);
        return r;
    }
        
        
    public static int getEditionId(String pdescription)throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ ? = call get_edition_id(?)}");
        
        int r;
        stmt.registerOutParameter(1,Types.INTEGER);
        stmt.setString(2 , pdescription);
        stmt.execute();
        r = (int) stmt.getInt(1);
        return r;
    }
        
        
    public static int getScoreId(String pdescription)throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{?= call get_calification_id(?)}");
        int score = Integer.parseInt(pdescription);  
        int r;
        stmt.registerOutParameter(1,Types.INTEGER);
        stmt.setInt(2 , score);
        stmt.execute();
        r = (int) stmt.getInt(1);
        return r;
    }
        
       
    public static int bookMaxId()throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{?= call getbookmaxid}");
        
        int r;
        stmt.registerOutParameter(1,Types.INTEGER);
        stmt.execute();
        r = (int) stmt.getInt(1);
        return r;
    }
        
        
   public static int getAutorId(String pname)throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{?= call get_author_id(?)}");  
        int r;
        stmt.registerOutParameter(1,Types.INTEGER);
        stmt.setString(2 , pname);
        stmt.execute();
        r = (int) stmt.getInt(1);
        return r;
    }
        
        
    public static void InsertBook(String ptitle, int pidEditorial, int id_edition, int pscore)throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_book(?,?,?,?)}");
        stmt.setString(1, ptitle);
         stmt.setInt(2,pidEditorial);
        stmt.setInt(3,id_edition);
        stmt.setInt(4,pscore);
  
         stmt.execute();
    }
         
         
   public static void InsertPersonOwnBook(int pidPerson, int pidBook)throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_personownsbook(?,?)}");
      
        stmt.setInt(2,pidBook);
        stmt.setInt(1,pidPerson);
     
  
         stmt.execute();
    }
         
   public static void InsertBookxAuthor(int pidBook, int pidAuthor)throws SQLException, ParseException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_bookxauthor(?,?)}");
        stmt.setInt(1,pidAuthor);
        stmt.setInt(2,pidBook);
  
         stmt.execute();
    }
      /**************************************************************************************************************************************************/
         
         
    public static void UpdateBookTitle(int pid,String ptitle)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_book_title(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,ptitle);
         
        
    
         stmt.execute();
    }
    public static void UpdateBookEditorial(int pid,int ptitle)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_book_id_editorial(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
         
    public static void UpdateBookEdiion(int pid,int ptitle)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_book_id_book_edition(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
         
         
   public static void UpdateBookScore(int pid,int ptitle)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_book_id_calification(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
         
         
         
   public static void UpdateBookAuthor(int pid,int ptitle)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_bxa_id_author(?,?)}");
         stmt.setInt(1,pid);
         stmt.setInt(2,ptitle);
         
        
    
         stmt.execute();
    }
        
         /******************************************************************************************************/
    public static void RemoveBookAuthor(int pid)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_bookxauthor(?)}");
         stmt.setInt(1,pid);
        
         
        
    
         stmt.execute();
    }
         
         
         
         
         
         
         
    public static void RemoveBookUser(int pidBook, int pidUser)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_personownsbook(?,?)}");
         stmt.setInt(1,pidBook);
          stmt.setInt(2,pidUser);
        
         
        
    
         stmt.execute();
    }
    
    
    /**************************************************************************************************/
    
    
    
    
    public static void InsertPerson(int pid, String pname, String plastName, String pbirthdate, String pemail)throws SQLException, ParseException{
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_person(?,?,?,?)}");
         stmt.setString(1,pname);
         stmt.setString(2,plastName);
         stmt.setString(3,pbirthdate);
         stmt.setString(4,pemail);
         stmt.execute();
    }
    
    public static void InsertPKP(int pid_user, int  pid_person, int pid_relationship)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_personknowsperson(?,?,?)}");
        stmt.setInt(1,pid_user);
        stmt.setInt(2,pid_person);
        stmt.setInt(3,pid_relationship);
        stmt.execute();
       }
    
    public static int getRelationshipID(String pdescription)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{?= call get_relationship_id(?)}");
        stmt.registerOutParameter(1, Types.INTEGER);
        stmt.setString(2,pdescription);
        stmt.execute();
        int r = (int) stmt.getInt(1);
        return r;
       }
    
    
    
    /******************************************************************************************************************************/
    
    public static int getPersonMaxID()throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{?= call getpersonmaxid()}");
        stmt.registerOutParameter(1, OracleTypes.INTEGER);

        stmt.execute();
        int r = (int) stmt.getInt(1);
        return r;
       }
    
    
    
    public static void UpdatePersonFirstName(int pid,String pfirst_name)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_first_name(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pfirst_name);
         stmt.execute();
    }
    
    
    public static void UpdatePersonLastName(int pid,String plast_name)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_last_name(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,plast_name);
         stmt.execute();
    }
    
    
    
     public static void UpdatePersonBirthday(int pid,String pbirthday)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_birthday(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pbirthday);
         stmt.execute();
    }
    
    public static void UpdatePersonEmail(int pid,String pemail)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_person_email(?,?)}");
         stmt.setInt(1,pid);
         stmt.setString(2,pemail);
         stmt.execute();
    }
    
     public static void RemovePerson(int pid)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call remove_person(?)}");
         stmt.setInt(1,pid);
         stmt.execute();
    }
    
     
     
     /********************************************************************************************************************/
     
     
     public static void InsertPBB(int pid_person, int  pid_book, String ploan_date)throws SQLException{   
      con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call insert_personborrowsbook(?,?,?)}");
        stmt.setInt(1,pid_person);
        stmt.setInt(2,pid_book);
        stmt.setString(3,ploan_date);
        stmt.execute();
       }
     
     
     
   public static void UpdatePBBBook(int pid_loan, int  pid_book)throws SQLException{   
      con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_pbb_id_book(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setInt(2,pid_book);
        stmt.execute();
       }
        
        
       public static void UpdatePBBLoanD(int pid_loan, String  ploan_date)throws SQLException{   
    con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_pbb_loan_date(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setString(2,ploan_date);
        stmt.execute();
       }
        
       public static void UpdatePBBReturnD(int pid_loan, String  preturn_date)throws SQLException{   
       con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_pbb_return_date(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setString(2,preturn_date);
        stmt.execute();
       }
       
       
        public static void UpdatePBBPerson(int pid_loan, int pid_person)throws SQLException{   
       con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call update_pbb_id_person(?,?)}");
        stmt.setInt(1,pid_loan);
        stmt.setInt(2,pid_person);
        stmt.execute();
       }
        
        
        /*******************************************Show and lists********************************************/
        public static DefaultTableModel showBooks()throws SQLException{   

        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Title");
        modelo.addColumn("Editorial");
        modelo.addColumn("Edition");
        modelo.addColumn("Author");
        modelo.addColumn("Score");

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_books()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
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
        
        
        
        
        
        
   public static DefaultTableModel showAuthors()throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_authors()}");

        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Name");

   
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString("id_author");
               data [1] = r.getString("name");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   }
   
   
   public static DefaultTableModel showCalification()throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);


        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Score");

        CallableStatement stmt = con.prepareCall("{ call show_califications()}");




        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString("id_calification");
               data [1] = r.getString("score");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

       return modelo;
   }
   
   
   public static DefaultTableModel showEditorial()throws SQLException{   
  con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        
        
        String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Editorial");


        CallableStatement stmt = con.prepareCall("{ call show_editorial()}");




        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString("id_editorial");
               data [1] = r.getString("description");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   
   }
   
   
   public static DefaultTableModel showgenre()throws SQLException{   
   String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Genre");

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_genre()}");




        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString("id_genre");
               data [1] = r.getString("description");
               System.out.println(r.getString("id_genre")); 
               System.out.println(r.getString("description"));

                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
   
   
 
   public static DefaultTableModel showrelationship()throws SQLException{   
       con = (Connection) DriverManager.getConnection(urlPE, user, pass);
       
       CallableStatement stmt = con.prepareCall("{ call show_relationship()}");

       String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("relationship");

        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString("id_relationship");
               data [1] = r.getString("description");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
   
   
   public static DefaultTableModel showphone()throws SQLException{
   
    String data [] = new String[2];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Phone");

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_phone()}");




        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString("id_phone");
               data [1] = r.getString("phone_number");
                 
                
                 
                 modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    }
   
   /************************************************************************************************************************************************/
   public static ArrayList showrelationshipList()throws SQLException{   
     con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        
        
        ArrayList<String> lista = new ArrayList();

        CallableStatement stmt = con.prepareCall("{ call show_relationship()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               
               lista.add(r.getString("description"));
                 
                
                 
                 
             
                 
                
                 
                 
             }
        

        return lista;
    }
   
   
   public static ArrayList EditionList()throws SQLException{   

        
        
        ArrayList editionList = new ArrayList();
        
        


         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_edition()}");


        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
              
               editionList.add(r.getString("description"));
                
             }
        

        return editionList;
    }
   
   
   
   public static ArrayList AuthorList()throws SQLException{   

        
        ArrayList editionList = new ArrayList();
        
        


        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_authors()}");




        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
              
               editionList.add(r.getString("name"));
                
             }
        

        return editionList;
    }
   
   
   public static ArrayList ScoreList()throws SQLException{   

        
        ArrayList editionList = new ArrayList();
        
        


        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_califications()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
              
               editionList.add(r.getString("score"));
                
             }
        

        return editionList;
    }
   
   
   public static ArrayList editorialList()throws SQLException{   

        
        
        ArrayList editionList = new ArrayList();
        
        

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);

        CallableStatement stmt = con.prepareCall("{ call show_editorial()}");




        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
              
               editionList.add(r.getString("description"));
                
             }
        

        return editionList;
    }
   
   
   public static ArrayList genreList()throws SQLException{   

        
        
        ArrayList editionList = new ArrayList();
        
        

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);

        CallableStatement stmt = con.prepareCall("{ call show_genre()}");




        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
              
               editionList.add(r.getString("description"));
                
             }
        

        return editionList;
    }
   
   
   
   
   
    public static DefaultTableModel showUserKnownPersons(int pid_user)throws SQLException{   

        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Person");
        modelo.addColumn("Name");
        modelo.addColumn("Last Name");
        modelo.addColumn("Relationship");

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call showPersonRelations(?)}");




        stmt.setInt(1,pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);
               data [3] = r.getString(4);

                modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
   }
   
    public static DefaultTableModel showUnknownPersons()throws SQLException{


        String data [] = new String[3];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("First Name");
        modelo.addColumn("Last Name");
        
         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call show_persons()}");


        
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){

               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);

                       modelo.addRow(data);
             }
        return modelo;
    }
   
   
   
   
   
   /*******************************************************************************************************/
    public static ArrayList UserAvBooksList(int pid_user)throws SQLException{   

        
        String.valueOf("inicia libros lista");
        ArrayList editionList = new ArrayList();
        
        

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call showUserAvailableBook(?)}");
        String.valueOf("Paso el llamado de libros lista");

        stmt.setInt(1, pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        String.valueOf("Se armo el result set usuarios lista");
        while(r.next()){
                 
              
               editionList.add(r.getString(1)+'-'+r.getString(2));
                
             }
        
        String.valueOf("antes del return de libroslista");
        return editionList;
    }
   
   
    
    
    
    public static ArrayList UserKnonwList(int pid_user)throws SQLException{   

        String.valueOf("inicia usuarios lista");
        ArrayList editionList = new ArrayList();
        
        
        

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call showPersonRelations(?)}");

         String.valueOf("Paso el llamado de usarios lista");

        stmt.setInt(1, pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        String.valueOf("Se armo el result set usuarios lista");
        while(r.next()){
                 
              
               editionList.add(r.getString(1)+'-'+r.getString(2)+' '+r.getString(3));
                
             }
        String.valueOf("antes del return de usuaarios lista");

        return editionList;
    }
   
   
    
    public static DefaultTableModel showUserReturnedBooks(int pid_user)throws SQLException{   
        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Loan");
        modelo.addColumn("Title");
        modelo.addColumn("First name");
        modelo.addColumn("Last name");
        modelo.addColumn("Load date");
        modelo.addColumn("Return date");


        CallableStatement stmt = con.prepareCall("{ call showUserReturnedBook(?)}");




        stmt.setInt(1,pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
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

        
        
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Loan");
        modelo.addColumn("Title");
        modelo.addColumn("First name");
        modelo.addColumn("Last name");
        modelo.addColumn("Load date");
        modelo.addColumn("Return date");

         con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call showUserNotReturnedBook(?)}");




        stmt.setInt(1,pid_user);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
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
    
    /**************************************************************************************************************/
    public static DefaultTableModel showNotReturnedBooks()throws SQLException{   

              
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Loan");
        modelo.addColumn("Title");
        modelo.addColumn("First name");
        modelo.addColumn("Last name");
        modelo.addColumn("Load date");
        modelo.addColumn("Return date");
      

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call showNotReturnedBook()}");





        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
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

          
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Book");
        modelo.addColumn("Title");

     

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{call showReturnedBook()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);

              
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        return modelo;
     }
    
    
    
    
    
    public static DefaultTableModel showBinnacle()throws SQLException{   

              
        String data [] = new String[7];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID ");
        modelo.addColumn("Change type");
        modelo.addColumn("Table name");
        modelo.addColumn("Field name");
        modelo.addColumn("Previous value");
        modelo.addColumn("Current value");
        modelo.addColumn("Date");
      

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{ call showBinnacle()}");





        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);
               data [3] = r.getString(4);
               data [4] = r.getString(5);
               data [5] = r.getString(6);
               data [6] = r.getString(7);
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        

        return modelo;
    
    
    
    }
    
    public static DefaultTableModel topLendedBooks(int n)throws SQLException{   

          
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Book");
        modelo.addColumn("Title");
        modelo.addColumn("N");

     

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{call topLendedBooks(?)}");


        stmt.setInt(1,n);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);

              
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        return modelo;
     }
    
    
        public static DefaultTableModel LendedBooksOT(int n, int m)throws SQLException{   

          
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Book");
        modelo.addColumn("Title");
        modelo.addColumn("n");
 
     

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{call LendedBooksOT(?,?)}");


        stmt.setInt(1,n);
        stmt.setInt(2,m);
        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);
               data [2] = r.getString(3);

              
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        return modelo;
     }
    
        
        
       public static DefaultTableModel AgePersonsQ()throws SQLException{   

          
        String data [] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Age");
        modelo.addColumn("Persons");
 
     

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{call AgePersons()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                 
               data [0] = r.getString(1);
               data [1] = r.getString(2);

              
                modelo.addRow(data);
             
                 
                
                 
                 
             }
        return modelo;
     }
    
    
       
    public static DefaultPieDataset AgePersonsS()throws SQLException{   

          
       DefaultPieDataset dataset = new DefaultPieDataset();
 
     

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{call AgePersonsB()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                  dataset.setValue(r.getString(1), r.getInt(2));

             
                 
                
                 
                 
             }
        return dataset;
     }
    
    public static DefaultPieDataset BooksPerGender()throws SQLException{   

          
       DefaultPieDataset dataset = new DefaultPieDataset();
 
     

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{call BooksPerGenre()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                  dataset.setValue(r.getString(1), r.getInt(2));

             
                 
                
                 
                 
             }
        return dataset;
     }
    
    
    
    
    public static DefaultPieDataset LendedBooksPerGender()throws SQLException{   

          
       DefaultPieDataset dataset = new DefaultPieDataset();
 
     

        con = (Connection) DriverManager.getConnection(urlPE, user, pass);
        CallableStatement stmt = con.prepareCall("{call LendedBookPerGender()}");



        stmt.executeQuery();
        ResultSet r =(ResultSet) stmt.getResultSet();
        while(r.next()){
                  dataset.setValue(r.getString(1), r.getInt(2));

             
                 
                
                 
                 
             }
        return dataset;
     }
    
    
    
    
    public static int countLended()throws SQLException{   
    con = (Connection) DriverManager.getConnection(urlPE, user, pass);
    CallableStatement stmt = con.prepareCall("{call countLended()}");
    stmt.executeQuery();
    ResultSet r =(ResultSet) stmt.getResultSet();
    int res=0;
    while(r.next()){
                  
        res=r.getInt(1);
             
                 
                
                 
                 
             }
    return res;
    }
    
    
    public static int countReturned()throws SQLException{   
    con = (Connection) DriverManager.getConnection(urlPE, user, pass);
    CallableStatement stmt = con.prepareCall("{call countReturned()}");
    stmt.executeQuery();
    ResultSet r =(ResultSet) stmt.getResultSet();
     int res=0;
    while(r.next()){
                  
        res=r.getInt(1);
             
                 
                
                 
                 
             }
    return res;

    }
    
    
    public static DefaultPieDataset TotalandLended()throws SQLException{   

          
       DefaultPieDataset dataset = new DefaultPieDataset();
 
     
                  dataset.setValue("Lended", countLended());
                  dataset.setValue("Returned", countReturned());
             
                 
                
                 
                 
             
        return dataset;
     }
    
    
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   


