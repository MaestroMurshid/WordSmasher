

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Toshiba
 */
public class dbconnection 
{
    public static Connection connect()
    {
        Connection conn = null;
        try{
            String dbName="madin_word_smasher";
            String dbUserName="root";
            String dbPassword="";


            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName+"?user="+dbUserName+"&password="+dbPassword+"&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            Component rootPane = null;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);  
        }
        return conn;
    }
}
