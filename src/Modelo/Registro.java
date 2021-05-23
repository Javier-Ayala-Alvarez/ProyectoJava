
package Modelo;

import java.util.ArrayList;

public class Registro {
    private int cantidadProducto;
    private double precioTotalProducto;
    private ArrayList<Producto> productos;
    

    public Registro() {
        productos = new ArrayList();
    }

    public Registro(int cantidadProducto, double precioTotalProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioTotalProducto = precioTotalProducto;
        productos = new ArrayList();
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setPrecioTotalProducto(double precioTotalProducto) {
        this.precioTotalProducto = precioTotalProducto;
    }
    
    public void addProducto  (Producto x){
        productos.add(x);
    }
}
