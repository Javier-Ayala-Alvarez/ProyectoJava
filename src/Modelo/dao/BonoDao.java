/*package Modelo.dao;
import Modelo.Conexion;
import Modelo.Bono;
import Modelo.Empresa;
import Modelo.Usuario;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BonoDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public BonoDao(){
        
    }
    
    public ArrayList<Bono> selectAll() {
        String sql = "SELECT * fROM Empleado";
        return select(sql);
    }
    
    public ArrayList<Bono> selectAllTo(String atributo, String condicion) {
        String sql = "SELECT * fROM empleado WHERE  " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Bono> selectId(int id) {
        String sql = "SELECT * fROM empleado WHERE  idEmpleado = " + id;
        return select(sql);
    } 
    
    public ArrayList<Bono> buscar(String dato) {
        String sql = "SELECT * fROM empleado WHERE codigoEmpleado like '" + dato 
                       + "%' or cargoEmpleado like '" + dato + "%' or nombre like '" + dato + "%' ";
        return select(sql);
    }
    
    public boolean insert(Bono obj){
        String sql = "INSERT  INTO empleado (codigoEmpleado, nombre, apellido, telefonoEmpleado,dirrecionEmpleado,"
                      + "salarioEmpleado,cargoEmpleado,afp,isss,contratacion,estado,idEmpresa,usuario_idUsuario) VALUES "
                       + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return alterarRegistro(sql, obj,1);
    }
    
    public boolean update(Bono obj) {
        String sql = "UPDATE empleado SET codigoEmpleado = ?, nombre = ?, apellido = ?, telefonoEmpleado = ?,dirrecionEmpleado = ?,"
                      + "salarioEmpleado = ?,cargoEmpleado = ?,afp = ?,isss = ?,contratacion = ?,estado = ?,idEmpresa = ?,usuario_idUsuario = ?"
                      + " WHERE idEmpleado = " + obj.();
        return alterarRegistro(sql, obj,2);
    }
    
    
    private ArrayList<Bono> select(String sql){
        ArrayList<Bono> lista = new ArrayList();
        Bono obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
              
                obj = new Bono();
                Usuario usuario = new Usuario(rs.getInt(("usuario_idUsuario")));
                Empresa empresa = new Empresa(rs.getInt("idEmpresa"));
                obj.setIdPersona(rs.getInt("idEmpleado"));
                obj.setCodigoEmpleado(rs.getString("codigoEmpleado"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setTelefono(rs.getString("telefonoEmpleado"));
                obj.setDireccion(rs.getString("dirrecionEmpleado"));
                obj.setSalarioEmpleado(rs.getDouble("salarioEmpleado"));
                obj.setCargoEmpleado(rs.getString("cargoEmpleado"));
                obj.setAfp(rs.getDouble("afp"));
                obj.setIsss(rs.getDouble("isss"));
                obj.setFechaContratacion(rs.getDate("contratacion"));
                obj.setEstado(rs.getInt("estado"));
                obj.addUsuario(usuario);
                obj.setEmpresa(empresa);
                
                
                 
                
                lista.add(obj);
            }
            
        }catch(Exception e) {
            Alerta alert = new Alerta(null,true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (Exception ex) {
                
            }
            conectar.closeConexion(con);
        }
        
        return lista;
    }
    
    private boolean alterarRegistro(String sql, Bono obj,int control){
        try {
           //codigoEmpleado, nombre, apellido, telefonoEmpleado,dirrecionEmpleado,"
             //         + "salarioEmpleado,cargoEmpleado,afp,isss,contatacion,estado,idEmpresa,usuario_idUsuario
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            if (control == 1) {
                ps.setString(1,obj.getCodigoEmpleado());
            //ps.setString(2,obj.getNombre());
            ps.setString(3,obj.getApellido());
            ps.setString(4,obj.getTelefono());
            ps.setString(5,obj.getDireccion());
            ps.setDouble(6,obj.getSalarioEmpleado());
            ps.setString(7,obj.getCargoEmpleado());
            ps.setDouble(8,obj.getAfp());
            ps.setDouble(9,obj.getIsss());
             //new java.sql.Date(obj.getFecha().getTime())
            ps.setDate(10 , new java.sql.Date(obj.getFechaContratacion().getTime()));
            ps.setInt(11, obj.getEstado());
            ps.setInt(12,obj.getEmpresa().getIdEmpresa());
            ps.setInt(13,0 );
            }else{
                ps.setString(1,obj.getCodigoEmpleado());
            ps.setString(2,obj.getNombre());
            ps.setString(3,obj.getApellido());
            ps.setString(4,obj.getTelefono());
            ps.setString(5,obj.getDireccion());
            ps.setDouble(6,obj.getSalarioEmpleado());
            ps.setString(7,obj.getCargoEmpleado());
            ps.setDouble(8,obj.getAfp());
            ps.setDouble(9,obj.getIsss());
             //new java.sql.Date(obj.getFecha().getTime())
            ps.setDate(10 , new java.sql.Date(obj.getFechaContratacion().getTime()));
            ps.setInt(11, obj.getEstado());
            ps.setInt(12,obj.getEmpresa().getIdEmpresa());
            ps.setInt(13,obj.getUsuario().getIdUsuario() );

            }
            
            
            
            
            ps.execute();
            //System.out.println("ujhuuj");
            return true;
        }catch(Exception e) {
            Alerta alert = new Alerta(null,true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (Exception ex) {
                
            }
            conectar.closeConexion(con);
        }
        return false; 
    }
    
     public boolean darBaja( Bono obj){
        try {
          
          String sql ="UPDATE empleado SET estado = '0' WHERE idEmpleado = " + obj.getIdPersona();
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
           
            ps.execute();
           
            return true;
        }catch(Exception e) {
            Alerta alert = new Alerta(null,true,"Error en sql", "/img/error.png");
            alert.show();
            e.printStackTrace();
        }finally{
            try {
                ps.close();
            } catch (Exception ex) {
                
            }
            conectar.closeConexion(con);
        }
        return false; 
    }
    
    
}
*/