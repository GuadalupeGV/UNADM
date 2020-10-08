//Test DatosEmpleado
//Guadalupe García Vázquez Matrícula: ES1921008556

package consulta.empleados;

//importacion de subclases
import abstracto.empleados.Gerentes;
import abstracto.empleados.Operativos;
import abstracto.empleados.Temporales;

/**
 * Guadalupe García
 */
public class consultarEmpleados {

    public static void main(String[] args) {

        System.out.println("...................................... ");
        Gerentes ger = new Gerentes("Gerentes");
        Operativos ope = new Operativos("Operativos");
        Temporales tem = new Temporales("Temporales ");

        System.out.println("...................................... ");
        System.out.println(" ");

        TestConsultarBdd tes = new TestConsultarBdd();
        TestConsultarBdd.main();

    }

}
