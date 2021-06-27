package Controlador;

import Modelo.Bono;
import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.Encriptacion;
import Modelo.GastoEmpresa;
import Modelo.InicioCaja;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.Registros;
import Modelo.Venta;
import Modelo.dao.BonoDao;
import Modelo.dao.ClienteDao;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.EmpresaDao;
import Modelo.dao.Gastosdao;
import Modelo.dao.InicioCajaDao;
import Modelo.dao.ProductoDao;
import Modelo.dao.RegistrosDao;
import Modelo.dao.UsuarioDao;

import Modelo.dao.VentaDao;
import VistaLogin.Alerta;
import VistaLogin.Login;
import VistaMA.BonoGM;
import VistaMA.ClienteMA;
import VistaMA.ConsultarVentas;

import VistaMA.EmpleadoGM;
import VistaMA.vistaEmpleadoGM;
import VistaMA.GastosGM;
import VistaMA.MenuAdministrador;
import VistaMA.ProductoModi;
import VistaMA.RegistrosDeProductos;
import VistaMA.RegistrosDeVentas;
import VistaMA.UsuarioGM;
import VistaMA.VistaEmpresa;
import VistaMA.VistaUsuario;
import VistaMA.vistaBono;
import VistaMA.vistaGrafica;
import VistaMV.Factura;
import static demo.BubbleChartDemo1.createDataset;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Dataset;

public class ControlMA extends MouseAdapter implements ActionListener, KeyListener, ItemListener, FocusListener {

    //para las graficas
    JFreeChart grafico;
    DefaultCategoryDataset dato = new DefaultCategoryDataset();
// constantes//

    static final double AFP = 7.75;
    static final double ISSS = 7.5;
    //fin constantes
    /*Clases que serán usadas para el Constructor*/
    MenuAdministrador menuAdministrador;
    Login login;

    //****Empleado****//
    vistaEmpleadoGM vistaEmpleadoGM;
    EmpleadoGM empleadoGM;
    EmpleadoDao daoEmpleado = new EmpleadoDao();
    Empleados empleado;
    Empleados empleadosSeleccionanda = null;
    //****Fin Empleado
    //****Bono****//
    vistaBono vistaBono;
    BonoGM bonoGM;
    BonoDao daoBono = new BonoDao();
    Bono bono;
    Bono bonoSelecionado = null;
    //****Fin Bono
    //****Usuario****//
    VistaUsuario vistaUsuario;
    UsuarioGM usuarioGM;
    UsuarioDao daoUsuario = new UsuarioDao();
    Usuario usuario;
    Usuario usuarioSeleccionando = null;
    //****Fin Usuario

    //****GastoGM****//
    GastosGM gastosGM;
    Gastosdao daoGasto = new Gastosdao();
    GastoEmpresa gastoEmpresa;
    GastoEmpresa gastoSeleccionado = null;
    //****Fin GastoGM****//
    //****ClienteMA****//
    ClienteMA clienteMA;
    Cliente cliente;
    Cliente clienteSeleccionado = null;
    ClienteDao daoCliente = new ClienteDao();
    //****Fin ClienteMA****//
    //****Empresa****//
    VistaEmpresa vistaEmpresa;
    EmpresaDao daoEmpresa = new EmpresaDao();
    Empresa empresa;
    Empresa empresaSeleccionanda = null;
    //****Fin GastoGM****//

    //****productoModi****//
    ProductoModi productoModi;
    ProductoDao daoProducto = new ProductoDao();
    Producto producto;
    Producto productoSeleccionado = null;
    //    ProductoModi producto = new ProductoModi();
    //****Fin productoModi****//
    //****Venta****//
    Venta ventaSeleccionada = null;
    RegistrosDeVentas registrosDeVenta;
    VentaDao daoVenta = new VentaDao();
    RegistrosDao daoRegistro = new RegistrosDao();
    RegistrosDao Daoregistro = new RegistrosDao();
    //****Fin Venta****//
    vistaGrafica vistaGrafica;
    
    
    RegistrosDeProductos registrosDeProductos;
    Producto productoSeleccionadoAun = null;
    InicioCajaDao daoCaja = new InicioCajaDao();
    

    private String padreActiva = "", hijaActiva = "";

    ///******Consulta Factura******////
    ConsultarVentas consultarVentas;

    Registros registro;
    ///******Fin Consulta Factura******////


    public ControlMA(MenuAdministrador menuAdministrador, Login login, EmpleadoGM empleadoGM, GastosGM gastosGM, RegistrosDeProductos registrosDeProductos, ProductoModi productoModi, RegistrosDeVentas registrosDeVentas, ConsultarVentas consultarVentas, ClienteMA clienteMA) {
        //this.daoGasto = new GastoDao();
        this.menuAdministrador = menuAdministrador;
        this.login = login;

        this.gastosGM = gastosGM;
        this.registrosDeProductos = registrosDeProductos;
        this.productoModi = productoModi;
        this.registrosDeVenta = registrosDeVentas;
        this.consultarVentas = consultarVentas;
        llamarVistaConsulta("menuAdministrador");
//usuario dao
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*Inicio de Botones Derechos*/
        if (e.getActionCommand().equals("Home")) {
            llamarVistaConsulta("home");
        } else if (e.getActionCommand().equals("Ventas")) {
            llamarVistaConsulta("ventas");
        } else if (e.getActionCommand().equals("Gastos")) {
            llamarVistaConsulta("gastos");
        } else if (e.getActionCommand().equals("Empleado")) {
            llamarVistaConsulta("empleado");
        } else if (e.getActionCommand().equals("Cliente")) {
            llamarVistaConsulta("cliente");
        } else if (e.getActionCommand().equals("cerrarMenu")) {
            llamarVistaConsulta("cerrarMenu");
        }
        /*Fin de Botones Derechos*/
 /*----------------------------------------------------------------------*/
 /*Inicio de Sub-botones de los Menús*/
        if (e.getActionCommand().equals("registrarFacturaItem")) {
            llamarVistaConsulta("registroVentas");
        } else if (e.getActionCommand().equals("guardarProducto")) {
            llamarVistaConsulta("guardarProducto");
        } else if (e.getActionCommand().equals("consultarProducto")) {
            llamarVistaConsulta("consultarProducto");
            //inicioEmpleado
        } else if (e.getActionCommand().equals("guardarEmpleado")) {
            llamarVistaConsulta("guardarEmpleado");
        } else if (e.getActionCommand().equals("modificarEmpleado")) {
            llamarVistaConsulta("modificarEmpleado");
        } else if (e.getActionCommand().equals("consultarUsuario")) {
            llamarVistaConsulta("consultarUsuario");
        } else if (e.getActionCommand().equals("guardarUsuario")) {
            llamarVistaConsulta("guardarUsuario");

        } else if (e.getActionCommand().equals("consultarBono")) {
            llamarVistaConsulta("consultarBono");
        } else if (e.getActionCommand().equals("guardarBono")) {
            llamarVistaConsulta("guardarBono");

        } else if (e.getActionCommand().equals("consultarEmpleado")) {
            llamarVistaConsulta("consultarEmpleado");
            //finEmpleado
        } else if (e.getActionCommand().equals("consultarCliente")) {
            llamarVistaConsulta("consultarCliente");
        } else if (e.getActionCommand().equals("opcionesGDS")) {
            llamarVistaConsulta("gastosGM");
        } else if (e.getActionCommand().equals("opcionesGDS1")) {
            llamarVistaConsulta("gastosGM1");
        } else if (e.getActionCommand().equals("valanceGDS")) {
            llamarVistaConsulta("valanceGDS");
        } else if (e.getActionCommand().equals("modificarEmpresa")) {
            llamarVistaConsulta("modificarEmpresa");
        } else if (e.getActionCommand().equals("consultarEmpresa")) {
            llamarVistaConsulta("consultarEmpresa");
        } /*Fin de Sub-botones de los Menús*/ /**
         * *******************************para Modificar
         * empresa********************************
         */
        else if (e.getActionCommand().equals("editarEmpresa")) {
            llamarAcciones("editarEmpresa");
        }

        /**
         * ********************************fin Modificar
         * empresa********************************
         */
        if ((e.getActionCommand().equals("Agregar"))
                || (e.getActionCommand().equals("Eliminar"))
                || (e.getActionCommand().equals("Modificar"))
                || (e.getActionCommand().equals("Generar"))
                || (e.getActionCommand().equals("Categoria"))
                || (e.getActionCommand().equals("Detalle"))
                || (e.getActionCommand().equals("IncrePro"))){
            accionDeBotones(e);
        }
        /*Fin de Sub-botones de los Menús*/

    }

    public void llamarAcciones(String nombreAccion) {
        //para boton modificar en vistaEmpresa
        if (nombreAccion.equals("editarEmpresa") && empresaSeleccionanda != null) {
            if ((!vistaEmpresa.tfNombre.getText().isEmpty())
                    && (!vistaEmpresa.tfDireccion.getText().isEmpty())
                    && (!vistaEmpresa.tfCorreo.getText().isEmpty())
                    && (!vistaEmpresa.tfCodigoEmpresa.getText().isEmpty())) {

                empresaSeleccionanda.setNombre(vistaEmpresa.tfNombre.getText());
                empresaSeleccionanda.setCorreo(vistaEmpresa.tfCorreo.getText());
                empresaSeleccionanda.setCodigoEmpresa(vistaEmpresa.tfCodigoEmpresa.getText());
                empresaSeleccionanda.setDireccion(vistaEmpresa.tfDireccion.getText());
                System.out.println(empresaSeleccionanda.getIdEmpresa() + empresaSeleccionanda.getNombre());

                //= new Empresa(vistaEmpresa.tfNombre.getText(), vistaEmpresa.tfDireccion.getText(), 
                //vistaEmpresa.tfCorreo.getText(),vistaEmpresa.tfCodigoEmpresa.getText());
                if (daoEmpresa.update(empresaSeleccionanda)) {
                    System.out.println(empresaSeleccionanda.getIdEmpresa() + empresaSeleccionanda.getNombre());
                    mostrarDatos();
                    Alerta aler = new Alerta(menuAdministrador, true, "Datos Modificados Con exito", "/img/Succes.png");
                    aler.show();
                    this.vistaEmpresa.dispose();
                } else {

                    Alerta aler = new Alerta(menuAdministrador, true, "Error realisando la operación", "/img/error.png");
                    aler.show();
                    this.vistaEmpresa.dispose();
                }

            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "complete los datos para poder realizar un cambio", "/img/error.png");
                aler.show();

            }

        } else if (empresaSeleccionanda == null && nombreAccion.equals("editarEmpresa")) {
            if ((!vistaEmpresa.tfNombre.getText().isEmpty())
                    && (!vistaEmpresa.tfDireccion.getText().isEmpty())
                    && (!vistaEmpresa.tfCorreo.getText().isEmpty())
                    && (!vistaEmpresa.tfCodigoEmpresa.getText().isEmpty())) {
                empresa = new Empresa(vistaEmpresa.tfCodigoEmpresa.getText(), vistaEmpresa.tfNombre.getText(),
                        vistaEmpresa.tfDireccion.getText(), vistaEmpresa.tfCorreo.getText());
                if (daoEmpresa.insert(empresa)) {
                    Alerta aler = new Alerta(menuAdministrador, true, "Datos Modificados Con exito", "/img/Succes.png");
                    aler.show();
                    mostrarDatos();
                    this.vistaEmpresa.dispose();
                } else {

                    Alerta aler = new Alerta(menuAdministrador, true, "Error  la operación", "/img/error.png");
                    aler.show();
                    this.vistaEmpresa.dispose();
                }

            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "complete los datos para poder realizar un cambio", "/img/error.png");
                aler.show();

            }

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1")) {
            ArrayList<GastoEmpresa> lista = daoGasto.buscar(GastosGM.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        }if (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1")) {
            ArrayList<GastoEmpresa> listaDis = daoGasto.buscarDis(GastosGM.tfBuscar.getText() + e.getKeyChar());

            if (listaDis.isEmpty()) {
                mostrarDatos();
            } else {
                filtrarReporte(listaDis);

            }

        }
        else if (padreActiva.equals("consultarCliente")) {
            ArrayList<Cliente> lista = daoCliente.buscar(ClienteMA.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        } else if (padreActiva.equals("registroVentas")) {
            ArrayList<Venta> lista = daoVenta.buscar(RegistrosDeVentas.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        } else if (padreActiva.equals("productoModi")) {
            ArrayList<Producto> lista = daoProducto.buscar(productoModi.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        }else if (padreActiva.equals("registrosDeProductos")) {
            ArrayList<Producto> lista = daoProducto.buscar(registrosDeProductos.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        //******************************************INICIO_EMPLEADO********************************************************************//
        if ((padreActiva.equals("vistaEmpleadoGM") || hijaActiva.equals("vistaEmpleadoGM"))) {
            if ((!vistaEmpleadoGM.tfSalario.getText().isEmpty())) {
                try {
                    double Salario = Double.valueOf(vistaEmpleadoGM.tfSalario.getText()), aux;
                    // System.out.println("aaa");
                    if (Salario > 0) {
                        //System.out.println("qq");
                        aux = (Salario * AFP) / 100;
                        vistaEmpleadoGM.tfAfp.setText(Double.toString(aux));
                        aux = (Salario * ISSS) / 100;
                        vistaEmpleadoGM.tfIsss.setText(Double.toString(aux));
                    }

                } catch (Exception exeException) {
                    vistaEmpleadoGM.alerta1.setText("por favor ingrese solo numeros");
                }
            }
            if ((!vistaEmpleadoGM.tfDireccion.getText().isEmpty())) {
                // System.out.println(e.paramString());
                char c = e.getKeyChar();
                String comilla = "'";
                char comprobar = vistaEmpleadoGM.tfDireccion.getText().charAt(vistaEmpleadoGM.tfDireccion.getText().length() - 1);
                if (comprobar == c) {

                    if (Character.toString(c).equals("'")) {
                        e.consume();

                        vistaEmpleadoGM.alerta1.setText("Caracter ' es invalido");
                        vistaEmpleadoGM.tfDireccion.setText(vistaEmpleadoGM.tfDireccion.getText().replace(comilla, ""));
                    } else {
                        vistaEmpleadoGM.alerta1.setText("");
                    }
                }

            }
            if ((!vistaEmpleadoGM.tfNombre.getText().isEmpty())) {
                char c = e.getKeyChar();
                // System.out.println(e.paramString());
                char comprobar = vistaEmpleadoGM.tfNombre.getText().charAt(vistaEmpleadoGM.tfNombre.getText().length() - 1);
                if (comprobar == c) {
                    if (Character.isDigit(c)) {
                        e.consume();

                        vistaEmpleadoGM.alerta1.setText("por favor ingrese solo letras");
                        vistaEmpleadoGM.tfNombre.setText(vistaEmpleadoGM.tfNombre.getText().replace(Character.toString(c), ""));
                    } else {
                        vistaEmpleadoGM.alerta1.setText("");
                    }
                }

            }
            if ((!vistaEmpleadoGM.tfApellido.getText().isEmpty())) {
                char c = e.getKeyChar();

                char comprobar = vistaEmpleadoGM.tfApellido.getText().charAt(vistaEmpleadoGM.tfApellido.getText().length() - 1);
                if (comprobar == c) {
                    if (Character.isDigit(c)) {
                        // e.consume();

                        vistaEmpleadoGM.alerta1.setText("por favor ingrese solo letras");
                        vistaEmpleadoGM.tfApellido.setText(vistaEmpleadoGM.tfApellido.getText().replace(Character.toString(c), ""));
                    } else {
                        vistaEmpleadoGM.alerta1.setText("");
                    }
                }

            }
            if ((!vistaEmpleadoGM.tfTelefono1.getText().isEmpty())) {
                char c = e.getKeyChar();

                char comprobar = vistaEmpleadoGM.tfTelefono1.getText().charAt(vistaEmpleadoGM.tfTelefono1.getText().length() - 1);
                if (comprobar == c) {
                    if (!Character.isDigit(c)) {
                        e.consume();

                        vistaEmpleadoGM.alerta1.setText("por favor ingrese solo numeros");
                        vistaEmpleadoGM.tfTelefono1.setText(vistaEmpleadoGM.tfTelefono1.getText().replace(Character.toString(c), ""));
                    } else {
                        vistaEmpleadoGM.alerta1.setText("");
                    }
                }

            }
            if ((!vistaEmpleadoGM.tfSalario.getText().isEmpty())) {
                char c = e.getKeyChar();
                System.out.println(c + " +");

                char comprobar = vistaEmpleadoGM.tfSalario.getText().charAt(vistaEmpleadoGM.tfSalario.getText().length() - 1);
                System.out.println(comprobar);
                if (comprobar == c) {

                    if (!validarDouble(Character.toString(c))) {
                        e.consume();

                        vistaEmpleadoGM.alerta1.setText("por favor ingrese solo  numeros");
                        vistaEmpleadoGM.tfSalario.setText(vistaEmpleadoGM.tfSalario.getText().replace(Character.toString(c), ""));
                    } else {
                        vistaEmpleadoGM.alerta1.setText("");
                    }
                }

            }

        }
        if (padreActiva.equals("empleadoGM")) {
            if ((!empleadoGM.buscar.getText().isEmpty())) {
                // System.out.println(e.paramString());
                char c = e.getKeyChar();
                String comilla = "'";
                char comprobar = empleadoGM.buscar.getText().charAt(empleadoGM.buscar.getText().length() - 1);
                if (comprobar == c) {

                    if (Character.toString(c).equals("'")) {
                        e.consume();

                        empleadoGM.alerta1.setText("Caracter ' es invalido");
                        empleadoGM.buscar.setText(empleadoGM.buscar.getText().replace(comilla, ""));
                    } else {
                        empleadoGM.alerta1.setText("");
                    }
                }
                ArrayList<Empleados> lista = daoEmpleado.buscar(empleadoGM.buscar.getText());
                if (lista.isEmpty()) {
                    //System.out.println("busca");
                    mostrarDatos();
                } else {
                    mostrarBusqueda(lista);
                    //System.out.println("NObusca");

                }
            }

        }
        //******************************************FIN_EMPLEADO********************************************************************//

        //******************************************INICIO_USUARIO********************************************************************//
        if ((padreActiva.equals("vistaUsuario") || hijaActiva.equals("vistaUsuario"))) {

            if (!vistaUsuario.tfContraseña.getText().isEmpty()) {
                // System.out.println(e.paramString());
                char c = e.getKeyChar();
                String comilla = "'";
                char comprobar = vistaUsuario.tfContraseña.getText().charAt(vistaUsuario.tfContraseña.getText().length() - 1);
                if (comprobar == c) {

                    if (Character.toString(c).equals("'")) {
                        e.consume();

                        vistaUsuario.alerta1.setText("Caracter ' es invalido");
                        vistaUsuario.tfContraseña.setText(vistaUsuario.tfContraseña.getText().replace(comilla, ""));

                    } else if (vistaUsuario.tfContraseña.getText().length() > 8) {
                        e.consume();

                        vistaUsuario.alerta1.setText("contraseña de 8 caracteres como maximo");
                        vistaUsuario.tfContraseña.setText(vistaUsuario.tfContraseña.getText().replace(Character.toString(c), ""));
                    } else if (vistaUsuario.tfContraseña.getText().length() > 1) {
                        comprobar = vistaUsuario.tfContraseña.getText().charAt(vistaUsuario.tfContraseña.getText().length() - 2);
                        System.out.println(comprobar);
                        if (c == comprobar) {
                            e.consume();

                            vistaUsuario.alerta1.setText("ingrese caracteres distintos");
                            vistaUsuario.tfContraseña.setText(vistaUsuario.tfContraseña.getText().replace(Character.toString(c), ""));
                        }
                    } else {
                        vistaUsuario.alerta1.setText("");
                    }
                }

            }

        }
        if (padreActiva.equals("usuarioGM")) {

            if ((!usuarioGM.buscar.getText().isEmpty())) {
                // System.out.println(e.paramString());
                char c = e.getKeyChar();
                String comilla = "'";
                char comprobar = usuarioGM.buscar.getText().charAt(usuarioGM.buscar.getText().length() - 1);
                if (comprobar == c) {

                    if (Character.toString(c).equals("'")) {
                        e.consume();

                        usuarioGM.alerta1.setText("Caracter ' es invalido");
                        usuarioGM.buscar.setText(usuarioGM.buscar.getText().replace(comilla, ""));
                    } else {
                        usuarioGM.alerta1.setText("");
                        ArrayList<Usuario> lista = daoUsuario.buscar(usuarioGM.buscar.getText());
                        if (lista.isEmpty()) {
                            //System.out.println("no buscA");
                            mostrarDatos();
                        } else {
                            mostrarBusqueda(lista);
                            //System.out.println("busca");

                        }
                    }
                }

            }

        }
        //******************************************fin_USUARIO********************************************************************//

        //******************************************inicio_bono********************************************************************//
        if ((padreActiva.equals("vistaBono") || hijaActiva.equals("vistaBono"))) {
            if ((!vistaBono.tfBono.getText().isEmpty())) {
                char c = e.getKeyChar();
                //System.out.println(c + " +");

                char comprobar = vistaBono.tfBono.getText().charAt(vistaBono.tfBono.getText().length() - 1);
                System.out.println(comprobar);
                if (comprobar == c) {
                    if (!validarDouble(Character.toString(c))) {
                        e.consume();

                        vistaBono.alerta1.setText("por favor ingrese solo  numeros");
                        vistaBono.tfBono.setText(vistaBono.tfBono.getText().replace(Character.toString(c), ""));
                    } else {
                        vistaBono.alerta1.setText("");
                    }
                }

            }
        }

        //******************************************fin_bono********************************************************************//
    }

    public boolean validarDouble(String c) {
        try {
            if (!c.equals(".")) {
                Double.parseDouble(c);
                return true;
            } else {
                return true;
            }

        } catch (Exception e) {

        }
        return false;
    }

    public void llamarVistaConsulta(String vista) {
        /*Esta función realiza la acción al presionar un determinado botón
        con su respectivo ActionCommand proveniente de la función ActionPerformed*/

 /*Ejecuciones de los Botones Derechos*/
        if (vista.equals("menuAdministrador")) {
            menuAdministrador.setControladorMA(this);
            mostrarDatos();
            menuAdministrador.iniciar();
        } else if (vista.equals("ventas")) {
             padreActiva = "vistaGraficas";
            this.vistaGrafica = new vistaGrafica(menuAdministrador, true);
            llenarGrafica();
            vistaGrafica.iniciar();
        } else if (vista.equals("cerrarMenu")) {
            menuAdministrador.dispose();
            login.cerrar();
            Login log = new Login();
            Factura vistaF = new Factura();
            MenuAdministrador vistaMA = new MenuAdministrador();
            ControlLogin controlL = new ControlLogin(log, vistaF, vistaMA, log.tfUser.getText());
        }
        /*Fin de Ejecuciones de los Botones Derechos*/
 /*----------------------------------------------------------------------*/
 /*Ejecuciones de los Sub-botones de los subMenús*/
        if (vista.equals("registroVentas")) {
            padreActiva = "registroVentas";
            this.registrosDeVenta = new RegistrosDeVentas(menuAdministrador, true);
            this.registrosDeVenta.setControlador(this);
            mostrarDatos();
            registrosDeVenta.iniciar();
        } else if (vista.equals("Detalle")) {
            hijaActiva= "Detalle";
            this.consultarVentas = new ConsultarVentas(menuAdministrador, true);
            DefaultTableModel modelo = new DefaultTableModel();
        modelo = new DefaultTableModel(); 
            String titulos[] = {"Cantidad", "Nombre", "Precio Unitario", "Precio Total"};
             modelo.setColumnIdentifiers(titulos);
             double totalVe= 0;
        this.consultarVentas.lbFactura.setText(ventaSeleccionada.getnFactura());
           this.consultarVentas.lbCliente.setText(ventaSeleccionada.getCliente().getNombre());
           this.consultarVentas.lbFecha.setText(String.valueOf(ventaSeleccionada.getFechaVenta()));
           this.consultarVentas.lbEmpleado.setText(ventaSeleccionada.getEmpleado().getNombre());
           this.consultarVentas.lbSucursal.setText(ventaSeleccionada.getEmpresa().getNombre());
           ArrayList<Registros> registros = daoRegistro.selectAllTo("idVenta", String.valueOf(ventaSeleccionada.getIdFactura()));
           for(Registros x: registros){
           totalVe = totalVe + x.getPrecioTotalProducto();
           
           Object datos[] = {x.getCantidadProducto(),x.getProducto().getNombreProducto(),x.getProducto().getPrecioVenta(),x.getPrecioTotalProducto()};
                modelo.addRow(datos);
           }
           consultarVentas.jDatos.setModel(modelo);
           consultarVentas.lbTotal.setText(String.valueOf(totalVe));
        
            consultarVentas.iniciar();
        } else if (vista.equals("guardarProducto")) {
            padreActiva = "productoModi";
            this.productoModi = new ProductoModi(menuAdministrador, true);
            this.productoModi.setControlador(this);
            mostrarDatos();
            this.productoModi.iniciar();
        } else if (vista.equals("consultarProducto")) {
            padreActiva = "registrosDeProductos";
            this.registrosDeProductos = new RegistrosDeProductos(menuAdministrador, true);
            this.registrosDeProductos.setControlador(this);
            mostrarDatos();
            this.registrosDeProductos.iniciar();

        } //empleado
        else if (vista.equals("guardarEmpleado")) {
            this.vistaEmpleadoGM = new vistaEmpleadoGM(menuAdministrador, true);
            this.vistaEmpleadoGM.setControladorMA(this);
            padreActiva = "vistaEmpleadoGM";
            String inicial = "EMP";
            this.vistaEmpleadoGM.tfCodigo.setText(crearCodigo(inicial, padreActiva));
            this.vistaEmpleadoGM.iniciar();

        } else if (vista.equals("consultarEmpleado")) {
            padreActiva = "empleadoGM";
            this.empleadoGM = new EmpleadoGM(menuAdministrador, true, false);
            this.empleadoGM.setControlador(this);
            mostrarDatos();
            this.empleadoGM.iniciar();

        } else if (vista.equals("modificarEmpleado")) {
            hijaActiva = "vistaEmpleadoGM";
            this.vistaEmpleadoGM = new vistaEmpleadoGM(menuAdministrador, true);
            this.vistaEmpleadoGM.setControladorMA(this);
            this.vistaEmpleadoGM.tfCodigo.setText(empleadosSeleccionanda.getCodigoEmpleado());
            this.vistaEmpleadoGM.tfNombre.setText(empleadosSeleccionanda.getNombre());
            this.vistaEmpleadoGM.tfApellido.setText(empleadosSeleccionanda.getApellido());
            this.vistaEmpleadoGM.tfTelefono1.setText(empleadosSeleccionanda.getTelefono());
            this.vistaEmpleadoGM.tfDireccion.setText(empleadosSeleccionanda.getDireccion());
            this.vistaEmpleadoGM.tfSalario.setText(Double.toString(empleadosSeleccionanda.getSalarioEmpleado()));
            this.vistaEmpleadoGM.tfCombobox.setSelectedItem(empleadosSeleccionanda.getCargoEmpleado());
            llenarCombo();
            this.vistaEmpleadoGM.tfAfp.setText(Double.toString(empleadosSeleccionanda.getAfp()));
            this.vistaEmpleadoGM.tfIsss.setText(Double.toString(empleadosSeleccionanda.getIsss()));
            this.vistaEmpleadoGM.tfFecha.setDatoFecha(empleadosSeleccionanda.getFechaContratacion());
            this.vistaEmpleadoGM.iniciar();

        } //fin Empleado 
        //inicio Usuario
        else if (vista.equals("consultarUsuario")) {
            padreActiva = "usuarioGM";
            this.usuarioGM = new UsuarioGM(menuAdministrador, true, false);
            this.usuarioGM.setControlador(this);
            mostrarDatos();
            this.usuarioGM.iniciar();
        } else if (vista.equals("guardarUsuario")) {
            this.vistaUsuario = new VistaUsuario(menuAdministrador, true);
            this.vistaUsuario.setControladorMA(this);
            padreActiva = "vistaUsuario";
            llenarCombo();
            this.vistaUsuario.iniciar();

        }//fin Usuario
        //inicio bono
        else if (vista.equals("consultarBono")) {
            padreActiva = "bonoGM";
            this.bonoGM = new BonoGM(menuAdministrador, true, false);
            this.bonoGM.setControlador(this);
            mostrarDatos();
            this.bonoGM.iniciar();
        } else if (vista.equals("guardarBono")) {
            this.vistaBono = new vistaBono(menuAdministrador, true);
            this.vistaBono.setControladorMA(this);
            padreActiva = "vistaBono";
            this.vistaBono.iniciar();

        } else if (vista.equals("modificarBono")) {
            hijaActiva = "vistaBono";
            this.vistaBono = new vistaBono(menuAdministrador, true);
            this.vistaBono.setControladorMA(this);
            this.vistaBono.tfBono.setText(bonoSelecionado.getBono().toString());
            vistaBono.tfCombobox.removeAllItems();
            this.vistaBono.tfCombobox.addItem(bonoSelecionado.getCargoEmpleado());
            this.vistaBono.iniciar();

        } else if (vista.equals("consultarCliente")) {

            this.clienteMA = new ClienteMA(menuAdministrador, true);
            this.clienteMA.setControlador(this);
            padreActiva = "consultarCliente";
            mostrarDatos();
            this.clienteMA.iniciar();
        } else if (vista.equals("gastosGM")) {
            this.gastosGM = new GastosGM(menuAdministrador, true);
            this.gastosGM.setControlador(this);
            padreActiva = "gastosGM";
            gastosGM.cbTipo.addItem("Seleccione");
            llenarCombo();
            mostrarDatos();
            this.gastosGM.iniciar();
        } else if (vista.equals("gastosGM1")) {
            this.gastosGM = new GastosGM(menuAdministrador, true);
            this.gastosGM.setControlador(this);
            padreActiva = "gastosGM1";
            gastosGM.tfPago1.setEditable(false);
            gastosGM.btnModificar.setVisible(false);
            gastosGM.cbTipo.removeAllItems();
            gastosGM.cbTipo.addItem("Seleccione");
            gastosGM.btnCategoria.setVisible(false);
            mostrarDatos();
            llenarCombo();
            this.gastosGM.iniciar();

        } /////////////////////////////////
        else if (vista.equals("modificarEmpresa")) {
            this.vistaEmpresa = new VistaEmpresa(menuAdministrador, true, true);
            try {
                empresaSeleccionanda = daoEmpresa.selectAll().get(0);
                this.vistaEmpresa.tfCodigoEmpresa.setText(empresaSeleccionanda.getCodigoEmpresa());
                this.vistaEmpresa.tfNombre.setText(empresaSeleccionanda.getNombre());
                this.vistaEmpresa.tfDireccion.setText(empresaSeleccionanda.getDireccion());
                this.vistaEmpresa.tfCorreo.setText(empresaSeleccionanda.getCorreo());
                mostrarDatos();
            } catch (Exception e) {
                empresaSeleccionanda = null;
            }
            this.vistaEmpresa.setControladorMA(this);

            this.vistaEmpresa.iniciar();

        } else if (vista.equals("consultarEmpresa")) {
            this.vistaEmpresa = new VistaEmpresa(menuAdministrador, true, false);
            empresaSeleccionanda = daoEmpresa.selectAll().get(0);
            this.vistaEmpresa.tfCodigoEmpresa.setText(empresaSeleccionanda.getCodigoEmpresa());
            this.vistaEmpresa.tfNombre.setText(empresaSeleccionanda.getNombre());
            this.vistaEmpresa.tfDireccion.setText(empresaSeleccionanda.getDireccion());
            this.vistaEmpresa.tfCorreo.setText(empresaSeleccionanda.getCorreo());

            this.vistaEmpresa.iniciar();

        }

        /*Fin de Ejecuciones de los Sub-botones de los Menús*/
    }

    public void llenarCombo() {
        if (padreActiva.equals("vistaUsuario")) {
            vistaUsuario.tfCombobox.removeAllItems();
            vistaUsuario.tfCombobox.addItem("Seleccione");
            String dato = "";

            ArrayList<Empleados> lista = daoEmpleado.selectConCondicion(" WHERE cargoEmpleado = 'Administrador' OR "
                    + " cargoEmpleado = 'Supervisor' OR  cargoEmpleado = 'Cajero' ");
            int i = 0;

            for (Empleados x : lista) {
                System.out.println(x.getUsuario().getIdUsuario());
                if (padreActiva.equals("vistaUsuario") && x.getEstado() > 0 && x.getUsuario().getIdUsuario() == 0) {
                    //para llenar empleados que no tienen ningun usuario
                    i++;
                    vistaUsuario.tfCombobox.addItem(String.valueOf(i) + " / " + x.getCodigoEmpleado() + " / "
                            + x.getNombre() + " " + x.getApellido() + " / " + x.getCargoEmpleado());

                }

            }

        } else if (padreActiva.equals("gastosGM1")) {

            ArrayList<Empleados> empleado = daoEmpleado.selectAll();
            for (Empleados x : empleado) {
                if (x.getEstado() == 1) {
                    String selec = x.getCodigoEmpleado() + " - " + x.getNombre() + " - " + x.getApellido();

                    gastosGM.cbTipo.addItem(selec);
                }
            }
        }else if (padreActiva.equals("gastosGM")) {

            ArrayList<GastoEmpresa> gasto = daoGasto.selectAllDis();
            for (GastoEmpresa x : gasto) {
               if(!(x.getCategoria().equals("Administrador")
                        || (x.getCategoria().equals("Cajero"))
                        || (x.getCategoria().equals("Supervisor")))){
                    String selec = x.getCategoria();

                    gastosGM.cbTipo.addItem(selec);
               }
            }
        }
        
        if (padreActiva.equals("vistaEmpleadoGM") || hijaActiva.equals("vistaEmpleadoGM")) {
            vistaEmpleadoGM.tfCombobox_1.removeAllItems();
            vistaEmpleadoGM.tfCombobox_1.addItem("Seleccione");

            String dato = "";

            ArrayList<Bono> lista = daoBono.selectAllTo("cargoEmpleado", vistaEmpleadoGM.tfCombobox.getSelectedItem().toString());
            if (!lista.isEmpty()) {
                vistaEmpleadoGM.tfCombobox_1.addItem("$" + lista.get(0).getBono().toString());
            }

            vistaEmpleadoGM.tfCombobox_1.addItem("no añadir Bono");
        }
    }

    public void mostrarDatos() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = new DefaultTableModel(); 
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1 = new DefaultTableModel();          
    
        ////////////******TOTAL InicioCaja********/////////////////          
        ArrayList<InicioCaja> caja1 = daoCaja.selectAll();
        double inicio = 0;
        for (InicioCaja x : caja1) {
            inicio = x.getDineroInicio();
        }
        this.menuAdministrador.lbCaja.setText("$" + String.format("%.2f", inicio));
        ////////////******FIN DE TOTAL InicioCaja********/////////////////
        ////////////******NOMBRE DE LA TIENDA********/////////////////
        String nombre = "";
        ArrayList<Empresa> empresa = daoEmpresa.selectAll();
        for (Empresa x : empresa) {

            Object datos1[] = {x.getIdEmpresa(), x.getNombre()};
            if (datos1[0].equals(1)) {
                nombre = x.getNombre();
            }

        }

        MenuAdministrador.lbEmpresa1.setText(nombre);
        ////////////******FIN DE NOMBRE DE LA TIENDA********/////////////////
        ////////////******TOTAL CLIENTE********/////////////////
        ArrayList<Cliente> cliente = daoCliente.selectAll();
        double total = 0;
        for (Cliente x : cliente) {
            total++;
        }
        this.menuAdministrador.lbClienteT.setText(String.format("%.2f", total));
        ////////////******FIN DE TOTAL CLIENTE********/////////////////

        ///////////*******PRODUCTO********************////////////////
        float totalV = 0;
        float totalUni1 = 0;
        ArrayList<Producto> producto1 = daoProducto.selectAll();
        for (Producto x : producto1) {
            totalUni1 = (float) (x.getPrecioVenta()) * x.getCantidad();
            totalV = (float) (totalV + totalUni1);
        }
        this.menuAdministrador.lbProducto1.setText("$" + String.format("%.2f", totalV));
        ///////////*******fIN DE PRODUCTO************////////////////
        ////////////******GASTOS EMPLEADO********/////////////////

        if (padreActiva.equals("gastosGM1")) {

            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Nombre"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll1();
            for (GastoEmpresa x : gastos) {
                if ((x.getCategoria().equals("Administrador")
                        || (x.getCategoria().equals("Cajero"))
                        || (x.getCategoria().equals("Supervisor")))) {
                    Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpleado().getNombre()};

                    modelo.addRow(datos);
                }
                totalR = totalR + x.getSaldo();
              

            }
            GastosGM.jtDatos.setModel(modelo);
            GastosGM.lbTotalReporte.setText("$"+String.format("%.2f", totalR));
            
        }
         ////////////******FINAL GASTOS EMPLEADO********/////////////////
        ////////////******GASTOS EMPRESA********/////////////////
        else if (padreActiva.equals("gastosGM")) {

            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (GastoEmpresa x : gastos) {
                if (!(x.getCategoria().equals("Administrador")
                        || (x.getCategoria().equals("Cajero"))
                        || (x.getCategoria().equals("Supervisor")))) {

                    Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpresa().getNombre()};

                    modelo.addRow(datos);
                }
                totalR = totalR + x.getSaldo();
               

            }
            GastosGM.jtDatos.setModel(modelo);
            GastosGM.lbTotalReporte.setText("$"+String.format("%.2f", totalR));
        }if (padreActiva.equals("gastosGM")||padreActiva.equals("gastosGM1")) {  
 
        String titulos1[] = {"Cant...", "Categoria", "Total"};
            modelo1.setColumnIdentifiers(titulos1);
            Gastosdao gastoDao= new Gastosdao();
        ArrayList<GastoEmpresa> muestra = gastoDao.selectAllDis();
        for(GastoEmpresa x: muestra ){
            ArrayList<GastoEmpresa> totales = gastoDao.selectAllTo("tipo",x.getCategoria());
                double totalRegistro = 0;
                int j = 0;
                for(GastoEmpresa i: totales){
                    totalRegistro = totalRegistro + i.getSaldo();
                    j++;
                }
                Object datos1[] = {j,x.getCategoria(), totalRegistro};
                
                modelo1.addRow(datos1);
        }
            
                GastosGM.jtDatosReporte.setModel(modelo1);

        } ////////////******FINAL EMPRESA********/////////////////
        ////////////******ClienteMA********/////////////////
        else if (padreActiva.equals("consultarCliente")) {

            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Cliente> cliente2 = daoCliente.selectAll();
            for (Cliente x : cliente2) {
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo.addRow(datos);

            }
            this.clienteMA.jtDatos.setModel(modelo);

        } ////////////******FINAL ClienteMA********/////////////////
        //**************ProductoModi****************//
        else if (padreActiva.equals("productoModi")) {
            String titulos[] = {"Codigo", "Nombre", "Cantidad", "Maximo", "Minimo", "Precio Compra", "Precio Unidad", "Precio Venta", "Ganancia", "Vence", "Iva", "Estado", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Producto> producto = daoProducto.selectAll();
            float precioUni = 0;
            //float cal1 = 0;
            //float cal2 = 0;
            //float precioVenta1 = 0;
            //float ganancia = 0;
            int i = 0;
            for (Producto x : producto) {
                //this.registrosDeProductos.jtDatos.editCellAt(3, i);
                //precioUni = (float) (x.getPrecioCompra() / x.getCantidad());
                //cal1 = (float) (x.getPrecioCompra() * x.getIva());
                //cal2 = (float) (x.getPrecioCompra() + cal1 + precioUni);
                //precioVenta1 = (float) (cal2 / x.getCantidad());
                //ganancia = (float) (precioVenta1 - precioUni);
                
                Object datos[] = {x.getCodigoProducto(), x.getNombreProducto(), x.getCantidad(), x.getMax(), x.getMin(),
                    x.getPrecioCompra(), precioUni, x.getPrecioVenta(), x.getGananciaUni(), x.getFechaVencimiento(),
                    x.getIva(), x.getEstado(), x.getEmpresa().getNombre()};
                
                modelo.addRow(datos);
                i++;
              
            }
            this.productoModi.jtDatos.setModel(modelo);
        }
        //************Fin productoModi*************//
        //**************Registro Producto****************//
        else if (padreActiva.equals("registrosDeProductos")) {
            String titulos[] = {"Codigo", "Nombre", "Cantidad", "Precio Unitario", "Iva", "Ganacia", "Precio Compra", "Precio Venta", "fecha de Vencimiento", "Max", "Min", "Empresa", "Total"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Producto> producto = daoProducto.selectAll();
            float precioUni = 0;
            float totalUni = 0;
            float total0 = 0;
            int i = 0;
            for (Producto x : producto) {
                precioUni = (float) (x.getPrecioCompra() / x.getCantidad());
                totalUni = (float) (x.getPrecioVenta() * x.getCantidad());
                Object datos[] = {x.getCodigoProducto(), x.getNombreProducto(), x.getCantidad(), precioUni, x.getIva(),
                    x.getGananciaUni(), x.getPrecioCompra(), x.getPrecioVenta(), x.getFechaVencimiento(),
                    x.getMax(), x.getMin(), x.getEmpresa().getNombre(), totalUni};///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                total0 = total0 + totalUni;
                modelo.addRow(datos);
                i++;

            }
            this.registrosDeProductos.jtDatos.setModel(modelo);
            this.registrosDeProductos.lbTotal.setText("$" + String.format("%.2f", total0));
        } //************Fin registro producto*************//
        // ------------------------------------------------Inicio Empleado------------------------------------------------//
        else if (padreActiva.equals("empleadoGM")) {
            String titulos[] = {"N", "codigo", "Nombre", "Apellido", "Telefono", "Direccion", "Salario", "afp", "isss", "Salario Total", "Cargo", "Fecha Contratacion"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Empleados> empleados = daoEmpleado.selectAll();
            int i = 1;
            for (Empleados x : empleados) {
                if (x.getEstado() > 0) {

                    Double salarioNeto = (x.getSalarioEmpleado() - x.getAfp() - x.getIsss());
                    Object datos[] = {i, x.getCodigoEmpleado(), x.getNombre(), x.getApellido(), x.getTelefono(),
                        x.getDireccion(), x.getSalarioEmpleado(), x.getAfp(), x.getIsss(), salarioNeto, x.getCargoEmpleado(), x.getFechaContratacion()};
                    modelo.addRow(datos);
                    i++;

                }
            }
            this.empleadoGM.tbEmpleados.setModel(modelo);
        } //------------------------------------------------fin Empleado------------------------------------------------//
        // ------------------------------------------------Inicio Usuario------------------------------------------------//
        else if (padreActiva.equals("usuarioGM")) {
            String titulos[] = {"N", "usuario", "Nombre Empleado", "cargo"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Usuario> usuarios = daoUsuario.selectAll();
            int i = 1;
            for (Usuario x : usuarios) {
                if (!x.getUsuario().isEmpty()) {
                    x.AddEpleado(x.getUsuario());
                    if (x.getEmpleados().getEstado() > 0) {

                        Object datos[] = {i, x.getUsuario(), x.getEmpleados().getNombre(), x.getEmpleados().getCargoEmpleado()};
                        modelo.addRow(datos);
                        i++;

                    }
                }
            }
            this.usuarioGM.tbEmpleados.setModel(modelo);
        } //------------------------------------------------fin Usuario------------------------------------------------//
        // ------------------------------------------------Inicio bono------------------------------------------------//
        else if (padreActiva.equals("bonoGM")) {
            String titulos[] = {"N", " $ ", "Cargo del Empleado "};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Bono> bonos = daoBono.selectAll();
            int i = 1;
            for (Bono x : bonos) {
                Object datos[] = {i, x.getBono(), x.getCargoEmpleado()};
                modelo.addRow(datos);
                i++;
            }
            this.bonoGM.tbBono.setModel(modelo);
        } //------------------------------------------------fin Usuario------------------------------------------------//
        //**************registroVentas****************//
        else if (padreActiva.equals("registroVentas")) {
            String titulos[] = {"N", "Fecha", "Cliente", "Empleado", "Precio Total"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Venta> venta1 = daoVenta.selectAll();
            float total1 = 0;
            for (Venta x : venta1) {

                Object datos[] = {x.getnFactura(), x.getFechaVenta(), x.getCliente().getNombre(), x.getEmpleado().getNombre(), x.getSaldoTotal()};
                modelo.addRow(datos);
                total1 = (float) (total1 + x.getSaldoTotal());
            }
            registrosDeVenta.jtDatos.setModel(modelo);
            registrosDeVenta.lbTotal.setText(String.format("%.2f", total1));
            //************Fin registroVentas*************//
        }
        
        
    }

    public String crearCodigo(String a, String activa) {
        ////////////******GASTOS********///////////////////////

        String correlativo = a;
        int corre = 0;
        if (activa.equals("Gastos")) {
            ArrayList<GastoEmpresa> gasto;
            gasto = daoGasto.selectAll();
            for (GastoEmpresa x : gasto) {
                corre = x.getIdGasto();

            }
            corre = corre + 1;
        }
        
        if (activa.equals("productoModi")) {
            ArrayList<Producto> producto;
            producto = daoProducto.selectAll();
            for (Producto x : producto) {
                corre = x.getIdProducto();
            }
            corre = corre + 1;
        }
        
        if (activa.equals("vistaEmpleadoGM")) {
            ArrayList<Empleados> empleados;
            empleados = daoEmpleado.selectAll();
            for (Empleados x : empleados) {
                corre = x.getIdPersona();
            }
        }
        for (int i = 0; i < 6; i++) {
            if ((correlativo.length() + String.valueOf(corre).length()) < 7) {
                correlativo = correlativo + "0";
            }
        }
        correlativo = correlativo + String.valueOf(corre);

        return correlativo;
        ////////////******FINAL GASTOS********/////////////////
    }

    public void accionDeBotones(ActionEvent e) {
        if (e.getActionCommand().equals("Agregar") && padreActiva.equals("gastosGM")) {
            if (!gastosGM.tfCodigo.getText().isEmpty()
                    && (!gastosGM.tfPago1.getText().isEmpty())
                    && (!gastosGM.cbTipo.getSelectedItem().equals("Seleccione"))) {
                ArrayList<Empresa> empresa = daoEmpresa.selectAllTo("idEmpresa", "1");
                String v = gastosGM.cbTipo.getSelectedItem().toString();
                if (gastoSeleccionado == null) {
                    GastoEmpresa gasto = new GastoEmpresa(gastosGM.tfCodigo.getText(), gastosGM.dFecha.getDatoFecha(), v, Double.parseDouble(gastosGM.tfPago1.getText()), empresa.get(0));
                    ArrayList<GastoEmpresa> existe = daoGasto.selectAllTo("codigoGasto", gastosGM.tfCodigo.getText());
                    if (existe.isEmpty()) {
                        if (daoGasto.insert(gasto)) {
                            vaciarVista();
                            Alerta aler = new Alerta(menuAdministrador, true, "Guardado con exito", "/img/Succes.png");

                            aler.show();

                        }
                    } else {

                        Alerta aler = new Alerta(menuAdministrador, true, "Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                mostrarDatos();
            } else {

                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios", "/img/error.png");
                aler.show();

            }

        } else if(e.getActionCommand().equals("Categoria") && padreActiva.equals("gastosGM")){
            String categoria = JOptionPane.showInputDialog("Ingresa la categoria");
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Agregar?","",  JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            ArrayList<GastoEmpresa> existe = daoGasto.selectAllTo("tipo", categoria);
            if(existe.isEmpty()){
                if(opccion == 0){
                this.gastosGM.cbTipo.addItem(categoria);
                }
            }else{
                 Alerta aler = new Alerta(menuAdministrador, true, "Ya Existe", "/img/Succes.png");
                            aler.show();
            }
        
        }else if (e.getActionCommand().equals("Agregar") && padreActiva.equals("gastosGM1")) {
            if (!gastosGM.tfCodigo.getText().isEmpty()) {
                int idEmpleado = 0;
                float salario = 0;
                float pago = 0;
                double afpE = 0;
                double isssE = 0;
                double bono = 0;
                double retiro = 0;
                String categoria = "";
                 String vq[] = gastosGM.cbTipo.getSelectedItem().toString().split(" - ");
                ArrayList<Empleados> empleado = daoEmpleado.selectConCondicion("WHERE codigoEmpleado = '" + vq[0] + "'");
                ArrayList<Empresa> empresa = daoEmpresa.selectAllTo("idEmpresa", "1");
                try {
                    if (empleado.get(0) != null) {
                        idEmpleado = empleado.get(0).getIdPersona();
                        salario = (float) empleado.get(0).getSalarioEmpleado();
                        categoria = empleado.get(0).getCargoEmpleado();
                        gastosGM.tfPago1.setText(String.valueOf(empleado.get(0).getSalarioEmpleado()));
                        afpE = empleado.get(0).getAfp();
                        isssE = empleado.get(0).getIsss();
                        if (empleado.get(0).getBono().getIdBono()>0) {
                           bono = empleado.get(0).getBono().getBono();
                        }else{
                            bono = 0;
                            
                        }
                    }else{
                        Alerta aler = new Alerta(menuAdministrador, true, "usuario no encontrado", "/img/error.png");
                            aler.show();
                    }
                } catch (Exception exeption) {
                    
                }

                ArrayList<Empleados> empleado1 = daoEmpleado.selectAllTo("idEmpleado", String.valueOf(idEmpleado));

                String v = gastosGM.cbTipo.getSelectedItem().toString();
                if (gastoSeleccionado == null) {
                    double ISSS = 0.0775;
                    double AFP = 0.0775;
                    pago = (float) (salario - (afpE + isssE));
                    
                    salario = (float) ((salario + (salario * ISSS)) + (salario * AFP) + bono);
                    retiro = (float) pago + bono;
                    GastoEmpresa gasto = new GastoEmpresa(gastosGM.tfCodigo.getText(), gastosGM.dFecha.getDatoFecha(), categoria, salario, empresa.get(0), empleado1.get(0));
                    ArrayList<GastoEmpresa> existe = daoGasto.selectAllTo("codigoGasto", gastosGM.tfCodigo.getText());
                    if (existe.isEmpty()) {
                        if (daoGasto.insert1(gasto)) {
                            vaciarVista();
                            Alerta aler = new Alerta(menuAdministrador, true, "Salario $" + pago + " + Bono " + bono + " = " + String.format("%.2f",retiro), "/img/Succes.png");
                            aler.show();

                        }
                    } else {
                        Alerta aler = new Alerta(menuAdministrador, true, "Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                mostrarDatos();
            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios", "/img/error.png");
                aler.show();
            }

        } else if (e.getActionCommand().equals("Generar") && ((padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1")))) {
            String iniciales = "EG-";

            this.gastosGM.tfCodigo.setText(crearCodigo(iniciales, "Gastos"));

        } else if (e.getActionCommand().equals("Eliminar")
                && (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1"))) {
            if(gastoSeleccionado != null){
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Eliminar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                if (gastoSeleccionado != null) {
                    if (daoGasto.delete(gastoSeleccionado)) {
                        mostrarDatos();
                        vaciarVista();

                        Alerta aler = new Alerta(menuAdministrador, true, "Eliminado con exito", "/img/Succes.png");
                        aler.show();
                        gastoSeleccionado = null;
                    } else {

                        Alerta aler = new Alerta(menuAdministrador, true, "Error al eliminado con exito", "/img/error.png");
                        aler.show();
                    }
                }
            }
            }else{
                Alerta aler = new Alerta(menuAdministrador, true, "Seleccione un Registro", "/img/error.png");
                    aler.show();
            }

        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("gastosGM")) {
            if(gastoSeleccionado != null){
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                gastoSeleccionado.setCodigoGastos(gastosGM.tfCodigo.getText());
                gastoSeleccionado.setFecha(gastosGM.dFecha.getDatoFecha());
                gastoSeleccionado.setCategoria((String) gastosGM.cbTipo.getSelectedItem());
                gastoSeleccionado.setSaldo(Double.parseDouble(gastosGM.tfPago1.getText()));
                gastoSeleccionado.getEmpresa().getIdEmpresa();
                daoGasto.update(gastoSeleccionado);
                vaciarVista();
                Alerta aler = new Alerta(menuAdministrador, true, "Modificado con exito", "/img/Succes.png");
                aler.show();
            }
            }else{
                Alerta aler = new Alerta(menuAdministrador, true, "Seleccione un Registro", "/img/error.png");
                    aler.show();
            }
        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("consultarCliente")) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                clienteSeleccionado.getCodigo();
                clienteSeleccionado.setNombre(ClienteMA.tfNombre.getText());
                clienteSeleccionado.setApellido(ClienteMA.tfApellido.getText());
                clienteSeleccionado.setTelefono(ClienteMA.tfTelefono.getText());
                clienteSeleccionado.setDireccion(ClienteMA.tfDireccion.getText());
                daoCliente.update(clienteSeleccionado);
                vaciarVista();
                Alerta aler = new Alerta(menuAdministrador, true, "Modificado con exito", "/img/bueno.png");
                aler.show();
            }
        }
        mostrarDatos();
        gastoSeleccionado = null;

        //**********ProductoModi************//
        if (e.getActionCommand().equals("Agregar") && padreActiva.equals("productoModi")) {
            if (!productoModi.tfCodigo.getText().isEmpty()
                    && (!productoModi.tfNombre.getText().isEmpty())
                    && (!productoModi.tfPrecioCompra.getText().isEmpty())
                    && (!productoModi.tfCantidad.getText().isEmpty())
                    && (!productoModi.tfMaximo.getText().isEmpty())
                    && (!productoModi.tfMinimo.getText().isEmpty())
                    && (!productoModi.tfPrecioVenta.getText().isEmpty()) ) {
                
                ArrayList<Empresa> empresa = daoEmpresa.selectAllTo("idEmpresa", "1");
                if (productoSeleccionado == null) { 
                    double ganancia = 0;
                    double precioUnitario = 0;
                    precioUnitario = (Integer.parseInt(productoModi.tfPrecioCompra.getText()) / Integer.parseInt(productoModi.tfCantidad.getText()));
                    ganancia = precioUnitario - Integer.parseInt(productoModi.tfPrecioVenta.getText());
                    
                    Producto productoo = new Producto(productoModi.tfCodigo.getText(), productoModi.tfNombre.getText(), 
                            Double.parseDouble(productoModi.tfPrecioCompra.getText())
                            , Integer.parseInt(productoModi.tfCantidad.getText()), productoModi.dVence.getDatoFecha(), 
                            Integer.parseInt(productoModi.tfMaximo.getText()), Integer.parseInt(productoModi.tfMinimo.getText()), 
                            1, ganancia, 0.13, Double.parseDouble(productoModi.tfPrecioVenta.getText()), empresa.get(0));
                    
                    ArrayList<Producto> existe = daoProducto.selectAllTo("codigoProducto", productoModi.tfCodigo.getText());
                    if (existe.isEmpty()) {
                        if (daoProducto.insertProducto(productoo)) {
                            vaciarVista();
                            Alerta aler = new Alerta(menuAdministrador, true, "Guardado con exito", "/img/Succes.png");

                            aler.show();

                        }
                    } else {

                        Alerta aler = new Alerta(menuAdministrador, true, "Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                mostrarDatos();
            } else {

                Alerta aler = new Alerta(menuAdministrador, true, "Campos incompletos o vacios", "/img/error.png");
                aler.show();

            }

        } else if (e.getActionCommand().equals("Generar") && ((padreActiva.equals("productoModi") ))) {
            String iniciales = "PR-";

            this.productoModi.tfCodigo.setText(crearCodigo(iniciales, "productoModi"));

        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("productoModi")) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                double ganancia = 0;
                double precioUnitario = 0;
                precioUnitario = (Double.parseDouble(productoModi.tfPrecioCompra.getText()) / Integer.parseInt(productoModi.tfCantidad.getText()));
                ganancia = precioUnitario - Double.parseDouble(productoModi.tfPrecioVenta.getText());
                
                productoSeleccionado.setCodigoProducto(productoModi.tfCodigo.getText());
                productoSeleccionado.setNombreProducto(productoModi.tfNombre.getText());
                productoSeleccionado.setPrecioCompra(Double.parseDouble(productoModi.tfPrecioCompra.getText()));
                productoSeleccionado.setCantidad(Integer.parseInt(productoModi.tfCantidad.getText()));
                productoSeleccionado.setFechaVencimiento(productoModi.dVence.getDatoFecha());
                productoSeleccionado.setMax(Integer.parseInt(productoModi.tfMaximo.getText()));
                productoSeleccionado.setMin(Integer.parseInt(productoModi.tfMinimo.getText()));
                productoSeleccionado.setEstado(1);
                productoSeleccionado.setGananciaUni(ganancia);
                productoSeleccionado.setIva(0.13);
                productoSeleccionado.setPrecioVenta(Double.parseDouble(productoModi.tfPrecioVenta.getText()));
                productoSeleccionado.getEmpresa().getIdEmpresa();
                if(daoProducto.updateProducto(productoSeleccionado)){
                vaciarVista();
                Alerta aler = new Alerta(menuAdministrador, true, "Modificado con exito", "/img/Succes.png");
                aler.show();
                 mostrarDatos();
                }
            }
        }else if (e.getActionCommand().equals("Eliminar")
                && (padreActiva.equals("productoModi"))) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Eliminar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                if (productoSeleccionado != null) {
                    if (daoProducto.delete(productoSeleccionado)) {
                        mostrarDatos();
                        vaciarVista();

                        Alerta aler = new Alerta(menuAdministrador, true, "Eliminado con exito", "/img/Succes.png");
                        aler.show();
                        productoSeleccionado = null;
                    } else {

                        Alerta aler = new Alerta(menuAdministrador, true, "Error al eliminado con exito", "/img/error.png");
                        aler.show();
                    }
                }
            }

        }else if(e.getActionCommand().equals("IncrePro")){
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         String incremento = JOptionPane.showInputDialog("Cantidad Entrante");
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Agregar?","",  JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(opccion == 0){
            int can =  productoSeleccionadoAun.getCantidad();
             productoSeleccionadoAun.getCodigoProducto();
             productoSeleccionadoAun.getNombreProducto();
             productoSeleccionadoAun.getPrecioCompra();
                 productoSeleccionadoAun.setCantidad(Integer.parseInt(incremento)+ can);
                 
                 if(daoProducto.updateCantidad(productoSeleccionadoAun)){
                   Alerta aler = new Alerta(menuAdministrador, true, "Aunmento con exito", "/img/Succes.png");
                        aler.show(); 
                         productoSeleccionadoAun = null;
                         mostrarDatos();
                 }
            }
        }
        //*****************Fin produtoModi****************//       

        ////////////////////////////////////para Empleado////////////////////////////////////
        if (e.getActionCommand().equals("Agregar") && padreActiva.equals("vistaEmpleadoGM")) {
            if ((!vistaEmpleadoGM.tfCodigo.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfNombre.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfApellido.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfTelefono1.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfDireccion.getText().isEmpty())
                    && (vistaEmpleadoGM.tfFecha.getDatoFecha() != null)
                    && (!vistaEmpleadoGM.tfAfp.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfIsss.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfSalario.getText().isEmpty())
                    && vistaEmpleadoGM.tfCombobox.getSelectedIndex() > 0
                    && vistaEmpleadoGM.tfCombobox_1.getSelectedIndex() > 0) {

                empleado = new Empleados(vistaEmpleadoGM.tfCombobox.getSelectedItem().toString(),
                        vistaEmpleadoGM.tfCodigo.getText(),
                        Double.parseDouble(vistaEmpleadoGM.tfSalario.getText()),
                        Double.parseDouble(vistaEmpleadoGM.tfAfp.getText()), Double.parseDouble(vistaEmpleadoGM.tfIsss.getText()),
                        vistaEmpleadoGM.tfFecha.getDatoFecha(), 1, vistaEmpleadoGM.tfNombre.getText(), vistaEmpleadoGM.tfApellido.getText(),
                        vistaEmpleadoGM.tfTelefono1.getText(), vistaEmpleadoGM.tfDireccion.getText());
                empleado.addEmpresa();

                ArrayList<Empleados> existe = daoEmpleado.selectAllTo("codigoEmpleado", vistaEmpleadoGM.tfCodigo.getText());
                if (existe.isEmpty()) {

                    if (daoEmpleado.insert(empleado)) {

                        if (!vistaEmpleadoGM.tfCombobox_1.getSelectedItem().toString().equals("no añadir Bono")) {
                            bono = daoBono.selectAllTo("cargoEmpleado", vistaEmpleadoGM.tfCombobox.getSelectedItem().toString()).get(0);
                            // System.out.println(bono.getCargoEmpleado());
                            if (bono != null) {

                                empleado.addBono(bono);
                                if (daoEmpleado.agregarBono(empleado)) {
                                    System.out.println(bono.getCargoEmpleado());
                                }

                            }
                        }
                        Alerta aler = new Alerta(menuAdministrador, true, "Empleado añadido con exito", "/img/Succes.png");
                        aler.show();
                        this.vistaEmpleadoGM.dispose();
                    } else {
                        Alerta aler = new Alerta(menuAdministrador, true, "Error añadiendo al Empleado vuelva a intentarlo", "/img/error.png");
                        aler.show();
                    }

                } else {
                    Alerta aler = new Alerta(menuAdministrador, true, "Ya Existe un emplado con esos datos", "/img/error.png");
                    aler.show();
                }

            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios ", "/img/error.png");
                aler.show();
            }
            //modificar
        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("empleadoGM") && empleadosSeleccionanda != null) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                llamarVistaConsulta("modificarEmpleado");

            }
        } else if (e.getActionCommand().equals("Agregar") && hijaActiva.equals("vistaEmpleadoGM")) {
            System.out.println("null");
            if ((!vistaEmpleadoGM.tfNombre.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfApellido.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfTelefono1.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfDireccion.getText().isEmpty())
                    && (vistaEmpleadoGM.tfFecha.getDatoFecha() != null)
                    && (!vistaEmpleadoGM.tfAfp.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfIsss.getText().isEmpty())
                    && (!vistaEmpleadoGM.tfSalario.getText().isEmpty())
                    && vistaEmpleadoGM.tfCombobox.getSelectedIndex() > 0
                    && vistaEmpleadoGM.tfCombobox_1.getSelectedIndex() > 0) {

                empleadosSeleccionanda.setNombre(vistaEmpleadoGM.tfNombre.getText());
                empleadosSeleccionanda.setApellido(vistaEmpleadoGM.tfApellido.getText());
                empleadosSeleccionanda.setTelefono(vistaEmpleadoGM.tfTelefono1.getText());
                empleadosSeleccionanda.setDireccion(vistaEmpleadoGM.tfDireccion.getText());
                empleadosSeleccionanda.setFechaContratacion(vistaEmpleadoGM.tfFecha.getDatoFecha());
                empleadosSeleccionanda.setAfp(Double.parseDouble(vistaEmpleadoGM.tfAfp.getText()));
                empleadosSeleccionanda.setIsss(Double.parseDouble(vistaEmpleadoGM.tfIsss.getText()));
                empleadosSeleccionanda.setSalarioEmpleado(Double.parseDouble(vistaEmpleadoGM.tfSalario.getText()));
                empleadosSeleccionanda.setCargoEmpleado(vistaEmpleadoGM.tfCombobox.getSelectedItem().toString());

                if (daoEmpleado.update(empleadosSeleccionanda)) {

                    if (!vistaEmpleadoGM.tfCombobox_1.getSelectedItem().toString().equals("no añadir Bono")) {
                        bono = daoBono.selectAllTo("cargoEmpleado", vistaEmpleadoGM.tfCombobox.getSelectedItem().toString()).get(0);
                        if (bono != null) {
                            empleadosSeleccionanda.addBono(bono);
                            daoEmpleado.agregarBono(empleadosSeleccionanda);

                        }
                    } else {
                        try {
                            Empleados evaluar = daoEmpleado.selectConCondicion("WHERE idEmpleado = " + empleadosSeleccionanda.getIdPersona()
                                    + " AND  idBono IS NOT NULL ").get(0);
                            if (evaluar != null) {

                                daoEmpleado.quitarBono(empleadosSeleccionanda);
                            }
                        } catch (Exception exeption) {
                            System.out.println("vacio");
                        }

                    }

                    Alerta aler = new Alerta(menuAdministrador, true, "Empleado modificado con exito", "/img/Succes.png");
                    empleadosSeleccionanda = null;
                    mostrarDatos();
                    aler.show();
                    this.vistaEmpleadoGM.dispose();
                } else {
                    Alerta aler = new Alerta(menuAdministrador, true, "Error modificado al Empleado vuelva a intentarlo", "/img/error.png");
                    aler.show();
                }
            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios ", "/img/error.png");
                aler.show();
            }

        } else if (e.getActionCommand().equals("Eliminar")
                && padreActiva.equals("empleadoGM") && empleadosSeleccionanda != null) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas dar de baja ?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                if (daoEmpleado.darBaja(empleadosSeleccionanda)) {
                    Alerta aler = new Alerta(menuAdministrador, true, "Empleado dado de baja con exito", "/img/Succes.png");
                    aler.show();
                    empleadosSeleccionanda = null;
                    mostrarDatos();
                } else {
                    Alerta aler = new Alerta(menuAdministrador, true, "Error al dar de baja al Empleado vuelva a intentarlo", "/img/error.png");
                    aler.show();
                }

            }
        }

        ////////////////////////////////////fin  Empleado////////////////////////////////////
        ////////////////////////////////////para bono////////////////////////////////////
        if (e.getActionCommand().equals("Agregar") && padreActiva.equals("vistaBono")) {
            if ((!vistaBono.tfBono.getText().isEmpty()) && vistaBono.tfCombobox.getSelectedIndex() > 0) {

                bono = new Bono(Double.valueOf(vistaBono.tfBono.getText()), vistaBono.tfCombobox.getSelectedItem().toString());

                ArrayList<Bono> existe = daoBono.selectAllTo("cargoEmpleado", vistaBono.tfCombobox.getSelectedItem().toString());
                if (existe.isEmpty()) {
                    if (daoBono.insert(bono)) {
                        Alerta aler = new Alerta(menuAdministrador, true, "Bono añadido con exito", "/img/Succes.png");
                        aler.show();
                        this.vistaBono.dispose();
                    } else {
                        Alerta aler = new Alerta(menuAdministrador, true, "Error añadiendo el bono vuelva a intentarlo", "/img/error.png");
                        aler.show();
                    }

                } else {
                    Alerta aler = new Alerta(menuAdministrador, true, "Ya Existe un bono para este tipo de usuario", "/img/error.png");
                    aler.show();
                }

            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios ", "/img/error.png");
                aler.show();
            }
            //modificar
        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("bonoGM") && bonoSelecionado != null) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                llamarVistaConsulta("modificarBono");
            }
        } else if (e.getActionCommand().equals("Agregar") && hijaActiva.equals("vistaBono")) {
            System.out.println("null");
            if ((!vistaBono.tfBono.getText().isEmpty())) {

                bonoSelecionado.setBono(Double.valueOf(vistaBono.tfBono.getText()));
                bonoSelecionado.setCargoEmpleado(vistaBono.tfCombobox.getSelectedItem().toString());
                if (daoBono.update(bonoSelecionado)) {
                    Alerta aler = new Alerta(menuAdministrador, true, "Bono modificado con exito", "/img/Succes.png");
                    bonoSelecionado = null;
                    mostrarDatos();
                    aler.show();
                    this.vistaBono.dispose();
                } else {
                    Alerta aler = new Alerta(menuAdministrador, true, "Error modificado el bono vuelva a intentarlo", "/img/error.png");
                    aler.show();
                }

            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios ", "/img/error.png");
                aler.show();
            }

        }

        ////////////////////////////////////fin  bono////////////////////////////////////
        ////////////////////////////////////para Usuario////////////////////////////////////
        if (e.getActionCommand().equals("Agregar") && padreActiva.equals("vistaUsuario")) {
            if ((!vistaUsuario.tfUsuario.getText().isEmpty())
                    && (!vistaUsuario.tfContraseña.getText().isEmpty())
                    && vistaUsuario.tfCombobox.getSelectedIndex() > 0) {

                if (vistaUsuario.tfContraseña.getText().length() >= 8) {
                    String clave = Encriptacion.getStringMessageDigest(vistaUsuario.tfContraseña.getText(), Encriptacion.SHA256);
//
                    usuario = new Usuario(vistaUsuario.tfUsuario.getText(), clave);
                    String codigoEmpleado[] = vistaUsuario.tfCombobox.getSelectedItem().toString().split(" / ");

                    System.out.println(codigoEmpleado[1]);

                    ArrayList<Usuario> existe = daoUsuario.selectAllTo("usuario", vistaUsuario.tfUsuario.getText());
                    if (existe.isEmpty()) {
                        //daoEmpleado.agregarUsuario(usuario.getEmpleados()) &&
                        if (daoUsuario.insert(usuario)) {
                            usuario = daoUsuario.selectAllTo("usuario", usuario.getUsuario()).get(0);
                            usuario.AddEpleado(codigoEmpleado[1]);
                            if (daoEmpleado.agregarUsuario(usuario)) {
                                Alerta aler = new Alerta(menuAdministrador, true, "usuario añadido con exito", "/img/Succes.png");
                                aler.show();
                                this.vistaUsuario.dispose();
                            }

                        } else {
                            Alerta aler = new Alerta(menuAdministrador, true, "Error añadiendo al usuario vuelva a intentarlo", "/img/error.png");
                            aler.show();
                        }

                    } else {
                        Alerta aler = new Alerta(menuAdministrador, true, "Ya Existe un usuario con esos datos", "/img/error.png");
                        aler.show();
                    }

                } else {
                    Alerta aler = new Alerta(menuAdministrador, true, "debe ingresar una contraseña de 8 caracteres", "/img/error.png");

                    aler.show();
                }

            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios ", "/img/error.png");
                aler.show();
            }
            //modificar

        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("usuarioGM") && usuarioSeleccionando != null) {
            String claveActual = JOptionPane.showInputDialog("Ingrese La contraseña Actual");
            String clave;
            try {
                clave = Encriptacion.getStringMessageDigest(claveActual, Encriptacion.SHA256);
            } catch (Exception exeption) {
                clave = "";
            }
            if (usuarioSeleccionando.getContraseña().equals(clave) && !claveActual.isEmpty()) {
                String claveNueva = JOptionPane.showInputDialog("Ingrese La contraseña nueva");

                int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opccion == 0 && claveNueva.length() >= 8) {
                    try {
                        clave = Encriptacion.getStringMessageDigest(claveNueva, Encriptacion.SHA256);
                        usuarioSeleccionando.setContraseña(clave);

                        if (daoUsuario.update(usuarioSeleccionando)) {
                            Alerta aler = new Alerta(menuAdministrador, true, "Contraseña modificada con exito", "/img/Succes.png");
                            usuarioSeleccionando = null;
                            mostrarDatos();
                            aler.show();

                        }
                    } catch (Exception exeption) {

                    }

                } else {
                    Alerta aler = new Alerta(menuAdministrador, true, "debe ingresar una contraseña de 8 caracteres", "/img/error.png");

                    aler.show();
                }
            } else {
                Alerta aler = new Alerta(menuAdministrador, true, "Contraseña incorrecta", "/img/error.png");
                usuarioSeleccionando = null;
                mostrarDatos();
                aler.show();
            }
            ////////////////////////////////////fin  Usuario////////////////////////////////////
        }else if (padreActiva.equals("registroVentas") && e.getActionCommand().equals("Detalle")) {
            if(ventaSeleccionada != null){
            llamarVistaConsulta("Detalle");
            }else{
                Alerta aler = new Alerta(menuAdministrador, true, "Seleccione un registro", "/img/error.png");
                 aler.show();
            }
        }

        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (padreActiva == "gastosGM1") {

            ArrayList<Empleados> empleado1 = daoEmpleado.selectAll();
            String vq[] = gastosGM.cbTipo.getSelectedItem().toString().split(" - ");
            for (Empleados x : empleado1) {
                if (vq[0].equals(x.getCodigoEmpleado())) {
                    gastosGM.tfPago1.setText(String.valueOf(x.getSalarioEmpleado()));

                }
            }
        } else if (padreActiva.equals("vistaUsuario") && vistaUsuario.tfCombobox.getSelectedIndex() > 0) {
            String codigoEmpleado[] = vistaUsuario.tfCombobox.getSelectedItem().toString().split(" / ");
            vistaUsuario.tfUsuario.setText(codigoEmpleado[1]);

        } else if ((padreActiva.equals("vistaEmpleadoGM") || hijaActiva.equals("vistaEmpleadoGM")) && vistaEmpleadoGM.tfCombobox.getSelectedIndex() > 0) {
            llenarCombo();
        }
    }

    public void mostrarBusqueda(ArrayList lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        
           
        ////////////******GASTOS Empresa********/////////////////

        if (padreActiva.equals("gastosGM")) {
            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (Object a : lista) {
                GastoEmpresa x = (GastoEmpresa) a;
                if (!(x.getCategoria().equals("Administrador")
                        || (x.getCategoria().equals("Cajero"))
                        || (x.getCategoria().equals("Supervisor")))) {
                    Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpresa().getNombre()};
                    totalR = totalR + x.getSaldo();
                    modelo.addRow(datos);
                }
                

            }

            GastosGM.jtDatos.setModel(modelo);
            GastosGM.lbTotalReporte.setText("$"+String.format("%.2f", totalR));
            
        }

        ////////////******FINAL GASTOS Empresa********/////////////////

        ////////////******GASTOS EMPLEADO********/////////////////
        if (padreActiva.equals("gastosGM1")) {
            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Nombre"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll1();
            for (Object a : lista) {
                GastoEmpresa x = (GastoEmpresa) a;
                if (x.getEmpleado().getEstado() == 1) {

                    if ((x.getCategoria().equals("Administrador")
                        || (x.getCategoria().equals("Cajero"))
                        || (x.getCategoria().equals("Supervisor")))) {
                        Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpleado().getNombre()};
                        totalR = totalR + x.getSaldo();
                        modelo.addRow(datos);
                    }
                  

                }

                GastosGM.jtDatos.setModel(modelo);
                GastosGM.lbTotalReporte.setText("$"+String.format("%.2f", totalR));
            }

        }
       
        ////////////******FINAL GASTOS EMPLEADO********/////////////////

        ////////////******ClienteMA********/////////////////
        if (padreActiva.equals("consultarCliente")) {
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion"};
            modelo.setColumnIdentifiers(titulos);
            this.clienteMA.jtDatos.setModel(modelo);
            ArrayList<Cliente> cliente = daoCliente.selectAll();
            for (Object a : lista) {
                Cliente x = (Cliente) a;
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo.addRow(datos);
            }

            this.clienteMA.jtDatos.setModel(modelo);

        }
        ////////////******FINAL ClienteMA********/////////////////
        // ------------------------------------------------Inicio Empleado------------------------------------------------//
        if (padreActiva.equals("empleadoGM")) {
            String titulos[] = {"N", "codigo", "Nombre", "Apellido", "Telefono", "Direccion", "Salario", "afp", "isss", "Salario Total", "Cargo", "Fecha Contratacion"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Empleados> empleados = daoEmpleado.selectAll();
            int i = 1;
            for (Object obj : lista) {
                Empleados x = (Empleados) obj;
                if (x.getEstado() > 0) {

                    Double salarioNeto = (x.getSalarioEmpleado() - x.getAfp() - x.getIsss());
                    Object datos[] = {i, x.getCodigoEmpleado(), x.getNombre(), x.getApellido(), x.getTelefono(),
                        x.getDireccion(), x.getSalarioEmpleado(), x.getAfp(), x.getIsss(), salarioNeto, x.getCargoEmpleado(), x.getFechaContratacion()};
                    modelo.addRow(datos);
                    i++;

                }
            }
            this.empleadoGM.tbEmpleados.setModel(modelo);
        } //------------------------------------------------fin Empleado------------------------------------------------//
        // ------------------------------------------------Inicio Usuario------------------------------------------------//
        else if (padreActiva.equals("usuarioGM")) {
            String titulos[] = {"N", "usuario", "Nombre Empleado", "cargo"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Usuario> usuarios = daoUsuario.selectAll();
            int i = 1;
            for (Object obj : lista) {
                Usuario x = (Usuario) obj;
                if (!x.getUsuario().isEmpty()) {
                    x.AddEpleado(x.getUsuario());
                    if (x.getEmpleados().getEstado() > 0) {

                        Object datos[] = {i, x.getUsuario(), x.getEmpleados().getNombre(), x.getEmpleados().getCargoEmpleado()};
                        modelo.addRow(datos);
                        i++;

                    }
                }
            }
            this.usuarioGM.tbEmpleados.setModel(modelo);
        } //------------------------------------------------fin Usuario------------------------------------------------//
        //**************ProductoModi**************//
        else if (padreActiva.equals("productoModi")) {
            String titulos[] = {"N", "CodigoProducto", "Nombre Producto", "Cantidad", "Maximo", "Minimo", "Estado", "Precio Compra", "Precio Venta", "Ganancia", "Vence", "Iva", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            int i = 1;
            for (Object x : lista) {
                Producto obj = (Producto) x;
                Object datos[] = {i, obj.getCodigoProducto(), obj.getNombreProducto(), obj.getCantidad(),
                    obj.getMax(), obj.getMin(), obj.getEstado(), obj.getPrecioCompra(), obj.getPrecioVenta(),
                    obj.getGananciaUni(), obj.getFechaVencimiento(), obj.getIva(), obj.getEmpresa()};
                modelo.addRow(datos);
                i++;
            }
            this.productoModi.jtDatos.setModel(modelo);
        }
        //***********Fin ProductoModi**********//
        //**************MostrarVenta**************//
        else if (padreActiva.equals("registroVentas")) {
            String titulos[] = {"N", "Fecha", "Cliente", "Empleado", "Precio Total"};
            modelo.setColumnIdentifiers(titulos);
            float total1 = 0;
            for (Object x : lista) {
                Venta obj = (Venta) x;
                Object datos[] = {obj.getnFactura(), obj.getFechaVenta(), obj.getCliente().getNombre(), obj.getEmpleado().getNombre(), obj.getSaldoTotal()};
                modelo.addRow(datos);
                total1 = (float) (total1 + obj.getSaldoTotal());
            }
            registrosDeVenta.jtDatos.setModel(modelo);
            registrosDeVenta.lbTotal.setText(String.format("%.2f", total1));
        } //***********Fin mostrarVenta**********//
        //        //**************ProductoModi****************//
        else if (padreActiva.equals("registrosDeProductos")) {
            String titulos[] = {"Codigo", "Nombre", "Cantidad", "Precio Unitario", "Iva", "Ganacia", "Precio Compra", "Precio Venta", "fecha de Vencimiento", "Max", "Min", "Empresa", "Total"};
            modelo.setColumnIdentifiers(titulos);

            float precioUni = 0;
            float totalUni = 0;
            float total2 = 0;
            int i = 0;
            for (Object obj : lista) {
                Producto x = (Producto) obj;
                this.registrosDeProductos.jtDatos.editCellAt(3, i);
                precioUni = (float) (x.getPrecioCompra() / x.getCantidad());
                totalUni = (float) (x.getPrecioVenta() * x.getCantidad());
                Object datos[] = {x.getCodigoProducto(), x.getNombreProducto(), x.getCantidad(), precioUni, x.getIva(),
                    x.getGananciaUni(), x.getPrecioCompra(), x.getPrecioVenta(), x.getFechaVencimiento(),
                    x.getMax(), x.getMin(), x.getEmpresa().getNombre(), totalUni};///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                total2 = total2 + totalUni;
                modelo.addRow(datos);
                i++;

            }
            this.registrosDeProductos.jtDatos.setModel(modelo);
            this.registrosDeProductos.lbTotal.setText("$" + String.format("%.2f", total2));
            //************Fin productoModi*************//
        } 
        

    }
public void filtrarReporte(ArrayList lista){
    DefaultTableModel modelo1 = new DefaultTableModel();
     if (padreActiva.equals("gastosGM")) {  
 
        String titulos1[] = {"Cant...", "Categoria", "Total"};
            modelo1.setColumnIdentifiers(titulos1);
            Gastosdao gastoDao= new Gastosdao();
        for(Object a : lista ){
            GastoEmpresa x= (GastoEmpresa) a;
            if (!(x.getCategoria().equals("Administrador")
                        || (x.getCategoria().equals("Cajero"))
                        || (x.getCategoria().equals("Supervisor")))) {
            ArrayList<GastoEmpresa> totales = gastoDao.selectAllTo("tipo",x.getCategoria());
                double totalRegistro = 0;
                int j = 0;
                for(GastoEmpresa i: totales){
                    totalRegistro = totalRegistro + i.getSaldo();
                    j++;
                }
                Object datos1[] = {j,x.getCategoria(), totalRegistro};
                
                modelo1.addRow(datos1);
            }
        }
            
                GastosGM.jtDatosReporte.setModel(modelo1);
        }else  if (padreActiva.equals("gastosGM1")) {  
 
        String titulos1[] = {"Cant...", "Categoria", "Total"};
            modelo1.setColumnIdentifiers(titulos1);
            Gastosdao gastoDao= new Gastosdao();
        for(Object a : lista ){
            GastoEmpresa x= (GastoEmpresa) a;
            if ((x.getCategoria().equals("Administrador")
                        || (x.getCategoria().equals("Cajero"))
                        || (x.getCategoria().equals("Supervisor")))) {
            ArrayList<GastoEmpresa> totales = gastoDao.selectAllTo("tipo",x.getCategoria());
                double totalRegistro = 0;
                int j = 0;
                for(GastoEmpresa i: totales){
                    totalRegistro = totalRegistro + i.getSaldo();
                    j++;
                }
                Object datos1[] = {j,x.getCategoria(), totalRegistro};
                
                modelo1.addRow(datos1);
            }
        }
            
                GastosGM.jtDatosReporte.setModel(modelo1);
        }
}
    @Override
    public void mouseClicked(MouseEvent me) {
        /* Gastos */
        if (padreActiva.equals("gastosGM")) {
            int fila = GastosGM.jtDatos.getSelectedRow();
            String id = GastosGM.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<GastoEmpresa> lista = daoGasto.selectAllTo("codigoGasto", id);
            gastoSeleccionado = lista.get(0);
            String codigo = GastosGM.jtDatos.getValueAt(fila, 0).toString();
            String pago = GastosGM.jtDatos.getValueAt(fila, 3).toString();
            GastosGM.tfCodigo.setText(codigo);
            GastosGM.tfPago1.setText(pago);
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (GastoEmpresa x : gastos) {
                if (x.getCodigoGastos().equals(codigo)) {
                    gastosGM.dFecha.setDatoFecha(x.getFecha());
                    gastosGM.cbTipo.setSelectedItem(x.getCategoria());
                }
            }
        } else if (padreActiva.equals("gastosGM1")) {
            int fila = GastosGM.jtDatos.getSelectedRow();
            String id = GastosGM.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<GastoEmpresa> lista = daoGasto.selectAllTo("codigoGasto", id);
            gastoSeleccionado = lista.get(0);

        } else if (padreActiva.equals("consultarCliente")) {
            int fila = ClienteMA.jtDatos.getSelectedRow();
            String id = ClienteMA.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<Cliente> lista = daoCliente.selectAllTo("codigoCliente", id);
            clienteSeleccionado = lista.get(0);
            ArrayList<Cliente> cliente = daoCliente.selectAll();
            for (Cliente x : cliente) {
                if (x.getCodigo().equals(id)) {
                    ClienteMA.tfNombre.setText(x.getNombre());
                    ClienteMA.tfApellido.setText(x.getApellido());
                    ClienteMA.tfTelefono.setText(x.getTelefono());
                    ClienteMA.tfDireccion.setText(x.getDireccion());
                }
            }
        } //para empleado
        else if (padreActiva.equals("empleadoGM")) {
            int fila = empleadoGM.tbEmpleados.getSelectedRow();
            String id = empleadoGM.tbEmpleados.getValueAt(fila, 1).toString();
            System.out.println(id);
            ArrayList<Empleados> lista = daoEmpleado.selectAllTo("codigoEmpleado", id);
            empleadosSeleccionanda = lista.get(0);
            if (empleadosSeleccionanda != null) {
                empleadoGM.setEstado(true);
            }
        } //fin empleado
        //inicio Usuario
        else if (padreActiva.equals("usuarioGM")) {
            int fila = usuarioGM.tbEmpleados.getSelectedRow();
            String id = usuarioGM.tbEmpleados.getValueAt(fila, 1).toString();
            System.out.println(id);
            ArrayList<Usuario> lista = daoUsuario.selectAllTo("usuario", id);
            usuarioSeleccionando = lista.get(0);
            System.out.println(usuarioSeleccionando.getUsuario());
            if (usuarioSeleccionando != null) {
                usuarioGM.setEstado(true);
            }
        } //inicio bono
        else if (padreActiva.equals("bonoGM")) {
            int fila = bonoGM.tbBono.getSelectedRow();
            String id = bonoGM.tbBono.getValueAt(fila, 2).toString();
            System.out.println(id);
            ArrayList<Bono> lista = daoBono.selectAllTo("cargoEmpleado", id);
            bonoSelecionado = lista.get(0);
            //System.out.println(usuarioSeleccionando.getUsuario());
            if (bonoSelecionado != null) {
                bonoGM.setEstado(true);
            }
        }
        
        else if (padreActiva.equals("productoModi")) {
            int fila = productoModi.jtDatos.getSelectedRow();
            String id = productoModi.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<Producto> lista = daoProducto.selectAllTo("codigoProducto", id);
            productoSeleccionado = lista.get(0);
            String codigo = productoModi.jtDatos.getValueAt(fila, 0).toString();
            String nombre = productoModi.jtDatos.getValueAt(fila, 1).toString();
            String precioCompra = productoModi.jtDatos.getValueAt(fila, 5).toString();
            String cantidad = productoModi.jtDatos.getValueAt(fila, 2).toString();
            String maximo = productoModi.jtDatos.getValueAt(fila, 3).toString();
            String minimo = productoModi.jtDatos.getValueAt(fila, 4).toString();
            String precioVenta = productoModi.jtDatos.getValueAt(fila, 7).toString();
            productoModi.tfCodigo.setText(codigo);
            productoModi.tfNombre.setText(nombre);
            productoModi.tfPrecioCompra.setText(precioCompra);
            productoModi.tfCantidad.setText(cantidad);
            productoModi.tfMaximo.setText(maximo);
            productoModi.tfMinimo.setText(minimo);
            productoModi.tfPrecioVenta.setText(precioVenta);
            ArrayList<Producto> producto = daoProducto.selectAll();
            for (Producto x : producto) {
                if (x.getCodigoProducto().equals(codigo)) {
                    productoModi.dVence.setDatoFecha(x.getFechaVencimiento());
                }
            }

        }
        
        
        else if (padreActiva.equals("registroVentas")) {
            int fila = registrosDeVenta.jtDatos.getSelectedRow();
            String id = registrosDeVenta.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<Venta> lista = daoVenta.selectAllTo("nFactura", id);
            ventaSeleccionada = lista.get(0);
            
        }else if (padreActiva.equals("registrosDeProductos")) {
            int fila = this.registrosDeProductos.jtDatos.getSelectedRow();
            String id = registrosDeProductos.jtDatos.getValueAt(fila, 0).toString();
            ArrayList<Producto> lista = daoProducto.selectAllTo("codigoProducto", id);
            productoSeleccionadoAun = lista.get(0);
            
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    public void vaciarVista() {
        if (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1")) {
            this.gastosGM.tfCodigo.setText("");
            this.gastosGM.tfPago1.setText("");
            this.gastosGM.dFecha.setDatoFecha(new Date());
            this.gastosGM.cbTipo.setSelectedIndex(0);

        } else if (padreActiva.equals("consultarCliente")) {
            this.clienteMA.tfNombre.setText("");
            this.clienteMA.tfApellido.setText("");
            this.clienteMA.tfTelefono.setText("");
            this.clienteMA.tfDireccion.setText("");

        }else if (padreActiva.equals("productoModi")) {
            this.productoModi.tfCodigo.setText("");
            this.productoModi.tfNombre.setText("");
            this.productoModi.tfCantidad.setText("");
            this.productoModi.tfMinimo.setText("");
            this.productoModi.tfMaximo.setText("");
            this.productoModi.tfPrecioCompra.setText("");
            this.productoModi.tfPrecioVenta.setText("");
            this.productoModi.dVence.setDatoFecha(new Date());
            
        }

    }

    @Override
    public void focusGained(FocusEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    private void printf(double bono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void llenarGrafica(){
        this.vistaGrafica.lbtitulo.setText("Gafico de ventas");
        JFreeChart barChart = ChartFactory.createBarChart("ventas durante el año ",           
         "meses",            
         "total $",            
         createDataset(),          
         PlotOrientation.VERTICAL,true, true, false);
        
        ChartPanel chartPanel = new ChartPanel( barChart );   
        this.vistaGrafica.contenedor.add(chartPanel);
        
      // this.vistaGrafica.setContentPane(chartPanel ); 

       
    }
    private CategoryDataset createDataset( ) {
        //variables a usar
        int mes = 0,  auxMes = 0,contadorMes = 0;
        int bandera = 0,i = 0;
        double auxiliar = 0;
        ArrayList<Double> ventasTotales = new ArrayList();
        ArrayList<InicioCaja> inicioCajasAnnio = new ArrayList();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        //para seleccionar el año actual
        calendar.setTime(date);
        String dateYear = String.valueOf(calendar.get(Calendar.YEAR));
        System.out.println(dateYear);
        inicioCajasAnnio = daoCaja.selectAllWithCondition( "fechaCierre LIKE '"+ dateYear+"%'  ORDER BY fechaCierre ASC");
        
        //ciclo que sirve para generar los datos a graficar, seleccionando y sumando las ventas por mes
        for(InicioCaja x : inicioCajasAnnio){
            
            //para seleccionar el mes de cada objeto inicioCaja
            calendar.setTime(x.getFechaCierre());
            mes = calendar.get(calendar.MONTH);
            
            
            if (auxMes == mes) { //proceso de suma en el mes

                 auxiliar+= (x.getDineroCierre()-x.getDineroInicio());
                 bandera ++;
                 
            }else if ( bandera > 1) { //proceso para iniciar el nuevo mes 
                bandera = 1;
                ventasTotales.add(auxiliar);
                auxMes = mes;
                auxiliar = x.getDineroCierre()-x.getDineroInicio();
               
            }else if (bandera == 1) {//proseso si en el mes existe unicamente una venta
               
                ventasTotales.add(auxiliar);
                System.out.println(ventasTotales);
                
                auxMes = mes;
                auxiliar = x.getDineroCierre()-x.getDineroInicio();
            }
            if (bandera == 0){//proceso para iniciar el 1er mes que se encuentra en el arraylist
                
                contadorMes = mes;
                auxMes = mes;
                bandera = 1;
                auxiliar = x.getDineroCierre()-x.getDineroInicio();
                
                
                
            }
           
        }
        ventasTotales.add(auxiliar);
        i = contadorMes;
         
         Locale locale = new Locale("es", "ES");
         DefaultCategoryDataset dataset =  new DefaultCategoryDataset( );  
          
          
         
        for(Double x : ventasTotales){
            System.out.println(x + "'");
            //contadorMes+= ventasTotales.size();
            calendar.set(Calendar.MONTH, i);
            i ++;
            String monthName=calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, locale);
            System.out.println(monthName);
            dataset.addValue(x, "$ "+x.toString(), monthName);
            
        }
      
      return dataset; 
    }
    
}

