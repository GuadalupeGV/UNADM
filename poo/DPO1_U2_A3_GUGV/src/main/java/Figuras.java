
import javax.swing.JOptionPane;



public class Figuras {//Inicio principal
    
    
float  BaseMayor = 0, BaseMenor = 0, h = 0;
double Radio= 0,Radio2, Areacirculo;
final double PI =3.1416;
    
     //Atributos
public Float Trapecio;
public Float Circulo;
public Float Pentagono;        
    
        
    
    //Metodo 1(Trapecio)

    public Figuras(Float Trapecio) {
        this.Trapecio = Trapecio;
 
//Trapecio
// Atributos
          
     
 //Llamado
 BaseMayor= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Base Mayor del Trapecio "));
 BaseMenor= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Base Menor del Trapecio "));
 h= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la Altura del Trapecio "));
 
 //Metodos
   Trapecio=(BaseMayor + BaseMenor)* h;
  
 JOptionPane.showMessageDialog(null,"El área del Trapecio es = " + Trapecio+ " u2 "); 
   
        
     }

    
    
    
    public Figuras(Float Trapecio, Float Circulo) {
       this.Circulo = Circulo;

// Circulo
// Atributo


//Llamado
Radio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo "));
 
//Metodo
Radio2=Radio*Radio;
Areacirculo= (Double) (PI* Radio2);

JOptionPane.showMessageDialog(null,"El área del círculo es = " +Areacirculo+ " u2 ");  
       
       
       
       
    }
    
    

    public Figuras(Float Trapecio, Float Circulo, Float Pentagono) {
       this.Pentagono = Pentagono;

//Pentagono
// Atributo
float Perimetro, Lado = 0, Apotema = 0;

//Llamado

Lado= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de un lado del Péntagono "));
Apotema= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del Apotema del Péntagono "));

 //Metodo
Perimetro= Lado*5;
Pentagono=(Perimetro * Apotema) / 2;

JOptionPane.showMessageDialog(null,"El área del Pentagono es = " + Pentagono+ " u2 ");
       
       
       
       
    }
    
    

    
    
    
    
    

    
    

    
    
    
    
    
    
    
    
    
    
    
}//Final Principal
