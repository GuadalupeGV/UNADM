/*
Una empresa que se dedica a la venta de automóviles seminuevos, necesita crear un programa que le permita almacenar la marca, modelo, el valor comercial y el tipo del automóvil (F->Familiar, P->Publico o C->Carga) de “n” automóviles. El programa permitirá agregar los datos de un nuevo automóvil. 
Para resolver el problema debe imprimir un listado de los automóviles almacenados con sus datos, además calcular y mostrar su valor final con base en: Para automóviles que su valor es menor a 150,000 pesos se le cobrara el IVA de 16%, para los demás el IVA es del 20%.
Datos: 
• Marca (es una cadena de caracteres) 
• Modelo (es una cadena de caracteres) 
• Valor Comercial (es un valor numérico con decimales) 
• Tipo del automóvil (F-Familiar, P-Publico o C-Carga, una inicial) 
• Valor final (es un valor para precio monetario)

 */
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Guadalupe García
 */
public class Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);

        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos registro desea ingresar"));
       vehiculos[] datosVehiculos = new vehiculos[nElementos];

//Bucle for
        System.out.println("ingrese los datos de los Vehículos");
        for (int i = 0; i < nElementos; i++) {

            String marca;
            String modelo;
            float valorComercial;
            char tipoAutomovil;
            float valorMonetario;

            //Primer ingreso
            System.out.print((i + 1) + ". Ingrese los datos: ");
            System.out.print((i + 1) +". Ingrese la Marca: ");
            marca = leer.nextLine();
            System.out.print((i + 1) +". Ingrese el Modelo: ");
            modelo = leer.nextLine();
            System.out.print((i + 1) +". Ingrese el valor comercial: ");
            valorComercial = leer.nextFloat();
            System.out.print((i + 1) +". Ingrese el tipo de automóvil : F-Familiar, P-Publico o C-Carga ");
            tipoAutomovil = leer.next().charAt(0);
            leer.nextLine();
            
            //arreglos
            datosVehiculos[i]= new vehiculos(marca,modelo, valorComercial, tipoAutomovil);
            
                       
        }
for (int i = 0; i < nElementos; i++){
    
    
    System.out.println(" Marca: "+datosVehiculos[i].getMarca()+" Modelo:"+datosVehiculos[i].getModelo()+" Tipo: "+ datosVehiculos[i].getTipoAutomovil()+" Valor Comercial: "+datosVehiculos[i].getValorComercial()+" Valor monetario: "+datosVehiculos[i].getValorMonetario());
    
}
        
        
        
        
    }

}//LLave cierre principal
