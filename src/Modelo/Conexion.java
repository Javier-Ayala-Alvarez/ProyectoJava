
package Modelo;
import ejemplocompleto.vistas.Alerta;
import java.sql.*;

public class Conexion {
    
Connection cn;
public Connection getConexion() {
     String driver = "com.mysql.cj.jdbc.Driver";
     String user = "root";  
     String nombreBd= "dtienda";
     String password = "";  
     String url = "jdbc:mysql://localhost:3306/"+nombreBd+"?useUnicode=true&use"
             + "JDBCCompliantTimezoneShift=true&uselegacyDateTimeCode=false&"
             + "serverTimezone=UTC";
      
    try {
            Class.forName(driver);
            cn= DriverManager.getConnection(url,user , password);
        } catch (Exception ex) {
         Alerta alert=new Alerta("Error en la conexión","/ejemplocompleto/img/error.png");
            alert.show();           
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
       Alerta alert=new Alerta("Error al cerrar conexión","/ejemplocompleto/img/error.png");
            alert.show(); 
    sql.printStackTrace();
  }
  }  
}
  
    
    
    
    
    
    

