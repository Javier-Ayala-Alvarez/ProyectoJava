package VistaMA;

import Controlador.ControlMA;
import static VistaLogin.Login.LogoE;
import VistaMV.Fondo;

public class ConsultarVentas extends javax.swing.JDialog {
    
    public static String x;
    
    public ConsultarVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        x = "x";
        jpLogo1.setBorder(new Fondo(LogoE));
        
    }
    public void setControlador(ControlMA control) {
        
    }
    public void iniciar() {
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        lbCodigo1 = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbEnergia = new javax.swing.JLabel();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        tfFactura = new javax.swing.JTextField();
        lbCodigo2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        materialButtonCircle3 = new principal.MaterialButtonCircle();

        materialButtonCircle1.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle1.setText("X");
        materialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle1ActionPerformed(evt);
            }
        });

        lbCodigo1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo1.setForeground(new java.awt.Color(204, 0, 0));

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
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 840, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Gastos");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 210, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Fecha de Ventas");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 200, 60));

        lbCodigo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 120, 40));

        lbEnergia.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbEnergia.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 140, 40));

        javax.swing.GroupLayout jpLogo1Layout = new javax.swing.GroupLayout(jpLogo1);
        jpLogo1.setLayout(jpLogo1Layout);
        jpLogo1Layout.setHorizontalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jpLogo1Layout.setVerticalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panelFondo.add(jpLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        materialButtonCircle2.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle2.setText("X");
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 50));

        tfFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFacturaKeyTyped(evt);
            }
        });
        panelFondo.add(tfFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 210, 40));

        lbCodigo2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo2.setForeground(new java.awt.Color(204, 0, 0));
        panelFondo.add(lbCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 160, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nº Factura");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Cliente");
        panelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Sucursal");
        panelFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 60));

        jTable1.setBackground(new java.awt.Color(217, 222, 226));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio Unitario", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 850, 250));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Total: ");
        panelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, -1));

        materialButtonCircle3.setBackground(new java.awt.Color(255, 0, 0));
        materialButtonCircle3.setText("X");
        materialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle3ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        x = null;        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed
        

    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    private void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed
        this.dispose();
        x = null;        
    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    private void tfFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFacturaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            lbCodigo.setText("");
        } else {
            lbCodigo.setText("solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfFacturaKeyTyped

    private void materialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle3ActionPerformed
        this.dispose();
        x = null;
    }//GEN-LAST:event_materialButtonCircle3ActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpLogo1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigo1;
    private javax.swing.JLabel lbCodigo2;
    private javax.swing.JLabel lbEnergia;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private principal.MaterialButtonCircle materialButtonCircle3;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public javax.swing.JTextField tfFactura;
    // End of variables declaration//GEN-END:variables
}
