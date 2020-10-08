/*
 * Programa para Registros escolares de la Escuela Secundaria Federal No. 15
 */
package u4_ea_mjro;

import java.util.Scanner;

/**
 * Programador: Moroni Jesus Ramos Olague
 */
public class U4_EA_MJRO {

    /**
     * En el metodo main se instancia el objeto arreglos
     * se declaran 4 variables:
     * n que sera el numero de materias
     * a que sera el numero de alumnos
     * i que sea para crear un contador
     * y op para leer las opciones que elija el usuario
     * Asi es que el programa comienza pidiendo la cantidad de registros. 
     */
    public static void main(String[] args) {
    Arreglos arr = new Arreglos();
        
        Scanner read = new Scanner(System.in);
        int n,a;
        int i=0;
        int j=0;
        int op;
        System.out.println("\n      Control escolar de la Escuela \n"
                           + "  Secundaria Federal No. 15 Versión 1.0 \n"
            +"\n\n");
        
        System.out.println("Porfavor ingrese cuantas ASIGNATURAS se cursan:\n");
            n = read.nextInt();
            read.nextLine(); 
            //se agrega el read.nextline porque se consume la siguiente linea.
        System.out.println("\nAhora la cantidad de ALUMNOS en el grupo:\n");
            a = read.nextInt();
            read.nextLine(); 
            //se agrega el read.nextline porque se consume la siguiente linea.
        do{
            System.out.println("\n\n\nA continuación ingresa\n"
                    +"el número de la opción deseada:\n\n\n"
                    +"1. Registrar Asignaturas.\n\n"
                    +"2. Registrar Calificaciones.\n\n"
                    +"3. Ver estadisticas.\n\n"
                    +"4. Salir.\n"); 
            op = read.nextInt();
            read.nextLine();
             
            switch(op){ 
                case 1: //Aquí se invoca el metodo arreg y se pasa n como parametro         
                    if(i<n){
                        arr.Asign(n);
                        i++;
                    }   else{ 
                            System.out.println("\n\n\n\nNo se pueden registrar mas \n"
                                + "solo habia disponibles "+n+" espacios.");
                            pressAnyKeyToContinue();
                        }
                    break;
                    
                case 2: //Aquí se invoca el metodo lista y se pasa n como parametro
                    if(j<a){
                        arr.Calif(n, a);
                        j++;
                    }   else{ 
                            System.out.println("\n\n\n\nNo se pueden registrar mas \n"
                                + "solo habia disponibles "+a+" espacios.");
                            pressAnyKeyToContinue();
                        }
                    break;
                    
                case 3: //Aquí se invoca el metodo conta y se pasa n como parametro
                    arr.Stats(n, a);
                    break;
                
                case 4: //Esto solo existe para mostrar la salida del programa
                    System.out.println("\n Saliendo del programa\n");
                    pressAnyKeyToContinue();
                    break;
            }
        }while(op!=4);   
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
