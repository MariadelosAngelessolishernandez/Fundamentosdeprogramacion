/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program6;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class Program6 {

    public static void main(String[] args) {
         Scanner it =new Scanner(System.in);
         double p1,p2,p3,subtotal,ivaT,total;
         final double iva=0.16;
        System.out.println("Escribir el precio p1");
        p1= it.nextDouble();
        System.out.println("Escribe un numero p2");
        p2= it.nextDouble();
        System.out.println("Escribir el precio p3");
        p3= it.nextDouble();
        total=p1 + p2 + p3;
        System.out.println("total,"+total);
        ivaT=total*iva;
        System.out.println("ivaT,"+ivaT);
        subtotal=total-ivaT;
        System.out.println("subtotal,"+subtotal);
        
    }
}
