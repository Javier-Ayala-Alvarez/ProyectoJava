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
        //this.setLocationRelativeTo(null);			
      cerrar();
      setLocationRelativeTo(null);		
      setVisible(true);
      jpLogo12.setBorder(new Fondo("/img/login.png"));
    }

    public void cerrar(){
        Facturacion.s = null;
        Producto.prod = null;
        moduloAdministracion.EliminarVentas.x = null;
        moduloAdministracion.GastosEC.x = null;
        moduloAdministracion.GastosGM.x = null;
        moduloAdministracion.GastosValance.x = null;
        moduloAdministracion.EmpleadoGM.x = null;
        moduloAdministracion.RegistrosDeProductos.x = null;
        moduloAdministracion.RegistrosDeVentas.x = null;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbError = new javax.swing.JLabel();
        jpLogo = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        btnSalir1 = new javax.swing.JButton();
        lbError1 = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        tfUser = new principal.MaterialTextField();
        lbUser = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jpLogo12 = new javax.swing.JPanel();
        lbUser1 = new javax.swing.JLabel();
        pfPass = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jpLogoLayout = new javax.swing.GroupLayout(jpLogo);
        jpLogo.setLayout(jpLogoLayout);
        jpLogoLayout.setHorizontalGroup(
            jpLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jpLogoLayout.setVerticalGroup(
            jpLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(102, 0, 102));
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);
        setIconImages(null);
        setLocationByPlatform(true);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(46, 114, 183));
        panel1.setForeground(new java.awt.Color(198, 161, 3));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN FORM");

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(materialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(materialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        btnSalir1.setBackground(new java.awt.Color(46, 114, 183));
        btnSalir1.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir1.setText("Entrar");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        lbError1.setBackground(new java.awt.Color(204, 0, 0));

        lbPass.setBackground(new java.awt.Color(255, 255, 255));
        lbPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPass.setForeground(new java.awt.Color(0, 0, 0));
        lbPass.setText("Contraseña:");

        tfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUserKeyTyped(evt);
            }
        });

        lbUser.setBackground(new java.awt.Color(255, 255, 255));
        lbUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbUser.setForeground(new java.awt.Color(0, 0, 0));
        lbUser.setText("Usuario:");

        panel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        panel3.setBackground(new java.awt.Color(46, 114, 183));

        jpLogo12.setBackground(new java.awt.Color(46, 114, 183));
        jpLogo12.setAutoscrolls(true);
        jpLogo12.setFocusCycleRoot(true);
        jpLogo12.setFocusTraversalPolicyProvider(true);
        jpLogo12.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jpLogo12Layout = new javax.swing.GroupLayout(jpLogo12);
        jpLogo12.setLayout(jpLogo12Layout);
        jpLogo12Layout.setHorizontalGroup(
            jpLogo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jpLogo12Layout.setVerticalGroup(
            jpLogo12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        lbUser1.setBackground(new java.awt.Color(255, 255, 255));
        lbUser1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbUser1.setForeground(new java.awt.Color(255, 255, 255));
        lbUser1.setText("Iniciar Sesion");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jpLogo12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lbUser1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jpLogo12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUser1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbError1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUser, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(lbPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfPass, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lbUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lbPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbError1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tfUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUserKeyTyped
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

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_materialButtonCircle1ActionPerformed
    public void limpiar(){
           tfUser.setText("");
           pfPass.setText("");
       }
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
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpLogo;
    public static javax.swing.JPanel jpLogo12;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbError1;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUser1;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JPasswordField pfPass;
    private principal.MaterialTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
