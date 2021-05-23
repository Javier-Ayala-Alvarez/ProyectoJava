/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AdministrarCaja {
    private int idAdminCaja;
    private Date fechaInicio,fechaCierre;
    private double dineroInicio,dineroCierre;
    private ArrayList<Venta>ventas;

    public AdministrarCaja(int idAdminCaja, Date fechaInicio, Date fechaCierre, double dineroInicio, double dineroCierre) {
        this.idAdminCaja = idAdminCaja;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.dineroInicio = dineroInicio;
        this.dineroCierre = dineroCierre;
       
    }

    public AdministrarCaja() {
    }

    public AdministrarCaja(Date fechaInicio, Date fechaCierre, double dineroInicio, double dineroCierre) {
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.dineroInicio = dineroInicio;
        this.dineroCierre = dineroCierre;
       
    }

    public int getIdAdminCaja() {
        return idAdminCaja;
    }

    public void setIdAdminCaja(int idAdminCaja) {
        this.idAdminCaja = idAdminCaja;
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

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    public void addVentas(Date fechaVenta, double saldoTotal)
    {
        ventas.add(new Venta(fechaVenta, saldoTotal));
    }
    
    
    

}
