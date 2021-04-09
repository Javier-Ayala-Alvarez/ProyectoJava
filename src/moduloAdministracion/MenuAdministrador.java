package moduloAdministracion;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import moduloVenta.Fondo;

/**
 *
 * @author Francisco Javier
 */
public class MenuAdministrador extends javax.swing.JFrame {
public static String xm;
    public MenuAdministrador() {
        initComponents();
        //this.setResizable(false);//No Maximo
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//PANTALLA COMPLETA
        jpEscritorio.setBorder(new Fondo("/img/Fondo.jpg"));
       xm = "xm";
        
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
        jpEscritorio = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jmGuardar2 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jmGuardar = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmGuardar3 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jmGuardar5 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jmGuardar6 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jmGuardar4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Tienda");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setSize(new java.awt.Dimension(10, 10));
        setState(5);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpEscritorio.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(230, 225, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 0, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Empresa:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 622, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                .addGap(0, 364, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu.setBackground(new java.awt.Color(54, 139, 200));
        jMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu.setForeground(new java.awt.Color(51, 153, 255));
        jMenu.setAlignmentY(22.0F);
        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu.setDoubleBuffered(true);
        jMenu.setFocusCycleRoot(true);
        jMenu.setFocusTraversalPolicyProvider(true);
        jMenu.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jMenu.setMinimumSize(new java.awt.Dimension(10, 10));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        jMenu3.setText("Venta");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Registro por Factura");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem19.setText("Registro de Ventas");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenu.add(jMenu3);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu9.setText("Productos");

        jmGuardar2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmGuardar2.setText("Guardar");
        jmGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardar2ActionPerformed(evt);
            }
        });
        jMenu9.add(jmGuardar2);

        jMenuItem9.setText("Modificar");
        jMenu9.add(jMenuItem9);

        jMenuItem10.setText("Eliminar");
        jMenu9.add(jMenuItem10);

        jMenuItem14.setText("Consultar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem14);

        jMenu.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Empleado.png"))); // NOI18N
        jMenu10.setText("Empleado");

        jmGuardar.setText("Guardar");
        jmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarActionPerformed(evt);
            }
        });
        jMenu10.add(jmGuardar);

        jMenuItem5.setText("Modificar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem5);

        jMenuItem6.setText("Eliminar");
        jMenu10.add(jMenuItem6);

        jMenuItem13.setText("Consultar");
        jMenu10.add(jMenuItem13);

        jMenu.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu11.setText("Cliente");

        jMenuItem12.setText("Consultar");
        jMenu11.add(jMenuItem12);

        jMenu.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gastos.png"))); // NOI18N
        jMenu12.setText("Gastos de Sucursal");

        jMenu4.setText("Agregar");

        jmGuardar3.setText("Impuesto");
        jmGuardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardar3ActionPerformed(evt);
            }
        });
        jMenu4.add(jmGuardar3);

        jMenuItem23.setText("IVA");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem23);

        jMenuItem11.setText("Energia");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem16.setText("Alquiler");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("Agua");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem21.setText("ISSS");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem21);

        jMenuItem22.setText("AFP");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem22);

        jMenu12.add(jMenu4);

        jMenu14.setText("Modificar");

        jmGuardar5.setText("Impuesto");
        jmGuardar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardar5ActionPerformed(evt);
            }
        });
        jMenu14.add(jmGuardar5);

        jMenuItem24.setText("IVA");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem24);

        jMenuItem25.setText("Energia");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem25);

        jMenuItem26.setText("Alquiler");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem26);

        jMenuItem27.setText("Agua");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem27);

        jMenuItem28.setText("ISSS");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem28);

        jMenuItem29.setText("AFP");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem29);

        jMenu12.add(jMenu14);

        jMenu15.setText("Consultar y Eliminar");

        jmGuardar6.setText("Impuesto");
        jmGuardar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardar6ActionPerformed(evt);
            }
        });
        jMenu15.add(jmGuardar6);

        jMenuItem30.setText("IVA");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem30);

        jMenuItem31.setText("Energia");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem31);

        jMenuItem32.setText("Alquiler");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem32);

        jMenuItem33.setText("Agua");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem33);

        jMenuItem34.setText("ISSS");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem34);

        jMenuItem35.setText("AFP");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem35);

        jMenu12.add(jMenu15);

        jMenu16.setText("Valance");
        jMenu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenu16);

        jMenu.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion.png"))); // NOI18N
        jMenu13.setText("Configuraciones");

        jmGuardar4.setText("Guardar");
        jmGuardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardar4ActionPerformed(evt);
            }
        });
        jMenu13.add(jmGuardar4);

        jMenuItem15.setText("Modificar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem15);

        jMenuItem18.setText("Consultar");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem18);

        jMenuItem20.setText("Eliminar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem20);

        jMenu.add(jMenu13);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       xm=null;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarActionPerformed
        String x = GuardarEmpleado.x;
        GuardarEmpleado vista = new GuardarEmpleado();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }       // TODO add your handling code here:
    }//GEN-LAST:event_jmGuardarActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        String x = RegistroDeProductos.x;
        RegistroDeProductos vista = new RegistroDeProductos();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jmGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmGuardar2ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        String x = RegistroDeVentas.x;
        RegistroDeVentas vista = new RegistroDeVentas();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String x = EliminarVenta.x;
        EliminarVenta vista = new EliminarVenta();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String x = ProductoVenta.x;
        ProductoVenta vista = new ProductoVenta();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       xm = null;
    }//GEN-LAST:event_formWindowClosing

    private void jmGuardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmGuardar4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jmGuardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardar3ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Impuesto");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jmGuardar3ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
       String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("IVA");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Energia");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Alquiler");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Agua");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("ISSS");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("AFP");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jmGuardar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardar5ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Impuesto");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jmGuardar5ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("IVA");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Energia");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
       String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Alquiler");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
         String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("Agua");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
       String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("ISSS");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        String x = GastoGM.x;
        GastoGM vista = new GastoGM();
        GastoGM.lbGasto.setText("AFP");
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jmGuardar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardar6ActionPerformed
         String x = GastoEC.x;
        GastoEC vista = new GastoEC();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jmGuardar6ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        String x = GastoEC.x;
        GastoEC vista = new GastoEC();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
       String x = GastoEC.x;
        GastoEC vista = new GastoEC();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
       String x = GastoEC.x;
        GastoEC vista = new GastoEC();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        String x = GastoEC.x;
        GastoEC vista = new GastoEC();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        String x = GastoEC.x;
        GastoEC vista = new GastoEC();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        String x = GastoEC.x;
        GastoEC vista = new GastoEC();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenu16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu16ActionPerformed
          String x = GastoValance.x;
        GastoValance vista = new GastoValance();
        if(x == null){
            jpEscritorio.add(vista);
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenu16ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jmGuardar;
    private javax.swing.JMenuItem jmGuardar2;
    private javax.swing.JMenuItem jmGuardar3;
    private javax.swing.JMenuItem jmGuardar4;
    private javax.swing.JMenuItem jmGuardar5;
    private javax.swing.JMenuItem jmGuardar6;
    public static javax.swing.JPanel jpEscritorio;
    // End of variables declaration//GEN-END:variables
}
