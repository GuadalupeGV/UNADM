
package dpo1_u4_a1_mjro;

import java.util.Scanner;

public class Arreglos{
Scanner read2 = new Scanner(System.in);

String [] marca;
String [] modelo;
String [] tipo;
float [] valorComercial;
float [] valorFinal;      

    public void Arreg(int n){
        marca = new String[n];
        modelo = new String[n];
        valorComercial = new float[n];
        tipo = new String[n];
        valorFinal = new float[n];
            for(int i=0;i<n;i++){
                System.out.println("\n\nIngrese la marca del auto:\n");
                marca[i] = read2.nextLine();
                System.out.println("\n\nIngrese el modelo del auto:\n");
                modelo[i] = read2.nextLine();
                System.out.println("\n\nIngrese el precio del auto:\n");
                valorComercial[i] = read2.nextFloat();
                read2.nextLine();
                System.out.println("\n\nIngrese la letra del tipo de auto:\n"
                        + "F - Familiar\n"
                        + "P - Publico\n"
                        + "C - Carga\n");
                tipo[i] = read2.nextLine();
                float v=valorComercial[i];
                if(valorComercial[i]>=150000){
                v=(float)((v*0.20)+v); 
                valorFinal[i]=v;
                }   else if(v<150000){
                    v=(float)((v*0.16)+v);
                    valorFinal[i]=v;
                    }
            }
    }
    
    public void Lista(int n){
        System.out.println("\n\nListado de autos: \n");
        System.out.println("\n");
        for(int i=0;i<n;i++){
        System.out.println(i+1+". Marca: "+marca[i]
                +", Modelo: "+modelo[i]
                +", Precio: "+valorComercial[i]
                +", Tipo: "+tipo[i]
                +", Precio Final: "+valorFinal[i]+"\n");      
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
