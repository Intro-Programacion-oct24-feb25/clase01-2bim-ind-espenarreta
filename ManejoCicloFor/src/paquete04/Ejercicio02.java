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
        double fahrenheit;
        String cadena = "";
        for (int operacion = 0; operacion <= 20; operacion++) {
            for (fahrenheit = 20.00; fahrenheit <= 100; fahrenheit += 4) {

                celcius = 5.0 / 9.0 * (fahrenheit - 32);
                
                cadena = String.format("%sOperación(%d)Fahrenheit: %.2f ===>"
                        + " Celcius: %.2f\n",
                        cadena,
                        operacion,
                        fahrenheit,
                        celcius);
            }
        }
        System.out.printf(cadena);
    }
}
