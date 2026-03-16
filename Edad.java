package laboratorio_patron_contenedor;
import java.util.Scanner;

public class Contenida_Personas {
    private String nombre;
    public Edad edad;
    public Sexo sexo;
    public EstadoCivil estadocivil;
    
    Scanner entrada = new Scanner(System.in);
    
    public Contenida_Personas(){
        System.out.println("Ingrese el nombre y apellido: ");
        nombre = entrada.next();
        this.edad = new Edad();
        this.sexo = new Sexo();
        this.estadocivil = new EstadoCivil();        
    }
    
    public void getNombre(){
        System.out.println("El nombre de la persona es: " + nombre);
    }
    
    public void setNombre(){
        System.out.println("Ingrese el nuevo nombre: ");
        nombre = entrada.next();        
    }
    
    public void getContenidaPersonas(){
        getNombre();
        edad.getAños();
        sexo.getSexo();
        estadocivil.getEstadoCivil();
    }
    
    public void setContenidaPersonas(){
        System.out.println("Indique que dato desea cambiar: \n|sexo| \n|edad| \n|estado civil| \n|nombre|");
        String set = entrada.next();
        switch (set) {
            case "sexo":
                sexo.setSexo();
                break;
            case "edad":
                edad.setAños();
                break;
            case "estado civil":
                estadocivil.setEstadoCivil();
                break;
            case "nombre":
                setNombre();
                break;
            default:
                throw new IllegalArgumentException("La opción seleccionada es erronea o está mal escrita.");
        }
    }
}