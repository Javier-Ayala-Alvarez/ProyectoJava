
package moduloAdministracion;

import moduloVenta.Fondo;


public class GastosGM extends javax.swing.JDialog {
public static String x;

    public GastosGM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         x ="x";
        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
        tbnModificar.setEnabled(false);
        tbnGuardar.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tfCodigo = new principal.MaterialTextField();
        tfPago = new principal.MaterialTextField();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        lbCodigo = new javax.swing.JLabel();
        lbEnergia = new javax.swing.JLabel();
        jpLogo1 = new javax.swing.JPanel();
        tbnGuardar = new javax.swing.JButton();
        tbnModificar = new javax.swing.JButton();
        materialButtonCircle2 = new principal.MaterialButtonCircle();

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Gasto");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 60));
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 80, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Gastos");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 210, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Fecha");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 80, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Pago");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 80, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Impuesto de Alcaldia", "Pago de Energia", "Pago de Alquiler", "Pago de Agua", "ISSS", "AFP", "IVA" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        panelFondo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 430, 50));

        tfCodigo.setBackground(new java.awt.Color(213, 216, 221));
        tfCodigo.setForeground(new java.awt.Color(0, 0, 0));
        tfCodigo.setCaretColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setSelectionColor(new java.awt.Color(102, 153, 255));
        panelFondo.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 420, 40));

        tfPago.setBackground(new java.awt.Color(213, 216, 221));
        tfPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPagoKeyTyped(evt);
            }
        });
        panelFondo.add(tfPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 420, 40));
        panelFondo.add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 420, 40));

        lbCodigo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 120, 40));

        lbEnergia.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbEnergia.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 140, 40));

        javax.swing.GroupLayout jpLogo1Layout = new javax.swing.GroupLayout(jpLogo1);
        jpLogo1.setLayout(jpLogo1Layout);
        jpLogo1Layout.setHorizontalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jpLogo1Layout.setVerticalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        panelFondo.add(jpLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tbnGuardar.setText("Guardar");
        tbnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGuardarActionPerformed(evt);
            }
        });
        panelFondo.add(tbnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 170, 50));

        tbnModificar.setText("Modificar");
        tbnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnModificarActionPerformed(evt);
            }
        });
        panelFondo.add(tbnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 452, 150, 50));

        materialButtonCircle2.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle2.setText("X");
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        if(MenuAdministrador.opcion == 1){
            tbnGuardar.setEnabled(true);
        }else{
            tbnModificar.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void tfPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPagoKeyTyped
        char c = evt.getKeyChar();

        if(Character.isDigit(c)){
            lbEnergia.setText("");
        }else{
            lbEnergia.setText("solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfPagoKeyTyped

    private void tbnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnGuardarActionPerformed

    private void tbnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnModificarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         x =null; 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed
       
        
    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    private void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed
        this.dispose();
         x =null; 
    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpLogo1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEnergia;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private efectos.Roboto roboto1;
    private javax.swing.JButton tbnGuardar;
    private javax.swing.JButton tbnModificar;
    private principal.MaterialTextField tfCodigo;
    private principal.MaterialTextField tfPago;
    // End of variables declaration//GEN-END:variables
}
