
package Modelo;

public class Producto {
  private int idProducto;
  private String nombreProducto;
  private double precioCompra;
  private double cantidad;
  private int max;
  private int min;

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

    public Producto(String text, String text0, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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
    
    
  
  
}
