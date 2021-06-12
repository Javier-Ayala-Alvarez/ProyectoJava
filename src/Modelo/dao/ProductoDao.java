package Modelo.dao;

import Modelo.Conexion;
import Modelo.Producto;
import VistaLogin.Alerta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductoDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ProductoDao(){
        
    }
    
    public ArrayList<Producto> selectAll() {
        String sql = "select * from producto";
        return select(sql);
    }
    
    public ArrayList<Producto> selectAllTo(String atributo, String condicion) {
        String sql = "select * from producto where " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Producto> selectId(int id) {
        String sql = "select * from producto where idProducto=" + id;
        return select(sql);
    } 
    
    public ArrayList<Producto> buscar(String dato) {
        String sql = "select * from producto where idProducto like '" + dato + "%' or nombreProducto like '" + dato + "%' or precioCompra like '" + dato + "%'  or cantidad like '" + dato + "%' or max like '" + dato + "%' or min like '" + dato + "%'";
        return select(sql);
    }
    
    public boolean insert(Producto obj){
        String sql = "insert into producto(idProducto, nombreProducto, precioCompra, cantidad, max, min)VALUES(?,?,?,?,?,?)";
        return alterarRegistro(sql, obj);
    }
    
    public void update(Producto obj) {
        String sql = "update producto set idProducto =?, nombreProducto =?, precioCompra =?, cantida =?, max =?, min =? where idProducto=" + obj.getIdProducto();
        alterarRegistro(sql, obj);
    }
    
    
    private ArrayList<Producto> select(String sql){
        ArrayList<Producto> lista = new ArrayList();
        Producto obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                obj = new Producto();
                obj.setIdProducto(rs.getInt("idProducto"));
                obj.setNombreProducto(rs.getString("nombreProducto"));
                obj.setPrecioCompra(rs.getDouble("precioCompra"));
                obj.setCantidad(rs.getDouble("cantidad"));
                obj.setMax(rs.getInt("max"));
                obj.setMin(rs.getInt("min"));
                lista.add(obj);
            }
            
        }catch(Exception e) {
             Alerta alert = new Alerta(null, true,"Error en sql", "/img/error.png");
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
    
    private boolean alterarRegistro(String sql, Producto obj){
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, obj.getNombreProducto());
            ps.setDouble(2, obj.getPrecioCompra());
            ps.setDouble(3, obj.getCantidad());
            ps.setInt(4, obj.getMax());
            ps.setInt(5, obj.getMin());
            
            
            ps.execute();
            
            return true;
        }catch(Exception e) {
             Alerta alert = new Alerta(null, true,"Error en sql", "/img/error.png");
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
