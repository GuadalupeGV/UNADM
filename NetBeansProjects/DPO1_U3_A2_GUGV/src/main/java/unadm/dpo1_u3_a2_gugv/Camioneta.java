package unadm.dpo1_u3_a2_gugv;

public class Camioneta extends Vehiculo{
 protected Double capacidadCarga;
 protected String traccion;
  
 //constructor
   public Camioneta(String marca,String modelo,int anio,Double precio,String tipo,Double capacidadCarga,String traccion){
    super(marca,modelo,anio,precio,tipo);
    this.capacidadCarga=capacidadCarga;
    this.traccion=traccion;
    
  }  //finalconstructor
 
 //Getter y setter
    public Double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public String getTraccion() {
        return traccion;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
        
 //sobreescribimos el metodo de la clase padre, ya que aparte de tener los atributos de la clase padre tiene un atributo más
  @Override
 public String datosVehiculo(){
     return "\n\n....................................."+
             "\nDatos de la Camioneta:"+
             "\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+anio+"\nPrecio:$"+precio+
     "\nCaracterísticas de la Camioneta:"+
             "\nCapacidad de carga: "+capacidadCarga+"\nTracción: "+traccion;
         
      }

 
}//finCamioneta

