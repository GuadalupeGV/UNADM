//Guadalupe García Vázquez Matrícula: ES1921008556

package conexion.bdd;

public interface AccesoDatos {
    
    public abstract void establecerConexion();
    public abstract void insertar(String parametros);
    public abstract void cerrarConexion(boolean statusConexion); 

}
   
    
    
    


/* 5.1.1. establecerConexion
5.1.2. insertar
5.1.3. cerrarConexion con el parámetro de tipo booleano statusConexion

*/