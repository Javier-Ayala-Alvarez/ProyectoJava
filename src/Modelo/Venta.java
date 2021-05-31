
package Modelo;
import java.util.ArrayList;
import java.util.Date;

public class Venta {
   private int  idFactura;
   private Date fechaVenta;
   private double saldoTotal;
   private ArrayList<Registro> registros;
   private  InicioCaja inicioCaja;
   private Cliente cliente;
   private Empleados empleado;
   
    

    public Venta() {
    }

    public Venta(int idFactura, Date fechaVenta, double saldoTotal) {
        this.idFactura = idFactura;
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
    }

    public Venta(Date fechaVenta, double saldoTotal) {
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }
    
    public void addRegistro(Registro x){
       registros.add(x);   
    }
    
    public void addInicioCaja(InicioCaja x)
    {
        this.inicioCaja = x;
    }

    public InicioCaja getInicioCaja() {
        return inicioCaja;
    }
    
    public void addCliente(String nombre, String apellido, String telefono, String direccion){
        cliente = new Cliente(nombre, apellido, telefono, direccion);
    }

  
}
