package ec.edu.intsuperior.modelo;

public class Empleado extends Persona{
    private int sueldoBruto;
    Directivo directivo;
    
    public Empleado() {
    }

    public Empleado(String nombre,int edad,int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
}
