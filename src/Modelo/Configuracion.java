
package Modelo;

public class Configuracion {
    private String codigoEmpresa;
    private String nombreEmpresa;
    private String dirrecionEmpresa;
    private String correoEmpresa;

    public Configuracion() {
    }

    public Configuracion(String codigoEmpresa, String nombreEmpresa, String dirrecionEmpresa, String correoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.dirrecionEmpresa = dirrecionEmpresa;
        this.correoEmpresa = correoEmpresa;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDirrecionEmpresa() {
        return dirrecionEmpresa;
    }

    public void setDirrecionEmpresa(String dirrecionEmpresa) {
        this.dirrecionEmpresa = dirrecionEmpresa;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }
    
    
}
