
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GastosEmpresa {
    private String codigoGastos;
    private Date fecha;
    private String tipo;
    private double saldo;

    public GastosEmpresa() {
    }

    public GastosEmpresa(String codigoGastos, Date fecha, String tipo, double saldo) {
        this.codigoGastos = codigoGastos;
        this.fecha = fecha;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getCodigoGastos() {
        return codigoGastos;
    }

    public void setCodigoGastos(String codigoGastos) {
        this.codigoGastos = codigoGastos;
    }

    public Date getFecha() {
       
        return fecha;
    }

    public void setFecha(Date fecha) {
        
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
   
}
