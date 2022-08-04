package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Empleado extends Persona{
    private double sueldo;
    
    public Empleado() {
    }

    public Empleado(double sueldo, String Nombre, String Apellido, String Cedula, Date fechaNacimiento) {
        super(Nombre, Apellido, Cedula, fechaNacimiento);
        this.sueldo = sueldo;
    }



    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
        @Override
    public String toString() {
        return "Los datos son: \n"
                + "Cedula: " +getCedula() + "\n"
                + "Nombre: "+getNombre() + "\n"
                + "Apelldo: "+getApellido() +"\n"
                + "FechaNacimiento: "+getFechaNacimiento() + "\n"
                + "Sueldo: " +getSueldo();
    }
}
