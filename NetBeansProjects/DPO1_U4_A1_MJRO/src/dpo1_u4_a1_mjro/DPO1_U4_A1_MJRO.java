
package dpo1_u4_a1_mjro;

import java.util.Scanner;

public class DPO1_U4_A1_MJRO {
    
    public static void main(String[] args) {
        Arreglos arr = new Arreglos();          // se instancia el objeto
        
        Scanner read = new Scanner(System.in);
        int n;
        int i=1;
        int op;
        System.out.println("\n            Bienvenido a la app \n"
            +"          de registro de automoviles\n\n");
        
        System.out.println("Indique la cantidad de autos a registrar:\n"
                + "   (Recuerde indicar la cantidad correcta,\n"
                + "ya que no podra añadir mas de los que indique)");
            n = read.nextInt();
            read.nextLine(); //se agrega porque se consume la siguiente linea.
        
        do{
            System.out.println("\n\n\n  A continuación ingresa\n"
                    +"el número de la opción deseada:\n\n"
                    +"1.Ingresar datos de autos\n"
                    +"2.Ingresar a la lista de autos\n"
                    +"3.Salir\n"); 
            op = read.nextInt();
            read.nextLine();
             
            switch(op){
                case 1:          
                    if(i<n){
                        arr.Arreg(n);
                        i++;
                    }   else{ 
                            System.out.println("No se pueden registrar mas autos\n"
                                + "solo habia disponibles "+n+" espacios.");
                        }
                       
                    break;
                    
                case 2: 
                    arr.Lista(n);
                    break;
                    
                case 3:
                    System.out.println("\n Aplicación cerrandose\n");
                    break;
            }
        }while(op!=3);   
    }
}
  