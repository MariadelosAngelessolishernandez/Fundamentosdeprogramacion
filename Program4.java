/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program4;
import java.util.Scanner;

/**
 *
 * @author Dell E7470
 */
public class Program4 {

    public static void main(String[] args) {
        Scanner it =new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce los grados Celcius");
        gradosC = it.nextDouble();
        gradosF = (gradosC * 9/5) + 32;
        System.out.println( gradosC + " grados Celcius es igual a " + gradosF + " grados Farenheit");
    }
    
}

        
    

