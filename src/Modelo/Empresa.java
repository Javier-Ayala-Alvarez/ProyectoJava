

package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Empresa {
    private int IdEmpresa;
    private String nombre,direccion,correo;
    private ArrayList<GastoEmpresa>gastosEmpresa;
    private ArrayList<Producto> productos;
    private ArrayList<Venta>ventas;
    private ArrayList<Empleados> empleados;
    

    public Empresa(int IdEmpresa, String nombre, String direccion, String correo) {
        this.IdEmpresa = IdEmpresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
         gastosEmpresa =new ArrayList();
         productos = new ArrayList();
         ventas = new ArrayList();
         empleados = new ArrayList();
    }

    public Empresa(String nombre, String direccion, String correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        gastosEmpresa =new ArrayList();
        productos = new ArrayList();
        ventas = new ArrayList();
         empleados = new ArrayList();
    }

    public Empresa() {
         gastosEmpresa =new ArrayList();
         productos = new ArrayList();
         ventas = new ArrayList();
          empleados = new ArrayList();
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(int IdEmpresa) {
        this.IdEmpresa = IdEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    private void addGasto(int idGasto, Date fecha, String categoria, double saldo){
        this.gastosEmpresa.add(new GastoEmpresa(idGasto, fecha, categoria, saldo));
        
    }

    public ArrayList<GastoEmpresa> getGastosEmpresa() {
        return gastosEmpresa;
    }

    public void setGastosEmpresa(ArrayList<GastoEmpresa> gastosEmpresa) {
        this.gastosEmpresa = gastosEmpresa;
    }
    
    
    public void addProductos( Producto x)
    {
        productos.add(x);
        
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
     public void addVenta( Venta x)
    {
        ventas.add(x);
        
    }
     
     public void addEmpleado(Empleados x)
     {
         this.empleados.add(x);
     }
     

}
