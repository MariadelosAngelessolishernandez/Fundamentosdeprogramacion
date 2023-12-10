/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p9u5;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class P9U5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el sueldo diario del trabajador: $");
        double sueldoDiario = sc.nextDouble();

        System.out.print("Ingrese el tiempo laborado (en días): ");
        int tiempoLaborado = sc.nextInt();

        // Calcular finiquito
        double finiquito = calcularFiniquito(sueldoDiario, tiempoLaborado);

        // Mostrar resultado
        System.out.println("Finiquito del trabajador: $" + finiquito);
    }

    // Función para calcular el finiquito
    static double calcularFiniquito(double sueldoDiario, int tiempoLaborado) {
        return sueldoDiario * tiempoLaborado;
    }
}