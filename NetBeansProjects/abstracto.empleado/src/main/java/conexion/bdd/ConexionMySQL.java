//Guadalupe García Vázquez Matrícula: ES1921008556

package conexion.bdd;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL implements AccesoDatos {

    @Override
    public void establecerConexion() {
        System.out.println("Conexión establecida con el servidor MySQL");
    }

    @Override
    public void insertar(String parametros) {
        System.out.println("Inserta un registro en MySQL");
    }

    //Excepciones validar el parámetro statusConexion
    @Override
    public void cerrarConexion(boolean statusConexion) {
        if (statusConexion == true) {
            System.out.println("Conexión finalizada correctamente");
        } else {
            try {
                throw new Excep();
            } catch (Excep ex) {
                System.out.println("Error al cerrar la conexión");
                Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class Excep extends Exception {

    public Excep() {
        super("Error al cerrar la conexión");
    }
}
    



/*/*La clase “ConexionMySQL” deberá implementar la interfaz “AccesoDatos”, se deberán sobre escribir los métodos de la interfaz de la siguiente forma:
5.2.1. “establecerConexion” deberá imprimir el mensaje “Conexión establecida con el servidor MySQL”
5.2.2. “insertar” deberá imprimir el mensaje “Inserta un registro en MySQL”
5.2.3. “cerrarConexion” deberás incluir el manejo de excepciones donde validaras el parámetro statusConexion, si es igual a “true” deberá mostrar el mensaje “Conexión finalizada correctamente” si es igual a false deberás generar una excepción y mostrar el mensaje “Error al cerrar la conexión”




*/
