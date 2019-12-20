
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEBA
 */
public class DbInfo {
    private static String username = "root";
    private static String password = "";
    private static String con = "jdbc:mysql://localhost/project?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    
    public static Connection conDB() throws SQLException{
        return DriverManager.getConnection(con,username,password);
    }
    
}
