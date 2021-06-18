/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Modelo.dao.UsuarioDao;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class InicioCaja {
    private int idAdminCaja;
     private String codigoCaja;
    private Date fechaInicio,fechaCierre;
    private double dineroInicio,dineroCierre;

    private  Usuario usuario;

    public InicioCaja(String codigoCaja, Date fechaInicio, Date fechaCierre, double dineroInicio, double dineroCierre, Usuario usuario) {
        this.codigoCaja = codigoCaja;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.dineroInicio = dineroInicio;
        this.dineroCierre = dineroCierre;
        this.usuario = usuario;
    }

    public InicioCaja(int idAdminCaja, Date fechaInicio, Date fechaCierre, double dineroInicio, double dineroCierre) {
        this.idAdminCaja = idAdminCaja;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.dineroInicio = dineroInicio;
        this.dineroCierre = dineroCierre;
    }
    

    public InicioCaja() {
    }

    public InicioCaja(int idAdminCaja) {
        this.idAdminCaja = idAdminCaja;
    }

    public InicioCaja(double dineroInicio) {
        this.dineroInicio = dineroInicio;
    }
    

    

    public int getIdAdminCaja() {
        return idAdminCaja;
    }

    public void setIdAdminCaja(int idAdminCaja) {
        this.idAdminCaja = idAdminCaja;
    }

    public String getCodigoCaja() {
        return codigoCaja;
    }

    public void setCodigoCaja(String codigoCaja) {
        this.codigoCaja = codigoCaja;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getDineroInicio() {
        return dineroInicio;
    }

    public void setDineroInicio(double dineroInicio) {
        this.dineroInicio = dineroInicio;
    }

    public double getDineroCierre() {
        return dineroCierre;
    }

    public void setDineroCierre(double dineroCierre) {
        this.dineroCierre = dineroCierre;
    }

    public Usuario getUsuario() {
           UsuarioDao daoUsuario = new UsuarioDao();
        usuario = daoUsuario.selectId(usuario.getIdUsuario()).get(0);

        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
  
     
}