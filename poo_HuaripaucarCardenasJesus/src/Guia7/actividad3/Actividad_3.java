
package Guia7.actividad3;

import javax.swing.JOptionPane;


public class Actividad_3 {

    
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
        
        Retorno obj1 = new Retorno();
        
        obj1.retornoTexto();
        
        obj1.retornoText();
        
        int suma = obj1.retornoOperacion(n1, n2);
        
        System.out.println("El resultado es "+suma);
    }
    
}
