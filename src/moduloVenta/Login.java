/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduloVenta;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
//probando 123 kathy estuvo aqui ok  jajajajja
/**
 *
 * @author Francisco Javier
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public Login() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
      int height = pantalla.height;
      int width = pantalla.width;
      setSize(width/3, height/3);		
      cerrar();
      setLocationRelativeTo(null);		
      setVisible(true);
      
    }

    public void cerrar(){
        Facturacion.s = null;
        Producto.prod = null;
        moduloAdministracion.EliminarVenta.x = null;
        moduloAdministracion.GastoEC.x = null;
        moduloAdministracion.GastoGM.x = null;
        moduloAdministracion.GastoValance.x = null;
        moduloAdministracion.GuardarEmpleado.x = null;
        moduloAdministracion.ModificarEmpleado.x = null;
        moduloAdministracion.ProductoVenta.x = null;
        moduloAdministracion.RegistroDeProductos.x = null;
        moduloAdministracion.RegistroDeVentas.x = null;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();
        lbError1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("INICIO");

        tfUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        tfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUserKeyTyped(evt);
            }
        });

        lbUser.setText("Usuario:");

        lbPass.setText("Contraseña:");

        pfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPassActionPerformed(evt);
            }
        });

        lbError1.setBackground(new java.awt.Color(204, 0, 0));

        btnSalir.setBackground(new java.awt.Color(71, 139, 184));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(71, 139, 184));
        btnSalir1.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir1.setText("Entrar");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbUser)
                                .addGap(26, 26, 26)
                                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(lbError1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUser))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbPass))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbError1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir1)
                    .addComponent(btnSalir))
                .addGap(24, 24, 24))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar(){
           tfUser.setText("");
           pfPass.setText("");
       }
    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserActionPerformed

    private void tfUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUserKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
            this.tfUser.setBackground(Color.red);
            lbError.setText("No se permiten numeros en usuario");
           
        } else{
            this.tfUser.setBackground(Color.WHITE);
            lbError.setText("");
        }
    }//GEN-LAST:event_tfUserKeyTyped

    private void pfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPassActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
         if (tfUser.getText().isEmpty() && pfPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"¡Campos Vacíos!","Error",JOptionPane.ERROR_MESSAGE);
        } else if (pfPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"¡Contraseña vacía!","Error",JOptionPane.ERROR_MESSAGE); 
        } else if (tfUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"¡Nombre vacío!","Error",JOptionPane.ERROR_MESSAGE);
        } else if(pfPass.getText().equals("12345") && tfUser.getText().equals("Admin")){
                JOptionPane.showMessageDialog(null, "Welcome", "ADMIN", HEIGHT);
                //capturar();
                //limpiar();
                moduloAdministracion.MenuAdministrador vistaAd = new moduloAdministracion.MenuAdministrador();
                vistaAd.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null,"Bienvenido " ,"Usuario",JOptionPane.ERROR_MESSAGE);
               // capturar();
                limpiar();
                Factura vista = new Factura();
                vista.setVisible(true);
                this.setVisible(false);
            }  
    }//GEN-LAST:event_btnSalir1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbError1;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
