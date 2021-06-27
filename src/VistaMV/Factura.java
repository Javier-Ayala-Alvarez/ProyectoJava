package VistaMV;

import Controlador.ControlFactura;
import Controlador.ControlLogin;
import javax.swing.JFrame;

public class Factura extends javax.swing.JFrame {

    public static String res;

    public Factura() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//PANTALLA COMPLETA
        escritorioFactura.setBorder(new Fondo("/img/Fondo.jpg"));
        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
        res = "res";
        //jpEscritorio1 (nombreOriginal)
        btnTiket.setActionCommand("tiket");
        btnFacturacion.setActionCommand("facturacion");
        btnCerrarCaja.setActionCommand("newCC");
        btnCerrarFactura.setActionCommand("cerrarFactura");
        btnIniciarCaja.setActionCommand("inicioCaja");

    }

    public void iniciar() {
        this.setVisible(true);
    }

    public void setControlador(ControlLogin control) {
        escritorioFactura.addMouseListener(control);
    }

    public void setControladorF(ControlFactura controlF) {
        escritorioFactura.addMouseListener(controlF);
        btnTiket.addActionListener(controlF);
        btnFacturacion.addActionListener(controlF);
        btnCerrarCaja.addActionListener(controlF);
        btnCerrarFactura.addActionListener(controlF);
        btnIniciarCaja.addActionListener(controlF);
    }

    public void visibilidad(boolean bool) {
        this.btnFacturacion.setVisible(bool);
        this.btnTiket.setVisible(bool);
        this.btnIniciarCaja.setVisible(!bool);
        this.lbNombreUsuario.setVisible(bool);
        this.btnCerrarCaja.setVisible(bool);
        this.btnCerrarFactura.setVisible(!bool);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenu3 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jMenuItem2 = new javax.swing.JMenuItem();
        escritorioFactura = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnFacturacion = new rojeru_san.complementos.RSButtonHover();
        btnCerrarCaja = new rojeru_san.complementos.RSButtonHover();
        btnTiket = new rojeru_san.complementos.RSButtonHover();
        jpLogo1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNombreUsuario = new javax.swing.JLabel();
        btnCerrarFactura = new principal.MaterialButtonCircle();
        btnIniciarCaja = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Tienda");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setUndecorated(true);
        setSize(new java.awt.Dimension(10, 10));
        setState(5);
        setType(java.awt.Window.Type.POPUP);

        escritorioFactura.setAutoscrolls(true);
        escritorioFactura.setFocusCycleRoot(true);
        escritorioFactura.setFocusTraversalPolicyProvider(true);
        escritorioFactura.setInheritsPopupMenu(true);

        jPanel3.setBackground(new java.awt.Color(72, 139, 183));
        jPanel3.setAutoscrolls(true);
        jPanel3.setFocusCycleRoot(true);
        jPanel3.setFocusTraversalPolicyProvider(true);
        jPanel3.setInheritsPopupMenu(true);

        btnFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/factura.png"))); // NOI18N
        btnFacturacion.setText("Factura");
        btnFacturacion.setActionCommand("Facturacion");
        btnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturacionActionPerformed(evt);
            }
        });

        btnCerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario1.png"))); // NOI18N
        btnCerrarCaja.setText("Cerrar");
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });

        btnTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tiket.png"))); // NOI18N
        btnTiket.setText("Tiket");
        btnTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLogo1Layout = new javax.swing.GroupLayout(jpLogo1);
        jpLogo1.setLayout(jpLogo1Layout);
        jpLogo1Layout.setHorizontalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        jpLogo1Layout.setVerticalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnFacturacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnCerrarCaja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jpLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jpLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(btnTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(71, 139, 184));
        jPanel2.setForeground(new java.awt.Color(0, 204, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setDoubleBuffered(false);
        jPanel2.setEnabled(false);
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setFocusTraversalPolicy(null);
        jPanel2.setFocusTraversalPolicyProvider(true);
        jPanel2.setInheritsPopupMenu(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de Factura");

        lbNombreUsuario.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUsuario.setText("Empleado:");

        btnCerrarFactura.setBackground(new java.awt.Color(220, 20, 20));
        btnCerrarFactura.setText("X");
        btnCerrarFactura.setActionCommand("cerrarFactura");
        btnCerrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarFacturaActionPerformed(evt);
            }
        });

        btnIniciarCaja.setText("Iniciar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(btnIniciarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lbNombreUsuario)
                    .addComponent(btnIniciarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout escritorioFacturaLayout = new javax.swing.GroupLayout(escritorioFactura);
        escritorioFactura.setLayout(escritorioFacturaLayout);
        escritorioFacturaLayout.setHorizontalGroup(
            escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioFacturaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioFacturaLayout.setVerticalGroup(
            escritorioFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarFacturaActionPerformed
//        int opccion = JOptionPane.showConfirmDialog(null, "Deseas Salir?", "Confirmar salida",
//            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if(opccion == 0){
//            Login vista = new Login();
//            vista.show();
//            this.dispose();
//        }
        this.dispose();
    }//GEN-LAST:event_btnCerrarFacturaActionPerformed

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
//       String xm = Facturacion.s;
//        Facturacion vista = new Facturacion();
//        if((xm == null)){
//            escritorioFactura.add(vista);
//            vista.show();
//        }else{
//            JOptionPane.showMessageDialog(escritorioFactura, "Ventana ya abierta!!!");
//
//        }
    }//GEN-LAST:event_btnFacturacionActionPerformed

    private void btnCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCajaActionPerformed
//        int opccion = JOptionPane.showConfirmDialog(null, "Deseas Salir de Facturacion?", "Confirmar salida", 
//               JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE); 
//        if(opccion == 0){
//         Login vista = new Login();
//        vista.show();
//        this.dispose();
//        }
    }//GEN-LAST:event_btnCerrarCajaActionPerformed

    private void btnTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTiketActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.complementos.RSButtonHover btnCerrarCaja;
    public principal.MaterialButtonCircle btnCerrarFactura;
    public rojeru_san.complementos.RSButtonHover btnFacturacion;
    public javax.swing.JButton btnIniciarCaja;
    public rojeru_san.complementos.RSButtonHover btnTiket;
    public static javax.swing.JPanel escritorioFactura;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpLogo1;
    public javax.swing.JLabel lbNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
