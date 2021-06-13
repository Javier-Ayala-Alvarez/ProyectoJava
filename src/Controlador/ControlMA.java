package Controlador;

import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.Encriptacion;
import Modelo.GastoEmpresa;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.Registro;
import Modelo.Venta;
import Modelo.dao.ClienteDao;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.EmpresaDao;
import Modelo.dao.Gastosdao;
import Modelo.dao.ProductoDao;
import Modelo.dao.UsuarioDao;

import Modelo.dao.VentaDao;
import VistaLogin.Alerta;
import VistaLogin.Login;
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
import VistaMV.Factura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlMA extends MouseAdapter implements ActionListener, KeyListener, ItemListener {
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
    ProductoModi productoSeleccionado = null;
    //    ProductoModi producto = new ProductoModi();
    //****Fin productoModi****//
    RegistrosDeProductos registrosDeProductos;
    RegistrosDeVentas registrosDeVentas;
  

    private String padreActiva = "", hijaActiva = "";

   
    ///******Consulta Factura******////
    ConsultarVentas consultarVentas;
    
    Registro registro;
    ///******Fin Consulta Factura******////
    //******Ventas**************//
    RegistrosDeVentas registrosDeVenta;
    VentaDao daoVenta = new VentaDao();
    Venta venta;
    //******Fin Venta***********//



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
        } else if (e.getActionCommand().equals("ConsultarFactura")) {
            llamarVistaConsulta("ConsultarFactura");
        }else if (e.getActionCommand().equals("guardarProducto")) {
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
        }else if (e.getActionCommand().equals("guardarUsuario")) {
            llamarVistaConsulta("guardarUsuario");
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
                || (e.getActionCommand().equals("Generar"))) {
            accionDeBotones(e);
        }
        /*Fin de Sub-botones de los Menús*/

    }

    public void llamarAcciones(String nombreAccion) {
        //para boton modificar en vistaEmpresa
        if (nombreAccion.equals("editarEmpresa")) {
            if ((!vistaEmpresa.tfNombre.getText().isEmpty())
                    && (!vistaEmpresa.tfDireccion.getText().isEmpty())
                    && (!vistaEmpresa.tfCorreo.getText().isEmpty())) {

                empresaSeleccionanda.setNombre(vistaEmpresa.tfNombre.getText());
                empresaSeleccionanda.setCorreo(vistaEmpresa.tfCorreo.getText());
                empresaSeleccionanda.setCodigoEmpresa(vistaEmpresa.tfCodigoEmpresa.getText());
                empresaSeleccionanda.setDireccion(vistaEmpresa.tfDireccion.getText());
                System.out.println(empresaSeleccionanda.getIdEmpresa() + empresaSeleccionanda.getNombre());

                //= new Empresa(vistaEmpresa.tfNombre.getText(), vistaEmpresa.tfDireccion.getText(), 
                //vistaEmpresa.tfCorreo.getText(),vistaEmpresa.tfCodigoEmpresa.getText());
                if (daoEmpresa.update(empresaSeleccionanda)) {
                    System.out.println(empresaSeleccionanda.getIdEmpresa() + empresaSeleccionanda.getNombre());
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

        }else if (padreActiva.equals("consultarCliente")) {
            ArrayList<Cliente> lista = daoCliente.buscar(ClienteMA.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        }else if (padreActiva.equals("registroVentas")) {
            ArrayList<Venta> lista = daoVenta.buscar(RegistrosDeVentas.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //para empleado
        if (padreActiva.equals("vistaEmpleadoGM") || hijaActiva.equals("vistaEmpleadoGM")) {
            double Salario = Double.valueOf(vistaEmpleadoGM.tfSalario.getText()), aux;
            // System.out.println("aaa");
            if (Salario > 0) {
                //System.out.println("qq");
                aux = (Salario * AFP) / 100;
                vistaEmpleadoGM.tfAfp.setText(Double.toString(aux));
                aux = (Salario * ISSS) / 100;
                vistaEmpleadoGM.tfIsss.setText(Double.toString(aux));
            }
        }
        if (padreActiva.equals("empleadoGM")) {
            ArrayList<Empleados> lista = daoEmpleado.buscar(empleadoGM.buscar.getText());
            if (lista.isEmpty()) {
                System.out.println("busca");
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);
                System.out.println("NObusca");

            }
        }
        if (padreActiva.equals("usuarioGM")) {
            ArrayList<Usuario> lista = daoUsuario.buscar(usuarioGM.buscar.getText());
            if (lista.isEmpty()) {
                System.out.println("busca");
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);
                System.out.println("NObusca");

            }
        }
        //fin empleado
    }

    public void llamarVistaConsulta(String vista) {
        /*Esta función realiza la acción al presionar un determinado botón
        con su respectivo ActionCommand proveniente de la función ActionPerformed*/

 /*Ejecuciones de los Botones Derechos*/
        if (vista.equals("menuAdministrador")) {
            menuAdministrador.setControladorMA(this);
            mostrarDatos();
            menuAdministrador.iniciar();
        } else if (vista.equals("home")) {
            JOptionPane.showMessageDialog(null, "No hay nada Home");
        } else if (vista.equals("ventas")) {
            JOptionPane.showMessageDialog(null, "NO HAY NADA VENTAS");
        } else if (vista.equals("gastos")) {
            JOptionPane.showMessageDialog(null, "NO HAY GASTOS");
        } else if (vista.equals("empleado")) {
            JOptionPane.showMessageDialog(null, "NO HAY NADA EMPLEADO");
        } else if (vista.equals("cliente")) {
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTE");
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
            padreActiva ="registroVentas";
            this.registrosDeVenta = new RegistrosDeVentas(menuAdministrador, true);
            this.registrosDeVenta.setControlador(this);
            mostrarDatos();
            registrosDeVenta.iniciar();
        } else if (vista.equals("ConsultarFactura")) {
            this.consultarVentas = new ConsultarVentas(menuAdministrador, true);
            padreActiva ="ConsultarFactura";
            this.consultarVentas.setControlador(this);
            mostrarDatos();
            consultarVentas.iniciar();
            
        } else if (vista.equals("guardarProducto")) {
            padreActiva = "productoModi1";
            this.productoModi = new ProductoModi(menuAdministrador, true);
            this.productoModi.setControlador(this);
            mostrarDatos();
            this.productoModi.iniciar();
        } else if (vista.equals("consultarProducto")) {
            this.registrosDeProductos = new RegistrosDeProductos(menuAdministrador, true);
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
            gastosGM.cbTipo.addItem("Impuesto de Alcaldia");
            gastosGM.cbTipo.addItem("Pago de Energia");
            gastosGM.cbTipo.addItem("Pago de Alquiler");
            gastosGM.cbTipo.addItem("Pago de Agua");
            mostrarDatos();
            this.gastosGM.iniciar();
        } else if (vista.equals("gastosGM1")) {
            this.gastosGM = new GastosGM(menuAdministrador, true);
            this.gastosGM.setControlador(this);
            gastosGM.tfPago1.setEditable(false);
            gastosGM.btnModificar.setVisible(false);
            gastosGM.cbTipo.removeAllItems();
            gastosGM.cbTipo.addItem("Seleccione");
            padreActiva = "gastosGM1";
            llenarCombo();
            
            mostrarDatos();
            this.gastosGM.iniciar();

        } /////////////////////////////////
        else if (vista.equals("modificarEmpresa")) {
            this.vistaEmpresa = new VistaEmpresa(menuAdministrador, true, true);
            empresaSeleccionanda = daoEmpresa.selectAll().get(0);
            this.vistaEmpresa.setControladorMA(this);
            this.vistaEmpresa.tfCodigoEmpresa.setText(empresaSeleccionanda.getCodigoEmpresa());
            this.vistaEmpresa.tfNombre.setText(empresaSeleccionanda.getNombre());
            this.vistaEmpresa.tfDireccion.setText(empresaSeleccionanda.getDireccion());
            this.vistaEmpresa.tfCorreo.setText(empresaSeleccionanda.getCorreo());
            mostrarDatos();
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
    public void llenarCombo(){
         if(padreActiva.equals("vistaUsuario")){
            vistaUsuario.tfCombobox.removeAllItems();
            vistaUsuario.tfCombobox.addItem("Seleccione");
            String dato = "";
            
                
                ArrayList<Empleados> lista = daoEmpleado.selectConCondicion(" WHERE cargoEmpleado = 'Administrador' OR "
                        + " cargoEmpleado = 'Supervisor' OR  cargoEmpleado = ' Cajero' ");
               int i = 0;
               
                for(Empleados x: lista){
                    System.out.println(x.getUsuario().getIdUsuario());
                    if (padreActiva.equals("vistaUsuario")&& x.getEstado() > 0 &&  x.getUsuario().getIdUsuario() == 0) {
                        //para llenar empleados que no tienen ningun usuario
                        i++;
                         vistaUsuario.tfCombobox.addItem(String.valueOf(i)+" / " + x.getCodigoEmpleado()+" / "
                                 + x.getNombre()+" "+ x.getApellido()+" / "+x.getCargoEmpleado());
                         
                    }
                    
                }
                
         }else if(padreActiva.equals("gastosGM1")){
         
         ArrayList<Empleados> empleado = daoEmpleado.selectAll();
        for (Empleados x : empleado) {
            if(x.getEstado() == 1){
            String selec = x.getCodigoEmpleado() + " - " + x.getNombre() + " - " + x.getApellido();

            gastosGM.cbTipo.addItem(selec);
            }
        }
         }
    }

    public void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = new DefaultTableModel();
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
        this.menuAdministrador.tfClienteT.setText(String.format("%.2f", total));
        ////////////******FIN DE TOTAL CLIENTE********/////////////////
        ////////////******GASTOS EMPLEADO********/////////////////

        if (padreActiva.equals("gastosGM1")) {

            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Nombre"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            int alcaldiaC = 0;
            int energiaC = 0;
            int alquilerC = 0;
            int aguaC = 0;
            int salarioC = 0;
            double salarioT = 0;
            double alcaldiaT = 0;
            double energiaT = 0;
            double alquilerT = 0;
            double aguaT = 0;

            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll1();
            for (GastoEmpresa x : gastos) {

                if (!(x.getCategoria().equals("Impuesto de Alcaldia")
                        || (x.getCategoria().equals("Pago de Energia"))
                        || (x.getCategoria().equals("Pago de Alquiler"))
                        || (x.getCategoria().equals("Pago de Agua")))) {

                    Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpleado().getNombre()};

                    modelo.addRow(datos);
                }
                totalR = totalR + x.getSaldo();
                if (x.getCategoria().equals("Impuesto de Alcaldia")) {
                    alcaldiaC++;
                    alcaldiaT = alcaldiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Energia")) {
                    energiaC++;
                    energiaT = energiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Alquiler")) {
                    alquilerC++;
                    alquilerT = alquilerT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Agua")) {
                    aguaC++;
                    aguaT = aguaT + x.getSaldo();
                } else {
                    salarioC++;
                    salarioT = salarioT + x.getSaldo();
                }


            GastosGM.jtDatos.setModel(modelo);
            this.gastosGM.lbAlcaldiaTotal.setText("$" + String.format("%.2f", alcaldiaT));
            this.gastosGM.lbAlcaldiaC.setText(String.valueOf(alcaldiaC));

            this.gastosGM.lbEnergiaTotal.setText("$" + String.format("%.2f", energiaT));
            this.gastosGM.lbEnergiaC.setText(String.valueOf(energiaC));

            this.gastosGM.lbAlquilerTotal.setText("$" + String.format("%.2f", alquilerT));
            this.gastosGM.lbAlquilerC.setText(String.valueOf(alquilerC));

            this.gastosGM.lbAguaTotal.setText("$" + String.format("%.2f", aguaT));
            this.gastosGM.lbAguaC.setText(String.valueOf(aguaC));

            this.gastosGM.lbSalarioT.setText("$" + String.format("%.2f", salarioT));
            this.gastosGM.lbSalarioC.setText(String.valueOf(salarioC));

            this.gastosGM.lbTotalReporte.setText("$" + String.format("%.2f", totalR));
            }
        }
        ////////////******FINAL GASTOS EMPLEADO********/////////////////
        ////////////******GASTOS EMPRESA********/////////////////

        if (padreActiva.equals("gastosGM")) {

            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            int alcaldiaC = 0;
            int energiaC = 0;
            int alquilerC = 0;
            int aguaC = 0;
            int salarioC = 0;
            double salarioT = 0;
            double alcaldiaT = 0;
            double energiaT = 0;
            double alquilerT = 0;
            double aguaT = 0;

            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (GastoEmpresa x : gastos) {
                if ((x.getCategoria().equals("Impuesto de Alcaldia")
                        || (x.getCategoria().equals("Pago de Energia"))
                        || (x.getCategoria().equals("Pago de Alquiler"))
                        || (x.getCategoria().equals("Pago de Agua")))) {

                    Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpresa().getNombre()};

                    modelo.addRow(datos);
                }
                totalR = totalR + x.getSaldo();
                if (x.getCategoria().equals("Impuesto de Alcaldia")) {
                    alcaldiaC++;
                    alcaldiaT = alcaldiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Energia")) {
                    energiaC++;
                    energiaT = energiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Alquiler")) {
                    alquilerC++;
                    alquilerT = alquilerT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Agua")) {
                    aguaC++;
                    aguaT = aguaT + x.getSaldo();
                } else {
                    salarioC++;
                    salarioT = salarioT + x.getSaldo();
                }

            }
            GastosGM.jtDatos.setModel(modelo);
            this.gastosGM.lbAlcaldiaTotal.setText("$" + String.format("%.2f", alcaldiaT));
            this.gastosGM.lbAlcaldiaC.setText(String.valueOf(alcaldiaC));

            this.gastosGM.lbEnergiaTotal.setText("$" + String.format("%.2f", energiaT));
            this.gastosGM.lbEnergiaC.setText(String.valueOf(energiaC));

            this.gastosGM.lbAlquilerTotal.setText("$" + String.format("%.2f", alquilerT));
            this.gastosGM.lbAlquilerC.setText(String.valueOf(alquilerC));

            this.gastosGM.lbAguaTotal.setText("$" + String.format("%.2f", aguaT));
            this.gastosGM.lbAguaC.setText(String.valueOf(aguaC));

            this.gastosGM.lbSalarioT.setText("$" + String.format("%.2f", salarioT));
            this.gastosGM.lbSalarioC.setText(String.valueOf(salarioC));

            this.gastosGM.lbTotalReporte.setText("$" + String.format("%.2f", totalR));

        } ////////////******FINAL EMPRESA********/////////////////
        ////////////******ClienteMA********/////////////////
        else if (padreActiva.equals("consultarCliente")) {
            double totalV = 0;
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion", "Total De Compra"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Cliente> cliente2 = daoCliente.selectAll();
            for (Cliente x : cliente2) {
                Object datos[] = {x.getCodigo(), x.getNombre(), x.getApellido(), x.getTelefono(), x.getDireccion()};
                modelo.addRow(datos);

            }
            this.clienteMA.jtDatos.setModel(modelo);

        }
        ////////////******FINAL ClienteMA********/////////////////

        //**************ProductoModi****************//
        if (padreActiva.equals("productoModi")) {
            String titulos[] = {"N", "Nombre", "Cantidad", "Precio", "Max", "Min"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Producto> producto = daoProducto.selectAll();
            int i = 1;
            for (Producto x : producto) {
                Object datos[] = {i, x.getNombreProducto(), x.getCantidad(), x.getPrecioCompra(), x.getMax(), x.getMin()};
                modelo.addRow(datos);
                i++;
            }
            this.productoModi.jtDatos.setModel(modelo);
        }
        //************Fin productoModi*************//

        // ------------------------------------------------Inicio Empleado------------------------------------------------//
        if (padreActiva.equals("empleadoGM")) {
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
        }
        //------------------------------------------------fin Empleado------------------------------------------------//
        
        
        // ------------------------------------------------Inicio Usuario------------------------------------------------//
        if (padreActiva.equals("usuarioGM")) {
            String titulos[] = {"N", "usuario","Nombre Empleado","cargo"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Usuario> usuarios = daoUsuario.selectAll();
            int i = 1;
            for (Usuario x : usuarios) {
                if (!x.getUsuario().isEmpty()) {
                    x.AddEpleado(x.getUsuario());
                if (x.getEmpleados().getEstado()> 0) {

                    
                    Object datos[] = {i, x.getUsuario(),x.getEmpleados().getNombre(),x.getEmpleados().getCargoEmpleado()};
                    modelo.addRow(datos);
                    i++;

                }
                }
            }
            this.usuarioGM.tbEmpleados.setModel(modelo);
        }
        //------------------------------------------------fin Usuario------------------------------------------------//
        
         //**************registroVentas****************//
        if (padreActiva.equals("registroVentas")) {
            String titulos[] = {"N", "Fecha", "Cliente","Empleado", "Precio Total"};
            modelo.setColumnIdentifiers(titulos);
            ArrayList<Venta> venta = daoVenta.selectAll();
            float total1 = 0;
            for (Venta x : venta) {
                
                Object datos[] = {x.getnFactura(),x.getFechaVenta(),x.getCliente().getNombre(),x.getEmpleado().getNombre(),x.getSaldoTotal()};
                modelo.addRow(datos);
                total1 = (float) (total1 + x.getSaldoTotal());
            }
            registrosDeVenta.jtDatos.setModel(modelo);
            registrosDeVenta.lbTotal.setText(String.format("%.2f", total1));
        }
        //************Fin registroVentas*************//
    }

    public String crearCodigo(String a, String activa) {
        ////////////******GASTOS********///////////////////////
        
        String correlativo = a;
        int corre = 0;
        if (activa.equals("GastosGM")) {
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (GastoEmpresa x : gastos) {
                corre = x.getIdGasto();

            }
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

                        Alerta aler = new Alerta(menuAdministrador, true,"Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                mostrarDatos();
            } else {

                Alerta aler = new Alerta(menuAdministrador, true,"Campos vacios", "/img/error.png");
                aler.show();

            }

        } else if (e.getActionCommand().equals("Agregar") && padreActiva.equals("gastosGM1")) {
            if (!gastosGM.tfCodigo.getText().isEmpty()) {
                int idEmpleado = 0;
                float salario = 0;
                float pago = 0;
                double afpE = 0;
                double isssE = 0;
                String categoria = "";
                ArrayList<Empleados> empleado = daoEmpleado.selectAll();
                ArrayList<Empresa> empresa = daoEmpresa.selectAllTo("idEmpresa", "1");
                String vq[] = gastosGM.cbTipo.getSelectedItem().toString().split(" - ");

                for (Empleados x : empleado) {
                    if (vq[0].equals(x.getCodigoEmpleado())) {
                        idEmpleado = x.getIdPersona();
                        salario = (float) x.getSalarioEmpleado();
                        categoria = x.getCargoEmpleado();
                        gastosGM.tfPago1.setText(String.valueOf(x.getSalarioEmpleado()));
                        afpE = x.getAfp();
                        isssE = x.getIsss();

                    }

                }
                ArrayList<Empleados> empleado1 = daoEmpleado.selectAllTo("idEmpleado", String.valueOf(idEmpleado));
                String v = gastosGM.cbTipo.getSelectedItem().toString();
                if (gastoSeleccionado == null) {
                    double ISSS = 0.0775;
                    double AFP = 0.0775;
                    pago = (float) (salario - (salario*afpE)-(salario*isssE));
                    salario = (float) ((salario + (salario * ISSS)) + (salario * AFP));
                    
                    GastoEmpresa gasto = new GastoEmpresa(gastosGM.tfCodigo.getText(), gastosGM.dFecha.getDatoFecha(), categoria, salario, empresa.get(0), empleado1.get(0));
                    ArrayList<GastoEmpresa> existe = daoGasto.selectAllTo("codigoGasto", gastosGM.tfCodigo.getText());
                    if (existe.isEmpty()) {
                        if (daoGasto.insert1(gasto)) {
                            vaciarVista();
                            Alerta aler = new Alerta(menuAdministrador, true,"Pago a retirar $"+pago+" ", "/img/Succes.png");
                            aler.show();

                        }
                    } else {
                        Alerta aler = new Alerta(menuAdministrador, true,"Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                mostrarDatos();
            } else {
                Alerta aler = new Alerta(menuAdministrador, true,"Campos vacios", "/img/error.png");
                aler.show();
            }

        } else if (e.getActionCommand().equals("Generar") && (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1"))) {
            String iniciales = "EG-";

            this.gastosGM.tfCodigo.setText(crearCodigo(iniciales,padreActiva));

        } else if (e.getActionCommand().equals("Eliminar")
                && (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1"))) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Eliminar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                if (gastoSeleccionado != null) {
                    if (daoGasto.delete(gastoSeleccionado)) {
                        vaciarVista();
                        Alerta aler = new Alerta(menuAdministrador, true,"Eliminado con exito", "/img/Succes.png");
                        aler.show();

                        mostrarDatos();
                        gastoSeleccionado = null;
                    } else {

                        Alerta aler = new Alerta(menuAdministrador, true,"Error al eliminado con exito", "/img/error.png");
                        aler.show();
                    }
                }
            }

        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("gastosGM")) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                gastoSeleccionado.setCodigoGastos(gastosGM.tfCodigo.getText());
                gastoSeleccionado.setFecha(gastosGM.dFecha.getDatoFecha());
                gastoSeleccionado.setCategoria((String) gastosGM.cbTipo.getSelectedItem());
                gastoSeleccionado.setSaldo(Double.parseDouble(gastosGM.tfPago1.getText()));
                gastoSeleccionado.getEmpresa().getIdEmpresa();
                daoGasto.update(gastoSeleccionado);
                vaciarVista();
                Alerta aler = new Alerta(menuAdministrador, true,"Modificado con exito", "/img/Succes.png");
                aler.show();
            }
        } else if (e.getActionCommand().equals("Modificar")
                && padreActiva.equals("consultarCliente") ) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                clienteSeleccionado.getCodigo();
                clienteSeleccionado.setNombre(ClienteMA.tfNombre.getText());
                clienteSeleccionado.setApellido(ClienteMA.tfApellido.getText());
                clienteSeleccionado.setTelefono(ClienteMA.tfTelefono.getText());
                clienteSeleccionado.setDireccion(ClienteMA.tfDireccion.getText());
                daoCliente.update(clienteSeleccionado);
                vaciarVista();
                Alerta aler = new Alerta(menuAdministrador, true,"Modificado con exito", "/img/bueno.png");
                aler.show();
            }
        }
        mostrarDatos();
        gastoSeleccionado = null;

        //**********ProductoModi************//
        if (e.getActionCommand().equals("Agregar") && padreActiva.equals("productoModi")) {
            if (!productoModi.tfCodigo.getText().isEmpty()
                    && (!productoModi.tfBuscar.getText().isEmpty())) {
                if (productoSeleccionado == null) {
                    Producto produ = new Producto(productoModi.tfCodigo.getText(), productoModi.tfNombre.getText(), (productoModi.tfBuscar.getText()));
                    ArrayList<Producto> existe = daoProducto.selectAllTo("codigoProducto", productoModi.tfCodigo.getText());
                    if (existe.isEmpty()) {
                        if (daoProducto.insert(produ)) {
                            vaciarVista();
                            Alerta aler = new Alerta(menuAdministrador, true,"Guardado con exito", "/img/Succes.png");
                            aler.show();
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Campos vacios");
            }

        } else if (e.getActionCommand().equals("Generar") && padreActiva.equals("productoModi")) {
            String code = "PR-";
            //crearCodigo(code);

        } else if (e.getActionCommand().equals("Modificar") && padreActiva.equals("productoModi")) {
            int opccion = JOptionPane.showConfirmDialog(null, "Quieres Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
        vaciarVista();
        //                            daoProducto.update(productoSeleccionado);
                Alerta aler = new Alerta(menuAdministrador, true,"Modificado con exito", "/img/Succes.png");
                aler.show();
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
                    && vistaEmpleadoGM.tfCombobox.getSelectedIndex() > 0) {

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
                    && vistaEmpleadoGM.tfCombobox.getSelectedIndex() > 0) {

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
        
        
           ////////////////////////////////////para Usuario////////////////////////////////////
        if (e.getActionCommand().equals("Agregar")  && padreActiva.equals("vistaUsuario")) {
            if ((!vistaUsuario.tfUsuario.getText().isEmpty())
                    && (!vistaUsuario.tfContraseña.getText().isEmpty())
                    && vistaUsuario.tfCombobox.getSelectedIndex() > 0) {
                
                String clave = Encriptacion.getStringMessageDigest(vistaUsuario.tfContraseña.getText(), Encriptacion.SHA256);
//
                usuario = new Usuario(vistaUsuario.tfUsuario.getText(), clave );
                String codigoEmpleado[] = vistaUsuario.tfCombobox.getSelectedItem().toString().split(" / ");
               
                System.out.println(codigoEmpleado[1]);
                

                ArrayList<Usuario> existe = daoUsuario.selectAllTo("usuario", vistaUsuario.tfUsuario.getText());
                if (existe.isEmpty()) {
                    //daoEmpleado.agregarUsuario(usuario.getEmpleados()) &&
                    if ( daoUsuario.insert(usuario)) {
                        usuario = daoUsuario.selectAllTo("usuario", usuario.getUsuario()).get(0);
                        usuario.AddEpleado(codigoEmpleado[1]);
                        if (daoEmpleado.agregarUsuario(usuario) ){
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
                Alerta aler = new Alerta(menuAdministrador, true, "Campos vacios ", "/img/error.png");
                aler.show();
            }
            //modificar

        } else if (e.getActionCommand().equals("Modificar" )
                && padreActiva.equals("usuarioGM") && usuarioSeleccionando != null) {
            String claveActual = JOptionPane.showInputDialog("Ingrese La contraseña Actual");
            String clave = Encriptacion.getStringMessageDigest(claveActual, Encriptacion.SHA256);
            if (usuarioSeleccionando.getContraseña().equals(clave) && !claveActual.isEmpty()) {
                String claveNueva = JOptionPane.showInputDialog("Ingrese La contraseña nueva");
              
                int opccion = JOptionPane.showConfirmDialog(null, "Deseas Modificar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opccion == 0) {
                     clave = Encriptacion.getStringMessageDigest(claveNueva, Encriptacion.SHA256);
                    usuarioSeleccionando.setContraseña(clave);
                    
                    if (daoUsuario.update(usuarioSeleccionando)) {
                    Alerta aler = new Alerta(menuAdministrador, true, "Contraseña modificada con exito", "/img/Succes.png");
                    usuarioSeleccionando = null;
                    mostrarDatos();
                    aler.show();
                        
                    }

                }
            }else{
                Alerta aler = new Alerta(menuAdministrador, true, "Contraseña incorrecta", "/img/error.png");
                    usuarioSeleccionando = null;
                    mostrarDatos();
                    aler.show();
            }

        } 

        ////////////////////////////////////fin  Usuario////////////////////////////////////
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
        }else  if (padreActiva.equals("vistaUsuario") && vistaUsuario.tfCombobox.getSelectedIndex() > 0) {
            String codigoEmpleado[] = vistaUsuario.tfCombobox.getSelectedItem().toString().split(" / ");
              vistaUsuario.tfUsuario.setText(codigoEmpleado[1]);
            
        }
    }

    public void mostrarBusqueda(ArrayList lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        ////////////******GASTOS Empresa********/////////////////

        if (padreActiva.equals("gastosGM")) {
            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            int alcaldiaC = 0;
            int energiaC = 0;
            int alquilerC = 0;
            int aguaC = 0;
            int salarioC = 0;
            double alcaldiaT = 0;
            double energiaT = 0;
            double alquilerT = 0;
            double aguaT = 0;
            double salarioT = 0;
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (Object a : lista) {

                GastoEmpresa x = (GastoEmpresa) a;
                if ((x.getCategoria().equals("Impuesto de Alcaldia")
                        || (x.getCategoria().equals("Pago de Energia"))
                        || (x.getCategoria().equals("Pago de Alquiler"))
                        || (x.getCategoria().equals("Pago de Agua")))) {
                    Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpresa().getNombre()};
                    totalR = totalR + x.getSaldo();
                    modelo.addRow(datos);
                }
                if (x.getCategoria().equals("Impuesto de Alcaldia")) {
                    alcaldiaC++;
                    alcaldiaT = alcaldiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Energia")) {
                    energiaC++;
                    energiaT = energiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Alquiler")) {
                    alquilerC++;
                    alquilerT = alquilerT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Agua")) {
                    aguaC++;
                    aguaT = aguaT + x.getSaldo();

                } else {
                    salarioC++;
                    salarioT = salarioT + x.getSaldo();
                }

            }

            GastosGM.jtDatos.setModel(modelo);
            this.gastosGM.lbAlcaldiaTotal.setText("$" + String.format("%.2f", alcaldiaT));
            this.gastosGM.lbAlcaldiaC.setText(String.valueOf(alcaldiaC));

            this.gastosGM.lbEnergiaTotal.setText("$" + String.format("%.2f", energiaT));
            this.gastosGM.lbEnergiaC.setText(String.valueOf(energiaC));

            this.gastosGM.lbAlquilerTotal.setText("$" + String.format("%.2f", alquilerT));
            this.gastosGM.lbAlquilerC.setText(String.valueOf(alquilerC));

            this.gastosGM.lbAguaTotal.setText("$" + String.format("%.2f", aguaT));
            this.gastosGM.lbAguaC.setText(String.valueOf(aguaC));

            this.gastosGM.lbSalarioT.setText("$" + String.format("%.2f", salarioT));
            this.gastosGM.lbSalarioC.setText(String.valueOf(salarioC));

            this.gastosGM.lbTotalReporte.setText("$" + String.format("%.2f", totalR));

        }
        ////////////******FINAL GASTOS Empresa********/////////////////
        ////////////******GASTOS EMPLEADO********/////////////////

        if (padreActiva.equals("gastosGM1")) {
            String titulos[] = {"Codigo", "Categoria", "Fecha", "Saldo", "Nombre"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            int alcaldiaC = 0;
            int energiaC = 0;
            int alquilerC = 0;
            int aguaC = 0;
            int salarioC = 0;
            double alcaldiaT = 0;
            double energiaT = 0;
            double alquilerT = 0;
            double aguaT = 0;
            double salarioT = 0;
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll1();
            for (Object a : lista) {
                 GastoEmpresa x = (GastoEmpresa) a;
                if(x.getEmpleado().getEstado()==1){

               
                if (!(x.getCategoria().equals("Impuesto de Alcaldia")
                        || (x.getCategoria().equals("Pago de Energia"))
                        || (x.getCategoria().equals("Pago de Alquiler"))
                        || (x.getCategoria().equals("Pago de Agua")))) {
                    Object datos[] = {x.getCodigoGastos(), x.getCategoria(), x.getFecha(), x.getSaldo(), x.getEmpleado().getNombre()};
                    totalR = totalR + x.getSaldo();
                    modelo.addRow(datos);
                }
                if (x.getCategoria().equals("Impuesto de Alcaldia")) {
                    alcaldiaC++;
                    alcaldiaT = alcaldiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Energia")) {
                    energiaC++;
                    energiaT = energiaT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Alquiler")) {
                    alquilerC++;
                    alquilerT = alquilerT + x.getSaldo();
                } else if (x.getCategoria().equals("Pago de Agua")) {
                    aguaC++;
                    aguaT = aguaT + x.getSaldo();

                } else {
                    salarioC++;
                    salarioT = salarioT + x.getSaldo();
                }

            }

            GastosGM.jtDatos.setModel(modelo);
            this.gastosGM.lbAlcaldiaTotal.setText("$" + String.format("%.2f", alcaldiaT));
            this.gastosGM.lbAlcaldiaC.setText(String.valueOf(alcaldiaC));

            this.gastosGM.lbEnergiaTotal.setText("$" + String.format("%.2f", energiaT));
            this.gastosGM.lbEnergiaC.setText(String.valueOf(energiaC));

            this.gastosGM.lbAlquilerTotal.setText("$" + String.format("%.2f", alquilerT));
            this.gastosGM.lbAlquilerC.setText(String.valueOf(alquilerC));

            this.gastosGM.lbAguaTotal.setText("$" + String.format("%.2f", aguaT));
            this.gastosGM.lbAguaC.setText(String.valueOf(aguaC));

            this.gastosGM.lbSalarioT.setText("$" + String.format("%.2f", salarioT));
            this.gastosGM.lbSalarioC.setText(String.valueOf(salarioC));

            this.gastosGM.lbTotalReporte.setText("$" + String.format("%.2f", totalR));
            }

        }
        ////////////******FINAL GASTOS EMPLEADO********/////////////////

        ////////////******ClienteMA********/////////////////
        if (padreActiva.equals("consultarCliente")) {
            String titulos[] = {"Codigo", "Nombre", "Apellido", "Telefono", "Direccion", "Total De Compra"};
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

        //**************ProductoModi**************//
        if (padreActiva.equals("productoModi")) {
            String titulos[] = {"N", "Nombre", "Cantidad", "Precio", "Max", "Min"};
            modelo.setColumnIdentifiers(titulos);
            int i = 1;
            for (Object x : lista) {
                Producto obj = (Producto) x;
                Object datos[] = {i, obj.getNombreProducto(), obj.getCantidad(), obj.getPrecioCompra(), obj.getMax(), obj.getMin()};
                modelo.addRow(datos);
                i++;
            }
            this.productoModi.jtDatos.setModel(modelo);
        }
        //***********Fin ProductoModi**********//
        //**************MostrarVenta**************//
        if (padreActiva.equals("registroVentas")) {
            String titulos[] = {"N", "Fecha", "Cliente","Empleado", "Precio Total"};
            modelo.setColumnIdentifiers(titulos);
            float total1 = 0;
            for (Object x : lista) {
                Venta obj = (Venta) x;
                Object datos[] = {obj.getnFactura(),obj.getFechaVenta(),obj.getCliente().getNombre(),obj.getEmpleado().getNombre(),obj.getSaldoTotal()};
                modelo.addRow(datos);
                total1 = (float) (total1 + obj.getSaldoTotal());
            }
            registrosDeVenta.jtDatos.setModel(modelo);
           registrosDeVenta.lbTotal.setText(String.format("%.2f", total1));
        }
        //***********Fin mostrarVenta**********//
        
                
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
            String cate = GastosGM.jtDatos.getValueAt(fila, 3).toString();
            String pago = GastosGM.jtDatos.getValueAt(fila, 3).toString();
            String fecha = GastosGM.jtDatos.getValueAt(fila, 2).toString();
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
        }
        //fin empleado
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
            
        
        }else if (padreActiva.equals("consultarCliente")) {
            this.clienteMA.tfNombre.setText("");
            this.clienteMA.tfApellido.setText("");
            this.clienteMA.tfTelefono.setText("");
            this.clienteMA.tfDireccion.setText("");

        }
        
    }
}
