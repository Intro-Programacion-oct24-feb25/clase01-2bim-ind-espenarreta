/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int i2 = 1; i2 <= i; i2++) {
                
                System.out.printf("*");
            }
            System.out.println("");
        }
        
        for (int i = 5; i >= 1; i--) {
            for (int i2 = 1; i2 <= i; i2++) {

                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
