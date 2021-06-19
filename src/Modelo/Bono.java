
package Modelo;

import java.util.Date;

public class Bono  {
    private Double bono;
    private int idBono;
    private String CargoEmpleado;

    public Bono() {
    }

    public Bono(Double bono) {
        this.bono = bono;
    }

    public Bono(Double bono, String CargoEmpleado) {
        this.bono = bono;
        this.CargoEmpleado = CargoEmpleado;
    }

    public Bono(int idBono) {
        this.idBono = idBono;
    }
    

    public Double getBono() {
        return bono;
    }

    public void setBono(Double bono) {
        this.bono = bono;
    }

    public int getIdBono() {
        return idBono;
    }

    public void setIdBono(int idBono) {
        this.idBono = idBono;
    }

    public String getCargoEmpleado() {
        return CargoEmpleado;
    }

    public void setCargoEmpleado(String CargoEmpleado) {
        this.CargoEmpleado = CargoEmpleado;
    }
    
    

   

    
  
  
}
