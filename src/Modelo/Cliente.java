
package Modelo;

import java.util.ArrayList;


public class Cliente extends Persona{
    
    ArrayList<Venta> ventas;

    public Cliente(int idPersona, String nombre, String apellido, String telefono, String direccion) {
        super(idPersona, nombre, apellido, telefono, direccion);
        ventas = new ArrayList();
    }

    public Cliente() {
        ventas = new ArrayList();
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion) {
        super(nombre, apellido, telefono, direccion);
        ventas = new ArrayList();
       
    }
    
    private void addVenta(Venta x){
        ventas.add(x);
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    
   
    
    
    
}
