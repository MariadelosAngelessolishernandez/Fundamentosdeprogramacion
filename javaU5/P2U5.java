/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2u5;
import java.util.Scanner;

public class P2U5 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Elige el tipo de conversión a realizar: ");
        System.out.println("1. Temperatura ºC a ºF");
        System.out.println("2. Temperatura ºF a ºK");
        System.out.println("3. Medida pulgadas a metros");
        System.out.println("4. Tiempos horas a segundos");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Escribe los ºC a convertir:");
                double c = sc.nextDouble();
                System.out.println("Tu resultado es: " + temperaturaCF(c));
                break;
            case 2:
                System.out.println("Tu resultado es: " + temperaturaFK());
                break;
            case 3:
                medida();
                break;
            case 4:
                System.out.println(tiempo());
                break;
            default:
                System.out.println("La opción es incorrecta");
                break;
        }
    }

    public static double temperaturaCF(double c) {
        return (c * 1.8) + 32;
    }

    public static double temperaturaFK() {
        System.out.println("Escribe la temperatura ºF a convertir:");
        double F = new Scanner(System.in).nextDouble();
        return (F - 32) * (5.0 / 9.0) + 273.15;
    }

    public static void medida() {
        System.out.println("Escribe la medida en pulgadas:");
        double p = new Scanner(System.in).nextDouble();
        double resultado = p / 39.37;
        System.out.println("Tu resultado es: " + resultado);
    }

    public static double tiempo() {
        System.out.println("Escribe las horas a convertir:");
        double h = new Scanner(System.in).nextDouble();
        return h * 3600;
    }
}
    

