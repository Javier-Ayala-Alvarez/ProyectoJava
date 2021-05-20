/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.Login.Login;
import Vista.moduloAdministracion.MenuAdministrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kathy
 */
public class ControladorAdministracion implements ActionListener {

    public ControladorAdministracion() {
        
         /*--------------Modulo vista===----------------*/
             Login login = new Login();
        /*-----------------------------------------------*/
        
        
        /*Modulo Administracion*/
         /*------------MenuAdministrador--------------*/
        MenuAdministrador menuAdministrador = new MenuAdministrador();
        /*-----------------------------------------------*/

        /*Fin de Modulo Administracion*/
        
     
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
