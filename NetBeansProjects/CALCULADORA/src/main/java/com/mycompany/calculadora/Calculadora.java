
package com.mycompany.calculadora;
 //Librerias//
import java.util.Scanner;
import javax.swing.JOptionPane;


//Guadalupe Garcia//

public class Calculadora {

    
    public static void main(String[] args) {
        
        //Llamar scaner para ingresar datos a la consola
        
        Scanner entra=new Scanner(System.in);
        
        
        
        // Definir variables
        float numero1, numero2, suma, resta, mul,div, modulo;
        Byte operacion;
        
        //Pedir usuario ingresar datos
        
        numero1= Float.parseFloat(JOptionPane.showInputDialog("Dígite el primer número"));
          
        numero2= Float.parseFloat(JOptionPane.showInputDialog("Dígite el segundo número"));
       
     
        
            
       //Operaciones, metodos//
        
        suma=numero1+numero2;
        resta=numero1-numero2;
        mul=numero1*numero2;
        div=numero1/numero2;
        modulo=numero1%numero2;
        
        
        
       //Imprimir resultados
        JOptionPane.showMessageDialog(null,"Suma = " + suma+ "\n Resta= "+ resta+ "\n Multiplicación= "+ mul+ "\n División= " + div+ "\n Modulo= "+ modulo);
       
               
          
        //Según operación deseada 
        
       
        System.out.println("Suma= "+ suma);
        System.out.println("Resta= "+ resta);
        System.out.println("Multiplicación= "+ mul);
        System.out.println("División= "+ div);
        System.out.println("Modulo= "+ modulo);
        
        
        
        
    }  //Fin del main
    

 

}//Fin de la calse 

        
        
        
        
        
        
        
           
