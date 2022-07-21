package ec.edu.intsupeior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        
        Cliente c1 = new Cliente();
        
        System.out.println("Ingrese su nombre: ");
       c1.setNombre(leer.next());
        
        System.out.println("Ingrese su edad: ");
       c1.setEdad(leer.nextInt());
    
       System.out.println("Ingrese su telefono: ");
       c1.setTelefonContacto(leer.nextInt());
       
       System.out.println("Su nombre es: " + c1.getNombre());
       System.out.println("Su edad es: " + c1.getEdad());
       System.out.println("Su telefono es: " + c1.getTelefonContacto());
       
        
        
    }
    
}
