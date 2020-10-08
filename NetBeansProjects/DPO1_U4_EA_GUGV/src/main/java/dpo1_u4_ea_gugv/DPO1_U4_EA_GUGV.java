/*
PAQUETE
 */
package dpo1_u4_ea_gugv;

import java.util.Scanner;

/**
 * Guadalupe García
 */
public class DPO1_U4_EA_GUGV {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Arreglos arr = new Arreglos();

        Scanner read = new Scanner(System.in);

        //Atributos, variable arreglo 1(i) y arreglo 2 (j), inician en 0
        int nMaterias, nAlumnos;
        int i = 0;
        int j = 0;
        int opcion;

        System.out.println("\nControl escolar de la Escuela Secundaria Federal No. 15 \n"
                + "----------------------------------------------------------------------------------\n");

        //Ingreso de asignaturas
        System.out.println("Ingrese el número de ASIGNATURAS que se cursan:\n");
        nMaterias = read.nextInt();
        //se agrega el read.nextline porque se consume la siguiente linea.
        read.nextLine();

        //Ingreso de alumnos
        System.out.println("\nIngrese el número de ALUMNOS en el grupo:\n");
        nAlumnos = read.nextInt();
        //se agrega el read.nextline porque se consume la siguiente linea.
        read.nextLine();

        //Utilizamos el ciclo DO-WHILE para realizar el llamado de los metodos de los arreglos.
        do {
            //Eleccion de menú principal de opciones.
            System.out.println("\n\n\nElija el proceso que desea realizar:\n"
                    + "1. Registrar Asignaturas.\n\n"
                    + "2. Registrar Calificaciones.\n\n"
                    + "3. Ver estadisticas.\n\n"
                    + "4. Salir.\n");
            opcion = read.nextInt();
            read.nextLine();

            //En relación de la opción seleccionada por el usuario se utiliza Switch- La instrucción switch es una forma de expresión de un anidamiento múltiple de instrucciones
            switch (opcion) {

//Instancia el metodo arreglo que determinará el parametro del arreglo
                case 1:
                    //Ciclo if-else, para pedirle al usuario que una vez ingresado el número de materias, repetir el ciclo de registro de materias
                    if (i < nMaterias) {
                        arr.Asign(nMaterias);
                        i++;
                    } else {
                        System.out.println("\n\nRegistros completos, elija otra opción \n");
                        pressAnyKeyToContinue();
                    }
                    break;

//Instancia el metodo arreglo que determinará el parametro de ingreso de calificaciones de los alumnos.
                case 2:
                    //Ciclo if-else, para pedirle al usuario que una vez ingresado el número de alumnos, repetir el ciclo de registro de calificaciones
                    if (j < nAlumnos) {
                        arr.Calif(nMaterias, nAlumnos);
                        j++;
                    } else {
                        System.out.println("\n\nRegistros completos, elija otro opción \n");
                        pressAnyKeyToContinue();
                    }
                    break;

//Instancia el metodo arreglo para el calculo de calificaciones: Calificación mayor, Calificación menor, Promedio
                case 3:
                    arr.Stats(nMaterias, nAlumnos);
                    break;

//Salir del programa
                case 4:
                    System.out.println("\nGracias por utilizar el programa\n");
                    break;
            }
        } while (opcion != 4);
    }

//Excepción para evitar que el sistema no continúe el proceso
    public static void pressAnyKeyToContinue() {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Press Enter key to continue...");
        try {
            seguir = teclado.nextLine();
        } catch (Exception e) {
        }
    } //Fin de clase principal

}//Fin DOP1
