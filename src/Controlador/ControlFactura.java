/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.InicioCaja;
import Modelo.dao.ProductoDao;
import Modelo.dao.VentaDao;
import VistaLogin.Login;
import VistaMA.MenuAdministrador;
import VistaMV.Factura;
import VistaMV.Facturacion;
import VistaMV.Mensaje;
import Modelo.Producto;
import Modelo.Registros;
import Modelo.Usuario;
import Modelo.Venta;
import Modelo.dao.EmpleadoDao;
import Modelo.dao.InicioCajaDao;
import Modelo.dao.RegistrosDao;
import Modelo.dao.UsuarioDao;
import VistaMV.CierreCaja;
import VistaMV.InicioCajaVista;
import VistaMV.TablaProducto;
import VistaMV.Tiket;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControlFactura extends MouseAdapter implements ActionListener, KeyListener {

    /*Objetos para el Constructor de esta clase*/
    Factura factura;
    Facturacion facturacion;
    Mensaje mensaje;
    TablaProducto tbproducto;
    /*Objetos para el Construtor de ControlLogin*/
    Login login;

    //NUEVO
    private ArrayList<Producto> listaProduc;
    private ArrayList<InicioCaja> listaInicioCaja;
    private ArrayList<Registros> listaRegistro = new ArrayList();////////////////////////;
    private ArrayList<Empleados> listaEmple;
    DefaultTableModel modelo;
    DefaultTableModel modeloTabla;
    VentaDao daoVenta;
    ProductoDao daoProducto;
    InicioCajaVista inicioCajaVista;
    Producto producto;
    Registros registroMd;
    RegistrosDao daoRegistros;
    Cliente clienteMd;
    Empleados empleadoMd;
    Tiket tiket;
    Usuario usuario;//added
    UsuarioDao daoUsuario;//added
    InicioCaja inicioCaja;//added
    private String codigoCajav;//added
    InicioCajaDao daoInicioCaja;//added
    CierreCaja cierreCaja;//added
    Venta venta;//added Lunes
//    private ArrayList<Venta> listaVenta;
    EmpleadoDao daoEmpleado;//added Lunes

    public ControlFactura(Factura factura, Facturacion facturacion, Mensaje mensaje, TablaProducto producto) {
        this.factura = factura;
        this.facturacion = facturacion;
        this.mensaje = mensaje;
        this.tbproducto = producto;
        llamarVFactura("FACTURA");
        modeloTabla = new DefaultTableModel();
        String titule[] = {"Codigo", "Producto", "Cantidad", "Precio/U", "Total"};
        this.modeloTabla.setColumnIdentifiers(titule);
        //HolaMundoooooo by Gerson

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*  Esta función verifica que el botón presionado contenga un determinado
        ActionCommand y ejecuta la función que alberga en su interior.  */
        switch (e.getActionCommand()) {
            case "inicioCaja":
                llamarVFactura("inicioCaja");
                break;
            case "AccesoIC":
                llamarVFactura("AccesoIC");
                break;
            case "tiket":
                llamarVFactura("tiket");
                break;
            case "facturacion":
                llamarVFactura("facturacion");
                break;
            case "Precargar":
                llamarVFactura("Precargar");
                break;
            case "ModificarCantidad":
                llamarVFactura("modificarCantidad");
                break;
            case "agregarProducto":
                llamarVFactura("agregarProducto");
                break;
            case "eliminarFila":
                llamarVFactura("eliminarFila");
                break;
            case "vender":
                llamarVFactura("vender");
                break;
            case "cerrarFacturacion":
                llamarVFactura("cerrarFacturacion");
                break;
            case "administrador":
                llamarVFactura("administrador");
                break;
            case "cerrarFactura":
                llamarVFactura("cerrarFactura");
                break;
            case "cerrarCaja":
                llamarVFactura("cerrarCaja");
                break;
            case "AccesoCC":
                llamarVFactura("AccesoCC");
                break;

            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void llamarVFactura(String vista) {
        if (vista.equals("FACTURA")) {
            factura.setControladorF(this);
            factura.iniciar();
            factura.visibilidad(false);//colocar false cuando se habiliten las Cajas
       // } ///////////////////*
        } else if (vista.equals("inicioCaja")) {
            this.inicioCajaVista = new InicioCajaVista(factura, true);
            this.inicioCajaVista.setControlador(this);
            this.inicioCajaVista.iniciar();
        } else if (vista.equals("AccesoIC")) {
            Date auxDate = (Date) inicioCajaVista.cldFechaInicio.getDatoFecha();
            if (this.inicioCajaVista.tfDineroInicio.getText().isEmpty() || auxDate == null) {
                JOptionPane.showMessageDialog(null, "Llene los campos");
            } else {
                this.usuario = new Usuario();
                this.daoInicioCaja = new InicioCajaDao();//se borro usuario
                this.daoUsuario = new UsuarioDao();//se borro usuario
                this.usuario.setIdUsuario(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()));
                this.inicioCaja = new InicioCaja();
                this.inicioCaja.setCodigoCaja(this.inicioCajaVista.codigoCaja.getText());
                this.codigoCajav = this.inicioCajaVista.codigoCaja.getText();
                this.inicioCaja.setUsuario(this.usuario);
                this.inicioCaja.setDineroInicio(Double.valueOf(this.inicioCajaVista.tfDineroInicio.getText()));
                this.inicioCaja.setFechaInicio(auxDate);
                this.inicioCaja.setFechaCierre(auxDate);
                this.inicioCaja.setDineroCierre(0);
                if (this.daoUsuario.validarUsuario(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()))) {
                    this.factura.visibilidad(true);
                    this.inicioCajaVista.dispose();

                    if (this.daoInicioCaja.insert(inicioCaja)) {
                        JOptionPane.showMessageDialog(null, "Guardado con exito\nQue tenga un buen dia");

                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL REGISTRO");
                    }
                }
            }

        } else if (vista.equals("tiket")) {//*/
            //this.tiket = new Tiket(factura, true);
            //this.tiket.setControlador(this);
            //this.tiket.iniciar();
        } else if (vista.equals("facturacion")) {
            this.facturacion = new Facturacion(factura, true);//
            this.facturacion.setControl(this);
            this.llenarCombo();
            this.facturacion.lbNomPr.setVisible(false);
            this.facturacion.iniciar();
        } else if (vista.equals("Precargar")) {
            this.completarInfoPrecios();
        } else if (vista.equals("modificarCantidad")) {
            this.facturacion.tfCantidad.setEditable(true);
            this.facturacion.tfPrecioTotalProducto.setText("");
        } else if (vista.equals("agregarProducto")) {
            this.completarInfoTabla(this.modeloTabla);
        } else if (vista.equals("eliminarFila")) {
            int y = this.facturacion.miTb1.getSelectedRow();
            if (y != -1) {
                
                
                this.regenerarProductos(y);
                this.eliminarRegistros(y);

           
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado que eliminar ");
            }

        } else if (vista.equals("vender")) {
           // this.conRegistro();
        } else if (vista.equals("cerrarFacturacion")) {
            facturacion.dispose();
        } else if (vista.equals("administrador")) {
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea ingresar al Login?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == 0) {
                factura.dispose();
                Login log = new Login();
                Factura vistaF = new Factura();
                MenuAdministrador vistaMA = new MenuAdministrador();
                ControlLogin controlL = new ControlLogin(log, vistaF, vistaMA, log.tfUser.getText());
            }
        } else if (vista.equals("cerrarFactura")) {
            factura.dispose();
            Login logg = new Login();
            Factura vistaFf = new Factura();
            MenuAdministrador vistaMAa = new MenuAdministrador();
            ControlLogin controlLo = new ControlLogin(logg, vistaFf, vistaMAa, logg.tfUser.getText());
        } else if (vista.equals("cerrarCaja")) {
            this.cierreCaja = new CierreCaja(factura, true);
            this.cierreCaja.setControlador(this);
            this.cierreCaja.iniciar();
        } else if (vista.equals("AccesoCC")) {

            Date auxDateC = (Date) cierreCaja.fechaCierre.getDatoFecha();
            if (this.cierreCaja.tfxDineroCierre.getText().isEmpty() || auxDateC == null) {
                JOptionPane.showMessageDialog(null, "Llenar Campos");
            } else {
                this.inicioCaja = new InicioCaja();
                this.inicioCaja.setFechaCierre(auxDateC);
                this.inicioCaja.setDineroCierre(Double.valueOf(this.cierreCaja.tfxDineroCierre.getText()));
                this.listaInicioCaja = this.daoInicioCaja.selectAll();
                int size = this.listaInicioCaja.size();
                int fila = this.listaInicioCaja.get(size - 1).getIdAdminCaja();
                this.inicioCaja.setIdAdminCaja(fila);
                //this.factura.btnCerrarCaja.setVisible(false);
                if (this.daoInicioCaja.update(inicioCaja)) {
                    JOptionPane.showMessageDialog(null, "Guardado con exito\nSalga");
                    this.cierreCaja.dispose();
                    this.factura.visibilidad(false);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL REGISTRO");
                }
            }

        }
    }

    public void llenarCombo() {
        //Llenar ComboBox de Producto
        this.listaProduc = new ArrayList();
        this.daoVenta = new VentaDao();
        this.listaProduc = this.daoVenta.listaProductComb();
        int sizeLista = 0;
        sizeLista = this.listaProduc.size();//Obtener el tamaño(numerico) del Array
        this.facturacion.cbProducto.removeAllItems();//Borra los items
        this.facturacion.cbProducto.addItem("Seleccione Productos");//item por defecto

        if (sizeLista > 0) {
            for (int i = 0; i <= (sizeLista - 1); i++) {
                String datos = this.listaProduc.get(i).getNombreProducto();
                this.facturacion.cbProducto.addItem(datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS");
        }
        //Fin de Llenar ComboBox de producto

        //Llenar ComboBox de Empleados
        this.listaEmple = new ArrayList();
        this.listaEmple = this.daoVenta.listaEmpleaComb();
        sizeLista = 0;
        sizeLista = this.listaEmple.size();
        this.facturacion.cbVendedor.removeAllItems();
        this.facturacion.cbVendedor.addItem("Seleccione Empleado");//item por defecto

        if (sizeLista > 0) {
            for (int i = 0; i <= (sizeLista - 1); i++) {
                String datos = this.listaEmple.get(i).getNombre();
                this.facturacion.cbVendedor.addItem(datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS");
        }
        //Fin de Llenar ComboBox de Empleado
    }

    public void completarInfoPrecios() {//Llena los campos de Precio Unitario/PrecioTotal
        this.listaProduc = new ArrayList();
        this.daoProducto = new ProductoDao();        
        this.listaEmple = new ArrayList();/////added Lunes
        this.daoEmpleado = new EmpleadoDao();/////addedLunes
        String p = String.valueOf(this.facturacion.cbProducto.getSelectedItem().toString());
        this.facturacion.lbNomPr.setText(p);
        this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", this.facturacion.lbNomPr.getText());
        if (!p.equals("Seleccione Productos")) {
            //this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", p);
            
            if (this.facturacion.tfCantidad.getText().equals("") == true) {
                JOptionPane.showMessageDialog(null, "No ha ingresado la cantidad");
            } else if (this.listaProduc.get(0).getCantidad() < Integer.parseInt(this.facturacion.tfCantidad.getText())) {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada supera las cantidades en existencia\n"
                        +"Cantidades en existencia: " + this.listaProduc.get(0).getCantidad());
            } else {
           
                
                
                //this.eliminarProductosBD();
            
                
                
//            this.listaEmple = this.daoEmpleado.selectAllTo("nombre", this.facturacion.cbVendedor.getSelectedItem().toString());///added Lunes
//            String hj = this.listaEmple.get(0).getNombre();
            //this.listaRegistro = new RegistrosDao().selectAllTo("idProducto", String.valueOf(this.listaProduc.get(0).getIdProducto()));////
//            String h = this.listaRegistro.get(0).getProducto().getNombreProducto();//////////////
//            double j = this.listaRegistro.get(0).getProducto().getCantidad();//////////////
//            JOptionPane.showMessageDialog(null, "Dao Registro dice: es " + h + " " + j);/////////////////////
            String exis = String.valueOf(this.listaProduc.get(0).getCantidad()- Integer.parseInt(this.facturacion.tfCantidad.getText()));///
            this.facturacion.tfExistenciaProd.setText(exis);//probando Existencia
            
            
            
            
            
            
                
                this.facturacion.tfCantidad.setEditable(false);
                this.facturacion.cbProducto.setEditable(false);
                this.facturacion.lbNomPr.setText(p);
                this.facturacion.tfPrecioUni.setText(String.valueOf(this.listaProduc.get(0).getPrecioVenta()));
                this.facturacion.tfPrecioTotalProducto.setText(String.valueOf(this.listaProduc.get(0).getPrecioVenta() * Double.parseDouble(this.facturacion.tfCantidad.getText())));
                
                //this.crearRegistros();
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un  producto");
            this.limpiarCb();
        }
    }

    public void completarInfoTabla(DefaultTableModel modelTabla) {//Envía los datos de los TF y CBX a la tabla
        //validar con la BD
        this.modeloTabla = modelTabla;
        if (!this.facturacion.tfCantidad.getText().isEmpty() && !this.facturacion.tfPrecioUni.getText().isEmpty() && !this.facturacion.tfPrecioTotalProducto.getText().isEmpty()) {
            this.daoProducto = new ProductoDao();
            this.listaProduc = new ArrayList();
            String p = String.valueOf(this.facturacion.cbProducto.getSelectedItem().toString());

            if (!p.equals("Seleccione Productos") && p.equals(this.facturacion.lbNomPr.getText())) {
                this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", p);
                //Datos enviados a la tabla
                Object fd[] = {this.listaProduc.get(0).getCodigoProducto(),
                    this.listaProduc.get(0).getNombreProducto(),
                    this.facturacion.tfCantidad.getText(),
                    String.valueOf(this.listaProduc.get(0).getPrecioVenta()),
                    this.facturacion.tfPrecioTotalProducto.getText(),
                    //String.format("%.2f", this.facturacion.tfPrecioTotalProducto.getText())
                };
                this.modeloTabla.addRow(fd);
                this.facturacion.miTb1.setModel(modeloTabla);
                this.crearRegistros();//agregado antes del uktimo
                this.eliminarProductosBD();
                this.limpiarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "El producto seleccionado no coincide con su precio unitario");
                this.limpiarCb();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete los campos");
        }
    }

    public void limpiarCb() {
        this.facturacion.tfPrecioUni.setText("");
        this.facturacion.tfPrecioTotalProducto.setText("");
        this.facturacion.tfExistenciaProd.setText("");
    }

    public void limpiarDatos() {
        this.facturacion.tfCliente.setText("");
        this.facturacion.tfDireccion.setText("");
        this.facturacion.tfCantidad.setText("");
        this.facturacion.tfPrecioUni.setText("");
        this.facturacion.tfPrecioTotalProducto.setText("");
        this.facturacion.cbProducto.setSelectedItem("Seleccione Productos");
        this.facturacion.cbVendedor.setSelectedItem("Seleccione Vendedor");
        this.facturacion.tfExistenciaProd.setText("");
    }

//    public void vender(int q) {//Falta enviar el Array para la tabla
//        if (!this.facturacion.tfCantidad.getText().isEmpty()
//                && !this.facturacion.tfPrecioUni.getText().isEmpty()
//                && !this.facturacion.tfPrecioTotalProducto.getText().isEmpty()
//                && !this.facturacion.tfCliente.getText().isEmpty()
//                && !this.facturacion.tfDireccion.getText().isEmpty()) {
//            int opc = JOptionPane.showConfirmDialog(null, "¿Desea ordenar Factura?", "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
//            if (opc == 0) {
//                //this.facturacion.dispose();
//                this.tiket = new Tiket(factura, true);
//                this.tiket.setControlador(this);
//                this.tiket.iniciar();
//            }
//        }
//    }
    
    public void eliminarProductosBD(){
        /*Restando cantidad de Productos ingresada*/
            this.producto = new Producto();
            this.daoProducto = new ProductoDao();
            this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
            this.producto.setCodigoProducto(this.listaProduc.get(0).getCodigoProducto());
            this.producto.setNombreProducto(this.listaProduc.get(0).getNombreProducto());
            this.producto.setPrecioCompra(this.listaProduc.get(0).getPrecioCompra());
            this.producto.setCantidad(this.listaProduc.get(0).getCantidad() - Integer.parseInt(this.facturacion.tfCantidad.getText()));
            this.producto.setFechaVencimiento(this.listaProduc.get(0).getFechaVencimiento());
            this.producto.setMax(this.listaProduc.get(0).getMax());
            this.producto.setMin(this.listaProduc.get(0).getMin());
            this.producto.setEstado(this.listaProduc.get(0).getEstado());
            this.producto.setGananciaUni(this.listaProduc.get(0).getGananciaUni());
            this.producto.setIva(this.listaProduc.get(0).getIva());
            this.producto.setPrecioVenta(this.listaProduc.get(0).getPrecioVenta());
            this.producto.setEmpresa(this.listaProduc.get(0).getEmpresa());
                if (this.daoProducto.updateCantidad(this.producto)) {
                    JOptionPane.showMessageDialog(null, "Cantidad disminuida: " + this.facturacion.lbNomPr.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad nooooo");
                }
                /*Fin de Restando Cantidad*/
    }
    
    public void crearRegistros(){
        /*Agregando Datos de Producto al Registro, de Venta no se ha hecho casi nada (aún)*/
        this.listaProduc = new ArrayList();
        this.daoProducto = new ProductoDao();
        this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", this.facturacion.lbNomPr.getText());
                this.registroMd = new Registros();//Objeto para insertar en el dao
                this.daoRegistros = new RegistrosDao();//Inicializando
                this.registroMd.setCantidadProducto(Integer.parseInt(this.facturacion.tfCantidad.getText()));
                this.registroMd.setPrecioTotalProducto(Double.parseDouble(this.facturacion.tfPrecioTotalProducto.getText()));
                this.venta = new Venta();
                this.venta.setIdFactura(2);
                this.producto = new Producto();
                this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
                this.registroMd.setVenta(venta);
                this.registroMd.setProducto(producto);
                
                if (this.daoRegistros.insert(this.registroMd) == true) {
                    JOptionPane.showMessageDialog(null, "Registro Insertado");
                } else {
                    JOptionPane.showMessageDialog(null, "No insertado");
                }
                /*Fin de Agregar Datos al Registro*/
    }
    
    public void regenerarProductos(int y){
                        /*Sumando cantidad de Productos eliminada*/
                String cantidad = this.facturacion.miTb1.getValueAt(y, 2).toString();
                String nomProd = this.facturacion.miTb1.getValueAt(y, 1).toString();
                this.listaProduc = new ArrayList();
                this.listaProduc = this.daoProducto.selectAllTo("nombreProducto",nomProd);
            JOptionPane.showMessageDialog(null, cantidad + nomProd);
            this.producto = new Producto();
            this.daoProducto = new ProductoDao();
            this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
            this.producto.setCodigoProducto(this.listaProduc.get(0).getCodigoProducto());
            this.producto.setNombreProducto(this.listaProduc.get(0).getNombreProducto());
            this.producto.setPrecioCompra(this.listaProduc.get(0).getPrecioCompra());
            this.producto.setCantidad(this.listaProduc.get(0).getCantidad() + Integer.parseInt(cantidad));
            this.producto.setFechaVencimiento(this.listaProduc.get(0).getFechaVencimiento());
            this.producto.setMax(this.listaProduc.get(0).getMax());
            this.producto.setMin(this.listaProduc.get(0).getMin());
            this.producto.setEstado(this.listaProduc.get(0).getEstado());
            this.producto.setGananciaUni(this.listaProduc.get(0).getGananciaUni());
            this.producto.setIva(this.listaProduc.get(0).getIva());
            this.producto.setPrecioVenta(this.listaProduc.get(0).getPrecioVenta());
            this.producto.setEmpresa(this.listaProduc.get(0).getEmpresa());
                if (this.daoProducto.updateCantidad(this.producto)) {
                    JOptionPane.showMessageDialog(null, "Cantidad regenerada: " + this.listaProduc.get(0).getNombreProducto());
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad no sumada");
                }
                /*Fin de Sumando Cantidad*/
                JOptionPane.showMessageDialog(null, y +" "+ this.producto.getNombreProducto()+" Removido");
                this.completarInfoTabla(modeloTabla);
    }
    
    public void eliminarRegistros(int y){
        this.daoRegistros = new RegistrosDao();
        this.listaRegistro = new ArrayList();
        String nombre = this.facturacion.miTb1.getValueAt(y, 1).toString();
        String cant = this.facturacion.miTb1.getValueAt(y, 2).toString();
        String precioTot = this.facturacion.miTb1.getValueAt(y, 4).toString();
                this.listaProduc = new ArrayList();
                this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", nombre);
        if (this.daoRegistros.delete(Integer.parseInt(cant), Double.parseDouble(precioTot), this.listaProduc.get(0).getIdProducto())) {
            JOptionPane.showMessageDialog(null, "Registro borrado con exito");
        } else {
            JOptionPane.showMessageDialog(null, "No borrado registro");
        }
    }
    
//    public void conRegistro(){
//        this.daoVenta = new VentaDao();
//        this.listaVenta = new ArrayList();
//        this.listaVenta = this.daoVenta.selectAll();
////        DefaultTableModel modeloR;
////        modeloR = new DefaultTableModel();
////        String titule[] = {"Codigo"};
////        modeloR.setColumnIdentifiers(titule);
//        for(Venta k: this.listaVenta){
//            int p=0;
//            if (true) {
//               
//            p+=k.getSaldoTotal();
//            String imi[]= {String.valueOf(k.getSaldoTotal())};
//            }
//            
////                String.valueOf(k.getCantidadProducto()),
////            String.valueOf(k.getPrecioTotalProducto()),
////            String.valueOf(k.getVenta().getIdFactura()),
////            String.valueOf(k.getProducto().getIdProducto())};
////            if (k.getCantidadProducto() == x && k.getPrecioTotalProducto()==y && k.getProducto().getIdProducto()==z) {
//                
//            
////            modeloR.addRow(imi);
////        this.facturacion.miTb1.setModel(modeloR);
//        }
//    }
}
