package dpo1_ac_gugv;

import java.util.Scanner;

/**
 * Guadalupe García
 */
public abstract class cuentaBancaria {

//Atributos
    protected Double transacciones, retiro, asignarSaldoCuenta;
    private static Double Saldo;
    private String Nombre;
    private String Cuenta;

//Objeto     
    Scanner entrada = new Scanner(System.in);

    @SuppressWarnings("empty-statement")
    public void Operaciones() {
//Atributos
        String nombre;
        String cuenta;
        int opcion;
        int bandera = 0;
        int bandera1 = 0;

//Metodo mostrar-ingreso datos
        do {
            System.out.println("\n\n\nIngrese su nombre de cliente:");
            nombre = entrada.nextLine();

            if (nombre.length() >= 1) {
                bandera = 1;
                System.out.println("-------------------------------------------------");
                System.out.println("\nBienvenido: " + nombre);
            } else {
                System.out.println("-------------------------------------------------");
                System.out.println("\nCadena vacia");
                System.out.println("-------------------------------------------------");
            }
        } while (bandera == 0);

        do {
            System.out.println("\nIngrese su cuenta de cliente:");
            cuenta = entrada.nextLine();

            if (cuenta.length() >= 1) {
                bandera1 = 1;
                System.out.println("\n-------------------------------------------------");
                System.out.println("\nCuenta válida ");
                System.out.println("-------------------------------------------------");
            } else {
                System.out.println("\n-------------------------------------------------");
                System.out.println("\nCuenta inválida");
                System.out.println("-------------------------------------------------");
            }

        } while (bandera1 == 0);

        //Menú mostrar opciones(llamado de metodo saldoCuenta, retiro
        // Iniciamos metodo do-While, para evaluar las opción elegida por el usuario
        do {
            System.out.println("\n\n............................................."
                    + "\nProcesos:\n"
                    + "Elija la opción deseada:\n\n"
                    + "1. Consulta saldo.\n"
                    + "2. Depósito.\n"
                    + "3. Retiro\n"
                    + "4. Salir.\n"
                    + "..................................................");
            opcion = entrada.nextInt();
            entrada.nextLine();

            //Se utiliza Switch cómo condicional, de esta manera de acuerdo a la opción elegida por el usuario, el sistema se ejecutará
            switch (opcion) {

                //Instancia metodo Arreglo, delimitanto al parámetro de tal, mediante nEmpleados   
                case 1:
                    System.out.print("\n\n1.Consulta saldo\n");
                    //llamamos metodo de consulta saldo, mediante el objeto mensajero
                    cuentaBancaria mensajero = new Consulta();
                    mensajero.Transacciones();

                    break;
                //Instancia metodo para generar lista 
                case 2:
                    System.out.println("\n\n2. Depósitos\n");
                    cuentaBancaria mensajero2 = new asignarSaldoCuenta();
                    mensajero2.Transacciones();

                    break;
                //Instancia contar totales de carga por categoría de producto
                case 3:
                    System.out.println("\n\n3. Retiros\n");
                    cuentaBancaria mensajero3 = new Retiros();
                    mensajero3.Transacciones();
                    break;

                case 4:
                    System.out.println("\n\nSesión finalizada\n");
                    break;

                default:
                    System.out.println("_______________________________________"
                            + "\n\nOpcion no válida"
                            + "\n\n_______________________________________");
                    break;

            }

        } while (opcion != 4);

    }//operaciones    

    public void Retiro() {
        retiro = entrada.nextDouble();
    }

    //Metodo solicitar cantidad depositos
    public void Deposito() {
        asignarSaldoCuenta = entrada.nextDouble();
    }

//Metodo abstracto
    public abstract void Transacciones();

    //Metodos getter y setter para poder consultar la variable que es privada
    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;

    }

}//fin cuentaBancaria
