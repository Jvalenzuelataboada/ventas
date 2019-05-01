package Conexion;

import java.awt.JobAttributes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
//    
//    String user="ra";
//    String pass="1234";
//    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    String url="jdbc:sqlserver://localhost:1433;databaseName=sisventas";
//    
//
//    public Connection getConecion() {
//        Connection con = null;
//        try {
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null, "CONECTADO");
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//                        JOptionPane.showMessageDialog(null, "ERROR AL CONECTARSE");
//
//        }
//        return con;
//    }
//    
//    public void Cerrar1(Connection con, CallableStatement cstm) {
//        try {
//            if (con != null) {
//                con.close();
//            }
//            if (cstm != null) {
//                cstm.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void Cerrar2(CallableStatement cstm, ResultSet rs) {
//        try {
//            if (rs != null) {
//                rs.close();
//            }
//            if (cstm != null) {
//                cstm.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    
    
    private static Connection con;
 
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=sisventas1","jc","123");

        } catch (Exception e) {
            System.out.println(""+e);
            con = null;
        }
        return con;
    }
    
    public static Connection closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;
    }

}
