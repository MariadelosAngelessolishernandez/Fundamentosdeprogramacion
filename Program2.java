/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program2;
import java.util.Scanner;

/**
 *
 * @author Dell E7470
 */
public class Program2 {

    public static void main(String[] args) {
        Scanner it=new Scanner( System.in);
        double y,a;
        double suma=0;
        double x;
        System.out.println("Escribe el valor de y");
        y = it.nextDouble();
        System.out.println("Escribe el valor de a");
        a = it.nextDouble();
        suma= y + a + 3;
        System.out.println("El valor de x es:" +suma);
        
    }
}
