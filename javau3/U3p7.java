/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p7;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class U3p7 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int temperatura; 
        System.out.println("Ingresa la temperatura!");
        temperatura=sc.nextInt();
        if(temperatura>=27)
		 System.out.println("Hace calor");
		else
		 {
			if(temperatura >=20&& temperatura <27)
				System.out.println( " Clima agradable");
			else
                        {
                            if(temperatura <20)
                        
				System.out.println( " Clima frio ");
		 }
	}

}
}

        
    

  
