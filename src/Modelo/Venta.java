
package Modelo;
import Modelo.dao.ClienteDao;
import Modelo.dao.EmpleadoDao;
import java.util.ArrayList;
import java.util.Date;

public class Venta {
   private int  idFactura;
   private String  nFactura;
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

    public Venta(int idFactura, Date fechaVenta, double saldoTotal, ArrayList<Registro> registros, Empleados empleado) {
        this.idFactura = idFactura;
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
        this.registros = registros;
        this.empleado = empleado;
    }

    public Venta(int idFactura, String nFactura, Date fechaVenta, double saldoTotal, ArrayList<Registro> registros, InicioCaja inicioCaja, Cliente cliente, Empleados empleado) {
        this.idFactura = idFactura;
        this.nFactura = nFactura;
        this.fechaVenta = fechaVenta;
        this.saldoTotal = saldoTotal;
        this.registros = registros;
        this.inicioCaja = inicioCaja;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public String getnFactura() {
        return nFactura;
    }

    public void setnFactura(String nFactura) {
        this.nFactura = nFactura;
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

    public Cliente getCliente() {
        ClienteDao daoCliente = new ClienteDao();
        cliente = daoCliente.selectId(cliente.getIdCliente()).get(0);
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleados getEmpleado() {
        EmpleadoDao daoEmpleado = new EmpleadoDao();
        empleado = daoEmpleado.selectId(empleado.getIdEmpleado()).get(0);
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }

    public void setInicioCaja(InicioCaja inicioCaja) {
        this.inicioCaja = inicioCaja;
    }
    
    

  
}
