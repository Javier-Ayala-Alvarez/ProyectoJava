/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GastoEmpresa {
    private int idGasto;
    private Date fecha;
    private String categoria;
    private double saldo;

    public GastoEmpresa(int idGasto, Date fecha, String categoria, double saldo) {
        this.idGasto = idGasto;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
    }

    public GastoEmpresa(Date fecha, String categoria, double saldo) {
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
    }

    public GastoEmpresa() {
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

}
