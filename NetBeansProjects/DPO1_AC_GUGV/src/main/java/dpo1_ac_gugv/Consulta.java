package dpo1_ac_gugv;

//Guadalupe
public class Consulta extends cuentaBancaria {

//metodo abstracto    
    @Override
    public void Transacciones() {
        System.out.print("------------------------------------");
        System.out.print("\n\nTu saldo es: " + getSaldo());
        System.out.print("\n------------------------------------");

    }

}
