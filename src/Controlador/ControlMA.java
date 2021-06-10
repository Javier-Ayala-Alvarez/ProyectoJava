package Controlador;

import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Empresa;
import Modelo.GastoEmpresa;
import Modelo.Producto;
import Modelo.dao.ClienteDao;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.EmpresaDao;
import Modelo.dao.Gastosdao;
import Modelo.dao.ProductoDao;
import VistaLogin.Alerta;
import VistaLogin.Login;
import VistaMA.ClienteMA;
import VistaMA.EliminarVentas;
import VistaMA.EmpleadoGM;
import VistaMA.GastosGM;
import VistaMA.MenuAdministrador;
import VistaMA.ProductoModi;
import VistaMA.RegistrosDeProductos;
import VistaMA.RegistrosDeVentas;
import VistaMA.VistaEmpresa;
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

    /*Clases que serán usadas para el Constructor*/
    MenuAdministrador menuAdministrador;
    Login login;
    EmpleadoGM empleadoGM;
    EmpleadoDao daoEmpleado = new EmpleadoDao();
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
    EliminarVentas eliminarVentas;

    private String padreActiva = "";

    public ControlMA(MenuAdministrador menuAdministrador, Login login, EmpleadoGM empleadoGM, GastosGM gastosGM, RegistrosDeProductos registrosDeProductos, ProductoModi productoModi, RegistrosDeVentas registrosDeVentas, EliminarVentas eliminarVentas, ClienteMA clienteMA) {
        //this.daoGasto = new GastoDao();
        this.menuAdministrador = menuAdministrador;
        this.login = login;
        this.empleadoGM = empleadoGM;
        this.gastosGM = gastosGM;
        this.registrosDeProductos = registrosDeProductos;
        this.productoModi = productoModi;
        this.registrosDeVentas = registrosDeVentas;
        this.eliminarVentas = eliminarVentas;
        llamarVistaConsulta("menuAdministrador");

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
        } else if (e.getActionCommand().equals("eliminarFacturaItem")) {
            llamarVistaConsulta("eliminarFacturaItem");
        } else if (e.getActionCommand().equals("guardarProducto")) {
            llamarVistaConsulta("guardarProducto");
        } else if (e.getActionCommand().equals("modificarProducto")) {
            llamarVistaConsulta("modificarProducto");
        } else if (e.getActionCommand().equals("eliminarProducto")) {
            llamarVistaConsulta("eliminarProducto");
        } else if (e.getActionCommand().equals("consultarProducto")) {
            llamarVistaConsulta("consultarProducto");
        } else if (e.getActionCommand().equals("guardarEmpleado")) {
            llamarVistaConsulta("guardarEmpleado");
        } else if (e.getActionCommand().equals("modificarEmpleado")) {
            llamarVistaConsulta("modificarEmpleado");
        } else if (e.getActionCommand().equals("eliminarEmpleado")) {
            llamarVistaConsulta("eliminarEmpleado");
        } else if (e.getActionCommand().equals("consultarEmpleado")) {
            llamarVistaConsulta("consultarEmpleado");
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
                    Alerta aler = new Alerta("Datos Modificados Con exito", "/img/Succes.png");
                    aler.show();
                    this.vistaEmpresa.dispose();
                } else {

                    Alerta aler = new Alerta("Error realisando la operación", "/img/error.png");
                    aler.show();
                    this.vistaEmpresa.dispose();
                }

            } else {
                Alerta aler = new Alerta("complete los datos para poder realizar un cambio", "/img/error.png");
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

        }
        if (padreActiva.equals("consultarCliente")) {
            ArrayList<Cliente> lista = daoCliente.buscar(ClienteMA.tfBuscar.getText() + e.getKeyChar());

            if (lista.isEmpty()) {
                mostrarDatos();
            } else {
                mostrarBusqueda(lista);

            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

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
            RegistrosDeVentas registroVen = new RegistrosDeVentas(menuAdministrador, true);
            registroVen.iniciar();
        } else if (vista.equals("eliminarFacturaItem")) {
            EliminarVentas elimFac = new EliminarVentas(menuAdministrador, true);
            elimFac.iniciar();
        } else if (vista.equals("guardarProducto")) {
            padreActiva = "productoModi1";
            this.productoModi = new ProductoModi(menuAdministrador, true);
            this.productoModi.setControlador(this);
            mostrarDatos();
            this.productoModi.iniciar();

        } else if (vista.equals("modificarProducto")) {

        } else if (vista.equals("eliminarProducto")) {

        } else if (vista.equals("consultarProducto")) {
            registrosDeProductos = new RegistrosDeProductos(menuAdministrador, true);
            this.registrosDeProductos.iniciar();
        } else if (vista.equals("guardarEmpleado")) {
            this.empleadoGM = new EmpleadoGM(menuAdministrador, true);
            this.empleadoGM.btnGuardar.setEnabled(true);
            this.empleadoGM.btnModificar.setEnabled(false);
            this.empleadoGM.iniciar();
        } else if (vista.equals("modificarEmpleado")) {
            this.empleadoGM = new EmpleadoGM(menuAdministrador, true);
            this.empleadoGM.btnGuardar.setEnabled(false);
            this.empleadoGM.btnModificar.setEnabled(true);
            this.empleadoGM.iniciar();
        } else if (vista.equals("eliminarEmpleado")) {

        } else if (vista.equals("consultarEmpleado")) {

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
            llenarCombo();
            padreActiva = "gastosGM1";
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
            String titulos[] = {"N", "Nombre", "Cantidad", "precio", "max", "min"};
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
    }

    public void crearCodigo(String a) {
        ////////////******GASTOS********///////////////////////
        String iniciales = a;
        String correlativo = iniciales;
        int corre = 1;
        ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
        for (GastoEmpresa x : gastos) {
            corre = x.getIdGasto();

        }
        for (int i = 0; i < 6; i++) {
            if (correlativo.length() + corre < 7) {
                correlativo = correlativo + "0";
            }
        }
        correlativo = correlativo + corre;

        this.gastosGM.tfCodigo.setText(correlativo);
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
                            Alerta aler = new Alerta("Guardado con exito", "/img/Succes.png");
                            aler.show();

                        }
                    } else {

                        Alerta aler = new Alerta("Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                mostrarDatos();
            } else {

                Alerta aler = new Alerta("Campos vacios", "/img/error.png");
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
                        idEmpleado = x.getIdEmpleado();
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
                            Alerta aler = new Alerta("Pago a retirar $"+pago+" ", "/img/Succes.png");
                            aler.show();

                        }
                    } else {
                        Alerta aler = new Alerta("Codigo ya Existe", "/img/error.png");
                        aler.show();
                    }
                }
                mostrarDatos();
            } else {
                Alerta aler = new Alerta("Campos vacios", "/img/error.png");
                aler.show();
            }

        } else if (e.getActionCommand().equals("Generar") && (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1"))) {
            String iniciales = "EG-";

            crearCodigo(iniciales);

        } else if (e.getActionCommand().equals("Eliminar")
                && (padreActiva.equals("gastosGM") || padreActiva.equals("gastosGM1"))) {
            int opccion = JOptionPane.showConfirmDialog(null, "Deseas Eliminar?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opccion == 0) {
                if (gastoSeleccionado != null) {
                    if (daoGasto.delete(gastoSeleccionado)) {
                        vaciarVista();
                        Alerta aler = new Alerta("Eliminado con exito", "/img/Succes.png");
                        aler.show();

                        mostrarDatos();
                        gastoSeleccionado = null;
                    } else {

                        Alerta aler = new Alerta("Error al eliminado con exito", "/img/error.png");
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
                Alerta aler = new Alerta("Modificado con exito", "/img/Succes.png");
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
                Alerta aler = new Alerta("Modificado con exito", "/img/bueno.png");
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
                            Alerta aler = new Alerta("Guardado con exito", "/img/Succes.png");
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
                Alerta aler = new Alerta("Modificado con exito", "/img/Succes.png");
                aler.show();
            }
        }
        //*****************Fin produtoModi****************//                
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (padreActiva == "gastosGM1") {

            ArrayList<Empleados> empleado1 = daoEmpleado.selectAll();
            String vq[] = gastosGM.cbTipo.getSelectedItem().toString().split(" - ");
            for (Empleados x : empleado1) {
                if (vq[0].equals(x.getCodigoEmpleado())) {
                    gastosGM.tfPago1.setText(String.valueOf(x.getSalarioEmpleado()));
                    crearCodigo("EG-");
                }
            }
        }else  if ((padreActiva == "gastosGM")&& (!gastosGM.cbTipo.getSelectedItem().equals("Seleccione"))) {
            
                    crearCodigo("EG-");
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
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    public void llenarCombo() {
        ArrayList<Empleados> empleado = daoEmpleado.selectAll();
        for (Empleados x : empleado) {
            String selec = x.getCodigoEmpleado() + " - " + x.getNombre() + " - " + x.getApellido();

            gastosGM.cbTipo.addItem(selec);

        }
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
