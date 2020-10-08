package unadm.dpo1_u3_a2_gugv;
//Guadalupe Garcia

public class Vehiculo {
    
    //Atributos
    protected String marca;
    protected  String modelo;
    protected  int anio;
    protected  Double precio;
    protected  String tipo;
    
        //Metodos
    
    //Metodo constructor-mismo nombre clase, no devuelve valor, declararse como publico
                    //parametro
   public Vehiculo(String marca, String modelo, int anio, Double precio, String tipo){
    this.marca=marca;
    this.modelo= modelo;
    this.anio= anio;
    this.precio= precio;
    this.tipo= tipo;
    
   } 
 
   //Getter y Setter  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
     //Metodos retornos valores
    
    
    
    public String datosVehiculo(){
               
       return "\n\n....................................."+
               "\nDatos del vehículo "+
               "\nMarca: "+marca+"\nModelo: "+modelo+"\nAño: "+anio+"\nPrecio:$ "+precio;
    
    
    }//datosvehiculo
  
    }//Vehiculo

