package dpo1_ac_gugv;

public class asignarSaldoCuenta extends cuentaBancaria {

    //metodo abstracto    
    @Override
    public void Transacciones() {
        System.out.print("¿Cuánto deseas depósitar?\n");

        //Llamamos metodo
        Deposito();//AsignarSaldoCuenta
        //consultamos saldo y guardamos en variable

        if (asignarSaldoCuenta > 0) {
            transacciones = getSaldo();
            setSaldo(transacciones + asignarSaldoCuenta);

            System.out.println("------------------------------------");
            System.out.print("\n\nImporte depósito: " + asignarSaldoCuenta);
            System.out.print("\nSaldo actual: " + getSaldo());
            System.out.println("\n------------------------------------");
        } else {
            System.out.print("\n\n-------------------------------------------------");
            System.out.print("\nCantidad negativa, no se puede realizar la operación");
            System.out.print("\n\n--------------------------------------------------");
        }
    }
}
