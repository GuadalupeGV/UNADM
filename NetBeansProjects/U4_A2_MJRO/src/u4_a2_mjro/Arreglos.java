/*
 * Siguiente parte del codigo:
 */
package u4_a2_mjro;
import java.util.Scanner;

/**
 * Aqui se crea la clase arreglos que contiene 3 metodos que interactuan con el
 * parametro enviado desde el main (n).
 * Se declaran 6 variables:
 * c que sera el simbolo de las columnas en el arreglo bidimensional
 * los 4 totales que sumaran cada uno su columna de datos correspondientes
 * y totaltodo que sera la suma total de todos los productos que se hayan tomado.
 * 
 * Asi mismo se declaran 2 arreglos, el unidimensional para el nombre, 
 * y el multidimensional para las cantidades de cargas.
 */
public class Arreglos {
Scanner read2 = new Scanner(System.in);
int c=4;
int total1=0, total2=0, total3=0, total4=0;
int totaltodo;

String [] nombre;
int [][] cantidad;  

    public void Arreg(int n){   //Metodo que recibe n para usarlo de limite en los arreglos.
        nombre = new String[n];
        cantidad = new int[n][c];
        
            for(int i=0;i<n;i++){ //Ya con los limites de los arreglos creados, 
                                  //se piden los datos para ir guradandolos en cada columna.
                System.out.println("\n\nIngrese el NOMBRE del vendedor:");
                nombre[i] = read2.nextLine();
                System.out.println("\n\nIngrese cuantos bonice SENCILLOS se lleva el vendedor:");
                cantidad[i][0] = read2.nextInt();
                read2.nextLine();
                System.out.println("\n\n\n");
                System.out.println("\n\nIngrese cuantos bonice DOBLES se lleva el vendedor:");
                cantidad[i][1] = read2.nextInt();
                read2.nextLine();
                System.out.println("\n\n\n");
                System.out.println("\n\nIngrese cuantos bonice BONISOTE se lleva el vendedor:");
                cantidad[i][2] = read2.nextInt();
                read2.nextLine();
                System.out.println("\n\n\n");
                System.out.println("\n\nIngrese cuantos bonice MEGAS se lleva el vendedor:");
                cantidad[i][3] = read2.nextInt();
                read2.nextLine();
                System.out.println("\n\n\n");
            }
    }
    
    public void Lista(int n){   //Metodo que toma n para usarlo como limite a la
                                //hora de imprimir los registros guardados.
        System.out.println("\n\n\n\nListado de cargas: \n");
        System.out.println("Vendedor   | Sencillo| Doble| BonIsote| Mega |\n");
        for(int i=0;i<n;i++){
        System.out.println(i+1+". "+nombre[i]
                +"   | "+cantidad[i][0]
                +"      | "+cantidad[i][1]
                +"   | "+cantidad[i][2]
                +"      | "+cantidad[i][3]+"   |\n");     
        }                       //asi mismo aqui podemos ver que cada columna
                                //esta representada por un numero que parte del 0.
        pressAnyKeyToContinue();
    }
    
    public void Conta(int n){   //Metodo que suma las cantidades de cada columna
                                //Asi mismo se divide en 2 procesos:
                                //La suma, hecho con contador
                                //Y la impresion de resultados.
        System.out.println("\n\n\n\n            Totales de cargas:");
        System.out.println("(Se muestra el total de producto o carga");
        System.out.println(" que se han llevado en los vendedores) \n");
        System.out.println("| Sencillo| Doble| BonIsote| Mega |\n");
        for(int i=0;i<n;i++){
            total1+=cantidad[i][0];
            total2+=cantidad[i][1];
            total3+=cantidad[i][2];
            total4+=cantidad[i][3];
            totaltodo=total1+total2+total3+total4;
        }
        System.out.println("| "+total1
                +"      | "+total2
                +"   | "+total3
                +"     | "+total4+"   |\n");
        System.out.println("En total se han llevado "+totaltodo+" productos este día.\n");
        pressAnyKeyToContinue();
    }
    
    public static void pressAnyKeyToContinue(){
    String seguir;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Press Enter key to continue...");
    try    {
        seguir = teclado.nextLine();
    }
    catch(Exception e){
        }
    }    
}
