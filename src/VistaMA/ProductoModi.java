package VistaMA;


import Controlador.ControlMA;
import VistaMV.*;
import VistaMA.*;
import Modelo.GastoEmpresa;
import static VistaMA.GastosGM.tfBuscar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import VistaMV.Fondo;

public class ProductoModi extends javax.swing.JDialog {

    DefaultTableModel modelo;
    public static String x;

    public ProductoModi(java.awt.Frame parent, boolean modal ) {
        super(parent, modal);
        initComponents();

        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
        btAgregar.setActionCommand("Agregar");
        btModificar.setActionCommand("Modificar");
        btGenerar.setActionCommand("Generar");
    }

//    public ProductoModi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   

    public void iniciar() {
        this.setVisible(true);
    }
    
    public void setControlador(ControlMA control1) {
        btAgregar.addActionListener(control1);
        btModificar.addActionListener(control1);
        btGenerar.addActionListener(control1);
        tfBuscar.addKeyListener(control1);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        panelFondo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigo = new principal.MaterialTextField();
        tfNombre = new principal.MaterialTextField();
        lbCodigo = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSeparator2 = new javax.swing.JSeparator();
        btGenerar = new rojeru_san.complementos.RSButtonHover();
        btModificar = new rojeru_san.complementos.RSButtonHover();
        btAgregar = new rojeru_san.complementos.RSButtonHover();
        tfBuscar = new principal.MaterialTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCantidad = new principal.MaterialTextField();
        tfPrecio1 = new principal.MaterialTextField();
        jLabel9 = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();

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
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Productos: Agregar y Modificar");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 420, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Buscar");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 60));

        tfCodigo.setBackground(new java.awt.Color(213, 216, 221));
        tfCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setEnabled(false);
        tfCodigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        panelFondo.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 330, 40));

        tfNombre.setBackground(new java.awt.Color(213, 216, 221));
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        panelFondo.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 430, 40));

        lbCodigo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 120, 40));

        lbPrecio.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 140, 40));

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
        materialButtonCircle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialButtonCircle2MouseClicked(evt);
            }
        });
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, 50));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio"
            }
        ));
        jtDatos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDatosFocusLost(evt);
            }
        });
        jtDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDatos);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 750, 190));
        panelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 20));

        btGenerar.setText("Generar");
        btGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarActionPerformed(evt);
            }
        });
        panelFondo.add(btGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 90, 40));

        btModificar.setBackground(new java.awt.Color(0, 102, 102));
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        panelFondo.add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 160, 50));

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        panelFondo.add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 160, 50));

        tfBuscar.setBackground(new java.awt.Color(213, 216, 221));
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBuscarKeyTyped(evt);
            }
        });
        panelFondo.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 230, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Cantidad");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 60));

        tfCantidad.setBackground(new java.awt.Color(213, 216, 221));
        tfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCantidadKeyTyped(evt);
            }
        });
        panelFondo.add(tfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 430, 40));

        tfPrecio1.setBackground(new java.awt.Color(213, 216, 221));
        tfPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecio1KeyTyped(evt);
            }
        });
        panelFondo.add(tfPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 430, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Precio");
        panelFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 60));

        lbCantidad.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCantidad.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, 40));

        lbNombre.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped

        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            lbNombre.setText("");
        } else {
            lbNombre.setText("solo letras");
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         x = null;
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        x = null;
    }//GEN-LAST:event_formWindowClosing

    private void materialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle1ActionPerformed


    }//GEN-LAST:event_materialButtonCircle1ActionPerformed

    private void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed

    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    private void jtDatosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDatosFocusLost

    }//GEN-LAST:event_jtDatosFocusLost

    private void jtDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDatosMouseClicked


    }//GEN-LAST:event_jtDatosMouseClicked

    private void btGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarActionPerformed

    }//GEN-LAST:event_btGenerarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        
    }//GEN-LAST:event_btModificarActionPerformed

      
    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
      
    }//GEN-LAST:event_btAgregarActionPerformed

    private void materialButtonCircle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtonCircle2MouseClicked
        this.dispose();
    }//GEN-LAST:event_materialButtonCircle2MouseClicked

    private void tfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarKeyTyped

    private void tfCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            lbCantidad.setText("");
        } else {
            lbCantidad.setText("solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfCantidadKeyTyped

    private void tfPrecio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecio1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            lbPrecio.setText("");
        } else {
            lbPrecio.setText("solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfPrecio1KeyTyped

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
    private rojeru_san.complementos.RSButtonHover btAgregar;
    private rojeru_san.complementos.RSButtonHover btGenerar;
    private rojeru_san.complementos.RSButtonHover btModificar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpLogo1;
    public final javax.swing.JTable jtDatos = new javax.swing.JTable();
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecio;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public principal.MaterialTextField tfBuscar;
    public principal.MaterialTextField tfCantidad;
    public principal.MaterialTextField tfCodigo;
    public principal.MaterialTextField tfNombre;
    public principal.MaterialTextField tfPrecio1;
    // End of variables declaration//GEN-END:variables

}
