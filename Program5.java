/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program5;
import java.util.Scanner;

/**
 *
 * @author Dell E7470
 */
public class Program5 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ingresa el valor en metros");
        double metro = sc.nextDouble();
        double convertir =metro*3.28084;
        System.out.println(convertir + "ft");
    }
}

