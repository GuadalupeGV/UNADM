//nombre del paquete
package dpo1_u4_a1_gugv;

//librerias a utilizar
import java.util.Scanner;

/**
 * Guadalupe Garcia
 */
public class DPO1_U4_A1_GUGV {

    public static void main(String[] args) {

//instanciar objeto-arreglo   
        Arreglos arr = new Arreglos();

        Scanner read = new Scanner(System.in);
        int nRegistros;
        int i = 0;
        int opcion;

        System.out.println("\n.........................................."
                + "\n Bienvenido al portal de registro de automoviles\n");
        System.out.println("¿Cuántos registro de automóvil, desea ingresar?\n");
        nRegistros = read.nextInt();
        read.nextLine();

        do {
            System.out.println("\n.........................................."
                    + "\n\n Seleccione la opción que desea\n"
                    + "(Número de la opción deseada:)\n\n"
                    + "1.Registro de datos de autos\n"
                    + "2.Ver la lista de autos registrados\n"
                    + "3.Salir\n\n");

            opcion = read.nextInt();
            read.nextLine();

//Switch- El resultado se compara con cada <valor> consecutivamente y se ejecutan las instrucciones.
            switch (opcion) {
                case 1:
                    if (i < nRegistros) {
                        arr.Arreg(nRegistros);
                        i++;
                    } else {
                        System.out.println("Registros completos\n");
                    }

                    break;

                case 2:
                    arr.Lista(nRegistros);
                    break;

                case 3:
                    System.out.println("\n Proceso completado\n");
                    break;
            }
        } while (opcion != 3);
    }
}
