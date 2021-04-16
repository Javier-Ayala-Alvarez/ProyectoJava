
package Clases;

public class Registro {
    private int cantidadProducto;
    private double precioTotalProducto;

    public Registro() {
    }

    public Registro(int cantidadProducto, double precioTotalProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioTotalProducto = precioTotalProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioTotalProducto() {
        return precioTotalProducto;
    }

    public void setPrecioTotalProducto(double precioTotalProducto) {
        this.precioTotalProducto = precioTotalProducto;
    }
    
    
}
