package VistaMA;

import Controlador.ControlLogin;
import Controlador.ControlMA;
import static VistaLogin.Login.LogoE;
import java.awt.Color;
import javax.swing.JFrame;
import VistaMV.Fondo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuAdministrador extends javax.swing.JFrame {

    public static String xm;
    public static int opcion;
//    ArrayList<GastosEmpresa> Gastos;

    public MenuAdministrador() {
        initComponents();
        //this.setResizable(false);//No Maximo
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//PANTALLA COMPLETA
        this.setIconImage(new ImageIcon(getClass().getResource(LogoE)).getImage());
        jpEscritorio.setBorder(new Fondo("/img/Fondo.jpg"));
        xm = "xm";
       
        jpCaja.setBorder(new Fondo("/img/dolar.png"));
        jpCompras.setBorder(new Fondo("/img/Compra.png"));
        jpProductos.setBorder(new Fondo("/img/producto2.png"));
        jpPercede.setBorder(new Fondo("/img/percedero.png"));
        jpVencer.setBorder(new Fondo("/img/Vencer.png"));
        jpCliente.setBorder(new Fondo("/img/cliente2.png"));
//        Gastos = new ArrayList();
        /*ActionCommand de los menus y sub-botones*/
        menuVenta.setActionCommand("menuVenta");
        btnRegistrarFacturaItem.setActionCommand("registrarFacturaItem");
        
        menuProductos.setActionCommand("menuProductos");
        this.guardarProducto.setActionCommand("guardarProducto");
        this.consultarProducto.setActionCommand("consultarProducto");
        //para empleado
        menuEmpleado.setActionCommand("menuEmpleado");
        this.guardarEmpleado.setActionCommand("guardarEmpleado");
        this.guardarUsuario.setActionCommand("guardarUsuario");
        this.ConsultarUsuario.setActionCommand("consultarUsuario");
        this.consultarEmpleado.setActionCommand("consultarEmpleado");
        this.guardarBono.setActionCommand("guardarBono");
        this.ConsultarBono.setActionCommand("consultarBono");
        //fin Empleado
        menuCliente.setActionCommand("menuCliente");
        this.consultarCliente.setActionCommand("consultarCliente");
        menuGDS.setActionCommand("menuGDS");
        this.opcionesGDS.setActionCommand("opcionesGDS");
        this.opcionesGDS1.setActionCommand("opcionesGDS1");
        this.modificarEmpresa.setActionCommand("modificarEmpresa");
        this.consultarEmpresa.setActionCommand("consultarEmpresa");
        
        /*ActionCommand de los Botones principales*/
        this.btnHome.setActionCommand("Home");
        this.btnVentas.setActionCommand("Ventas");
        this.btnGastos.setActionCommand("Gastos");
        this.btnEmpleado.setActionCommand("Empleado");
        this.btnCliente.setActionCommand("Cliente");
        btnCerrarMenuAdmin.setActionCommand("cerrarMenu");
    }

    public void iniciar() {
        this.setVisible(true);
    }

    public void setControlador(ControlLogin control) {
        jpEscritorio.addMouseListener(control);
        btnCerrarMenuAdmin.addActionListener(control);
    }

    public void setControladorMA(ControlMA controlMA) {
       
        /*Esta función envía los botones y demás recursos al ControlMA para ser usados por esa clase*/
        /*Agregando menus y sub-botones*/
        menuVenta.addActionListener(controlMA);
        jpEscritorio.addMouseListener(controlMA);
        this.btnRegistrarFacturaItem.addActionListener(controlMA);
       
        this.menuProductos.addActionListener(controlMA);
        this.guardarProducto.addActionListener(controlMA);
        this.consultarProducto.addActionListener(controlMA);
        this.guardarEmpleado.addActionListener(controlMA);
        this.ConsultarUsuario.addActionListener(controlMA);
        this.guardarUsuario.addActionListener(controlMA);
        this.consultarEmpleado.addActionListener(controlMA);
        this.ConsultarBono.addActionListener(controlMA);
        this.guardarBono.addActionListener(controlMA);
        this.menuCliente.addActionListener(controlMA);
        this.consultarCliente.addActionListener(controlMA);
        this.opcionesGDS.addActionListener(controlMA);
        this.opcionesGDS1.addActionListener(controlMA);
        this.consultarEmpresa.addActionListener(controlMA);
        this.modificarEmpresa.addActionListener(controlMA);
        
        /*Agregando botones principales*/
        btnHome.addActionListener(controlMA);
        btnVentas.addActionListener(controlMA);
        btnGastos.addActionListener(controlMA);
        btnEmpleado.addActionListener(controlMA);
        btnCliente.addActionListener(controlMA);
        btnCerrarMenuAdmin.addActionListener(controlMA);
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
        btnCerrarMenuAdmin = new principal.MaterialButtonCircle();
        lbEmpresa1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnEmpleado = new rojeru_san.complementos.RSButtonHover();
        btnGastos = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnCliente = new rojeru_san.complementos.RSButtonHover();
        btnVentas = new rojeru_san.complementos.RSButtonHover();
        panel1 = new javax.swing.JPanel();
        jpCaja = new javax.swing.JPanel();
        lbCaja = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jpCompras = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jpProductos = new javax.swing.JPanel();
        lbProducto1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        jpPercede = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        jpVencer = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        jpCliente = new javax.swing.JPanel();
        lbClienteT = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        menuVenta = new javax.swing.JMenu();
        btnRegistrarFacturaItem = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        guardarProducto = new javax.swing.JMenuItem();
        consultarProducto = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        consultarEmpleado = new javax.swing.JMenuItem();
        guardarEmpleado = new javax.swing.JMenuItem();
        ConsultarUsuario = new javax.swing.JMenuItem();
        guardarUsuario = new javax.swing.JMenuItem();
        ConsultarBono = new javax.swing.JMenuItem();
        guardarBono = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        consultarCliente = new javax.swing.JMenuItem();
        menuGDS = new javax.swing.JMenu();
        opcionesGDS = new javax.swing.JMenuItem();
        opcionesGDS1 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        modificarEmpresa = new javax.swing.JMenuItem();
        consultarEmpresa = new javax.swing.JMenuItem();

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
        jLabel2.setText("Empresa:");

        btnCerrarMenuAdmin.setBackground(new java.awt.Color(220, 20, 20));
        btnCerrarMenuAdmin.setText("X");
        btnCerrarMenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarMenuAdminActionPerformed(evt);
            }
        });

        lbEmpresa1.setBackground(new java.awt.Color(255, 255, 255));
        lbEmpresa1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lbEmpresa1.setText(".");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(lbEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCerrarMenuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEmpresa1))
                    .addComponent(jLabel2))
                .addGap(13, 13, 13))
        );

        jPanel4.setBackground(new java.awt.Color(71, 139, 184));

        btnEmpleado.setText("Empleado");
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnGastos.setText("Gastos");
        btnGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Graficas");

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(114, Short.MAX_VALUE))
            .addComponent(btnVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(142, 177, 213));

        jpCaja.setBackground(new java.awt.Color(142, 177, 213));

        javax.swing.GroupLayout jpCajaLayout = new javax.swing.GroupLayout(jpCaja);
        jpCaja.setLayout(jpCajaLayout);
        jpCajaLayout.setHorizontalGroup(
            jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpCajaLayout.setVerticalGroup(
            jpCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        lbCaja.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbCaja.setText("$0:00");

        jLabel4.setText("Inicio de caja");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbCaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jpCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbCaja))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jpCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        panel2.setBackground(new java.awt.Color(184, 158, 99));

        jpCompras.setBackground(new java.awt.Color(184, 158, 99));

        javax.swing.GroupLayout jpComprasLayout = new javax.swing.GroupLayout(jpCompras);
        jpCompras.setLayout(jpComprasLayout);
        jpComprasLayout.setHorizontalGroup(
            jpComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpComprasLayout.setVerticalGroup(
            jpComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("$0:00");

        jLabel6.setText("Compras del mes");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jpCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel6)
                .addContainerGap())
        );

        panel3.setBackground(new java.awt.Color(214, 153, 121));

        jpProductos.setBackground(new java.awt.Color(214, 153, 121));

        javax.swing.GroupLayout jpProductosLayout = new javax.swing.GroupLayout(jpProductos);
        jpProductos.setLayout(jpProductosLayout);
        jpProductosLayout.setHorizontalGroup(
            jpProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpProductosLayout.setVerticalGroup(
            jpProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        lbProducto1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbProducto1.setText("$0:00");

        jLabel8.setText("Productos ingresados");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbProducto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbProducto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel8)
                .addContainerGap())
        );

        panel4.setBackground(new java.awt.Color(144, 179, 144));

        jpPercede.setBackground(new java.awt.Color(144, 179, 144));

        javax.swing.GroupLayout jpPercedeLayout = new javax.swing.GroupLayout(jpPercede);
        jpPercede.setLayout(jpPercedeLayout);
        jpPercedeLayout.setHorizontalGroup(
            jpPercedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpPercedeLayout.setVerticalGroup(
            jpPercedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("$0:00");

        jLabel10.setText("Percederedos");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPercede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpPercede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel10)
                .addContainerGap())
        );

        panel5.setBackground(new java.awt.Color(65, 126, 126));

        jpVencer.setBackground(new java.awt.Color(65, 126, 126));

        javax.swing.GroupLayout jpVencerLayout = new javax.swing.GroupLayout(jpVencer);
        jpVencer.setLayout(jpVencerLayout);
        jpVencerLayout.setHorizontalGroup(
            jpVencerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpVencerLayout.setVerticalGroup(
            jpVencerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("$0:00");

        jLabel12.setText("Venceran en los poximos 30 dias");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpVencer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jpVencer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel12)
                .addContainerGap())
        );

        panel6.setBackground(new java.awt.Color(124, 124, 162));

        jpCliente.setBackground(new java.awt.Color(124, 124, 162));

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        lbClienteT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbClienteT.setText("0:00");

        jLabel16.setText("Cliente");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbClienteT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbClienteT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu.setBackground(new java.awt.Color(71, 139, 184));
        jMenu.setBorder(null);
        jMenu.setAlignmentX(1.0F);
        jMenu.setAlignmentY(22.0F);
        jMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenu.setDoubleBuffered(true);
        jMenu.setFocusCycleRoot(true);
        jMenu.setFocusTraversalPolicyProvider(true);
        jMenu.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jMenu.setMinimumSize(new java.awt.Dimension(12, 12));

        menuVenta.setForeground(new java.awt.Color(255, 255, 255));
        menuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        menuVenta.setText("Venta");
        menuVenta.setActionCommand("menuVenta");
        menuVenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnRegistrarFacturaItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        btnRegistrarFacturaItem.setText("Registro de Factura");
        btnRegistrarFacturaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFacturaItemActionPerformed(evt);
            }
        });
        menuVenta.add(btnRegistrarFacturaItem);

        jMenu.add(menuVenta);

        menuProductos.setForeground(new java.awt.Color(255, 255, 255));
        menuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        menuProductos.setText("Productos");
        menuProductos.setActionCommand("menuProductos");
        menuProductos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        guardarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        guardarProducto.setText("Productos");
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });
        menuProductos.add(guardarProducto);

        consultarProducto.setText("Consultar");
        consultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProductoActionPerformed(evt);
            }
        });
        menuProductos.add(consultarProducto);

        jMenu.add(menuProductos);

        menuEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        menuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Empleado.png"))); // NOI18N
        menuEmpleado.setText("Empleado");
        menuEmpleado.setActionCommand("menuEmpleado");
        menuEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        consultarEmpleado.setText("Consultar Empleados");
        consultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(consultarEmpleado);

        guardarEmpleado.setText("Añadir Empleado");
        guardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEmpleadoActionPerformed(evt);
            }
        });
        menuEmpleado.add(guardarEmpleado);

        ConsultarUsuario.setText("Consultar Usuarios");
        ConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuarioActionPerformed(evt);
            }
        });
        menuEmpleado.add(ConsultarUsuario);

        guardarUsuario.setText("Añadir Usuario");
        guardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUsuarioActionPerformed(evt);
            }
        });
        menuEmpleado.add(guardarUsuario);

        ConsultarBono.setText("Consultar Bonos");
        ConsultarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBonoActionPerformed(evt);
            }
        });
        menuEmpleado.add(ConsultarBono);

        guardarBono.setText("Añadir Bono");
        guardarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBonoActionPerformed(evt);
            }
        });
        menuEmpleado.add(guardarBono);

        jMenu.add(menuEmpleado);

        menuCliente.setForeground(new java.awt.Color(255, 255, 255));
        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        menuCliente.setText("Cliente");
        menuCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        consultarCliente.setText("Consultar");
        consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(consultarCliente);

        jMenu.add(menuCliente);

        menuGDS.setForeground(new java.awt.Color(255, 255, 255));
        menuGDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gastos.png"))); // NOI18N
        menuGDS.setText("Pagos de Sucursal");
        menuGDS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        opcionesGDS.setText("Gastos Administrativo");
        opcionesGDS.setBorderPainted(false);
        opcionesGDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesGDSActionPerformed(evt);
            }
        });
        menuGDS.add(opcionesGDS);

        opcionesGDS1.setText("Pago de Empleados");
        opcionesGDS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesGDS1ActionPerformed(evt);
            }
        });
        menuGDS.add(opcionesGDS1);

        jMenu.add(menuGDS);

        jMenu13.setForeground(new java.awt.Color(255, 255, 255));
        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion.png"))); // NOI18N
        jMenu13.setText("Configuraciones");
        jMenu13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        modificarEmpresa.setText("Modificar");
        modificarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEmpresaActionPerformed(evt);
            }
        });
        jMenu13.add(modificarEmpresa);

        consultarEmpresa.setText("Consultar");
        consultarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEmpresaActionPerformed(evt);
            }
        });
        jMenu13.add(consultarEmpresa);

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

    private void guardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEmpleadoActionPerformed

    }//GEN-LAST:event_guardarEmpleadoActionPerformed

    private void consultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarProductoActionPerformed

    }//GEN-LAST:event_consultarProductoActionPerformed

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarProductoActionPerformed

    private void btnRegistrarFacturaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFacturaItemActionPerformed

    }//GEN-LAST:event_btnRegistrarFacturaItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        xm = null;
    }//GEN-LAST:event_formWindowClosing

    private void modificarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarEmpresaActionPerformed

    private void consultarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpresaActionPerformed

    private void opcionesGDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesGDSActionPerformed
//        String x = GastosGM.x;
//        opcion = 1;
//        GastosGM vista = new GastosGM(this, false, Gastos);
//        if (x == null) {
//
//            vista.show();
//        } else {
//            JOptionPane.showMessageDialog(jpEscritorio, "Ventana ya abierta!!!");
//
//        }
    }//GEN-LAST:event_opcionesGDSActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGastosActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnCerrarMenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarMenuAdminActionPerformed

    }//GEN-LAST:event_btnCerrarMenuAdminActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void consultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarEmpleadoActionPerformed

    private void consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarClienteActionPerformed

    private void ConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarUsuarioActionPerformed

    private void guardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarUsuarioActionPerformed
    private void opcionesGDS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesGDS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesGDS1ActionPerformed

    private void guardarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBonoActionPerformed

    private void ConsultarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarBonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem ConsultarBono;
    public javax.swing.JMenuItem ConsultarUsuario;
    public principal.MaterialButtonCircle btnCerrarMenuAdmin;
    public rojeru_san.complementos.RSButtonHover btnCliente;
    public rojeru_san.complementos.RSButtonHover btnEmpleado;
    public rojeru_san.complementos.RSButtonHover btnGastos;
    public rojeru_san.complementos.RSButtonHover btnHome;
    public javax.swing.JMenuItem btnRegistrarFacturaItem;
    public rojeru_san.complementos.RSButtonHover btnVentas;
    public javax.swing.JMenuItem consultarCliente;
    public javax.swing.JMenuItem consultarEmpleado;
    private javax.swing.JMenuItem consultarEmpresa;
    public javax.swing.JMenuItem consultarProducto;
    public javax.swing.JMenuItem guardarBono;
    public javax.swing.JMenuItem guardarEmpleado;
    public javax.swing.JMenuItem guardarProducto;
    public javax.swing.JMenuItem guardarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpCaja;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpCompras;
    public javax.swing.JPanel jpEscritorio;
    private javax.swing.JPanel jpPercede;
    private javax.swing.JPanel jpProductos;
    private javax.swing.JPanel jpVencer;
    public javax.swing.JLabel lbCaja;
    public static javax.swing.JLabel lbClienteT;
    public static javax.swing.JLabel lbEmpresa1;
    public static javax.swing.JLabel lbProducto1;
    private efectos.MaterialShadowCircle materialShadowCircle1;
    private efectos.MaterialShadowCircle materialShadowCircle2;
    public javax.swing.JMenu menuCliente;
    public javax.swing.JMenu menuEmpleado;
    public javax.swing.JMenu menuGDS;
    public javax.swing.JMenu menuProductos;
    public javax.swing.JMenu menuVenta;
    private javax.swing.JMenuItem modificarEmpresa;
    public javax.swing.JMenuItem opcionesGDS;
    public javax.swing.JMenuItem opcionesGDS1;
    public javax.swing.JPanel panel1;
    public javax.swing.JPanel panel2;
    public javax.swing.JPanel panel3;
    public javax.swing.JPanel panel4;
    public javax.swing.JPanel panel5;
    public javax.swing.JPanel panel6;
    // End of variables declaration//GEN-END:variables
}
