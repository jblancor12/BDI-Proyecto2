/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import static interfaz.inicio.id_user;
import java.sql.SQLException;

/**
 *
 * @author andres
 */
public class logica {
    
    
    
    
    
   public static boolean validPassword(int userId, String ppassword) throws SQLException{
       
       String r1 = connectMysql.conexion.getPassword(userId);
            String r2 = ppassword;
       
       return r1.equals(r2);
   }
    
    public static int extractId(String pvalue){
        
        
        String id="";
        for(int i=0; i<= pvalue.length()-1;i++){
            if(pvalue.substring(i, i+1).equals("-")){
                break;
            }
            else{
               id =id+ pvalue.substring(i, i+1);
            }
        }
        return Integer.valueOf(id);
    }
}
