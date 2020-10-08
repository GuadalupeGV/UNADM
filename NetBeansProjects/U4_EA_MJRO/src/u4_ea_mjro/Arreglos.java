/*
 * Programa para registros escolares (parte 2)
 */
package u4_ea_mjro;

import java.util.Scanner;

/**
 * Aqui se crea la clase arreglos que contiene 3 metodos que interactuan con los
 * parametros enviados desde el main "n" y "a".
 * Se declaran las variables "suma" y "promedio" que sera usara para mostrar el 
 * promedio de cada materia que se haya ingresado.
 * La variable opcion para elegir la materia en mostrar sus estadisticas.
 * Y las variables mayor y menor que usaremos en las estadisticas tambien.
 * Asi mismo se declaran 2 arreglos bidimensionales.
 */
public class Arreglos {
Scanner read2 = new Scanner(System.in);
float promedio;
float suma=0;
int opcion;

String [][] materias;
float [][] califica;  

    public void Asign(int n){       //Metodo que recibe n para usarlo de limite en los arreglos.
        materias = new String[n][2];
                
            for(int i=0;i<n;i++){   //Ya con los indices de los arreglos creados, 
                                    //se piden los datos para ir guradandolos en cada columna.
                System.out.println("\n\n\n\n\n\nIngrese la CLAVE de la asignatura:");
                materias[i][0] = read2.nextLine();
                System.out.println("\n\nIngrese el NOMBRE de la asignatura:");
                materias[i][1] = read2.nextLine();
                                    //Ahora se imprime el resultado para comprobarlo
            }
                System.out.println("\n\n\nNo. | CLAVE | NOMBRE    |");
                System.out.println("");
            for(int i=0;i<n;i++){
                System.out.println(i+1+".  | "+materias[i][0]+" | "+materias[i][1]);
                System.out.println("");
            }   pressAnyKeyToContinue();
    }
    
    public void Calif(int n, int a){//En este metodo se reciben "n" y "a" los
                                    //cuales se usaran a continuacion
        califica = new float[n][a];
        
            for(int i=0;i<n;i++){   //Se usa un contador para las filas
                    System.out.println("\n\n\n\n\n(Recuerde que para ingresar las calificaciones");
                    System.out.println("se deben ingresar enteros del 0 al 100 sin decimales)");
                    System.out.println("\n\n\n        De la Materia: "+materias[i][1]);
                for(int j=0;j<a;j++){//Se usa un contador para las columnas
                    System.out.println("\nIngrese la calificación del alumno no. "+(j+1)+" :");
                    califica[i][j] = read2.nextInt();
                        read2.nextLine();    
                }     
            }
                                    //Ahora se imprime el resultado para comprobarlo
            System.out.println("\n\n\n");
            for(int i=0;i<n;i++){
                    System.out.println("\n    Materia: "+materias[i][1]);
                for(int j=0;j<a;j++){
                    System.out.println("El Alumno "+(j+1)+" obtuvo un "+califica[i][j]);
                }
            }       pressAnyKeyToContinue();
    }
    
    public void Stats(int n, int a){   //Metodo que suma las cantidades de cada materia (fila)
                                //tambien busca el maxico de cada materia (fila)
                                //busca el mini de cada materia (fila)
                                //dando al final la impresion de resultados.
        
        System.out.println("\n\n\n Seleccione 1 materia para ver sus estadisticas:");
        System.out.println("\n ");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+". "+materias[i][1]+"\n");
        }
                                //las variables acontinuacion se posicionan aqui ya que
                                //se busca no verse afectadas por los ciclos
        opcion = read2.nextInt();
                 read2.nextLine();
                                //Aqui declaramos que mayor y menor toman el primer dato del arreglo
        float mayor =califica[opcion-1][0];
        float menor =califica[opcion-1][0];
        
        if(opcion>-1&&opcion<=n){
            System.out.println("\n");
            for(int j=0;j<a;j++){
                suma=suma+califica[opcion-1][j];
                promedio=suma/a;
            }
            for(int k=0;k<a;k++){
                                //se busca que si hay un numero mayor que el que toma la variable
                                //mayor, entonces esta se convierta en ese numero
                if(califica[opcion-1][k]>mayor){
                    mayor=califica[opcion-1][k];
                }
                                //Asi mismo con la variable menor
                if(califica[opcion-1][k]<menor){
                    menor=califica[opcion-1][k];
                }                                
            }
            System.out.println("\n\n\n"+materias[opcion-1][1]);
            System.out.println("\nLa MAYOR calificacion fue de: "+mayor);
            System.out.println("\nLa MENOR calificacion fue de: "+menor);
            System.out.println("\nEl PROMEDIO de calificaciones de esta materia es de: "+promedio);
            suma=0;             //se limpia la memria de suma, regrsandola a 0
        }   else{
                System.out.println("Seleccione un numero que se encuentre dentro del rango de opciones");
            }
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
