
package Clases;

import java.util.Date;

public class Bono extends Empleados{

    public Bono(double bono, String codigo, String nombreEmpleado, String apellidoEmpleado, String telefonoEmpleado, String dirrecionEmpleado, String salarioEmpleado, String cargoEmpleado, String afp, String isss, Date constratacion) {
        super(codigo, nombreEmpleado, apellidoEmpleado, telefonoEmpleado, dirrecionEmpleado, salarioEmpleado, cargoEmpleado, afp, isss, constratacion);
        this.bono = bono;
    }
  private double bono;

    public Bono() {
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    
  
  
}
