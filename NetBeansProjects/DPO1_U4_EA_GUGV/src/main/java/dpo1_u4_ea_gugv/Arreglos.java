/*
Paquete
 */
package dpo1_u4_ea_gugv;

import java.util.Scanner;

/**
 * Guadalupe García
 */
public class Arreglos {

//Atributos    
    Scanner read2 = new Scanner(System.in);
    float promedio;
    float suma = 0;
    int opcion;

//Arreglos
    String[][] materias;
    float[][] califica;

//Creacion de indices de arreglo materia
    public void Asign(int n) {
        materias = new String[n][2];

        //Metodo ingreso de datos en arreglos        
        for (int i = 0; i < n; i++) {
            //Ingreso datos columnas
            System.out.println("\n\n\nIngrese la CLAVE de la asignatura:");
            materias[i][0] = read2.nextLine();

            System.out.println("\n\nIngrese el NOMBRE de la asignatura:");
            materias[i][1] = read2.nextLine();
            //Ahora se imprime el resultado para comprobarlo
        }

        //Metodo imprimir resultados
        System.out.println("\nDatos de la materia");
        System.out.println("\nNo.  | CLAVE   | NOMBRE  |");
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ".  | " + materias[i][0] + " | " + materias[i][1]);
            System.out.println("");
        }
        pressAnyKeyToContinue();
    }

    //Creacion de indices de arreglo calificaciones
    public void Calif(int n, int a) {
        califica = new float[n][a];

        //Metodo ingreso de datos en arreglos calificaciones
        for (int i = 0; i < n; i++) {
            //Ingreso datos filas
            System.out.println("\n\n\nIngrese las calificaciones (rango 0 al 100 sin decimales");
            System.out.println("\n\n\n        De la Materia: " + materias[i][1]);

            for (int j = 0; j < a; j++) {
                System.out.println("\nIngrese la calificación del alumno no. " + (j + 1) + " :");
                califica[i][j] = read2.nextInt();
                read2.nextLine();
            }
        }

        //Metodo imprimir resultados
        for (int i = 0; i < n; i++) {
            System.out.println("\nDatos de calificación por materia ");
            System.out.println("\n    Materia: " + materias[i][1]);
            for (int j = 0; j < a; j++) {
                System.out.println("El Alumno " + (j + 1) + " obtuvo un " + califica[i][j]);
            }
        }
        pressAnyKeyToContinue();
    }

    //Metodos de calculos
    public void Stats(int n, int a) {

        System.out.println("\n\n\n Elija la material para ver sus estadisticas (el número de la opción):");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + materias[i][1] + "\n");
        }
        opcion = read2.nextInt();
        read2.nextLine();

//Atributos de metodos 
        float mayor = califica[opcion - 1][0];
        float menor = califica[opcion - 1][0];

        //metodo de ordenamiento para buscar la calificación mayor y menor
        if (opcion > -1 && opcion <= n) {
            System.out.println("\n");
            for (int j = 0; j < a; j++) {
                suma = suma + califica[opcion - 1][j];
                promedio = suma / a;
            }
            for (int k = 0; k < a; k++) {
                //Se busca el número mayor de los datos ingresados
                if (califica[opcion - 1][k] > mayor) {
                    mayor = califica[opcion - 1][k];
                }
                //Se busca el número menor de los datos ingresados
                if (califica[opcion - 1][k] < menor) {
                    menor = califica[opcion - 1][k];
                }
            }

            System.out.println("\n\n\n" + materias[opcion - 1][1]);
            System.out.println("\nEstadisticas");
            System.out.println("\nCalificación MAYOR: " + mayor);
            System.out.println("\nCalificación MENOR: " + menor);
            System.out.println("\nEl PROMEDIO de calificaciones: " + promedio);
            suma = 0;
        } else {
            System.out.println("Seleccione un numero que se encuentre dentro del rango de opciones");
        }
        pressAnyKeyToContinue();
    }

//Excepcion para evitar que el sistema no continue el proceso
    public static void pressAnyKeyToContinue() {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Press Enter key to continue...");
        try {
            seguir = teclado.nextLine();
        } catch (Exception e) {
        }
    }
}//Fin clase Arreglos

