/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p1;

import java.util.Scanner;

/**
 *
 * @author Dell E7470
 */
public class U3p1 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int edad; //2
        System.out.println("Escribe tu edad: ");//3
        edad=sc.nextInt();
        if(edad>=18)
            System.out.println("Eres mayor de edad!!");//5a
        else //6
            System.out.println("eres menor de edad");//6a
        
    }
}
