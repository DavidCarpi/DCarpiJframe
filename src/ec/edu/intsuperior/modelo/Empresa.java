package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Empresa extends Empleado {
    private String nombreEmpresa;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, double sueldo, String Nombre, String Apellido, String Cedula, Date fechaNacimiento) {
        super(sueldo, Nombre, Apellido, Cedula, fechaNacimiento);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    @Override
    public String toString() {
        return "Los datos son: \n "
                + "Nombre de la empresa: " +getNombreEmpresa();
    }
}
