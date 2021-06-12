package Modelo.dao;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.InicioCaja;
import Modelo.Venta;
import VistaMV.Facturacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaDao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public VentaDao(){
        
    }
    
    public ArrayList<Venta> selectAll() {
        String sql = "select * from venta";
        return select(sql);
    }
    
    public ArrayList<Venta> selectAllTo(String atributo, String condicion) {
        String sql = "select * from venta where " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<Venta> selectId(int id) {
        String sql = "select * from venta where idVenta=" + id;
        return select(sql);
    } 
    
    public ArrayList<Venta> buscar(String dato) {
        String sql = "select * from venta where idVenta like '" + dato + "%' or  nFactura like '" + dato + "%' or fechaVenta like '" + dato + "%' or precioTotal like '" + dato + "%'";
        return select(sql);
    }
    
    public boolean insert(Venta obj){
        String sql = "insert into venta(nFactura, fechaVenta, precioTotal)VALUES(?,?,?)";
        return alterarRegistro(sql, obj);
    }
    
    public void update(Venta obj) {
        String sql = "update venta set idVenta =?, nFactura =?, fechaVenta =?, precioTotal =? where idVenta=" + obj.getIdFactura();
        alterarRegistro(sql, obj);
    }
    
    
    private ArrayList<Venta> select(String sql){
        ArrayList<Venta> lista = new ArrayList();
        Venta obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                obj = new Venta();
                //obj.setIdGasto(rs.getInt("idGastos"));
                obj.setIdFactura(rs.getInt("idVenta"));
                obj.setnFactura(rs.getString("nFactura"));
                obj.setFechaVenta(rs.getDate("fechaVenta"));
                obj.setSaldoTotal(rs.getDouble("precioTotal"));
                obj.setCliente(new Cliente(rs.getInt("idCliente")));
                obj.setInicioCaja(new InicioCaja(rs.getInt("idCaja")));
                obj.setEmpleado(new Empleados(rs.getInt("idEmpleado")));
//                obj.setEmpresa(new Empresa(rs.getInt("idEmpresa")));
                lista.add(obj);
            }
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error en sql");
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
    
    private boolean alterarRegistro(String sql, Venta obj){
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, obj.getIdFactura());//aqui
            ps.setDate(2, (Date)obj.getFechaVenta());//aqui
            ps.setDouble(3, obj.getSaldoTotal());//aqui
            
            
            ps.execute();
            
            return true;
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error en sql");
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
    
    public boolean delete(Venta obj) {
        String sql = "delete from venta where idVenta='" + obj.getIdFactura() + "'";//aqui
        
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.execute();
            return true;
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error en sql");
            e.printStackTrace();
        }finally{
            try {
                ps.close();
                conectar.closeConexion(con);
            } catch (Exception ex) {
            }
        }

        return false;
    }
}
