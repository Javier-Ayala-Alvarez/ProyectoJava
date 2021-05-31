
package Modelo;

import java.util.ArrayList;

public class Registro {
    private int cantidadProducto;
    private double precioTotalProducto;
    Producto producto;
    

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
     
    public void addProducto(Producto x){
        this.producto = x;
    }

    public Producto getProducto() {
        return producto;
    }
            
    
}
