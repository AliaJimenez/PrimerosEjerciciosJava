/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosimparesfor;

/**
 *
 * @author alian
 */
public class Numerosimparesfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que imprima los números impares del 1 al 100 utilizando ciclos "for".
        for (int i=0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
