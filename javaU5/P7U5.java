/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p7u5;
import java.util.Scanner;

public class P7U5 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el subtotal: ");
        double subtotal = sc.nextDouble();

        System.out.print("Ingrese la tasa de IVA : ");
        double tasaIVA = sc.nextDouble();

        // Calcular el IVA, Subtotal y Total
        double iva = calcularIVA(subtotal, tasaIVA);
        double total = calcularTotal(subtotal, iva);

        // Mostrar los resultados
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);
    }

    // Función para calcular el IVA
    static double calcularIVA(double subtotal, double tasaIVA) {
        return subtotal * (tasaIVA / 100);
    }

    // Función para calcular el Total
    static double calcularTotal(double subtotal, double iva) {
        return subtotal + iva;
    }
}
