/*
 * 
 */
package dpo1_ac_mjro;

/**
 * Programador: Moroni Jesus Ramos Olague
 */
public class PruebaCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria acc=new CuentaBancaria();
            
            acc.leer();
        
            acc.setCuentaBancaria(acc.nombreDeCliente, "06062020", 20.55);
            
            System.out.println("Nombre de cliente: "+acc.getnombreDeCliente()+"\n");
            System.out.println("Numero de cuenta: "+acc.getnumeroDeCuenta()+"\n");
            System.out.println("Saldo de la cuenta: "+acc.getsaldoDeCuenta()+"\n");
    }
    
}
