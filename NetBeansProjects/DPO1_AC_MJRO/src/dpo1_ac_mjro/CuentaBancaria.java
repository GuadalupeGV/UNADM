/*
 * 
 */
package dpo1_ac_mjro;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase representa una cuenta para determinado cliente.
 */
public class CuentaBancaria {
                            // Declaracion de atributos o variables miembro
    String nombreDeCliente;
    String numeroDeCuenta;
    double saldoDeCuenta;
    String nombre, numero;
    double saldo;
    boolean okay=false;
     
    public String getnombreDeCliente(){
        return nombre;
    }
    public String getnumeroDeCuenta(){
        return numero;
    }
    public double getsaldoDeCuenta(){
        return saldo;
    }
    
    public  void setCuentaBancaria(String nombreDeCliente, 
                            String numeroDeCuenta, 
                            double saldoDeCuenta){
        this.nombre = nombreDeCliente;
        this.numero = numeroDeCuenta;
        this.saldo = saldoDeCuenta;
    }
    
    public void leer(){
    Scanner read=new Scanner(System.in);
        do{
            System.out.print("\n Ingrese el nombre del cliente: \n");
            try{
                nombreDeCliente=read.nextLine();
                okay=true;
                if(nombreDeCliente==null){
                    System.exit(0);
                }
            }catch(InputMismatchException e){
                okay=false;
                System.out.println("Cadena vacía");
            }
            
        }while(!okay); 
    }
}
