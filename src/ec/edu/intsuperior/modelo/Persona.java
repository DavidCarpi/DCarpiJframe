package ec.edu.intsuperior.modelo;

public class Persona {
    public String nombre;
    public int edad;
    Cliente cliente;
    
    public Persona() {
    }

    public Persona(String nombre, int edad, Cliente cliente) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
