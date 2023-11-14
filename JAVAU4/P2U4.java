/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2u4;

/**
 *
 * @author Dell E7470
 */
public class P2U4 {

    public static void main(String[] args) {
         int[] calificaciones = new int[] { 100, 70, 80, 90, 81, 70, 84, 78, 100, 79,70 };
 int suma = 0, promedio = 0;


 for (int i = 0; i < calificaciones.length; i++)
 {
   //  suma = suma + calificaciones[i];

     System.out.println("Calificacion: " + i + " es: " + calificaciones[i]);
     suma += calificaciones[i];

     
 }
promedio = suma / calificaciones.length;
 System.out.println("El promedio es: " + promedio);

    }
}
