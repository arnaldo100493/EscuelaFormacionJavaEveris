package calculadora;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abarrime
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* String limite = JOptionPane.showInputDialog("Ingrese límite");
        while (!limite.equals("5")) {
            limite = JOptionPane.showInputDialog("Ingrese límite");
        }*/
        String opcion = "";
        do {
            try {
                opcion = JOptionPane.showInputDialog("Seleccione departamento\n\nA. Antioquia\n\nB. Valle\n\nC. Cundinamarca\n\nD. Quindio\n\n\n\nSeleccione la opción deseada:");
                if (opcion != null) {
                    switch (opcion) {
                        case "a":
                            opcion = JOptionPane.showInputDialog("Seleccione Ciudad\n\nA. Medellín\n\nB. Rionegro\n\nC. Turbo\n\nD. Quindio\n\n\n\nSeleccione la opción deseada:");
                            switch (opcion) {
                                case "a":
                                    opcion = JOptionPane.showInputDialog("Seleccione Ciudad\n\nA. 1960\n\nB. 2030\n\nC. 520 a.C.\n\n\n\nSeleccione la opción deseada:");
                                    switch (opcion) {
                                        case "a":
                                            break;

                                        case "b":

                                            break;

                                        case "c":

                                            break;

                                        default:
                                            JOptionPane.showMessageDialog(null,
                                                    "Opción no válida", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                            break;
                                    }
                                    break;

                                case "b":

                                    break;

                                case "c":

                                    break;

                                case "d":

                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null,
                                            "Opción no válida", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                    break;

                            }

                            break;

                        case "b":
                            break;

                        case "c":
                            break;

                        case "d":
                            break;

                        default:
                            JOptionPane.showMessageDialog(null,
                                    "Opción no válida", "Advertencia", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Ingrese una opción", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        "Ocurrió un error", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!opcion.equals("a") || !opcion.equals("b") || !opcion.equals("c") || !opcion.equals("d"));
    }

}
