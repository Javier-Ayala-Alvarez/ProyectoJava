package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
Connection cn;
public Connection getConexion() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/ventasjava";
      
    try {
            Class.forName(driver);
            cn= DriverManager.getConnection(url,user , password);
        } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "Error de conexion");          
            ex.printStackTrace();
        }
     return cn;   
     
     
    }
   
  public  void closeConexion(Connection conn){
  try{
      if(conn!=null){
          conn.close();
      }
  }catch(SQLException sql){
       JOptionPane.showMessageDialog(null, "Error al cerrar conexion"); 
    sql.printStackTrace();
  }
  }  
}
  
    
    
    
    
    
    

