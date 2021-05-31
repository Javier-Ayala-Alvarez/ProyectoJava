package VistaMA;

import Modelo.GastosEmpresa;
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

public class GastosGM extends javax.swing.JDialog {

    public static String x;
    DefaultTableModel modelo;
    ArrayList<GastosEmpresa> empresa;
    DateFormat formater = new SimpleDateFormat("MMM-yyyy");

    public GastosGM(java.awt.Frame parent, boolean modal, ArrayList<GastosEmpresa> g) {
        super(parent, modal);
        initComponents();
        x = "x";
        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
        empresa = g;
        dFecha.setDatoFecha(new Date());
        btEliminar.setVisible(false);
        btModificar.setVisible(false);
        empresa = g;
        mostrar();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

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
        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tfCodigo = new principal.MaterialTextField();
        tfPago = new principal.MaterialTextField();
        dFecha = new rojeru_san.componentes.RSDateChooser();
        lbCodigo = new javax.swing.JLabel();
        lbPago = new javax.swing.JLabel();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        tbGenerar = new rojeru_san.complementos.RSButtonHover();
        btModificar = new rojeru_san.complementos.RSButtonHover();
        btEliminar = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();

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
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 60));
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Gastos/ Agregar/ Modificar / Eliminar");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 420, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Fecha");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Pago");
        panelFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 60));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Impuesto de Alcaldia", "Pago de Energia", "Pago de Alquiler", "Pago de Agua", "ISSS", "AFP", "IVA" }));
        cbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTipoMouseClicked(evt);
            }
        });
        panelFondo.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 430, 50));

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
        panelFondo.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 330, 40));

        tfPago.setBackground(new java.awt.Color(213, 216, 221));
        tfPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPagoKeyTyped(evt);
            }
        });
        panelFondo.add(tfPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 430, 40));
        panelFondo.add(dFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 430, 40));

        lbCodigo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 120, 40));

        lbPago.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbPago.setForeground(new java.awt.Color(255, 0, 0));
        panelFondo.add(lbPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, 40));

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
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, 50));

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDatos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbDatosFocusLost(evt);
            }
        });
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatos);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 750, 190));
        panelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 20));

        tbGenerar.setText("Generar");
        tbGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbGenerarActionPerformed(evt);
            }
        });
        panelFondo.add(tbGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, 40));

        btModificar.setBackground(new java.awt.Color(0, 102, 102));
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        panelFondo.add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 160, 50));

        btEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btEliminar.setForeground(new java.awt.Color(255, 153, 153));
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 160, 50));

        rSButtonHover7.setText("Agregar");
        rSButtonHover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover7ActionPerformed(evt);
            }
        });
        panelFondo.add(rSButtonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTipoMouseClicked

    }//GEN-LAST:event_cbTipoMouseClicked

    private void tfPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPagoKeyTyped
        char c = evt.getKeyChar();

        if ((c >= 46 && c <= 57)) {
            lbPago.setText("");
        } else {
            lbPago.setText("solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_tfPagoKeyTyped

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

    private void tbDatosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbDatosFocusLost

    }//GEN-LAST:event_tbDatosFocusLost

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        btEliminar.setVisible(true);
        btModificar.setVisible(true);
        int fila = tbDatos.getSelectedRow();
        String codigo = tbDatos.getValueAt(fila, 0).toString();
        for (GastosEmpresa x : empresa) {
            if (x.getCodigoGastos().equals(codigo)) {
                tfCodigo.setText(x.getCodigoGastos());
                tfPago.setText(String.valueOf(x.getSaldo()));
                dFecha.setDatoFecha(x.getFecha());
            }

        }

    }//GEN-LAST:event_tbDatosMouseClicked

    private void tbGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbGenerarActionPerformed
        tfCodigo.setText(codigo());
    }//GEN-LAST:event_tbGenerarActionPerformed
    private boolean existe() {
        for (GastosEmpresa x : empresa) {
            if (x.getCodigoGastos().equals(tfCodigo.getText())) {
                return true;
            }
        }
        return false;
    }

    private void limpiar() {
        tfCodigo.setText("");
        tfPago.setText("");
        dFecha.setDatoFecha(new Date());
    }

    private void mostrar() {
        modelo = new DefaultTableModel();
        String titulo[] = {"Codigo", "Fecha", "Tipo", "Pago"};
        modelo.setColumnIdentifiers(titulo);
        for (GastosEmpresa x : empresa) {
            Object obj1[] = {x.getCodigoGastos(), x.getFecha(), x.getTipo(), "$ " + String.format("%.2f", x.getSaldo())};
            modelo.addRow(obj1);
        }
        tbDatos.setModel(modelo);
    }
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        if (existe()) {
            int fila = tbDatos.getSelectedRow();
            String codigo = tbDatos.getValueAt(fila, 0).toString();
            for (GastosEmpresa x : empresa) {
                if (x.getCodigoGastos().equals(codigo)) {
                    double pago = Double.parseDouble(tfPago.getText());
                    if (cbTipo.getSelectedItem().equals("Impuesto de Alcaldia")) {
                        x.setCodigoGastos(tfCodigo.getText());
                        Date fechaC = dFecha.getDatoFecha();
                        x.setFecha(fechaC);
                        x.setTipo("Impuesto de Alcaldia");
                        x.setSaldo(pago);
                    } else if (cbTipo.getSelectedItem().equals("Pago de Energia")) {
                        x.setCodigoGastos(tfCodigo.getText());
                        Date fechaC = dFecha.getDatoFecha();
                        x.setFecha(fechaC);
                        x.setTipo("Pago de Energia");
                        x.setSaldo(pago);
                    } else if (cbTipo.getSelectedItem().equals("Pago de Alquiler")) {
                        x.setCodigoGastos(tfCodigo.getText());
                        Date fechaC = dFecha.getDatoFecha();
                        x.setFecha(fechaC);
                        x.setTipo("Pago de Alquiler");
                        x.setSaldo(pago);
                    } else if (cbTipo.getSelectedItem().equals("Pago de Agua")) {
                        x.setCodigoGastos(tfCodigo.getText());
                        Date fechaC = dFecha.getDatoFecha();
                        x.setFecha(fechaC);
                        x.setTipo("Pago de Agua");
                        x.setSaldo(pago);
                    } else if (cbTipo.getSelectedItem().equals("ISSS")) {
                        x.setCodigoGastos(tfCodigo.getText());
                        Date fechaC = dFecha.getDatoFecha();
                        x.setFecha(fechaC);
                        x.setTipo("ISSS");
                        x.setSaldo(pago);
                    } else if (cbTipo.getSelectedItem().equals("AFP")) {
                        x.setCodigoGastos(tfCodigo.getText());
                        Date fechaC = dFecha.getDatoFecha();
                        x.setFecha(fechaC);
                        x.setTipo("AFP");
                        x.setSaldo(pago);
                    } else if (cbTipo.getSelectedItem().equals("IVA")) {
                        x.setCodigoGastos(tfCodigo.getText());
                        Date fechaC = dFecha.getDatoFecha();
                        x.setFecha(fechaC);
                        x.setTipo("IVA");
                        x.setSaldo(pago);
                    }
                }
            }
            limpiar();
            mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "Codigo no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btModificarActionPerformed
    private String codigo() {
        int w = 0;
        String letra = "GE-";
        String correlativo = letra;
        String[] corre = null;
        int corre1 = 0;
        String d = "0qq-0000";
        for (GastosEmpresa x : empresa) {
            d = x.getCodigoGastos();

        }
        corre = d.split("-");
        corre1 = Integer.valueOf(corre[1]);

        corre1 = corre1 + 1;
        String ww = String.valueOf(corre1);
        for (int i = 0; i < 6; i++) {
            if (correlativo.length() + ww.length() < 7) {
                correlativo = correlativo + "0";
            }
        }
        correlativo = correlativo + String.valueOf(ww);
        return correlativo;
    }
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int fila = tbDatos.getSelectedRow();
        String codigo = tbDatos.getValueAt(fila, 0).toString();
        int w = 0;
        for (GastosEmpresa x : empresa) {
            if (x.getCodigoGastos().equals(codigo)) {
                int opccion1 = JOptionPane.showConfirmDialog(null, "Deseas Eliminar Registro?", "Welcome",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opccion1 == 0) {
                    empresa.remove(w);
                }
                limpiar();
                mostrar();
            }
            w++;
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void rSButtonHover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover7ActionPerformed
        Date fechaC = dFecha.getDatoFecha();
        double pago = Double.parseDouble(tfPago.getText());
        if (!existe()) {
            if ((!tfCodigo.getText().isEmpty()) && (!tfPago.getText().isEmpty())) {
                if (cbTipo.getSelectedItem().equals("Impuesto de Alcaldia")) {
                    GastosEmpresa obj = new GastosEmpresa(tfCodigo.getText(), fechaC, "Impuesto de Alcaldia", pago);
                    empresa.add(obj);
                } else if (cbTipo.getSelectedItem().equals("Pago de Energia")) {
                    GastosEmpresa obj = new GastosEmpresa(tfCodigo.getText(), fechaC, "Pago de Energia", pago);
                    empresa.add(obj);
                } else if (cbTipo.getSelectedItem().equals("Pago de Alquiler")) {
                    GastosEmpresa obj = new GastosEmpresa(tfCodigo.getText(), fechaC, "Pago de Alquiler", pago);
                    empresa.add(obj);
                } else if (cbTipo.getSelectedItem().equals("Pago de Agua")) {
                    GastosEmpresa obj = new GastosEmpresa(tfCodigo.getText(), fechaC, "Pago de Agua", pago);
                    empresa.add(obj);
                } else if (cbTipo.getSelectedItem().equals("ISSS")) {
                    GastosEmpresa obj = new GastosEmpresa(tfCodigo.getText(), fechaC, "ISSS", pago);
                    empresa.add(obj);
                } else if (cbTipo.getSelectedItem().equals("AFP")) {
                    GastosEmpresa obj = new GastosEmpresa(tfCodigo.getText(), fechaC, "AFP", pago);
                    empresa.add(obj);
                } else if (cbTipo.getSelectedItem().equals("IVA")) {
                    GastosEmpresa obj = new GastosEmpresa(tfCodigo.getText(), fechaC, "IVA", pago);
                    empresa.add(obj);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Codigo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }

        mostrar();
    }//GEN-LAST:event_rSButtonHover7ActionPerformed

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
    private rojeru_san.complementos.RSButtonHover btEliminar;
    private rojeru_san.complementos.RSButtonHover btModificar;
    private javax.swing.JComboBox<String> cbTipo;
    private rojeru_san.componentes.RSDateChooser dFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpLogo1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbPago;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    private javax.swing.JTable tbDatos;
    private rojeru_san.complementos.RSButtonHover tbGenerar;
    private principal.MaterialTextField tfCodigo;
    private principal.MaterialTextField tfPago;
    // End of variables declaration//GEN-END:variables
}
