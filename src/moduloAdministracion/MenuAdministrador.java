package moduloAdministracion;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import moduloVenta.Fondo;
import moduloVenta.Login;

/**
 *
 * @author Francisco Javier
 */
public class MenuAdministrador extends javax.swing.JFrame {
public static String xm;
public static int opcion;
    public MenuAdministrador() {
        initComponents();
        //this.setResizable(false);//No Maximo
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//PANTALLA COMPLETA
        jpEscritorio.setBorder(new Fondo("/img/Fondo.jpg"));
       xm = "xm";
       jMenu.setBackground(Color.yellow);
       jMenu.setBackground(Color.yellow);
        
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
        jMenuItem4 = new javax.swing.JMenuItem();
        materialShadowCircle1 = new efectos.MaterialShadowCircle();
        materialShadowCircle2 = new efectos.MaterialShadowCircle();
        jpEscritorio = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jPanel4 = new javax.swing.JPanel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();
        jPanel3 = new javax.swing.JPanel();
        jMenu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
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
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
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

        jMenuItem4.setText("jMenuItem4");

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpEscritorio.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(71, 139, 184));
        jPanel2.setForeground(new java.awt.Color(255, 0, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Empresa:");

        materialButtonCircle2.setBackground(new java.awt.Color(220, 20, 20));
        materialButtonCircle2.setText("X");
        materialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonCircle2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(materialButtonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materialButtonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13))
        );

        jPanel4.setBackground(new java.awt.Color(71, 139, 184));

        rSButtonHover3.setText("Empleado");
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        rSButtonHover4.setText("Gastos");
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Graficas");

        rSButtonHover5.setText("Home");
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });

        rSButtonHover6.setText("Cliente");
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });

        rSButtonHover7.setText("Ventas");
        rSButtonHover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonHover6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(114, Short.MAX_VALUE))
            .addComponent(rSButtonHover7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonHover5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonHover7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonHover6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu.setBackground(new java.awt.Color(54, 139, 200));
        jMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
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
        jMenuItem2.setText("Registro de Factura");
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
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
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

        jMenuItem7.setText("Agregar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem7);

        jMenuItem8.setText("Modificar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem8);

        jMenuItem11.setText("Consulta y Eliminar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem11);

        jMenuItem16.setText("Valance");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem16);

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
            .addComponent(jpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String x = EmpleadoGM.x;
        EmpleadoGM vista = new EmpleadoGM(this,false);
        opcion = 2;
        if(x == null){
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }  
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarActionPerformed
        String x = EmpleadoGM.x;
        EmpleadoGM vista = new EmpleadoGM(this,false);
        opcion = 1;
        if(x == null){
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }       // TODO add your handling code here:
    }//GEN-LAST:event_jmGuardarActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        String x = RegistrosDeProductos.x;
        RegistrosDeProductos vista = new RegistrosDeProductos(this,false);
        if(x == null){
            
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jmGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmGuardar2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String x = EliminarVentas.x;
        EliminarVentas vista = new EliminarVentas(this,false);
        if(x == null){
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String x = RegistrosDeVentas.x;
        RegistrosDeVentas vista = new RegistrosDeVentas(this,false);
        if(x == null){
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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       String x = GastosGM.x;
          opcion = 1;
        GastosGM vista = new GastosGM(this,false);
        if(x == null){
            
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         String x = GastosGM.x;
           opcion = 2;
        GastosGM vista = new GastosGM(this,false);
        if(x == null){
            
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        String x = GastosEC.x;
        GastosEC vista = new GastosEC(this,false);
        if(x == null){
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");

        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        String x = GastosValance.x;
        GastosValance vista = new GastosValance(this,false);
        if(x == null){
            
            vista.show();
        }else{
            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void materialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonCircle2ActionPerformed
         int opccion = JOptionPane.showConfirmDialog(null, "Deseas Salir?", "Confirmar salida", 
               JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE); 
        if(opccion == 0){
         moduloVenta.Login vista = new moduloVenta.Login();
        vista.show();
        this.dispose();
        xm=null;
        }
    }//GEN-LAST:event_materialButtonCircle2ActionPerformed

    private void rSButtonHover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover7ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
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
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem jmGuardar;
    private javax.swing.JMenuItem jmGuardar2;
    private javax.swing.JMenuItem jmGuardar4;
    public static javax.swing.JPanel jpEscritorio;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private efectos.MaterialShadowCircle materialShadowCircle1;
    private efectos.MaterialShadowCircle materialShadowCircle2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    // End of variables declaration//GEN-END:variables
}
