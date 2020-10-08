package dpo1_ac_gugv;

public class Retiros extends cuentaBancaria {

//metodo abstracto    
    @Override
    public void Transacciones() {
        System.out.print("¿Cuánto deseas retirar\n");

//mandar llamar metodo
        Retiro();
        //Validar un retiro correcto
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.print("------------------------------------");
            System.out.print("\n\nImporte retito: " + retiro);
            System.out.print("\nSaldo actual: " + getSaldo());
            System.out.print("\n------------------------------------");

        } else {
            System.out.print("\n\n-------------------------------------------------");
            System.out.print("\nEl monto a retirar excede el saldo de la cuenta");          
            System.out.print("\n\n--------------------------------------------------");

        }

    }

}
