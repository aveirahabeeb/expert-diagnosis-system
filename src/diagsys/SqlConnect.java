/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  diagsys;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Properties;


/**
 *
 * @author Mr Olayinka
 */
public class SqlConnect {
    
    static  Connection conn = null;
    
    // Database Connection 
    public static Connection conDB() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
     
        try {
               InputStream fis = SqlConnect.class.getClassLoader().getResourceAsStream("Config.properties");
               // InputStream fis = new FileInputStream("./Config.properties");
               //FileInputStream fis = new FileInputStream("./Config.properties");
                Properties props = new Properties();
                props.load(fis);
                
                     String Driver = props.getProperty("DB_Driver");
                     String DbName = props.getProperty("DB_DiagnosisSystem");
                     
            Class.forName(Driver).newInstance();
           conn = DriverManager.getConnection(DbName);
            return conn;
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
             return null;
        }
   
    }
    
    
    
    
     
   
   

}
