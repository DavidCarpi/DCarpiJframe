package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Cliente extends Empleado{
    private int telefono; 
    private Empresa empresa;

    public Cliente() {
    }

    public Cliente(int telefono, Empresa empresa, double sueldo, String Nombre, String Apellido, String Cedula, Date fechaNacimiento) {
        super(sueldo, Nombre, Apellido, Cedula, fechaNacimiento);
        this.telefono = telefono;
        this.empresa = empresa;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
        @Override
    public String toString() {
        return "Los datos son: \n"
                + "Telefono" +getTelefono();
    }
}
