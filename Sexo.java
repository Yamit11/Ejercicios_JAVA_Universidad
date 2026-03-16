package laboratorio_patron_contenedor;
import java.util.Scanner;


public class Laboratorio_Patron_Contenedor {

    public static void main(String[] args) {
        
        Contenedor_Evento CE = new Contenedor_Evento();
        Scanner entrada = new Scanner(System.in);
        String opcion;
        
        do{
            System.out.println("Ingrese una opción: \n |agregar| \n |imprimir|");
            opcion = entrada.next();
            switch (opcion) {
                case "imprimir":
                    CE.imprimirResultados();
                    break;
                case "agregar":
                    CE.Add_Contenida_Persona();
                    break;
                default:
                    throw new AssertionError();
            }
        
            
        }while (!opcion.equals("finalizar")); 
        
        
    }
    
}
