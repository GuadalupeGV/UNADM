package unadm.dpo1_u3_a2_gugv;

public class Sedan extends Vehiculo{
  protected Boolean descapotable;
  
  //inicioconstructor
  public Sedan(String marca,String modelo,int anio,Double precio,String tipo,Boolean descapotable){
    super(marca,modelo,anio,precio,tipo);
    //instancia de los atributos de la clase hija
    this.descapotable=descapotable;
        
  }  //finalconstructor

  
  //getter y setter
    public Boolean getDescapotable() {
        return descapotable;
    }
    public void setDescapotable(Boolean descapotable) {
        this.descapotable = descapotable;
    }//Fin getter
 
    //sobreescribimos el metodo de la clase padre, ya que aparte de tener los atributos de la clase padre tiene un atributo más
  @Override
   public String datosVehiculo(){
     return "\n\n....................................."+
             "\nDatos del Sedan"+
               "\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+anio+"\nPrecio:$"+precio+
          "\nCaracterísticas del Sedan: "+
              "\nDescapotable:"+descapotable;
              
   }//fin datosVehiculo
      
}//finVehiculo

