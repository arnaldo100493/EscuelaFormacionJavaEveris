/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author abarrime
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola Mundo");
        //JOptionPane.showMessageDialog(null, "Hola Mundo");
        //String nombre = "Pepe";
        //int numero1 = 2;
        //boolean validar = true
        //JOptionPane.showMessageDialog(null, nombre + " " + numero1);
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2"));
        int suma = 0;
        
        suma = num1 + num2;
       
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        
    }
    
}
