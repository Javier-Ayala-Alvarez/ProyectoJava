package VistaMA;
import Controlador.ControlMA;
import javax.swing.table.DefaultTableModel;
import VistaMV.Fondo;
import javax.swing.JOptionPane;
public class GastosGM extends javax.swing.JDialog {

    DefaultTableModel modelo;
    public static String x;

    public GastosGM(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jpLogo1.setBorder(new Fondo("/img/Logo.jpg"));
        btnAgregar.setActionCommand("Agregar");
        btnEliminar.setActionCommand("Eliminar");
        btnModificar.setActionCommand("Modificar");
        btnGenerar.setActionCommand("Generar");
        
                    
    }
    public void iniciar() {
        this.setVisible(true);
    }
     public void setControlador(ControlMA control1) {
        btnAgregar.addActionListener(control1);
        btnEliminar.addActionListener(control1);
        btnModificar.addActionListener(control1);
        btnGenerar.addActionListener(control1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        roboto1 = new efectos.Roboto();
        materialButtonCircle1 = new principal.MaterialButtonCircle();
        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigo = new principal.MaterialTextField();
        jpLogo1 = new javax.swing.JPanel();
        materialButtonCircle2 = new principal.MaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnGenerar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbAlcaldiaC = new javax.swing.JLabel();
        lbAlcaldiaTotal = new javax.swing.JLabel();
        lbCodigo3 = new javax.swing.JLabel();
        lbCodigo4 = new javax.swing.JLabel();
        lbCodigo5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbEnergiaC = new javax.swing.JLabel();
        lbCodigo6 = new javax.swing.JLabel();
        lbEnergiaTotal = new javax.swing.JLabel();
        lbAlquilerC = new javax.swing.JLabel();
        lbCodigo8 = new javax.swing.JLabel();
        lbAlquilerTotal = new javax.swing.JLabel();
        lbCodigo10 = new javax.swing.JLabel();
        lbAguaC = new javax.swing.JLabel();
        lbAguaTotal = new javax.swing.JLabel();
        lbIsssC = new javax.swing.JLabel();
        lbCodigo12 = new javax.swing.JLabel();
        lbISSSTotal = new javax.swing.JLabel();
        lbCodigo14 = new javax.swing.JLabel();
        lbAfpC = new javax.swing.JLabel();
        lbAFPTotal = new javax.swing.JLabel();
        lbIvaC = new javax.swing.JLabel();
        lbCodigo16 = new javax.swing.JLabel();
        lbIVATotal = new javax.swing.JLabel();
        lbCodigo18 = new javax.swing.JLabel();
        lbTotalReporte = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbCodigo1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Buscar...");
        panelFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 80, 50));

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
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        panelFondo.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 400, 50));

        tfCodigo.setBackground(new java.awt.Color(213, 216, 221));
        tfCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfCodigo.setSelectionColor(new java.awt.Color(102, 153, 255));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        panelFondo.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 300, 40));

        tfPago.setBackground(new java.awt.Color(213, 216, 221));
        tfPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPagoKeyTyped(evt);
            }
        });
        panelFondo.add(tfPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 160, 30));
        panelFondo.add(dFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 400, 40));

        javax.swing.GroupLayout jpLogo1Layout = new javax.swing.GroupLayout(jpLogo1);
        jpLogo1.setLayout(jpLogo1Layout);
        jpLogo1Layout.setHorizontalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpLogo1Layout.setVerticalGroup(
            jpLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
        panelFondo.add(materialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 50));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
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

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 580, 160));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        panelFondo.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 90, 40));

        btnModificar.setBackground(new java.awt.Color(0, 102, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelFondo.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 160, 50));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 153, 153));
        btnEliminar.setText("Eliminar");
        btnEliminar.setActionCommand("Eliminar3");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 160, 50));

        btnAgregar.setText("Agregar");
        btnAgregar.setActionCommand("Agregar1");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelFondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 102, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Reporte");

        lbCodigo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo.setText("Impuesto de Alcaldia ........");

        lbAlcaldiaC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAlcaldiaC.setForeground(new java.awt.Color(255, 0, 0));
        lbAlcaldiaC.setText("0");

        lbAlcaldiaTotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAlcaldiaTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbAlcaldiaTotal.setText("$0.00");

        lbCodigo3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo3.setForeground(new java.awt.Color(0, 0, 153));
        lbCodigo3.setText("Total");

        lbCodigo4.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo4.setForeground(new java.awt.Color(0, 0, 153));
        lbCodigo4.setText("Cantidad");

        lbCodigo5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo5.setForeground(new java.awt.Color(0, 0, 153));
        lbCodigo5.setText("Categoria");

        lbEnergiaC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbEnergiaC.setForeground(new java.awt.Color(255, 0, 0));
        lbEnergiaC.setText("0");

        lbCodigo6.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo6.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo6.setText("Pago de Energia ...............");

        lbEnergiaTotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbEnergiaTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbEnergiaTotal.setText("$0.00");

        lbAlquilerC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAlquilerC.setForeground(new java.awt.Color(255, 0, 0));
        lbAlquilerC.setText("0");

        lbCodigo8.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo8.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo8.setText("Pago de Alquiler  .............");

        lbAlquilerTotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAlquilerTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbAlquilerTotal.setText("$0.00");

        lbCodigo10.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo10.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo10.setText("Pago de Agua  ..................");

        lbAguaC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAguaC.setForeground(new java.awt.Color(255, 0, 0));
        lbAguaC.setText("0");

        lbAguaTotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAguaTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbAguaTotal.setText("$0.00");

        lbIsssC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbIsssC.setForeground(new java.awt.Color(255, 0, 0));
        lbIsssC.setText("0");

        lbCodigo12.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo12.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo12.setText("Pago de ISSS  ...................");

        lbISSSTotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbISSSTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbISSSTotal.setText("$0.00");

        lbCodigo14.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo14.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo14.setText("Pago de AFP  ...................");

        lbAfpC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAfpC.setForeground(new java.awt.Color(255, 0, 0));
        lbAfpC.setText("0");

        lbAFPTotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbAFPTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbAFPTotal.setText("$0.00");

        lbIvaC.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbIvaC.setForeground(new java.awt.Color(255, 0, 0));
        lbIvaC.setText("0");

        lbCodigo16.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo16.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo16.setText("Pago de IVA ...................");

        lbIVATotal.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbIVATotal.setForeground(new java.awt.Color(255, 0, 0));
        lbIVATotal.setText("$0.00");

        lbCodigo18.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo18.setForeground(new java.awt.Color(0, 0, 153));
        lbCodigo18.setText("Total....................................");

        lbTotalReporte.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbTotalReporte.setForeground(new java.awt.Color(0, 0, 153));
        lbTotalReporte.setText("$0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCodigo4)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbAlcaldiaC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAlcaldiaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigo3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbEnergiaC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAlquilerC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAguaC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbIsssC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbAfpC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbIvaC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbCodigo14, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbAFPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbCodigo8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbAlquilerTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbCodigo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbEnergiaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbAguaTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbISSSTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbCodigo16, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbCodigo18)
                                            .addComponent(lbCodigo12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbCodigo10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTotalReporte)
                                            .addComponent(lbIVATotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo4)
                    .addComponent(lbCodigo5)
                    .addComponent(lbCodigo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(lbAlcaldiaC)
                    .addComponent(lbAlcaldiaTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo6)
                    .addComponent(lbEnergiaC)
                    .addComponent(lbEnergiaTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo8)
                    .addComponent(lbAlquilerC)
                    .addComponent(lbAlquilerTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo10)
                    .addComponent(lbAguaC)
                    .addComponent(lbAguaTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo12)
                    .addComponent(lbIsssC)
                    .addComponent(lbISSSTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo14)
                    .addComponent(lbAfpC)
                    .addComponent(lbAFPTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo16)
                    .addComponent(lbIvaC)
                    .addComponent(lbIVATotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo18)
                    .addComponent(lbTotalReporte))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 350, 420));
        panelFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 960, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Gastos/ Agregar/ Modificar / Eliminar / Reporte");
        panelFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 530, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Reporte");
        panelFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        lbCodigo1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lbCodigo1.setForeground(new java.awt.Color(255, 0, 0));
        lbCodigo1.setText("Impuesto");
        panelFondo.add(lbCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 120, 40));
        panelFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 40));

        tfPago1.setBackground(new java.awt.Color(213, 216, 221));
        tfPago1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPago1KeyTyped(evt);
            }
        });
        panelFondo.add(tfPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 400, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Fecha");
        panelFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }//GEN-LAST:event_tfPagoKeyTyped

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

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void materialButtonCircle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtonCircle2MouseClicked
        this.dispose();
    }//GEN-LAST:event_materialButtonCircle2MouseClicked

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void tfPago1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPago1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPago1KeyTyped

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
    public rojeru_san.complementos.RSButtonHover btnAgregar;
    public rojeru_san.complementos.RSButtonHover btnEliminar;
    public rojeru_san.complementos.RSButtonHover btnGenerar;
    public rojeru_san.complementos.RSButtonHover btnModificar;
    public static final javax.swing.JComboBox<String> cbTipo = new javax.swing.JComboBox<>();
    public static final rojeru_san.componentes.RSDateChooser dFecha = new rojeru_san.componentes.RSDateChooser();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel jpLogo1;
    public static final javax.swing.JTable jtDatos = new javax.swing.JTable();
    public static javax.swing.JLabel lbAFPTotal;
    public static javax.swing.JLabel lbAfpC;
    public static javax.swing.JLabel lbAguaC;
    public static javax.swing.JLabel lbAguaTotal;
    public static javax.swing.JLabel lbAlcaldiaC;
    public static javax.swing.JLabel lbAlcaldiaTotal;
    public static javax.swing.JLabel lbAlquilerC;
    public static javax.swing.JLabel lbAlquilerTotal;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigo1;
    private javax.swing.JLabel lbCodigo10;
    private javax.swing.JLabel lbCodigo12;
    private javax.swing.JLabel lbCodigo14;
    private javax.swing.JLabel lbCodigo16;
    private javax.swing.JLabel lbCodigo18;
    private javax.swing.JLabel lbCodigo3;
    private javax.swing.JLabel lbCodigo4;
    private javax.swing.JLabel lbCodigo5;
    private javax.swing.JLabel lbCodigo6;
    private javax.swing.JLabel lbCodigo8;
    public static javax.swing.JLabel lbEnergiaC;
    public static javax.swing.JLabel lbEnergiaTotal;
    public static javax.swing.JLabel lbISSSTotal;
    public static javax.swing.JLabel lbIVATotal;
    public static javax.swing.JLabel lbIsssC;
    public static javax.swing.JLabel lbIvaC;
    public static javax.swing.JLabel lbTotalReporte;
    private principal.MaterialButtonCircle materialButtonCircle1;
    private principal.MaterialButtonCircle materialButtonCircle2;
    private javax.swing.JPanel panelFondo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private efectos.Roboto roboto1;
    public static principal.MaterialTextField tfCodigo;
    public static final principal.MaterialTextField tfPago = new principal.MaterialTextField();
    public static final principal.MaterialTextField tfPago1 = new principal.MaterialTextField();
    // End of variables declaration//GEN-END:variables
}
