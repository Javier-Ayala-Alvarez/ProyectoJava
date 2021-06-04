package Controlador;

import Modelo.Empresa;
import Modelo.GastoEmpresa;
import Modelo.dao.EmpresaDao;
import Modelo.dao.Gastosdao;
import VistaLogin.Alerta;
import VistaLogin.Login;
import VistaMA.EliminarVentas;
import VistaMA.EmpleadoGM;
import VistaMA.GastosGM;
import VistaMA.MenuAdministrador;
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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlMA  extends MouseAdapter implements ActionListener, KeyListener, ItemListener  {

    /*Clases que serán usadas para el Constructor*/
    MenuAdministrador menuAdministrador;
    Login login;
    EmpleadoGM empleadoGM;

    //****GastoGM****//
    GastosGM gastosGM;
    Gastosdao daoGasto = new Gastosdao();
    GastosGM gastoSeleccionado = null;
    //****Fin GastoGM****//
    //****Empresa****//
     
    VistaEmpresa vistaEmpresa;
    EmpresaDao daoEmpresa = new EmpresaDao();
    Empresa empresa;
    Empresa empresaSeleccionanda = null;
    //****Fin GastoGM****//

    RegistrosDeProductos registrosDeProductos;
    RegistrosDeVentas registrosDeVentas;
    EliminarVentas eliminarVentas;
    DefaultTableModel modelo = new DefaultTableModel();
    private String padreActiva = "";

    public ControlMA(MenuAdministrador menuAdministrador, Login login, EmpleadoGM empleadoGM, GastosGM gastosGM, RegistrosDeProductos registrosDeProductos, RegistrosDeVentas registrosDeVentas, EliminarVentas eliminarVentas) {
        //this.daoGasto = new GastoDao();
        this.menuAdministrador = menuAdministrador;
        this.login = login;
        this.empleadoGM = empleadoGM;
        this.gastosGM = gastosGM;
        this.registrosDeProductos = registrosDeProductos;
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
            padreActiva = "gastosGM";
            llamarVistaConsulta("gastosGM");
        } else if (e.getActionCommand().equals("valanceGDS")) {
            llamarVistaConsulta("valanceGDS");
        }
        
        if ((e.getActionCommand().equals("Agregar")) 
                || (e.getActionCommand().equals("Eliminar") )
                || (e.getActionCommand().equals("Modificar") )
                || (e.getActionCommand().equals("Generar") )) {
            accionDeBotones(e);
        }
        /*Fin de Sub-botones de los Menús*/

    }
    public void llamarAcciones(String nombreAccion ) {
        //para boton modificar en vistaEmpresa
        if (nombreAccion.equals("editarEmpresa")) {
            if ((!vistaEmpresa.tfNombre.getText().isEmpty())
                  && (!vistaEmpresa.tfDireccion.getText().isEmpty())
                  && (!vistaEmpresa.tfCorreo.getText().isEmpty())) {
                
                empresaSeleccionanda.setNombre(vistaEmpresa.tfNombre.getText()); 
                 empresaSeleccionanda.setCorreo(vistaEmpresa.tfCorreo.getText()); 
                 empresaSeleccionanda.setCodigoEmpresa(vistaEmpresa.tfCodigoEmpresa.getText()); 
                 empresaSeleccionanda.setDireccion(vistaEmpresa.tfDireccion.getText()); 
                
                 
                //= new Empresa(vistaEmpresa.tfNombre.getText(), vistaEmpresa.tfDireccion.getText(), 
                        //vistaEmpresa.tfCorreo.getText(),vistaEmpresa.tfCodigoEmpresa.getText());
              
                if ( daoEmpresa.update(empresaSeleccionanda)) {
                    
                    Alerta alerta = new Alerta("Datos Modificados con exito", "/img/exito.png");
                    alerta.show();
                    this.vistaEmpresa.dispose();
                }
                else{
                     Alerta alerta = new Alerta("error realisando la modificacion ", "/img/error.png");
                     alerta.show();
                    this.vistaEmpresa.dispose();
                }
                
            }else{
                Alerta alerta = new Alerta("complete los datos para poder realizar un cambio", "/img/error.png");
            }
            
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (padreActiva.equals("gastosGM")) {
                    ArrayList<GastoEmpresa> lista = daoGasto.buscar(GastosGM.tfBuscar.getText() + e.getKeyChar());

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

        } else if (vista.equals("gastosGM")) {
            padreActiva = "gastosGM";
            this.gastosGM = new GastosGM(menuAdministrador, true);
            this.gastosGM.setControlador(this);
            mostrarDatos();
            this.gastosGM.iniciar();
        } 
        /*Fin de Ejecuciones de los Sub-botones de los Menús*/
    }

    public void mostrarDatos() {
        modelo = new DefaultTableModel();
        ////////////******GASTOS********/////////////////

        if (padreActiva.equals("gastosGM")) {
            String titulos[] = {"Codigo", "Tipo", "Fecha", "Saldo", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            int alcaldiaC = 0;
            int energiaC = 0;
            int alquilerC = 0;
            int aguaC = 0;
            int isssC = 0;
            int afpC = 0;
            int ivaC = 0;
            double alcaldiaT = 0;
            double energiaT = 0;
            double alquilerT = 0;
            double aguaT = 0;
            double isssT = 0;
            double afpT = 0;
            double ivaT = 0;
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (GastoEmpresa x : gastos) {
                Object datos[] = {x.getCodigoGastos(),x.getCategoria(), x.getFecha(),x.getSaldo(),  x.getEmpresa().getNombre()};
                totalR = totalR + x.getSaldo();
                modelo.addRow(datos);
                if(x.getCategoria().equals("Impuesto de Alcaldia")){
                    alcaldiaC++;
                    alcaldiaT = alcaldiaT + x.getSaldo();
                }else if(x.getCategoria().equals("Pago de Energia")){
                    energiaC++;
                    energiaT = energiaT + x.getSaldo();
                }else if(x.getCategoria().equals("Pago de Alquiler")){
                    alquilerC++;
                    alquilerT = alquilerT + x.getSaldo();
                }else if(x.getCategoria().equals("Pago de Agua")){
                    aguaC++;
                    aguaT = aguaT + x.getSaldo();
                }else if(x.getCategoria().equals("ISSS")){
                    isssC++;
                    isssT = isssT + x.getSaldo();
                }else if(x.getCategoria().equals("AFP")){
                    afpC++;
                    afpT = afpT + x.getSaldo();
                }else if(x.getCategoria().equals("IVA")){
                    ivaC++;
                    ivaT = ivaT + x.getSaldo();
                }
                
            }
            GastosGM.jtDatos.setModel(modelo);
            this.gastosGM.lbAlcaldiaTotal.setText("$"+alcaldiaT);
            this.gastosGM.lbAlcaldiaC.setText(String.valueOf(alcaldiaC));
            
            this.gastosGM.lbEnergiaTotal.setText("$"+energiaT);
            this.gastosGM.lbEnergiaC.setText(String.valueOf(energiaC));
            
            this.gastosGM.lbAlquilerTotal.setText("$"+alquilerT);
            this.gastosGM.lbAlquilerC.setText(String.valueOf(alquilerC));
            
            this.gastosGM.lbAguaTotal.setText("$"+aguaT);
            this.gastosGM.lbAguaC.setText(String.valueOf(aguaC));
            
            this.gastosGM.lbISSSTotal.setText("$"+isssT);
            this.gastosGM.lbIsssC.setText(String.valueOf(isssC));
            
            this.gastosGM.lbAFPTotal.setText("$"+afpT);
            this.gastosGM.lbAfpC.setText(String.valueOf(afpC));
            
            this.gastosGM.lbIVATotal.setText("$"+ivaT);
            this.gastosGM.lbIvaC.setText(String.valueOf(ivaC));
            
            this.gastosGM.lbTotalReporte.setText("$"+totalR);

        }
        ////////////******FINAL GASTOS********/////////////////
    }

    public void crearCodigo(String a) {
        ////////////******GASTOS********///////////////////////
        String iniciales = a;
        String correlativo = iniciales;
        int corre = 0;
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
        
        this.gastosGM.tfCodigo.setText("correlativo");
        ////////////******FINAL GASTOS********/////////////////
    }
    public void accionDeBotones(ActionEvent e){
        if(e.getActionCommand().equals("Agregar") && padreActiva.equals("gastosGM")){
            if(!gastosGM.tfCodigo.getText().isEmpty() 
                    && (!gastosGM.tfBuscar.getText().isEmpty())){
                if(gastoSeleccionado == null){
                    String v = gastosGM.cbTipo.getSelectedItem().toString(); 
                    GastoEmpresa gasto = new GastoEmpresa(gastosGM.tfCodigo.getText(),gastosGM.dFecha.getDatoFecha(),v,Double.parseDouble(gastosGM.tfBuscar.getText()));
                    ArrayList<GastoEmpresa> existe = daoGasto.selectAllTo("codigoGasto",gastosGM.tfCodigo.getText());
                    if(existe.isEmpty()){
                        if(daoGasto.insert(gasto)){
                             JOptionPane.showMessageDialog(null, "Guardado con exito");
                        }
                    }
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Campos vacios");
            }
            
        }else if(e.getActionCommand().equals("Generar") && padreActiva.equals("gastosGM")){
            String iniciales = "EG-";
            
            crearCodigo(iniciales);
            
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void mostrarBusqueda(ArrayList lista) {

        ////////////******GASTOS********/////////////////

        if (padreActiva.equals("gastosGM")) {
            String titulos[] = {"Codigo", "Tipo", "Fecha", "Saldo", "Empresa"};
            modelo.setColumnIdentifiers(titulos);
            ///Variables de Reporte//
            int alcaldiaC = 0;
            int energiaC = 0;
            int alquilerC = 0;
            int aguaC = 0;
            int isssC = 0;
            int afpC = 0;
            int ivaC = 0;
            double alcaldiaT = 0;
            double energiaT = 0;
            double alquilerT = 0;
            double aguaT = 0;
            double isssT = 0;
            double afpT = 0;
            double ivaT = 0;
            double totalR = 0;
            //Fin de Variable
            ArrayList<GastoEmpresa> gastos = daoGasto.selectAll();
            for (Object a : lista) {
                GastoEmpresa x = (GastoEmpresa) a;
                Object datos[] = {x.getCodigoGastos(),x.getCategoria(), x.getFecha(),x.getSaldo(),  x.getEmpresa().getNombre()};
                totalR = totalR + x.getSaldo();
                modelo.addRow(datos);
                if(x.getCategoria().equals("Impuesto de Alcaldia")){
                    alcaldiaC++;
                    alcaldiaT = alcaldiaT + x.getSaldo();
                }else if(x.getCategoria().equals("Pago de Energia")){
                    energiaC++;
                    energiaT = energiaT + x.getSaldo();
                }else if(x.getCategoria().equals("Pago de Alquiler")){
                    alquilerC++;
                    alquilerT = alquilerT + x.getSaldo();
                }else if(x.getCategoria().equals("Pago de Agua")){
                    aguaC++;
                    aguaT = aguaT + x.getSaldo();
                }else if(x.getCategoria().equals("ISSS")){
                    isssC++;
                    isssT = isssT + x.getSaldo();
                }else if(x.getCategoria().equals("AFP")){
                    afpC++;
                    afpT = afpT + x.getSaldo();
                }else if(x.getCategoria().equals("IVA")){
                    ivaC++;
                    ivaT = ivaT + x.getSaldo();
                }
                
            }
            GastosGM.jtDatos.setModel(modelo);
            this.gastosGM.lbAlcaldiaTotal.setText("$"+alcaldiaT);
            this.gastosGM.lbAlcaldiaC.setText(String.valueOf(alcaldiaC));
            
            this.gastosGM.lbEnergiaTotal.setText("$"+energiaT);
            this.gastosGM.lbEnergiaC.setText(String.valueOf(energiaC));
            
            this.gastosGM.lbAlquilerTotal.setText("$"+alquilerT);
            this.gastosGM.lbAlquilerC.setText(String.valueOf(alquilerC));
            
            this.gastosGM.lbAguaTotal.setText("$"+aguaT);
            this.gastosGM.lbAguaC.setText(String.valueOf(aguaC));
            
            this.gastosGM.lbISSSTotal.setText("$"+isssT);
            this.gastosGM.lbIsssC.setText(String.valueOf(isssC));
            
            this.gastosGM.lbAFPTotal.setText("$"+afpT);
            this.gastosGM.lbAfpC.setText(String.valueOf(afpC));
            
            this.gastosGM.lbIVATotal.setText("$"+ivaT);
            this.gastosGM.lbIvaC.setText(String.valueOf(ivaC));
            
            this.gastosGM.lbTotalReporte.setText("$"+totalR);

        }
        ////////////******FINAL GASTOS********/////////////////
    }
}
