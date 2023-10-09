/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program1;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class Program1 {

    public static void main(String[] args) {
        Scanner it =new Scanner ( System.in);
        double c1, c2, c3, c4, c5, c6,total,promedio;
       
             System.out.println("escribe calificacion 1: ");
             c1 = (int) it.nextDouble();
             System.out.println("Escribe la calificacion 2: ");
             c2= (int) it.nextDouble();
             System.out.println("escribe calificacion 3: ");
             c3 = (int) it.nextDouble();
             System.out.println("Escribe la calificacion 4: ");
             c4= (int) it.nextDouble();
             System.out.println("escribe calificacion 5: ");
             c5 = (int) it.nextDouble();
             System.out.println("Escribe la calificacion 6: ");
             c6= (int) it.nextDouble();
             total= c1 + c2 + c3 + c4 + c5 + c6;
             System.out.println("total, "+total);
             promedio=total/6;
             System.out.println("promedio, "+promedio);
                      
    }
}
