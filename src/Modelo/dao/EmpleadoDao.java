package Modelo.dao;
import Modelo.Conexion;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.Usuario;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public EmpleadoDao(){
        
    }
    
    public ArrayList<Empleados> selectAll() {
        String sql = "SELECT * fROM empleado";
        return select(sql);
    }
    
    public ArrayList<Empleados> selectAllTo(String atributo, String condicion) {
        String sql = "SELECT * fROM empleado WHERE  " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Empleados> selectId(int id) {
        String sql = "SELECT * fROM empleado WHERE  idEmpleado = " + id;
        return select(sql);
    } 
    
    public ArrayList<Empleados> buscar(String dato) {
        String sql = "SELECT * fROM empleado WHERE idEmpleado like '" + dato 
                       + "%' or codigoEmpleado like '" + dato + "%' or cargoEmpleado like '" + dato + "%' or nombre like '" + dato + "%' ";
        return select(sql);
    }
    
    
    public boolean insert(Empleados obj){
        String sql = "INSERT  INTO empleado (codigoEmpleado, nombre, apellido, telefonoEmpleado,dirrecionEmpleado,"
                      + "salarioEmpleado,cargoEmpleado,afp,isss,contratacion,estado,idEmpresa,idUsuario) VALUES "
                       + "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }
    //UPDATE `Empleado` SET `codigoEmpleados`='2', `nombreEmpleados`='Tienda1', `dirrecionEmpleados`='San vicente1' WHERE (`idEmpleados`='1')
    public boolean update(Empleados obj) {
        String sql = "UPDATE empleado SET codigoEmpleado = ?, nombre = ?, apellido = ?, telefonoEmpleado = ?,dirrecionEmpleado = ?,"
                      + "salarioEmpleado = ?,cargoEmpleado = ?,afp = ?,isss = ?,contratacion = ?,estado = ?,idEmpresa = ?,idUsuario = ?"
                      + " WHERE idEmpleado = " + obj.getIdPersona();
        return alterarRegistro(sql, obj);
    }
    
    
    private ArrayList<Empleados> select(String sql){
        ArrayList<Empleados> lista = new ArrayList();
        Empleados obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
              
                obj = new Empleados();
                
                obj.setIdEmpleado(rs.getInt("idEmpleado"));
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
                
                Empresa empresa = new Empresa(rs.getInt("idEmpresa"));
                Usuario usuario = new Usuario(rs.getInt(("idUsuario")));
                obj.setEmpresa(empresa);
                obj.addUsuario(usuario);
                
                
                
                 
                
                lista.add(obj);
            }
            
        }catch(Exception e) {
            Alerta alert = new Alerta("Error en sql", "/img/error.png");
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
    
    private boolean alterarRegistro(String sql, Empleados obj){
        try {
            //UPDATE Empleado SET codigoEmpleados = ? , nombreEmpleados = ?, dirrecionEmpleados = ?, correoEmpleados = ? WHERE idEmpleados
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,obj.getCodigoEmpleado());
            ps.setString(2,obj.getNombre());
            ps.setString(3,obj.getApellido());
            ps.setString(4,obj.getTelefono());
            ps.setString(5,obj.getDireccion());
            ps.setDouble(6,obj.getSalarioEmpleado());
            ps.setString(7,obj.getCargoEmpleado());
            ps.setDouble(8,obj.getAfp());
            ps.setDouble(9,obj.getIsss());
            ps.setDate(10 , (Date) obj.getFechaContratacion());
            ps.setInt(11, obj.getEstado());
            ps.setInt(13, obj.getUsuario().getIdUsuario());
            
            
            
            
            ps.execute();
            //System.out.println("ujhuuj");
            return true;
        }catch(Exception e) {
            Alerta alert = new Alerta("Error en sql", "/img/error.png");
            alert.show();
            //e.printStackTrace();
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
