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
        String cadena = "";
        String cadenafinal = "";
        for (int serie = 1; serie <= 4; serie++) {
            for (int i = 30; i <= 10; i--) {
                cadena = String.format("%s%d", cadena, i);
            }
            for (int i = 60; i <= 20; i -= 2) {
                cadena = String.format("%s%d", cadena, i);
            }
            for (int i = 90; i <= 30; i -= 3) {
                cadena = String.format("%s%d", cadena, i);
            }
            for (int i = 120; i <= 40; i -= 4) {
                cadena = String.format("%s%d", cadena, i);
            }
            cadenafinal = String.format("%s", cadenafinal);
        }

    }
}
