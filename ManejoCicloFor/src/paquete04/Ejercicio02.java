/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        double celcius;
        double fahrenheit = 20.0;
        String cadena = "";

        for (int operacion = 0; operacion <= 20; operacion++) {

            celcius = 5.0 / 9.0 * (fahrenheit - 32);

            cadena = String.format("%sOperación(%d)Fahrenheit: %.2f ===>"
                    + " Celcius: %.2f\n",
                    cadena,
                    operacion,
                    fahrenheit,
                    celcius);

            fahrenheit = fahrenheit + 4;
        }
        System.out.printf(cadena);
    }

}
