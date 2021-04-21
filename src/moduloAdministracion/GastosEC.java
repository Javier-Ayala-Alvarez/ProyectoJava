
package moduloAdministracion;

import moduloVenta.Fondo;


public class GastosEC extends javax.swing.JDialog {
public static String x;

    public GastosEC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         x ="x";
        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
       btnEliminar1.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TOTAL");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nuevo Empleado");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 210, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Impuesto de Alcaldia", "Pago de Energia", "Pago de Alquiler", "Pago de Agua", "ISSS", "AFP", "IVA" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        panelFondo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 430, 50));

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

        materialButtonCircle2.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle2.setText("X");
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 50, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Fecha", "Impuesto"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 191, 750, 230));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TOTAL");
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        panelFondo.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 482, 160, 40));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelFondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 482, 150, 40));

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
       
    }//GEN-LAST:event_jComboBox1MouseClicked

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

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

    }//GEN-LAST:event_jTable1FocusLost

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        btnEliminar1.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        x=null;
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpLogo1;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    // End of variables declaration//GEN-END:variables
}
