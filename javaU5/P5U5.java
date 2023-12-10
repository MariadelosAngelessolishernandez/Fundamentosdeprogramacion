/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p5u5;
import java.util.Scanner;
public class P5U5 {

    public static void main(String[] args) {
  
 Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase para contar las palabras: ");
        String frase = sc.nextLine();

        int cantidadPalabras = contarPalabras(frase);
        System.out.println("Número de palabras: " + cantidadPalabras);
    }

    // Función para contar las palabras en una cadena
    static int contarPalabras(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return 0;
        }

        String[] palabras = cadena.split("\\s+"); // Dividir la cadena en palabras usando espacios en blanco como delimitadores
        return palabras.length;
    }
}