/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p13u2;
import java.util.Scanner;

public class P13U2 {

    public static void main(String[] args) {
        float [][] temp=new float [5][7];
        Scanner sc=new Scanner(System.in);
        for(int f=0; f<5;f++){
        for(int c=0; c<7;c++){
            System.out.println("ESCRIBE TEMPERATURA EN("+f+","+c+")");
            temp[f][c]=sc.nextFloat();
            
    }
        float[][] tempF=new float[5][7];
        for(int F=0; F<5;f++){
          for(int c=0; c<7;c++){ 
              tempF[f][c]=(temp[f][c]*9/5)+32;
              System.out.println("f en("+f+","+c+")"+tempF[f][c]+",");
        }
          System.out.println();
}
    }
}
}

