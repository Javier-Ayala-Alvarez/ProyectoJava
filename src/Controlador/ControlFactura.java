package Controlador;

import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Empresa;
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
import Modelo.dao.ClienteDao;
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
    /*Objetos para el Constructor de ControlLogin*/
    Login login;

    //NUEVO
    private ArrayList<Producto> listaProduc;
    private ArrayList<InicioCaja> listaInicioCaja;
    private ArrayList<Registros> listaRegistro;
    private ArrayList<Empleados> listaEmple;
    DefaultTableModel modelo;
    DefaultTableModel modeloTabla;
    ProductoDao daoProducto;
    Producto producto;
    Registros registroMd;
    RegistrosDao daoRegistros;
    Cliente clienteMd;
    Empleados empleadoMd;
    EmpleadoDao daoEmpleado;//added Lunes
    Tiket tiket;
    Usuario usuario;//added
    UsuarioDao daoUsuario;//added
    InicioCajaVista inicioCajaVista;
    InicioCaja inicioCaja;//added
    InicioCajaDao daoInicioCaja;//added
    CierreCaja cierreCaja;//added
    Venta venta;
    private ArrayList<Venta> listaVenta;
    VentaDao daoVenta;
    private ArrayList<Cliente> listaCliente;
    ClienteDao daoCliente;
    Empresa empresa;
    private double sumatoriaPrecios = 0;
    private int nuevoRegistro = 0;
    private ArrayList<Usuario> listaUsuario;

    private double dineroCaja;
    private String acceso;

    public ControlFactura(Factura factura, Facturacion facturacion, Mensaje mensaje, TablaProducto producto, String acceso) {
        this.factura = factura;
        this.facturacion = facturacion;
        this.mensaje = mensaje;
        this.tbproducto = producto;
        this.acceso = acceso;
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
            case "newCC":
                llamarVFactura("newCC");
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

        } else if (vista.equals("inicioCaja")) {
            this.inicioCajaVista = new InicioCajaVista(factura, true);
            this.inicioCajaVista.setControlador(this);
            this.inicioCajaVista.codigoCaja.setEditable(false);
            this.inicioCajaVista.codigoCaja.setText(this.crearCodigo("INCJ", "inicioCaja"));
            this.listaUsuario = new ArrayList();
            this.daoUsuario = new UsuarioDao();
            this.listaUsuario = this.daoUsuario.selectAllTo("idUsuario", this.acceso);
            this.inicioCajaVista.tfUsuId.setText(String.valueOf(this.listaUsuario.get(0).getIdUsuario()));
            this.inicioCajaVista.tfUsuId.setEditable(false);
            this.inicioCajaVista.iniciar();
        } else if (vista.equals("AccesoIC")) {
            this.crearRegistroCajaVista();

        }  else if (vista.equals("facturacion")) {
            this.facturacion = new Facturacion(factura, true);
            this.facturacion.setControl(this);
            this.llenarCombo();
            this.facturacion.tfNFactura.setText(crearCodigo("FACT", "facturacion"));
            this.facturacion.tfTotalPagar.setEditable(false);
            this.facturacion.lbNomPr.setVisible(false);
            this.listaRegistro = new ArrayList();
            this.daoRegistros = new RegistrosDao();
            this.facturacion.lbTRegistroInicial.setVisible(false);
            this.listaRegistro = this.daoRegistros.selectAll();
            this.facturacion.lbTRegistroInicial.setText(String.valueOf(this.listaRegistro.size()));
            this.facturacion.btnCerrarFd.setEnabled(true);

            this.facturacion.iniciar();

        } else if (vista.equals("Precargar")) {
            this.completarInfoPrecios();
        } else if (vista.equals("modificarCantidad")) {
            this.facturacion.tfCantidad.setEditable(true);
            this.facturacion.tfPrecioTotalProducto.setText("");
        } else if (vista.equals("agregarProducto")) {
            this.facturacion.btnCerrarFd.setEnabled(false);
            this.completarInfoTabla(this.modeloTabla);

        } else if (vista.equals("eliminarFila")) {

            int y = this.facturacion.miTb1.getSelectedRow();
            int z = this.facturacion.miTb1.getSelectedColumn();
            String objetoExistente = this.facturacion.miTb1.getValueAt(y, z).toString();
            if (y != -1 && objetoExistente.length() > 0 && z != -1) {///primera linea que modifique
                this.regenerarProductos(y);
                this.eliminarRegistros(y);
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado que eliminar ");
            }

        } else if (vista.equals("vender")) {
            this.facturacion.btnCerrarFd.setEnabled(true);
            this.daoVenta = new VentaDao();
            this.listaVenta = new ArrayList();
            this.listaVenta = this.daoVenta.selectAll();
            int size = this.listaVenta.size();
            this.venta = new Venta();
            this.venta.setIdFactura(this.listaVenta.get(size - 1).getIdFactura());
            this.venta.setnFactura(this.listaVenta.get(size - 1).getnFactura());
            this.venta.setFechaVenta(this.listaVenta.get(size - 1).getFechaVenta());
            this.venta.setSaldoTotal(this.listaVenta.get(size - 1).getSaldoTotal());
            this.venta.setEstado(1);
            this.venta.setInicioCaja(this.listaVenta.get(size - 1).getInicioCaja());
            this.venta.setCliente(this.listaVenta.get(size - 1).getCliente());
            this.venta.setEmpleado(this.listaVenta.get(size - 1).getEmpleado());
            this.venta.setEmpresa(this.listaVenta.get(size - 1).getEmpresa());
            if (this.daoVenta.updateVenta(this.venta)) {
                JOptionPane.showMessageDialog(null, "VENDIDO");
                this.limpiarDatos();
                this.facturacion.miTb1.removeAll();
                this.facturacion.tfNFactura.setText(crearCodigo("FACT", "facturacion"));
                this.facturacion.dispose();
                this.llamarVFactura("facturacion");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar");
            }

        } else if (vista.equals("cerrarFacturacion")) {

            facturacion.dispose();

        } else if (vista.equals("newCC")) {

            this.cierreCaja = new CierreCaja(factura, true);
            this.cierreCaja.setControlador(this);
            this.cierreCaja.tfxDineroCierre.setEditable(false);
            double sumaTotalCC, dineVentaAux;
            dineVentaAux = this.cantiCierre();
            sumaTotalCC = dineVentaAux + dineroCaja;
            this.cierreCaja.tfxDineroCierre.setText(String.valueOf(sumaTotalCC));
            this.cierreCaja.iniciar();

        } else if (vista.equals("cerrarFactura")) {

            factura.dispose();
            Login logg = new Login();
            Factura vistaFf = new Factura();
            MenuAdministrador vistaMAa = new MenuAdministrador();
            ControlLogin controlLo = new ControlLogin(logg, vistaFf, vistaMAa, logg.tfUser.getText());

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
        this.daoProducto = new ProductoDao();
        this.listaProduc = this.daoProducto.listaProductComb();
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
    }

    public void completarInfoPrecios() {//Llena los campos de Precio Unitario/PrecioTotal/Existencia
        this.listaProduc = new ArrayList();
        this.daoProducto = new ProductoDao();
        this.listaEmple = new ArrayList();
        this.daoEmpleado = new EmpleadoDao();
        String p = String.valueOf(this.facturacion.cbProducto.getSelectedItem().toString());
        this.facturacion.lbNomPr.setText(p);
        this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", this.facturacion.lbNomPr.getText());

        if (!p.equals("Seleccione Productos")) {
            if (this.facturacion.tfCantidad.getText().equals("") || this.facturacion.tfCantidad.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "No ha ingresado la cantidad");
            } else if (this.listaProduc.get(0).getCantidad() < Integer.parseInt(this.facturacion.tfCantidad.getText())) {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada supera las cantidades en existencia\n"
                        + "Cantidades en existencia: " + this.listaProduc.get(0).getCantidad());
            } else {
                String exis = String.valueOf(this.listaProduc.get(0).getCantidad() - Integer.parseInt(this.facturacion.tfCantidad.getText()));
                this.facturacion.tfExistenciaProd.setText(exis);
                this.facturacion.tfCantidad.setEditable(false);
                this.facturacion.cbProducto.setEditable(false);
                this.facturacion.lbNomPr.setText(p);
                this.facturacion.tfPrecioUni.setText(String.valueOf(this.listaProduc.get(0).getPrecioVenta()));
                this.facturacion.tfPrecioTotalProducto.setText(String.format("%.2f", Double.parseDouble(String.valueOf(this.listaProduc.get(0).getPrecioVenta() * Double.parseDouble(this.facturacion.tfCantidad.getText())))));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un  producto");
            this.limpiarCb();
        }
    }

    public void completarInfoTabla(DefaultTableModel modelTabla) {//Envía los datos de los TF y CBX a la tabla
      
        this.modeloTabla = modelTabla;
        if (!this.facturacion.tfCantidad.getText().isEmpty()
                && !this.facturacion.tfPrecioUni.getText().isEmpty()
                && !this.facturacion.tfPrecioTotalProducto.getText().isEmpty()
                && !this.facturacion.tfCliente.getText().isEmpty()
                && !this.facturacion.tfDireccion.getText().isEmpty()) {
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
                    this.facturacion.tfPrecioTotalProducto.getText()
                };
                this.sumatoriaPrecios += Double.parseDouble(this.facturacion.tfPrecioTotalProducto.getText());
                this.facturacion.tfTotalPagar.setText(String.valueOf(this.sumatoriaPrecios));
                this.modeloTabla.addRow(fd);
                this.facturacion.miTb1.setModel(modeloTabla);
                this.crearRegistros();//crea los registros de los productos insertados en la tabla con su venta
                this.eliminarProductosBD();//elimina los productos (cantidad) de la BD
                this.limpiarCb();
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
        this.facturacion.tfExistenciaProd.setText("-----------------------------------");
        this.facturacion.tfCantidad.setText("");
        this.facturacion.cbProducto.setSelectedItem("Seleccione Productos");

    }

    public void limpiarDatos() {
        this.facturacion.tfNFactura.setText("");
        this.facturacion.tfCliente.setText("");
        this.facturacion.tfDireccion.setText("");
        this.facturacion.tfCantidad.setText("");
        this.facturacion.tfPrecioUni.setText("");
        this.facturacion.tfPrecioTotalProducto.setText("");
        this.facturacion.tfTotalPagar.setText("");
        this.facturacion.cbProducto.setSelectedItem("Seleccione Productos");
        this.facturacion.tfExistenciaProd.setText("-----------------------------------");
        this.facturacion.lbNomPr.setText("");
        this.sumatoriaPrecios = 0;
        this.facturacion.lbTRegistroInicial.setText("");
        this.nuevoRegistro = 0;
        this.facturacion.miTb1.removeAll();
    }

    public void eliminarProductosBD() {//Disminuye la cantidad de productos solicitados en la Facturacion
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
            JOptionPane.showMessageDialog(null, "Cantidad disminuida de: " + this.facturacion.lbNomPr.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad nooooo");
        }
        /*Fin de Restando Cantidad*/
    }

    public void crearRegistros() {

        this.daoVenta = new VentaDao();
        this.listaVenta = new ArrayList();
        this.listaVenta = this.daoVenta.selectAll();
        int size = this.listaVenta.size();
        String verifFacturaexistente = String.valueOf(this.listaVenta.get(size - 1).getnFactura());
        if (verifFacturaexistente.equals(this.facturacion.tfNFactura.getText())) {
            JOptionPane.showMessageDialog(null, "Ya existe la factura, idVenta: " + this.listaVenta.get(size - 1).getIdFactura() + ", nFactura: " + this.listaVenta.get(size - 1).getnFactura());
            /*Agregando Datos de Producto al Registro, pero ya esta creado el idVenta correspondiente*/
            this.listaProduc = new ArrayList();
            this.daoProducto = new ProductoDao();
            this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", this.facturacion.lbNomPr.getText());
            this.registroMd = new Registros();
            this.daoRegistros = new RegistrosDao();
            this.registroMd.setCantidadProducto(Integer.parseInt(this.facturacion.tfCantidad.getText()));
            this.registroMd.setPrecioTotalProducto(Double.parseDouble(this.facturacion.tfPrecioTotalProducto.getText()));
            this.venta = new Venta();

            /*------------------------Actualizando venta para modificar su registro---------------------*/
            this.venta.setIdFactura(this.listaVenta.get(size - 1).getIdFactura());
            this.venta.setnFactura(this.listaVenta.get(size - 1).getnFactura());//insertando nFactura y ajustarlo al tamaño (longitud)
            this.venta.setFechaVenta(this.listaVenta.get(size - 1).getFechaVenta());//insertando fecha
            this.venta.setSaldoTotal(Double.parseDouble(this.facturacion.tfTotalPagar.getText()));//insertando precioVenta
            this.venta.setEstado(0);//insertando estado

            this.inicioCaja = new InicioCaja();
            this.listaInicioCaja = new ArrayList();
            this.daoInicioCaja = new InicioCajaDao();
            this.listaInicioCaja = this.daoInicioCaja.selectAll();
            int tamanioInic = this.listaInicioCaja.size();
            this.inicioCaja.setIdAdminCaja(this.listaInicioCaja.get(tamanioInic - 1).getIdAdminCaja());
            this.venta.setInicioCaja(this.inicioCaja);//agregando id del ultimo cajero

            this.clienteMd = new Cliente();
            this.listaCliente = new ArrayList();
            this.daoCliente = new ClienteDao();
            this.listaCliente = this.daoCliente.selectAll();
            int tamanioCli = this.listaCliente.size();
            int idCli = this.listaCliente.get(tamanioCli - 1).getIdCliente();
            this.clienteMd.setIdCliente(idCli);
            this.venta.setCliente(this.clienteMd);//agregando el idCliente

            this.empleadoMd = new Empleados();
            this.empleadoMd.setIdEmpleado(this.listaInicioCaja.get(tamanioInic - 1).getUsuario().getIdUsuario());
            this.venta.setEmpleado(empleadoMd);//agregando el idEmpleado

            this.empresa = new Empresa();
            this.empresa.setIdEmpresa(1);
            this.venta.setEmpresa(empresa);//agregando el idEmpresa

            this.daoVenta = new VentaDao();
            if (this.daoVenta.updateVenta(this.venta)) {
                //obteniendo el idVenta ultimo para asignar a la tabla registro
                this.daoVenta = new VentaDao();
                this.listaVenta = new ArrayList();
                this.listaVenta = this.daoVenta.selectAll();
                int tamanioVenta = this.listaVenta.size();

                this.listaRegistro = new ArrayList();
                this.daoRegistros = new RegistrosDao();
                this.nuevoRegistro = this.daoRegistros.selectAll().size();
                this.listaRegistro = this.daoRegistros.selectAll();
                int idVenUltimo = this.listaVenta.get(tamanioVenta - 1).getIdFactura();
                this.venta.setIdFactura(idVenUltimo);//Asignando el id de la Venta a la que pertenece
                this.producto = new Producto();
                this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
                this.registroMd.setVenta(venta);
                this.registroMd.setProducto(producto);

                if (this.daoRegistros.insert(this.registroMd) == true) {
                } else {
                    JOptionPane.showMessageDialog(null, "Registro No insertado");
                }
                /*Fin de Agregar Datos al Registro*/
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar a la venta\n Por favor verificar la conexion con la BD");
            }
            /*------------------------------------------Fin de Actualizando------------------------------------------------------*/

        } else {

            /*Agregando Datos de Producto al Registro, pero antes se debe crear la venta para otorgar el id correspondiente*/
            this.listaProduc = new ArrayList();
            this.daoProducto = new ProductoDao();
            this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", this.facturacion.lbNomPr.getText());
            this.registroMd = new Registros();
            this.daoRegistros = new RegistrosDao();
            this.registroMd.setCantidadProducto(Integer.parseInt(this.facturacion.tfCantidad.getText()));
            this.registroMd.setPrecioTotalProducto(Double.parseDouble(this.facturacion.tfPrecioTotalProducto.getText()));
            this.venta = new Venta();

            /*------------------------Creando venta para obtener su id y otorgar de una vez al registro---------------------*/
            this.venta.setnFactura(this.facturacion.tfNFactura.getText());//insertando nFactura y ajustarlo al tamaño (longitud)
            this.venta.setFechaVenta(this.facturacion.rSDateFecha.getDatoFecha());//insertando fecha
            this.venta.setSaldoTotal(Double.parseDouble(this.facturacion.tfTotalPagar.getText()));//insertando precioVenta
            this.venta.setEstado(0);//insertando estado

            this.inicioCaja = new InicioCaja();
            this.listaInicioCaja = new ArrayList();
            this.daoInicioCaja = new InicioCajaDao();
            this.listaInicioCaja = this.daoInicioCaja.selectAll();
            int tamanioInic = this.listaInicioCaja.size();
            this.inicioCaja.setIdAdminCaja(this.listaInicioCaja.get(tamanioInic - 1).getIdAdminCaja());
            this.venta.setInicioCaja(this.inicioCaja);//agregando id del ultimo cajero

            this.clienteMd = new Cliente();
            this.listaCliente = new ArrayList();
            this.daoCliente = new ClienteDao();
            this.clienteMd.setCodigo(this.crearCodigo("CLIE", "cliente"));
            this.clienteMd.setNombre(this.facturacion.tfCliente.getText());
            this.clienteMd.setApellido("-----");
            this.clienteMd.setTelefono("-----");
            this.clienteMd.setDireccion(this.facturacion.tfDireccion.getText());
            int idCli;
            if (this.daoCliente.insert(clienteMd)) {//insertando cliente para obtener su id

                this.clienteMd = new Cliente();
                this.listaCliente = new ArrayList();
                this.daoCliente = new ClienteDao();
                this.listaCliente = this.daoCliente.selectAll();
                int tamanioCli = this.listaCliente.size();
                idCli = this.listaCliente.get(tamanioCli - 1).getIdCliente();
                this.clienteMd.setIdCliente(idCli);
                this.venta.setCliente(this.clienteMd);//agregando el idCliente

                this.empleadoMd = new Empleados();
                this.empleadoMd.setIdEmpleado(this.listaInicioCaja.get(tamanioInic - 1).getUsuario().getIdUsuario());
                this.venta.setEmpleado(empleadoMd);//agregando el idEmpleado

                this.empresa = new Empresa();
                this.empresa.setIdEmpresa(1);
                this.venta.setEmpresa(empresa);//agregando el idEmpresa

                this.daoVenta = new VentaDao();
                if (this.daoVenta.insertarVenta(this.venta)) {
                    //obteniendo el idVenta ultimo para asignar al registro
                    this.daoVenta = new VentaDao();
                    this.listaVenta = new ArrayList();
                    this.listaVenta = this.daoVenta.selectAll();
                    int tamanioVenta = this.listaVenta.size();

                    this.listaRegistro = new ArrayList();
                    this.daoRegistros = new RegistrosDao();
                    this.nuevoRegistro = this.daoRegistros.selectAll().size();
                    this.listaRegistro = this.daoRegistros.selectAll();
                    int idVenUltimo = this.listaVenta.get(tamanioVenta - 1).getIdFactura();
                    JOptionPane.showMessageDialog(null, "idVenta obtenido (ultimo): " + idVenUltimo);
                    /*------------------------------------ Fin De Creando venta---------------------------------*/
                    this.venta.setIdFactura(idVenUltimo);//Asignando el id de la Venta a la que pertenece
                    this.producto = new Producto();
                    this.producto.setIdProducto(this.listaProduc.get(0).getIdProducto());
                    this.registroMd.setVenta(venta);
                    this.registroMd.setProducto(producto);

                    if (this.daoRegistros.insert(this.registroMd) == true) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Registro No insertado");
                    }
                    /*Fin de Agregar Datos al Registro*/
                } else {
                    JOptionPane.showMessageDialog(null, "Venta no insertada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Problemas con cliente");
            }

        }

    }

    public void regenerarProductos(int y) {
        /*Sumando cantidad de Productos eliminada*/
        String cantidad = this.facturacion.miTb1.getValueAt(y, 2).toString();
        String nomProd = this.facturacion.miTb1.getValueAt(y, 1).toString();
        this.listaProduc = new ArrayList();
        this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", nomProd);
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
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad no devuelta");
        }
        /*Fin de Sumando Cantidad*/
    }

    public void eliminarRegistros(int y) {
        String nombre = this.facturacion.miTb1.getValueAt(y, 1).toString();
        String cant = this.facturacion.miTb1.getValueAt(y, 2).toString();
        String precioTot = this.facturacion.miTb1.getValueAt(y, 4).toString();
        double precioTotal = Double.parseDouble(precioTot);
        this.daoRegistros = new RegistrosDao();
        this.listaProduc = new ArrayList();
        this.listaProduc = this.daoProducto.selectAllTo("nombreProducto", nombre);

        this.daoVenta = new VentaDao();
        this.listaVenta = new ArrayList();
        this.listaVenta = this.daoVenta.selectAll();
        int tamanioVenta = this.listaVenta.size();
        int idVen = this.listaVenta.get(tamanioVenta - 1).getIdFactura();

        if (this.daoRegistros.delete(Integer.parseInt(cant), Double.parseDouble(String.format("%.2f", precioTotal)), idVen)) {
            this.sumatoriaPrecios -= Double.parseDouble(String.format("%.2f", precioTotal));//probando la resta de la sumatoria
            this.facturacion.tfTotalPagar.setText(String.valueOf(this.sumatoriaPrecios));

            for (int i = 0; i < 5; i++) {
                this.facturacion.miTb1.setValueAt("", y, i);
            }

            int tamTabla = this.facturacion.miTb1.getRowCount();
            for (int i = 0; i < tamTabla; i++) {
                String objetoExistente = this.facturacion.miTb1.getValueAt(i, 0).toString();
                if (objetoExistente.length() > 1) { //segunda linea que modifique
                    this.facturacion.btnCerrarFd.setEnabled(false);
                } else {
                    this.facturacion.btnCerrarFd.setEnabled(true);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Problemas al borrar Registro");
        }
    }

    public String crearCodigo(String a, String activa) {
        String correlativo = a;
        int corre = 0;

        if (activa.equals("facturacion")) {
            this.daoVenta = new VentaDao();
            corre = this.daoVenta.selectAll().size() + 1;
        } else if (activa.equals("cliente")) {
            this.daoCliente = new ClienteDao();
            corre = this.daoCliente.selectAll().size() + 1;
        } else if (activa.equals("inicioCaja")) {
            this.daoInicioCaja = new InicioCajaDao();
            this.listaInicioCaja = new ArrayList();
            this.listaInicioCaja = this.daoInicioCaja.selectAll();
            corre = this.listaInicioCaja.size() + 1;
        }

        for (int i = 0; i < 6; i++) {
            if ((correlativo.length() + String.valueOf(corre).length()) < 10) {
                correlativo = correlativo + "0";
            }
        }
        correlativo = correlativo + String.valueOf(corre);

        return correlativo;
    }

    public double cantiCierre() {
        this.daoVenta = new VentaDao();
        this.listaVenta = new ArrayList();
        this.listaVenta = this.daoVenta.selectAll();

        double tVentaK = 0;
        this.listaInicioCaja = this.daoInicioCaja.selectAll();
        int size = this.listaInicioCaja.size();//Arreglo que contiene el id de cajainicio
        String fecha = String.valueOf(this.listaInicioCaja.get(size - 1).getFechaInicio());

        for (int i = 0; i <= (listaVenta.size() - 1); i++) {
            String fechaBD = String.valueOf(listaVenta.get(i).getFechaVenta());
            int estado = 0;
            estado = listaVenta.get(i).getEstado();
            if (fecha.equals(fechaBD) && estado == 1) {

                tVentaK += listaVenta.get(i).getSaldoTotal();
//                String imi[] = {String.valueOf(k.getSaldoTotal())}; 
            }
        }
        listaVenta = null;
        return tVentaK;
    }

    private void crearRegistroCajaVista() {
        Date auxDate = (Date) inicioCajaVista.cldFechaInicio.getDatoFecha();
        if (this.inicioCajaVista.tfDineroInicio.getText().isEmpty() || auxDate == null) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            this.usuario = new Usuario();
            this.daoInicioCaja = new InicioCajaDao();
            this.daoUsuario = new UsuarioDao();
            this.usuario.setIdUsuario(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()));
            this.inicioCaja = new InicioCaja();
            this.inicioCaja.setCodigoCaja(this.inicioCajaVista.codigoCaja.getText());
            this.inicioCaja.setUsuario(this.usuario);
            this.inicioCaja.setDineroInicio(Double.valueOf(this.inicioCajaVista.tfDineroInicio.getText()));
            dineroCaja = Double.valueOf(this.inicioCajaVista.tfDineroInicio.getText());///resetear el valor al vendeeer
            this.inicioCaja.setFechaInicio(auxDate);
            this.inicioCaja.setFechaCierre(auxDate);
            this.inicioCaja.setDineroCierre(0);
            if (this.daoUsuario.validarUsuario(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()))) {
                this.factura.visibilidad(true);
                this.listaUsuario = new ArrayList();
                this.listaUsuario = this.daoUsuario.selectId(Integer.parseInt(this.inicioCajaVista.tfUsuId.getText()));
                this.factura.lbNombreUsuario.setText(this.listaUsuario.get(0).getUsuario());
                this.inicioCajaVista.dispose();

                if (this.daoInicioCaja.insert(inicioCaja)) {
                    JOptionPane.showMessageDialog(null, "Guardado con exito\nQue tenga un buen dia");

                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR EL REGISTRO");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no valido");
            }
        }
    }



}
