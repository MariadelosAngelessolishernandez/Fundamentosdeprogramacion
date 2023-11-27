/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p16u4;

public class P16U4 {

    public static void main(String[] args) {
                  char[][] letras = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };

     
        for (int f = letras.length - 1; f >= 0; f--) {
            
            for (int c = letras[f].length - 1; c >= 0; c--) {
                System.out.print(letras[f][c] + ",");
            }
            System.out.println();
        }
    }
}



