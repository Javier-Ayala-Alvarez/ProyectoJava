
package moduloVenta;

import javax.swing.JOptionPane;
import static moduloVenta.Factura.res;

public class Facturacion extends javax.swing.JInternalFrame {
public static String s;
public static String i;

    public Facturacion() {
        initComponents();
        int a = Factura.jpEscritorio1.getWidth()-this.getWidth();
        int b = Factura.jpEscritorio1.getHeight()-this.getHeight();
        setLocation(a / 2, b / 2);
        s ="s";
        i = "i";
      
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jTextNomClien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextDirecClien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextCantiProdu = new javax.swing.JTextField();
        jButtonAgreCarri = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextPreUniProduc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextPreTotProdu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegisProd = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextTotalPagar = new javax.swing.JTextField();
        jButtonVender = new javax.swing.JButton();
        jLabelNombreClie = new javax.swing.JLabel();
        jLabelCanti = new javax.swing.JLabel();
        jLabelPU = new javax.swing.JLabel();
        jLabelTotPagar = new javax.swing.JLabel();
        jLabelPT = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jFormattedFecha = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextNomProdu = new javax.swing.JTextField();

        jTextField7.setText("jTextField7");

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

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel5.setText(" Cliente:");

        jTextNomClien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNomClienFocusLost(evt);
            }
        });
        jTextNomClien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNomClienMouseClicked(evt);
            }
        });
        jTextNomClien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNomClienKeyTyped(evt);
            }
        });

        jLabel6.setText("Dirección:");

        jTextDirecClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDirecClienActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad:");

        jTextCantiProdu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCantiProduKeyTyped(evt);
            }
        });

        jButtonAgreCarri.setText("Agregar a carrito");
        jButtonAgreCarri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgreCarriActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE DE LA EMPRESA");

        jLabel3.setText("Precio Unitario");

        jTextPreUniProduc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPreUniProducKeyTyped(evt);
            }
        });

        jLabel4.setText("PrecioTotal:");

        jTextPreTotProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPreTotProduActionPerformed(evt);
            }
        });
        jTextPreTotProdu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPreTotProduKeyTyped(evt);
            }
        });

        jLabel8.setText("Fecha:");

        jTableRegisProd.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cantidad", "Producto", "P/U", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTableRegisProd);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("TOTAL A PAGAR:");

        jTextTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalPagarActionPerformed(evt);
            }
        });
        jTextTotalPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTotalPagarKeyTyped(evt);
            }
        });

        jButtonVender.setText("Vender");

        jLabelNombreClie.setForeground(new java.awt.Color(255, 51, 51));

        jLabelCanti.setForeground(new java.awt.Color(255, 51, 51));

        jLabelPU.setForeground(new java.awt.Color(255, 51, 51));

        jLabelTotPagar.setForeground(new java.awt.Color(255, 51, 51));

        jLabelPT.setForeground(new java.awt.Color(255, 51, 51));

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        try {
            jFormattedFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Producto:");

        jTextNomProdu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextNomProduFocusGained(evt);
            }
        });
        jTextNomProdu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNomProduMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(778, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAgreCarri))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTotPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(486, 486, 486)
                                .addComponent(jLabelNombreClie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextCantiProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabelCanti, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextNomClien, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextNomProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addComponent(jFormattedFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextPreTotProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabelPT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextPreUniProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPU, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextDirecClien, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNomClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextDirecClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombreClie, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextPreUniProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jTextNomProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelPU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextCantiProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jTextPreTotProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCanti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButtonAgreCarri)
                    .addComponent(jFormattedFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTotPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalir)
                            .addComponent(jButtonVender))
                        .addGap(20, 20, 20))))
        );

        getAccessibleContext().setAccessibleName("factura");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
       s =null; 
       i = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void jTextTotalPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTotalPagarKeyTyped
        // TODO add your handling code here:
        this.jTextTotalPagar.setEditable(false);
        char vali = evt.getKeyChar();
        if(Character.isDigit(vali)){
            evt.consume();
            jLabelTotPagar.setText("Este campo no es editable");
        }else{
            jLabelTotPagar.setText("Este campo no es editable");
        }
    }//GEN-LAST:event_jTextTotalPagarKeyTyped

    private void jTextTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalPagarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextTotalPagarActionPerformed

    private void jTextPreTotProduKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPreTotProduKeyTyped
        // TODO add your handling code here:
        this.jTextPreTotProdu.setEditable(false);
        char vali = evt.getKeyChar();
        if(Character.isDigit(vali)){
            evt.consume();
            jLabelPT.setText("Este campo no es editable");
        }else{
            jLabelPT.setText("Este campo no es editable");
        }

    }//GEN-LAST:event_jTextPreTotProduKeyTyped

    private void jTextPreTotProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPreTotProduActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextPreTotProduActionPerformed

    private void jTextPreUniProducKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPreUniProducKeyTyped
        // TODO add your handling code here:
        this.jTextPreUniProduc.setEditable(false);
        char vali = evt.getKeyChar();
        if(Character.isDigit(vali)){
            evt.consume();
            jLabelPU.setText("Este campo no es editable");
        }else{
            jLabelPU.setText("Este campo no es editable");
        }

    }//GEN-LAST:event_jTextPreUniProducKeyTyped

    private void jButtonAgreCarriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgreCarriActionPerformed
        // TODO add your handling code here:
        if(!jTextNomClien.getText().isEmpty()
            && !jTextDirecClien.getText().isEmpty()
            && !jTextNomProdu.getText().isEmpty()
            && !jTextCantiProdu.getText().isEmpty()
            && !jFormattedFecha.getText().isEmpty()){

            //            Aqui voy hacer que se almacenen en la tabla

            limpiarVista();

        }else{
            JOptionPane.showMessageDialog(null,"Llenar todos los Campos","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonAgreCarriActionPerformed

    private void jTextCantiProduKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantiProduKeyTyped
        // TODO add your handling code here:
        char vali = evt.getKeyChar();
        if(Character.isDigit(vali)){
            jLabelCanti.setText("");
        }else{
            jLabelCanti.setText("Digitar numeros");
            evt.consume();
        }
    }//GEN-LAST:event_jTextCantiProduKeyTyped

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        s =null;
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextDirecClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDirecClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDirecClienActionPerformed

    private void jTextNomClienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomClienKeyTyped
        // TODO add your handling code here:
        char vali = evt.getKeyChar();
        if(Character.isDigit(vali)){
            evt.consume();
            jLabelNombreClie.setText("Digitar letras");
        }else{
            jLabelNombreClie.setText("");
        }
    }//GEN-LAST:event_jTextNomClienKeyTyped

    private void jTextNomClienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNomClienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomClienMouseClicked

    private void jTextNomClienFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNomClienFocusLost
       
    }//GEN-LAST:event_jTextNomClienFocusLost

    private void jTextNomProduMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNomProduMouseClicked

    }//GEN-LAST:event_jTextNomProduMouseClicked

    private void jTextNomProduFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNomProduFocusGained

    }//GEN-LAST:event_jTextNomProduFocusGained

     public void limpiarVista(){
    jTextNomClien.setText("");
    jTextDirecClien.setText("");
    jTextNomProdu.setText("");
    jTextCantiProdu.setText("");
    jFormattedFecha.setText("");
    jLabelPU.setText("");
    jLabelPT.setText("");
    jLabelTotPagar.setText("");
}
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgreCarri;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFormattedTextField jFormattedFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCanti;
    private javax.swing.JLabel jLabelNombreClie;
    private javax.swing.JLabel jLabelPT;
    private javax.swing.JLabel jLabelPU;
    private javax.swing.JLabel jLabelTotPagar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegisProd;
    private javax.swing.JTextField jTextCantiProdu;
    private javax.swing.JTextField jTextDirecClien;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextNomClien;
    public javax.swing.JTextField jTextNomProdu;
    private javax.swing.JTextField jTextPreTotProdu;
    private javax.swing.JTextField jTextPreUniProduc;
    private javax.swing.JTextField jTextTotalPagar;
    // End of variables declaration//GEN-END:variables
}
