
package Modelo;

import java.util.Date;

public class Producto {
  private int idProducto;
  private String codigoProducto;
  private String nombreProducto;
  private double precioCompra;
  private double cantidad;
  private Date fechaVencimiento;
  private String porcentaje;
  private int max;
  private int min;
  private int estado;
  private double gananciaUni;
  private double iva;
  private double precioVenta;
  private Empresa empresa;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, double precioCompra, double cantidad, int max, int min) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.max = max;
        this.min = min;
    }

    public Producto(String nombreProducto, double precioCompra, double cantidad, int max, int min) {
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.max = max;
        this.min = min;
    }

    public Producto(String codigoProducto, String nombreProducto, double precioCompra, double cantidad, Date fechaVencimiento, double gananciaUni, double precioVenta) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
        this.gananciaUni = gananciaUni;
        this.precioVenta = precioVenta;
    }

    public Producto(int idProducto, String codigoProducto, String nombreProducto, double precioCompra, double cantidad, Date fechaVencimiento, String porcentaje, int max, int min, int estado, double gananciaUni, double iva, double precioVenta, Empresa empresa) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
        this.porcentaje = porcentaje;
        this.max = max;
        this.min = min;
        this.estado = estado;
        this.gananciaUni = gananciaUni;
        this.iva = iva;
        this.precioVenta = precioVenta;
        this.empresa = empresa;
    }
    

    public Producto(String text, String text0, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getGananciaUni() {
        return gananciaUni;
    }

    public void setGananciaUni(double gananciaUni) {
        this.gananciaUni = gananciaUni;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
