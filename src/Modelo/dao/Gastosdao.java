package Modelo.dao;

import Modelo.Conexion;
import Modelo.Empresa;
import Modelo.GastoEmpresa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gastosdao {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Gastosdao(){
        
    }
    
    public ArrayList<GastoEmpresa> selectAll() {
        String sql = "select * from gastoempresa";
        return select(sql);
    }
    
    public ArrayList<GastoEmpresa> selectAllTo(String atributo, String condicion) {
        String sql = "select * from gastoempresa where " + atributo + "='" + condicion + "'";
        return select(sql);
    }
    
    public ArrayList<GastoEmpresa> selectId(int id) {
        String sql = "select * from gastoempresa where idGastos=" + id;
        return select(sql);
    } 
    
    public ArrayList<GastoEmpresa> buscar(String dato) {
        String sql = "select * from gastoempresa where idGastos like '" + dato + "%' or codigoGasto like '" + dato + "%' or fecha like '" + dato + "%'  or tipo like '" + dato + "%'  or saldo like '" + dato + "%' or idEmpresa like '" + dato + "%'";
        return select(sql);
    }
    
    public boolean insert(GastoEmpresa obj){
        String sql = "insert into gastoempresa(codigoGasto, fecha, tipo, saldo, idEmpresa)VALUES(?????)";
        return alterarRegistro(sql, obj);
    }
    
    public void update(GastoEmpresa obj) {
        String sql = "update gastoempresa set fecha =?, tipo =?, saldo =?, idEmpresa =? where idGastos=" + obj.getIdGasto();
        alterarRegistro(sql, obj);
    }
    
    
    private ArrayList<GastoEmpresa> select(String sql){
        ArrayList<GastoEmpresa> lista = new ArrayList();
        GastoEmpresa obj = null;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                obj = new GastoEmpresa();
                //obj.setIdGasto(rs.getInt("idGastos"));
                obj.setCodigoGastos(rs.getString("codigoGasto"));
                obj.setFecha(rs.getDate("fecha"));
                obj.setCategoria(rs.getString("tipo"));
                obj.setSaldo(rs.getDouble("saldo"));
                obj.setEmpresa(new Empresa(rs.getInt("idEmpresa")));
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
    
    private boolean alterarRegistro(String sql, GastoEmpresa obj){
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setDate(1, (Date) obj.getFecha());
            ps.setString(2, obj.getCategoria());
            ps.setDouble(3, obj.getSaldo());
            
            
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
    
    public boolean delete(GastoEmpresa obj) {
        String sql = "delete from gastoempresa where idGastoEmpresa='" + obj.getIdGasto() + "'";
        
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
