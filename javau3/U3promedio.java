/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3promedio;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class U3promedio {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		double c1,c2,c3,c4,c5,c6,suma,promedio; 
        System.out.println("ingrese la primera calificacion: ");
        c1 = sc.nextDouble();
        System.out.println("ingrese la segunda calificacion:");
        c2 = sc.nextDouble();
        System.out.println("ingrese la tercera calificacion:");
        c3 = sc.nextDouble();
        System.out.println("ingrese la cuarta calificacion: ");
        c4 = sc.nextDouble();
        System.out.println("ingrese la quinta calificacion:");
        c5 = sc.nextDouble();
        System.out.println("ingrese la sexta calificacion:");
        c6 = sc.nextDouble();
        suma = c1+c2+c3+c4+c5+c6;
        promedio = suma / 6; 
        if (promedio<=70){
        System.out.println("el alumno esta aprobado");
        }else{
        System.out.println("el alumno esta reprobado"); 
	}
}
}
        
    

