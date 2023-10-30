/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programn;
import java.util.Scanner;

public class U3programN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char opcion;
        do{
          System.out.println("Bienvenida a una sola ejecucion");
          System.out.println(" Escribe n para salir!!");
          opcion=sc.next().charAt(0);
          System.out.println(opcion);
          
        }while(opcion !='n');
        
    }
}

