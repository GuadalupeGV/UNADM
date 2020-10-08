

package com.mycompany.dpo1_u1_1;

import javax.swing.JOptionPane;

/**  Guadalupe Garcia */
public class Formulario extends javax.swing.JFrame {


    public Formulario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        texto = new javax.swing.JLabel();
        BotonRectangulo = new javax.swing.JRadioButton();
        BotonTriangulo = new javax.swing.JRadioButton();
        BotonPromedio = new javax.swing.JRadioButton();
        BotonComparacion = new javax.swing.JRadioButton();
        SalirBoton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        texto.setText("Seleccionar la opción que desea");

        buttonGroup1.add(BotonRectangulo);
        BotonRectangulo.setText("Área Rectángulo");
        BotonRectangulo.setName(""); // NOI18N
        BotonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRectanguloAccion(evt);
            }
        });

        buttonGroup1.add(BotonTriangulo);
        BotonTriangulo.setText("Área triángulo");
        BotonTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTrianguloAccion(evt);
            }
        });

        buttonGroup1.add(BotonPromedio);
        BotonPromedio.setText("Obtener promedio");
        BotonPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPromedioAccion(evt);
            }
        });

        buttonGroup1.add(BotonComparacion);
        BotonComparacion.setText("Comparar números");
        BotonComparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComparacionAccion(evt);
            }
        });

        SalirBoton.setText("Salir");
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirAccion(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(texto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonTriangulo)
                            .addComponent(BotonRectangulo)
                            .addComponent(BotonPromedio)
                            .addComponent(BotonComparacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(SalirBoton)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonPromedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonComparacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(SalirBoton)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRectanguloAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRectanguloAccion
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,"Calculo de área de un rectángulo");
              
//Rectangulo
// Atributos
     int  lado1 = 0, lado2 = 0, AreaRectangulo;   
     
 //Llamado
 lado1= (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de base"));
 lado2= (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la altura"));
 
 //Metodos
  AreaRectangulo=lado1*lado2;
  
 JOptionPane.showMessageDialog(null,"El área del rectángulo es = " + AreaRectangulo+ " u2 "); 
   
 //name.ischeket = false 
  
        
        
    }//GEN-LAST:event_BotonRectanguloAccion

    private void BotonTrianguloAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTrianguloAccion
        // TODO add your handling code here:
        
         JOptionPane.showMessageDialog(null,"Calculo de área de un triángulo");
            
//Triangulo
// Atributos
   Integer base = 0, altura = 0;   
   Float  AreaTriangulo;
 //Llamado
 base= (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la base"));
 altura= (int) Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del la altura"));
 
 //Metodos
  AreaTriangulo=(float)base*altura/2;
 JOptionPane.showMessageDialog(null,"El área del Triángulo es = " + AreaTriangulo+ " u2 ");     
         
         
         
                
    }//GEN-LAST:event_BotonTrianguloAccion

    @SuppressWarnings("empty-statement")
    private void BotonPromedioAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPromedioAccion
           
        //Variables
         int datos=0, acumulado = 1;
         float total=0;
         float valorIngresado= 0;
         float promedio;
               
        datos= (int) Float.parseFloat(JOptionPane.showInputDialog("¿Cuántas calificaciones desea ingresar?"));
     
        while(acumulado<=datos){
        
         valorIngresado= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación número "+ acumulado));
         total+=valorIngresado;
         acumulado++;
        }
        promedio= total/datos;        
        JOptionPane.showMessageDialog(null,"El promedio de calificaciones ingresado es " + promedio);
        
        
              
    }//GEN-LAST:event_BotonPromedioAccion

    private void BotonComparacionAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComparacionAccion
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Comparación entre dos números");
        
    // Atributos
    double  numeroUno = 0, numeroDos= 0;   
     
 //Llamado
 numeroUno= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
 numeroDos= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));   
 
////CASO 1
if(numeroUno<numeroDos){
    JOptionPane.showMessageDialog(null,"El número " + numeroUno + " es < " + numeroDos);
}//Principal

 else{
     if (numeroUno > numeroDos){//CASO 2
           JOptionPane.showMessageDialog(null,"El número " + numeroUno + " es > " + numeroDos);
                
        } else {         
            if (numeroUno==numeroDos){ //CASO 3
              
            JOptionPane.showMessageDialog(null,"El número " + numeroUno + " es = " + numeroDos);
                
            } else {
                    JOptionPane.showMessageDialog(null,"Respuesta errónea");
            }
          }
 }
  
 
 

            
                        
        
    }//GEN-LAST:event_BotonComparacionAccion

    private void SalirAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirAccion
       JOptionPane.showMessageDialog(null," Gracias por ocupar el programa ");
       dispose();
    }//GEN-LAST:event_SalirAccion

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Formulario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonComparacion;
    private javax.swing.JRadioButton BotonPromedio;
    private javax.swing.JRadioButton BotonRectangulo;
    private javax.swing.JRadioButton BotonTriangulo;
    private javax.swing.JToggleButton SalirBoton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
