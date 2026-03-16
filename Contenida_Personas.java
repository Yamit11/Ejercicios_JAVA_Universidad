package laboratorio_patron_contenedor;
import java.util.Scanner;

public class Contenedor_Evento {
    public Contenida_Personas[] evento;
    private int cantidad_Hombres;
    private int cantidad_Mujeres;
    private int cantidad_Mayores;
    private int cantidad_Menores;
    private int cantidad_Solteros;
    private int cantidad_Viudos;
    private int cantidad_Divorciados;
    private int cantidad_Casados;
    public int cantidad_Asistentes;
    public int invitados;
    
    Scanner entrada = new Scanner(System.in);
    
    public Contenedor_Evento(){
        cantidad_Hombres = 0;
        cantidad_Mujeres = 0;
        cantidad_Mayores = 0;
        cantidad_Menores = 0;
        cantidad_Solteros = 0;
        cantidad_Viudos = 0;
        cantidad_Divorciados = 0;
        cantidad_Casados = 0;
        cantidad_Asistentes = 0;

        System.out.println("Ingrese la cantidad de invitados al evento: ");
        invitados = entrada.nextInt();
        evento = new Contenida_Personas[invitados];
        
    }
    
    public void Add_Contenida_Persona(){
        evento[cantidad_Asistentes] = new Contenida_Personas();
        if (evento[cantidad_Asistentes].edad.comprobarAños()){
            cantidad_Mayores ++;
        }
        else{
            cantidad_Menores ++;
        }
        if (evento[cantidad_Asistentes].sexo.comprobarSexo()){
            cantidad_Hombres ++;
        }
        else{
            cantidad_Mujeres ++;
        }
        switch (evento[cantidad_Asistentes].estadocivil.comprobarEstadoCivil()) {
            case 1:
                cantidad_Casados ++;
                break;
            case 2:
                cantidad_Divorciados ++;
                break;
            case 3:
                cantidad_Viudos ++;
                break;
            case 4:
                cantidad_Solteros ++;
                break;
                
        }
        
        cantidad_Asistentes ++;
    }
    
    public void imprimirResultados(){
        
        double promediohombres = ((double)cantidad_Hombres/cantidad_Asistentes)*100;
        double promediomujeres = ((double)cantidad_Mujeres/cantidad_Asistentes)*100;
        System.out.println("La cantidad de asistentes fue: " + cantidad_Asistentes);
        System.out.println("La cantidad de mujeres fue: " + cantidad_Mujeres + " con un: %" + promediohombres);
        System.out.println("La cantidad de hombres fue: " + cantidad_Hombres + " con un: %" + promediomujeres);
        System.out.println("La cantidad de mayores de edad fue: " + cantidad_Mayores);
        System.out.println("La cantidad de menores de edad fue: " + cantidad_Menores);
        System.out.println("La cantidad de personas solteras fue: " + cantidad_Solteros);
        System.out.println("La cantidad de personas casadas fue: " + cantidad_Casados);
        System.out.println("La cantidad de personas divorciadas fue: " + cantidad_Divorciados);
        System.out.println("La cantidad de personas viudas fue: " + cantidad_Viudos);
    }
}
