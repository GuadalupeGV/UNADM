/*
Paquetería relacionada
 */
package DPO1_U4_A2_GUGV;

//Librerias
import java.util.Scanner;

/**
 * Guadalupe García
 */
public class Arreglos {
//Declaraciones

    Scanner arrProductos = new Scanner(System.in);
    int c = 4;
    int total1 = 0, total2 = 0, total3 = 0, total4 = 0;
    int totalgeneral;

    String[] nombreVendedor;
    int[][] cantidad;

//Metodo para ingresar el limite del arreglo.
    public void Arreg(int n) {
        nombreVendedor = new String[n];
        cantidad = new int[n][c];

        //Metodo arreglo para ingresar las cantidades que se guardarán en cada columna.
        for (int i = 0; i < n; i++) {
            System.out.println("\n\nIngrese el NOMBRE del vendedor:");
            nombreVendedor[i] = arrProductos.nextLine();
            System.out.println("\n\nIngrese las cantidades de producto de carga del vendedor según la presentación");
            System.out.println("\nBonice SENCILLOS: ");
            cantidad[i][0] = arrProductos.nextInt();
            arrProductos.nextLine();
            System.out.println("\n\nBonice DOBLES: ");
            cantidad[i][1] = arrProductos.nextInt();
            arrProductos.nextLine();
            System.out.println("\n\nBonice BONISOTE: ");
            cantidad[i][2] = arrProductos.nextInt();
            arrProductos.nextLine();          
            System.out.println("\n\nBonice MEGAS: ");
            cantidad[i][3] = arrProductos.nextInt();
            arrProductos.nextLine();
            //System.out.println("\n\n\n");
        }
    }

    //Metodo impresión de lista de registros ingresados
    public void Lista(int n) {
        System.out.println("\n\nListado de cargas por vendedor: \n");
        System.out.println("Vendedor  | Sencillo |  Doble   | BonIsote |  Mega   |\n");
        for (int i = 0; i < n; i++) {//Iniciamos conteo en 0
            System.out.println(i + 1 + ". " + nombreVendedor[i]
                    + "  | " + cantidad[i][0]
                    + "        | " + cantidad[i][1]
                    + "        | " + cantidad[i][2]
                    + "        | " + cantidad[i][3] + "       |\n");
        }
        pressAnyKeyToContinue();
    }

    //Metodo conteo de cargas vendedor
    public void Conta(int n) {

        //Metodo contador
       
        System.out.println("\n\nTotales generales de cargas por tipo:");
        System.out.println("| Sencillo| Doble| BonIsote| Mega |\n");

        //
        for (int i = 0; i < n; i++) {//Iniciamos en 0
            total1 += cantidad[i][0];
            total2 += cantidad[i][1];
            total3 += cantidad[i][2];
            total4 += cantidad[i][3];
            totalgeneral = total1 + total2 + total3 + total4;
        }
        System.out.println("| " + total1
                + "       | " + total2
                + "     | " + total3
                + "      | " + total4 + "    |\n");
        
         //Impresion de resultados.
        System.out.println("Total de cargas de producto: " + totalgeneral);
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

}// Fin clase Arreglos
