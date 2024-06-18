/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosClase;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class RFC {

    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog(null, "Ingresa tu RFC", "RFC", 1);

        Pattern patron = Pattern.compile("([A-Z0-9]{4})([0-9]{6})([A-Z0-9]{3})");
        //Pattern patron = Pattern.compile("([A-Z\\d{4}])([\\d{4}])([A-Z|\\d{3}])");
        Matcher mat = patron.matcher(cadena.toUpperCase());

        //boolean validacion = false;
        //while (validacion==false) {
        while (!mat.matches()) {
            JOptionPane.showMessageDialog(null, "RFC es invalido", "RFC", 0);

            cadena = JOptionPane.showInputDialog(null, "Ingresa tu RFC", "RFC", 1);

            patron = Pattern.compile("([A-Z0-9]{4})([0-9]{6})([A-Z0-9]{3})");
            //Pattern patron = Pattern.compile("([A-Z\\d{4}])([\\d{4}])([A-Z|\\d{3}])");
            mat = patron.matcher(cadena.toUpperCase());

            if (mat.matches()) {
                JOptionPane.showMessageDialog(null, "RFC: " + cadena.toUpperCase() + "\nEs válido", "RFC", 3);
            }

        }
    }
}
