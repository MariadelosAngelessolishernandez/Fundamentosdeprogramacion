/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p11;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class U3p11 {

    public static void main(String[] args) {
         Scanner sc = new  Scanner(System.in);
        int numero; //2
        System.out.println("Escribe un numero entero: ");//3
        numero=sc.nextInt();
        if(numero %2==0)
            System.out.println("Es par!!");//5a
        else //6
            System.out.println("Es impar");//6a
        
        
    }
}
