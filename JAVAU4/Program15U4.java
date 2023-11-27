/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program15u4;

/**
 *
 * @author Dell E7470
 */
public class Program15U4 {

    public static void main(String[] args) {
             int[][] elementos = {{5, 7, 9}, {6, 8, 7}, {10, 3, 1}};

        for (int f = 0; f < elementos.length; f++) {
            int sumaFila = 0;
            for (int c = 0; c < elementos[f].length; c++) {
             
                sumaFila += elementos[f][c];
            }

          
            int mediaFila =sumaFila / elementos[f].length;

           
            System.out.println("Media de la fila " + (f + 1) + ": " + mediaFila);
        }
    }
}