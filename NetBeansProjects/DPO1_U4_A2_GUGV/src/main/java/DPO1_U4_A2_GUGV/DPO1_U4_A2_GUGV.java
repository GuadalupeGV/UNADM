/*
paqueteria
 */
package DPO1_U4_A2_GUGV;

import java.util.Scanner;

/**
 * Guadalupe García
 */
public class DPO1_U4_A2_GUGV {

    public static void main(String[] args) {
        Arreglos arreglo = new Arreglos();

        Scanner read = new Scanner(System.in);
        int nEmpleados;
        int i = 0;
        int opcion;
        String usuario;
        
        System.out.println("--------------------------------------------"
                + "\n Bonne Ice Registro de Cargas Versión 1.0 \n"
                + "------------------------------------------------"
                + "\n\n");
        
        System.out.print("Ingrese su nombre\n\n");
        usuario = read.nextLine();

        System.out.println("\n¿Cuántos empleados desea registrar?\n\n");
        nEmpleados = read.nextInt();

        //Para poder leer un archivo línea por línea y tener la posibilidad de buscar solo la información relevante, utilizamos read.nextline
        read.nextLine();

        // Iniciamos metodo do-While, para evaluar las opción elegida por el usuario
        do {
            System.out.println("\n\n\nProcesos:\n"
                    + "Elija la opción deseada:\n\n\n"
                    + "1. Capturar las cargas del vendedor.\n\n"
                    + "2. Mostrar las cargas de todos los vendedores.\n\n"
                    + "3. Obtener totales de carga por categoría de producto.\n\n"
                    + "4. Salir.\n");
            opcion = read.nextInt();
            read.nextLine();

            //Se utiliza Switch cómo condicional, de esta manera de acuerdo a la opción elegida por el usuario, el sistema se ejecutará
            switch (opcion) {
            
                    //Instancia metodo Arreglo, delimitanto al parámetro de tal, mediante nEmpleados   
                case 1:
                    if (i < nEmpleados) {
                        arreglo.Arreg(nEmpleados);
                        i++;
                    } else {
                        System.out.println("Datos completos \n");
                    }
                    break;
                     //Instancia metodo para generar lista 
                case 2:
                    arreglo.Lista(nEmpleados);
                    break;
                    //Instancia contar totales de carga por categoría de producto
                case 3: 
                    arreglo.Conta(nEmpleados);
                    break;
                    //Finalizar el programa
                case 4: 
                    System.out.println("\n\nUsuario: "+usuario+
                            "\nGracias por utilizar el programa\n");
                    break;
            }
        } while (opcion != 4);
    }

}//Fin clase principal

