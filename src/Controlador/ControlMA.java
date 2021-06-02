/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.GastoEmpresa;
import VistaLogin.Login;
import VistaMA.EliminarVentas;
import VistaMA.EmpleadoGM;
import VistaMA.GastosGM;
import VistaMA.GastosValance;
import VistaMA.MenuAdministrador;
import VistaMA.RegistrosDeProductos;
import VistaMA.RegistrosDeVentas;
import VistaMA.VistaEmpresa;
import VistaMV.Factura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kathy
 */
public class ControlMA extends MouseAdapter implements ActionListener, KeyListener {

    /*Clases que serán usadas para el Constructor*/
    MenuAdministrador menuAdministrador;
    Login login;
    EmpleadoGM empleadoGM;
    GastosGM gastosGM;
    GastosValance gastosValance;
    RegistrosDeProductos registrosDeProductos;
    RegistrosDeVentas registrosDeVentas;
    EliminarVentas eliminarVentas;
    VistaEmpresa vistaEmpresa;

    public ControlMA(MenuAdministrador menuAdministrador, Login login, EmpleadoGM empleadoGM, GastosGM gastosGM, GastosValance gastosValance, RegistrosDeProductos registrosDeProductos, RegistrosDeVentas registrosDeVentas, EliminarVentas eliminarVentas) {
        this.menuAdministrador = menuAdministrador;
        this.login = login;
        this.empleadoGM = empleadoGM;
        this.gastosGM = gastosGM;
        this.gastosValance = gastosValance;
        this.registrosDeProductos = registrosDeProductos;
        this.registrosDeVentas = registrosDeVentas;
        this.eliminarVentas = eliminarVentas;
        llamarVistaConsulta("menuAdministrador");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*  Esta función verifica que el botón presionado contenga un determinado
        ActionCommand y ejecuta la función que alberga en su interior.  */

 /*Inicio de Botones Derechos*/
        if (e.getActionCommand().equals("Home")) {
            llamarVistaConsulta("home");
        } else if (e.getActionCommand().equals("Ventas")) {
            llamarVistaConsulta("ventas");
        } else if (e.getActionCommand().equals("Gastos")) {
            llamarVistaConsulta("gastos");
        } else if (e.getActionCommand().equals("Empleado")) {
            llamarVistaConsulta("empleado");
        } else if (e.getActionCommand().equals("Cliente")) {
            llamarVistaConsulta("cliente");
        } else if (e.getActionCommand().equals("cerrarMenu")) {
            llamarVistaConsulta("cerrarMenu");
        }
        /*Fin de Botones Derechos*/
 /*----------------------------------------------------------------------*/
 /*Inicio de Sub-botones de los Menús*/
        if (e.getActionCommand().equals("registrarFacturaItem")) {
            llamarVistaConsulta("registroVentas");
        } else if (e.getActionCommand().equals("eliminarFacturaItem")) {
            llamarVistaConsulta("eliminarFacturaItem");
        } else if (e.getActionCommand().equals("guardarProducto")) {
            llamarVistaConsulta("guardarProducto");
        } else if (e.getActionCommand().equals("modificarProducto")) {
            llamarVistaConsulta("modificarProducto");
        } else if (e.getActionCommand().equals("eliminarProducto")) {
            llamarVistaConsulta("eliminarProducto");
        } else if (e.getActionCommand().equals("consultarProducto")) {
            llamarVistaConsulta("consultarProducto");
        } else if (e.getActionCommand().equals("guardarEmpleado")) {
            llamarVistaConsulta("guardarEmpleado");
        } else if (e.getActionCommand().equals("modificarEmpleado")) {
            llamarVistaConsulta("modificarEmpleado");
        } else if (e.getActionCommand().equals("eliminarEmpleado")) {
            llamarVistaConsulta("eliminarEmpleado");
        } else if (e.getActionCommand().equals("consultarEmpleado")) {
            llamarVistaConsulta("consultarEmpleado");
        } else if (e.getActionCommand().equals("consultarCliente")) {
            llamarVistaConsulta("consultarCliente");
        }else if (e.getActionCommand().equals("opcionesGDS")) {
            llamarVistaConsulta("opcionesGDS");
        }else if (e.getActionCommand().equals("valanceGDS")) {
            llamarVistaConsulta("valanceGDS");
        }else if (e.getActionCommand().equals("modificarEmpresa")) {
            llamarVistaConsulta("modificarEmpresa");
        }else if (e.getActionCommand().equals("consultarEmpresa")) {
            llamarVistaConsulta("consultarEmpresa");
        }
        /*Fin de Sub-botones de los Menús*/

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void llamarVistaConsulta(String vista) {
        /*Esta función realiza la acción al presionar un determinado botón
        con su respectivo ActionCommand proveniente de la función ActionPerformed*/

 /*Ejecuciones de los Botones Derechos*/
        if (vista.equals("menuAdministrador")) {
            menuAdministrador.setControladorMA(this);
            menuAdministrador.iniciar();
        } else if (vista.equals("home")) {
            JOptionPane.showMessageDialog(null, "No hay nada Home");
        } else if (vista.equals("ventas")) {
            JOptionPane.showMessageDialog(null, "NO HAY NADA VENTAS");
        } else if (vista.equals("gastos")) {
            JOptionPane.showMessageDialog(null, "NO HAY GASTOS");
        } else if (vista.equals("empleado")) {
            JOptionPane.showMessageDialog(null, "NO HAY NADA EMPLEADO");
        } else if (vista.equals("cliente")) {
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTE");
        } else if (vista.equals("cerrarMenu")) {
            menuAdministrador.dispose();
            login.cerrar();
            Login log = new Login();
            Factura vistaF = new Factura();
            MenuAdministrador vistaMA = new MenuAdministrador();
            ControlLogin controlL = new ControlLogin(log, vistaF, vistaMA, log.tfUser.getText());
        }
        /*Fin de Ejecuciones de los Botones Derechos*/
 /*----------------------------------------------------------------------*/
 /*Ejecuciones de los Sub-botones de los subMenús*/
        if (vista.equals("registroVentas")) {
            RegistrosDeVentas registroVen = new RegistrosDeVentas(menuAdministrador, true);
            registroVen.iniciar();
        } else if (vista.equals("eliminarFacturaItem")) {
            EliminarVentas elimFac = new EliminarVentas(menuAdministrador, true);
            elimFac.iniciar();
        } else if (vista.equals("guardarProducto")) {

        } else if (vista.equals("modificarProducto")) {

        } else if (vista.equals("eliminarProducto")) {

        } else if (vista.equals("consultarProducto")) {
            registrosDeProductos = new RegistrosDeProductos(menuAdministrador, true);
            this.registrosDeProductos.iniciar();
        } else if (vista.equals("guardarEmpleado")) {
            this.empleadoGM = new EmpleadoGM(menuAdministrador, true);
            this.empleadoGM.btnGuardar.setEnabled(true);
            this.empleadoGM.btnModificar.setEnabled(false);
            this.empleadoGM.iniciar();
        } else if (vista.equals("modificarEmpleado")) {
            this.empleadoGM = new EmpleadoGM(menuAdministrador, true);
            this.empleadoGM.btnGuardar.setEnabled(false);
            this.empleadoGM.btnModificar.setEnabled(true);
            this.empleadoGM.iniciar();
        } else if (vista.equals("eliminarEmpleado")) {

        } else if (vista.equals("consultarEmpleado")) {

        }else if (vista.equals("consultarCliente")) {
            
        }else if (vista.equals("opcionesGDS")) {
             ArrayList<GastoEmpresa> gastos = new ArrayList();
            this.gastosGM = new GastosGM(menuAdministrador,true,gastos);
            this.gastosGM.iniciar();
        }else if (vista.equals("valanceGDS")) {
             ArrayList<GastoEmpresa> empresa = new ArrayList();
            this.gastosValance = new GastosValance(menuAdministrador,true,empresa);
            this.gastosValance.iniciar();
        }
        else if (vista.equals("modificarEmpresa")) {
            this.vistaEmpresa = new VistaEmpresa(menuAdministrador,true,true);
            this.vistaEmpresa.iniciar();
            
        }
        else if (vista.equals("consultarEmpresa")) {
            this.vistaEmpresa = new VistaEmpresa(menuAdministrador,true,false);
            this.vistaEmpresa.iniciar();
            
        }
        
        /*Fin de Ejecuciones de los Sub-botones de los Menús*/
    }
}
