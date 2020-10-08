
package unadm.dpo1_u3_a2_gugv;

public class ClasePrincipal {


    public static void main(String[] args) {
      
    //Arreglo de los vehículos, reservamos memoria para las dos clases hijas
    
    Vehiculo vehiculos[]= new Vehiculo[3];
    
    
    //Mostrara los valores generales del metodo de la Superclase "Vehiculos"
    vehiculos[0]= new Vehiculo("Marca", "modelo", 2019, 283.222, "tipo");
    
    
    /*
    Para la siguientes observamos como se aplico el polimorfismo.
    Es en este momento cuándo utilizamos este concepto, ya que debido a qué las clases hijas "Sedan y Camioneta"
    tienen más atributos que la clase padre, necesitamos modificar el metodo, por lo que se darán variaciones del mismo proceso.
    Es decir, se esta almacenando objetos de las subclases (Sedan y Camioneta) en la clase padre*/
        
    vehiculos[1]= new Sedan("Toyota", "Yaris", 2020, 230300.000, "Deportivo", false);
    vehiculos[2]=new Camioneta("Chevrolet", "Silverado", 2020, 575200.000, "Carga", 1025.00, "4x4");
    
    
    for(Vehiculo vehiculo: vehiculos){
        System.out.println(vehiculo.datosVehiculo());
        System.out.println("");
    }

}
    
    
}    
    