/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p19menormayora0;
import java.util.Scanner;

public class U3p19MenorMayorA0 {

    public static void main(String[] args) {
       Scanner Scanner = new Scanner(System.in);
        
    
        System.out.print("Ingrese la cantidad de números: ");
        int n = Scanner.nextInt();
        
        
        int cero = 0;
        int mayorCero = 0;
        int menorCero = 0;
        
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            int numero = Scanner.nextInt();
            
           
            if (numero == 0) {
                cero++;
            } else if (numero > 0) {
                mayorCero++;
            } else {
                menorCero++;
            }
        }
        
       
        System.out.println("Cantidad de números cero: " + cero);
        System.out.println("Cantidad de números mayores a cero: " + mayorCero);
        System.out.println("Cantidad de números menores a cero: " + menorCero);
        
       
        Scanner.close();
    }
}
