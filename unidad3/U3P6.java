/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p6;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class U3P6 {

    public static void main(String[] args) {
         Scanner sc = new  Scanner(System.in);
         int n1,n2;
        System.out.println("Intruduce el primer numero");
        n1=sc.nextInt();
        System.out.println("Intruduce el segundo numero");
        n2=sc.nextInt();
       
        if(n1==n2)
		 System.out.println("Son iguales");
		else
		 {
			if(n1>n2)
				System.out.println(n1 + " es mayor que " + n2);
			else
				System.out.println(n2 + " es mayor que " + n1);
		 }
	}

}
        
    
