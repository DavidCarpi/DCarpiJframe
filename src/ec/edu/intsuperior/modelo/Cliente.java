package ec.edu.intsuperior.modelo;

public class Cliente extends Persona{
    private int telefonContacto; 
    Empresa empresa;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, int telefonContacto) {
        this.telefonContacto = telefonContacto;
    }

    public void setTelefonContacto(int telefonContacto) {
        this.telefonContacto = telefonContacto;
    }

    public int getTelefonContacto() {
        return telefonContacto;
    }
    
    
}
