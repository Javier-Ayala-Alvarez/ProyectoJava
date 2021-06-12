/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import VistaLogin.Login;
import VistaMA.MenuAdministrador;
import VistaMV.Factura;
import VistaMV.Facturacion;
import VistaMV.Facturacion;
import VistaMV.Mensaje;
import VistaMV.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControlFactura extends MouseAdapter implements ActionListener, KeyListener {

    /*Objetos para el Constructor de esta clase*/
    Factura factura;
    Facturacion facturacion;
    Mensaje mensaje;
    Producto producto;
    Facturacion fD;
    /*Objetos para el Construtor de ControlLogin*/
    Login login;

    public ControlFactura(Factura factura, Facturacion facturacion, Mensaje mensaje, Producto producto) {
        this.factura = factura;
        this.facturacion = facturacion;
        this.mensaje = mensaje;
        this.producto = producto;
        llamarVFactura("FACTURA");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*  Esta función verifica que el botón presionado contenga un determinado
        ActionCommand y ejecuta la función que alberga en su interior.  */
        switch (e.getActionCommand()) {
            case "buscar":
                llamarVFactura("buscar");
                break;
            case "tiket":
                llamarVFactura("tiket");
                break;
            case "facturacion":
                llamarVFactura("facturacion");
                break;
            case "administrador":
                llamarVFactura("administrador");
                break;
            case "cerrarFactura":
                llamarVFactura("cerrarFactura");
                break;
            case "x":
                llamarVFactura("cerrarF");
                break;
            default:
                break;
        }
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

    public void llamarVFactura(String vista) {
        if (vista.equals("FACTURA")) {
            factura.setControladorF(this);
            factura.iniciar();
        } else if (vista.equals("buscar")) {

        } else if (vista.equals("tiket")) {
            JOptionPane.showMessageDialog(null, "Tiket está vacío");
        } else if (vista.equals("facturacion")) {
          
        } else if (vista.equals("administrador")) {
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea ingresar al Login?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == 0) {
                factura.dispose();
                login.cerrar();
                Login log = new Login();
                Factura vistaF = new Factura();
                MenuAdministrador vistaMA = new MenuAdministrador();
                ControlLogin controlL = new ControlLogin(log, vistaF, vistaMA, log.tfUser.getText());
            }
        } else if (vista.equals("cerrarFactura")) {
            factura.dispose();
            login.cerrar();
            Login logg = new Login();
            Factura vistaFf = new Factura();
            MenuAdministrador vistaMAa = new MenuAdministrador();
            ControlLogin controlLo = new ControlLogin(logg, vistaFf, vistaMAa, logg.tfUser.getText());
        }
    }
//hola
}
