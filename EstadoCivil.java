package laboratorio_patron_contenedor;

import java.util.Scanner;

public class Edad {
    private int años;
    Scanner entrada = new Scanner(System.in);

    public Edad(){
        System.out.println("Ingrese la edad de la persona.");
        años = entrada.nextInt();
    }
    
    public void getAños(){
        System.out.println("La edad es: " + años);
    }
    
    public void setAños(){
        System.out.println("Ingrese la nueva edad de la persona.");
        años = entrada.nextInt();   
    }
    
    public boolean comprobarAños(){
        if (años >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
