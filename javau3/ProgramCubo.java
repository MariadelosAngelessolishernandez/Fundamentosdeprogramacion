/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programcubo;
import java.util.Scanner;

public class ProgramCubo {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de números naturales positivos: ");
        int cantidadNumeros = Scanner.nextInt();

        int contador = 0;

        
        while (contador < cantidadNumeros) {
            
            System.out.print("Ingrese un número natural positivo: ");
            int numero = Scanner.nextInt();

           
            if (numero > 0) {
               
                int cubo = numero * numero * numero;
                System.out.println("El cubo de " + numero + " es: " + cubo);
                contador++;
            } else {
                System.out.println("Por favor, ingrese un número natural positivo.");
            }
        }

        
        Scanner.close();
    }
}
