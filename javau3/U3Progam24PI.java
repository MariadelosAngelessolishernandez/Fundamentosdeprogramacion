/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3progam24pi;
 import java.util.Scanner;

public class U3Progam24PI {
    
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int numero;

        do {
           
            System.out.print("Ingrese un número o un número negativo para salir): ");
            numero = sc.nextInt();
        

            
            if (numero >= 0) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " es un número par.");
                } else {
                    System.out.println(numero + " es un número impar.");
                }
            } else {
                System.out.println("¡Hasta luego!");
            }

        } while (numero >= 0); 

       
       
    }
}

 
