/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paroimpar;

/**
 *
 * @author alian
 */
public class Paroimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que ingresado un numero, me indique si es par o impar.
        int numero = 6; 

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
    
}
