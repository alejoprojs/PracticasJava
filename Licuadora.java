import java.util.Scanner;
package AppLicuadora;

public class Licuadora {
    public static void main (String [] args) {

        // int hielo;
        String fruta;
        int bebida = 2; 

        // Boolean leche = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido. ¡Que tipo de debida te gustaria preparar?\n");
        System.out.println("1 - Licuado");
        System.out.println("2 - Batido \n");
        
        switch (bebida) {
            case 1:
                System.out.println("1 - Licuado");
                bebida = 1;
                break;
        
            case 2:
                System.out.println("2 - Batido");
                bebida = 2;    
                break;
            
            default: 
                System.out.println("Error, opción no reconocida.\n");
                break;
        }
        
        System.out.println("¿Saludos, de que bebida te gusta preparar el dia de hoy?");
        fruta = sc.nextLine(); 

        System.out.println ("¿Tu bebida lleva hielo?");
        System.out.println("1 - Poco");
        System.out.println("2 - Medio");
        System.out.println("3 - Mucho");
        

        System.out.println("La fruta seleccionada es " + fruta);

        // if (hielo > 100 ); 

        // Controlar la cantidad de hielo siendo 100 maximo y 0 nada
        
        System.out.println("La opción seleccionada es " + bebida); // Salida por pantalla de la opción seleccionada
        System.out.println("La fruta seleccionada es " + fruta); 

        sc.close();
    }
}
