package Modelo;


import java.util.ArrayList;
import java.util.Date;

public class Empleados extends Persona{

    private int idEmpleado;
    private String cargoEmpleado,codigoEmpleado;
    private double salarioEmpleado, afp, isss;
    private Date fechaContratacion;
    private Usuario usuario;
    private  Bono bono;
    private Empresa empresa;
    private ArrayList<Venta> ventas;
    private int estado;

    public Empleados(String cargoEmpleado, double salarioEmpleado, double afp, double isss,Usuario usuario, Date fechaContratacion, int idPersona, String nombre, String apellido, String telefono, String direccion) {
        super(idPersona, nombre, apellido, telefono, direccion);
        this.cargoEmpleado = cargoEmpleado;
        this.salarioEmpleado = salarioEmpleado;
        this.afp = afp;
        this.isss = isss;
        this.fechaContratacion = fechaContratacion;
        this.usuario = usuario;
        ventas = new ArrayList();
        
    }

    public Empleados(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleados() {
        ventas = new ArrayList();
    }

    public Empleados(String cargoEmpleado, double salarioEmpleado, double afp, double isss, Date fechaContratacion, Usuario usuario, String nombre, String apellido, String telefono, String direccion) {
        super(nombre, apellido, telefono, direccion);
        this.cargoEmpleado = cargoEmpleado;
        this.salarioEmpleado = salarioEmpleado;
        this.afp = afp;
        this.isss = isss;
        this.fechaContratacion = fechaContratacion;
        this.usuario = usuario;
        ventas = new ArrayList();
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

   

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public double getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(double salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public double getAfp() {
        return afp;
    }

    public void setAfp(double afp) {
        this.afp = afp;
    }

    public double getIsss() {
        return isss;
    }

    public void setIsss(double isss) {
        this.isss = isss;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }



    public Usuario getUsuario() {
        return usuario;
    }

    public void addVenta(Venta x){
        ventas.add(x);
    }
    public void addBono(Bono x){
        this.bono = x;
    }
    public void addUsuario(Usuario x){
        this.usuario = x;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

  
    
}
