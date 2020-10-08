package Arreglos;

/**
 * Guadalupe Garcia
 */
public class vehiculos {

//Atributos
    private String marca;
    private String modelo;
    private float valorComercial;
    private char tipoAutomovil;
    private float valorMonetario;

    //Constructor Objeto
    public vehiculos() {
        marca = "";
        modelo = "";
        valorComercial = 0;
        tipoAutomovil = ' ';
        valorMonetario = 0;

    }
    public vehiculos(String marca,String modelo, float valorComercial, char tipoAutomovil){
        marca = "";
        modelo = "";
        valorComercial = 0;
        tipoAutomovil = ' ';
        valorMonetario = 0;
                
    }
    
    
    
    

    //Setter y getter
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

    public Float getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(Float valorComercial) {
        this.valorComercial = valorComercial;
    }

    public char getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(char tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public Float getValorMonetario() {
        return valorMonetario;
    }

    public void setValorMonetario(Float valorMonetario) {
        this.valorMonetario = valorMonetario;
    }

}//final
