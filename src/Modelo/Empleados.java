
package Modelo;

import java.util.Date;

public class Empleados {
    protected String codigo; 
    protected String nombreEmpleado; 
    protected String apellidoEmpleado;
    protected String telefonoEmpleado;
    protected String dirrecionEmpleado;
    protected String salarioEmpleado;
    protected String cargoEmpleado;
    protected String afp;
    protected String isss;
    protected Date constratacion; 

    public Empleados() {
    }

    public Empleados(String codigo, String nombreEmpleado, String apellidoEmpleado, String telefonoEmpleado, String dirrecionEmpleado, String salarioEmpleado, String cargoEmpleado, String afp, String isss, Date constratacion) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.dirrecionEmpleado = dirrecionEmpleado;
        this.salarioEmpleado = salarioEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.afp = afp;
        this.isss = isss;
        this.constratacion = constratacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getDirrecionEmpleado() {
        return dirrecionEmpleado;
    }

    public void setDirrecionEmpleado(String dirrecionEmpleado) {
        this.dirrecionEmpleado = dirrecionEmpleado;
    }

    public String getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(String salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getIsss() {
        return isss;
    }

    public void setIsss(String isss) {
        this.isss = isss;
    }

    public Date getConstratacion() {
        return constratacion;
    }

    public void setConstratacion(Date constratacion) {
        this.constratacion = constratacion;
    }
   
   
}
