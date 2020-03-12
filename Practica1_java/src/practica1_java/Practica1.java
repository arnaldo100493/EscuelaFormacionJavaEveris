
package practica1_java;

import javax.swing.JOptionPane;


public class Practica1 {

    
    public static void main(String[] args) {
        //System.out.println("Hola mundo");
        //JOptionPane.showMessageDialog(null,"Work..it");
        //String nombre = "pepe";
        //int numero = 5;
        //JOptionPane.showMessageDialog(null,nombre);
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 1: ") );
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2: ") );
        int suma = num1+num2;
        JOptionPane.showMessageDialog(null,suma);
         
        
    }
    
}
