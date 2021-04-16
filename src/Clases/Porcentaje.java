
package Clases;

public class Porcentaje extends Producto{
    private String codigo;
    private double porcentajeUno;
    private double porcentajeDos;
    private double porcentajeTres;

    public Porcentaje() {
    }

    public Porcentaje(String codigo, double porcentajeUno, double porcentajeDos, double porcentajeTres, String codigoProducto, String nombreProducto, double precioCompra, double cantidad, int max, int min) {
        super(codigoProducto, nombreProducto, precioCompra, cantidad, max, min);
        this.codigo = codigo;
        this.porcentajeUno = porcentajeUno;
        this.porcentajeDos = porcentajeDos;
        this.porcentajeTres = porcentajeTres;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPorcentajeUno() {
        return porcentajeUno;
    }

    public void setPorcentajeUno(double porcentajeUno) {
        this.porcentajeUno = porcentajeUno;
    }

    public double getPorcentajeDos() {
        return porcentajeDos;
    }

    public void setPorcentajeDos(double porcentajeDos) {
        this.porcentajeDos = porcentajeDos;
    }

    public double getPorcentajeTres() {
        return porcentajeTres;
    }

    public void setPorcentajeTres(double porcentajeTres) {
        this.porcentajeTres = porcentajeTres;
    }

   
    
    
}
