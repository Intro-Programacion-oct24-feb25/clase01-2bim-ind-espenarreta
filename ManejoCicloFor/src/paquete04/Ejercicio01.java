/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int i;
        String cadena = "";
        String cadena2 = "";
        int serie;
        for (i = 30; i <= 10; i--) {
            for (int i2 = 1; i2 <= 4; i2++){
                serie = i * i2;
                cadena = String.format("%s%d-", cadena, serie);
            }
            cadena2 = String.format("%s%s\n", cadena2, cadena);
            cadena = "";
        }
        System.out.printf("%s\n", cadena2);
    }
}
