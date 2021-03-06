
import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* Guadalupe Garcia */
public class FigurasGeometricas {

    
//INICIO DE CLASE

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner entra = new Scanner(System.in);

       try {
        //Usuario
        String user = JOptionPane.showInputDialog("Ingrese el nombre del usuario ");
        Byte edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese su edad "));
        final int EDAD_MAXIMA = 100;

        
            //Validar
            if (edad < EDAD_MAXIMA) {
                JOptionPane.showMessageDialog(null, "Bievenido " + user);

            } else {

                JOptionPane.showMessageDialog(null, "La edad ingresada no es válida");

            }

            //Main principal
//Declaracion
            byte Pregunta, Pregunta1 = 0;

            //Exception try-catch
            Pregunta1 = Byte.parseByte(JOptionPane.showInputDialog("¿Qué obtener un área? \n 1. Si \n 2. No "));
            int pregunta1 = 0;

            while (Pregunta1 == 1) {

                Pregunta = Byte.parseByte(JOptionPane.showInputDialog("¿Qué desea calcular? \n 1. Área Trapecio \n 2. Área circulo \n 3. Área Pentágono "));

//CASO 1
                if (Pregunta == 1) {//Trapecio
                    JOptionPane.showMessageDialog(null, "Calcular el área del Trapecio");
                    Figuras F1 = new Figuras(Float.NaN);

                    Pregunta1 = Byte.parseByte(JOptionPane.showInputDialog("¿Qué obtener un área? \n 1. Si \n 2. No "));
                }//Principal
                else {   //CASO 2
                    if (Pregunta == 2) {//Inicio segunda- Círculo
                        JOptionPane.showMessageDialog(null, "Calcular el área del Círculo");
                        Figuras F2 = new Figuras(Float.NaN, Float.NaN);

                        Pregunta1 = Byte.parseByte(JOptionPane.showInputDialog("¿Qué obtener un área? \n 1. Si \n 2. No "));
                    }//cierre segunda
                    else {

                        if (Pregunta == 3) { //CASO 2
                            JOptionPane.showMessageDialog(null, "Calcular el área del Pentagono");
                            Figuras F3 = new Figuras(Float.NaN, Float.NaN, Float.NaN);

                            Pregunta1 = Byte.parseByte(JOptionPane.showInputDialog("¿Qué obtener un área? \n 1. Si \n 2. No "));
                        }//Cirre tercer
                        else {
                            JOptionPane.showMessageDialog(null, "Respuesta errónea");

                            Pregunta1 = Byte.parseByte(JOptionPane.showInputDialog("¿Qué obtener un área? \n 1. Si \n 2. No "));
                        }

                    }//cierre segunda

                }

            }//cierre principal

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, datos inválidos:  " + e);

        }//FinCatch 
        finally {

            JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");

        }//FIN DE MAIN

    }

}//FIN DE CLASE

