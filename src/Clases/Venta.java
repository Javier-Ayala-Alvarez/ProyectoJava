
package Clases;
import java.util.Date;

public class Venta {
   private String nFactura;
   private Date fechaVenta;
   private double precioTotal;

    public Venta() {
    }

    public Venta(String nFactura, Date fechaVenta, double precioTotal) {
        this.nFactura = nFactura;
        this.fechaVenta = fechaVenta;
        this.precioTotal = precioTotal;
    }

    public String getnFactura() {
        return nFactura;
    }

    public void setnFactura(String nFactura) {
        this.nFactura = nFactura;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
   
   
}
