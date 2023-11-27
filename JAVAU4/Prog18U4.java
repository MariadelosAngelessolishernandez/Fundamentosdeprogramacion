/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog18u4;

/**
 *
 * @author Dell E7470
 */
public class Prog18U4 {

    public static void main(String[] args) {
       int diag[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int sumap=0;
       int sumai=0;
       int sumas=0;
    System.out.println("Diagonal principal.....");
    for(int c=0; c<diag.length; c++){
           System.out.println(diag[c][c]+"");
            sumap += diag[c][c];
    }
     System.out.println("Suma Diagonal Principal: " + sumap);

    System.out.println("Diagonal inversa...");
      for(int i=0; i<diag.length; i++){
           System.out.println(diag[i][diag.length -1 -i]+"");
           sumai +=diag[i][i];
      }
       System.out.println("Suma Diagonal Principal: " + sumai);
       System.out.println("Diagonal secundaria...");
      for(int i=1; i<3; i++){
           System.out.println(diag[i][i-1]+"");
           sumas +=diag[i][i-1];
      }
       System.out.println("Suma Diagonal Principal: " + sumas);
        System.out.println();
    }
}
