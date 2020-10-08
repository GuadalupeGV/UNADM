//Test ConsultarBdd
//Guadalupe García Vázquez Matrícula: ES1921008556

package consulta.empleados;
import conexion.bdd.ConexionMySQL;


class TestConsultarBdd {
    
       
     public static void main() {  
        ConexionMySQL con=new ConexionMySQL();
        con.establecerConexion();
        con.insertar("Test Registro");
        con.cerrarConexion(true);
}
}