/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p8u5;
import java.util.Random;
import java.util.Scanner;

public class P8U5 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de veces que desea lanzar el dado: ");
        int vecesLanzamiento = sc.nextInt();

        System.out.println("Resultados de los lanzamientos:");

        for (int i = 0; i < vecesLanzamiento; i++) {
            int resultado = lanzarDado();
            System.out.println("Lanzamiento " + (i + 1) + ": " + resultado);
        }
    }

    // Función para simular el lanzamiento de un dado de 6 caras
    static int lanzarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
