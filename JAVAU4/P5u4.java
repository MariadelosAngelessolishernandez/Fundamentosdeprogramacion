/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p5u4;

/**
 *
 * @author Dell E7470
 */
public class P5u4 {

    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Mango", "Fresa", "Uva", "Liche","sandia"};

        // Crear un nuevo arreglo para almacenar las frutas al revés
        String[] frutasAlReves = new String[frutas.length];

        // Copiar las frutas al revés al nuevo arreglo
        for (int i = 0; i < frutas.length; i++) {
            frutasAlReves[i] = frutas[frutas.length - 1 - i];
        }

        // Imprimir el arreglo original
        System.out.println("Arreglo Original:");
        imprimirArreglo(frutas);

        // Imprimir el arreglo al revés
        System.out.println("\nArreglo al Revés:");
        imprimirArreglo(frutasAlReves);
    }

    // Método para imprimir un arreglo de Strings
    static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        
    }
}    

