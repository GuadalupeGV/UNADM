/*
 * Programa para contabilizar el producto de los vendedore de BONICE
 */
package u4_a2_mjro;
import java.util.Scanner;

/**
 *Creador: Moroni jesus Ramos
 */
public class U4_A2_MJRO {

    /**
     * En el metodo main se instancia el objeto arreglos
     * se declaran 3 variables:
     * n que sera el numero de registros
     * i que sea para crear un contador
     * y op para leer las opciones que eliga el usuario
     * Asi es que el programa comienza pidiendo la cantidad de registros aprox.
     */
    public static void main(String[] args) {
        
        Arreglos arr = new Arreglos();
        
        Scanner read = new Scanner(System.in);
        int n;
        int i=1;
        int op;
        System.out.println("\n Bonne Ice Registro de Cargas Versión 1.0 \n"
            +"\n\n");
        
        System.out.println("Indique la cantidad de empleados a registrar:\n\n"
                + "(Recuerde indicar una cantidad estimada de vendedores,\n"
                + "ya que no se podran añadir mas de los que indique aqui)");
            n = read.nextInt();
            read.nextLine(); 
            //se agrega el read.nextline porque se consume la siguiente linea.
        do{
            System.out.println("\n\n\n  A continuación ingresa\n"
                    +"el número de la opción deseada:\n\n\n"
                    +"1. Capturar las cargas del vendedor.\n\n"
                    +"2. Mostrar las cargas de todos los vendedores.\n\n"
                    +"3. Obtener totales de carga por categoría de producto.\n\n"
                    +"4. Salir.\n"); 
            op = read.nextInt();
            read.nextLine();
             
            switch(op){ 
                case 1: //Aquí se invoca el metodo arreg y se pasa n como parametro         
                    if(i<n){
                        arr.Arreg(n);
                        i++;
                    }   else{ 
                            System.out.println("No se pueden registrar mas \n"
                                + "solo habia disponibles "+n+" espacios.");
                        }
                       
                    break;
                    
                case 2: //Aquí se invoca el metodo lista y se pasa n como parametro
                    arr.Lista(n);
                    break;
                    
                case 3: //Aquí se invoca el metodo conta y se pasa n como parametro
                    arr.Conta(n);
                    break;
                
                case 4: //Esto solo existe para mostrar la salida del programa
                    System.out.println("\n Saliendo del programa\n");
                    break;
            }
        }while(op!=4);   
    }
    
}
