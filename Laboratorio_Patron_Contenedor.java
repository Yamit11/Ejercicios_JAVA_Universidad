package laboratorio_patron_contenedor;
import java.util.Scanner;

public class EstadoCivil {
   
    private String estadocivil;
    Scanner entrada = new Scanner(System.in);

    public EstadoCivil(){
        System.out.println("Ingrese su estado civil: ");
        estadocivil = entrada.next();
    }
            
    public void getEstadoCivil(){
        System.out.println("El estado civil es: " + estadocivil); 
    }
    
    public void setEstadoCivil(){
        System.out.println("Ingrese su nuevo estado civil: ");
        estadocivil = entrada.next();        
    }
    
    public int comprobarEstadoCivil(){
        switch(estadocivil){
            case "casado":
            case "casada":
                return 1;
                
            case "divorciado":
            case "divorciada":
                return 2;
                
            case "viudo":
            case "viuda":
                return 3;
                
            case "soltero":
            case "soltera":
                return 4;
            default:
                return 0;
        }
    }
}