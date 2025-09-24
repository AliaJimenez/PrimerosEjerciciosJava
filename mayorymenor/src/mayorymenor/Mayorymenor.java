/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayorymenor;

/**
 *
 * @author alian
 */
public class Mayorymenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.
        int num1 = 16;
        int num2 = 61;

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
    
}
