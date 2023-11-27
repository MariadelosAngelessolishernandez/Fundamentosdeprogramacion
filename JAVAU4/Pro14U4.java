/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro14u4;


public class Pro14U4 {

    public static void main(String[] args) {
       
          int[][] elementos={{5,7,9},{6,8,7},{10,3,1}};
          int suma=0;
          
            for (int f = 0; f < elementos.length; f++) {
             for (int c = 0; c < elementos[f].length; c++){
             suma += elementos[f][c];
             }
          }
        System.out.println("suma de todos los elementos: "+suma);
    }
}


