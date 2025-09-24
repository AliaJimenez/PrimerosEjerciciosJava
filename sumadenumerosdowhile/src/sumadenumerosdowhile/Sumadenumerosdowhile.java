/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadenumerosdowhile;

/**
 *
 * @author alian
 */
public class Sumadenumerosdowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos "do while".
        int i = 1;
        int suma = 0;
        
        do {
            suma += i;
            i++;
        } while(i <= 50);
        
        System.out.println("La sumatoria de los numeros del 1 al 50 es: "+ suma);
    }
    
}
