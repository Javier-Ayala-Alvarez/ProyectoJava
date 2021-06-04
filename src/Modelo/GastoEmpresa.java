/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Modelo.dao.EmpresaDao;
import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GastoEmpresa {
    private int idGasto;
    private String codigoGastos;
    private Date fecha;
    private String categoria;
    private double saldo;
    private Empresa empresa;

    public GastoEmpresa(int idGasto, Date fecha, String categoria, double saldo) {
        this.idGasto = idGasto;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
    }

    public GastoEmpresa(String codigoGastos, Date fecha, String categoria, double saldo, Empresa empresa) {
        this.codigoGastos = codigoGastos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
        this.empresa = empresa;
    }

    public GastoEmpresa(String codigoGastos, Date fecha, String categoria, double saldo) {
        this.codigoGastos = codigoGastos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.saldo = saldo;
    }

    public GastoEmpresa() {
    }



    public String getCodigoGastos() {
        return codigoGastos;
    }

    public void setCodigoGastos(String codigoGastos) {
        this.codigoGastos = codigoGastos;
    }

    public Empresa getEmpresa() {
        EmpresaDao daoEmpresa = new EmpresaDao();
        empresa = daoEmpresa.selectId(empresa.getIdEmpresa()).get(0);

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
