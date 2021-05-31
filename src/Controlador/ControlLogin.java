/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import VistaLogin.Login;
import VistaMA.EliminarVentas;
import VistaMA.EmpleadoGM;
import VistaMA.GastosGM;
import VistaMA.GastosValance;
import VistaMA.MenuAdministrador;
import VistaMA.RegistrosDeProductos;
import VistaMA.RegistrosDeVentas;
import VistaMV.Factura;
import VistaMV.Facturacion;
import VistaMV.Mensaje;
import VistaMV.Producto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author kathy
 */
public class ControlLogin extends MouseAdapter implements ActionListener, KeyListener {

    /*Objetos para el Constructor de esta clase*/
    Login login;
    Factura factura;
    MenuAdministrador menuAdministrador;
    String acceso;
    /*Objetos para el Constructor de ControlMA*/
    EmpleadoGM empleadoGM;
    GastosGM gastosGM;
    GastosValance gastosValance;
    RegistrosDeProductos registrosDeProductos;
    RegistrosDeVentas registrosDeVentas;
    EliminarVentas eliminarVentas;
    /*Objetos para el Constructor de ControlFactura*/
    Facturacion facturacion;
    Mensaje mensaje;
    Producto producto;
    String g;

    public ControlLogin(Login login, Factura factura, MenuAdministrador menuAdministrador, String acceso) {
        this.login = login;
        this.acceso = acceso;
        this.factura = factura;
        this.menuAdministrador = menuAdministrador;
        llamarVistaConsulta("login");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*  Esta función verifica que el botón presionado contenga un determinado
        ActionCommand y ejecuta la función que alberga en su interior.  */
        if (e.getActionCommand().equals("Entrar")) {
            String respuesta = direccion();
            llamarVistaConsulta(respuesta);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (Character.isDigit(c)) {
            e.consume();
            login.tfUser.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "No se permiten números");
        } else {
            login.tfUser.setBackground(Color.WHITE);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void limpiar() {
        login.tfUser.setText("");
        login.pfPass.setText("");
    }

    public void llamarVistaConsulta(String vista) {
        /*Esta función realiza la acción al presionar un determinado botón
        con su respectivo ActionCommand proveniente de la función ActionPerformed*/
        if (vista.equals("login")) {
            login.setControlador(this);
            login.iniciar();
        } else if (vista.equals("admin")) {
            login.dispose();
            factura.setControlador(this);
            ControlFactura controlF = new ControlFactura(factura, facturacion, mensaje, producto);
        } else if (vista.equals("Admin")) {
            login.dispose();
            menuAdministrador.setControlador(this);
            ControlMA controlMA = new ControlMA(menuAdministrador, login, empleadoGM, gastosGM, gastosValance, registrosDeProductos, registrosDeVentas, eliminarVentas);
        }
    }

    public String direccion() {
        if (login.tfUser.getText().isEmpty() && login.pfPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Ambos campos vacíos!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((login.pfPass.getText().isEmpty()) || login.tfUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Ningún campo debe quedar en blanco!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ((login.pfPass.getText().equals("1") && (login.tfUser.getText().equals("AD")))) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas ingresar a Administracion?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                login.dispose();
                g = "Admin";
            }
        } else if ((login.pfPass.getText().equals("1") && (login.tfUser.getText().equals("ad")))) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas ingresar a Caja?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                login.dispose();
                g = "admin";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
        }
        limpiar();
        return g;
    }

}
