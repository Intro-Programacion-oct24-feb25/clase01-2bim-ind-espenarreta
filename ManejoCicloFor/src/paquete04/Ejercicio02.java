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
        String cadena = "";

        for (int i = 30; i <= 10; i--) {
            cadena+= String.format("%s%d-%d-%d-%d\n", cadena,
                    i, i * 2, i * 3, i * 4);
        }
        System.out.print(cadena);
    }
}
