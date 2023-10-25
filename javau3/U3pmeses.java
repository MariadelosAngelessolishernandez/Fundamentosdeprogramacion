/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3pmeses;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class U3pmeses {

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int mes;
        
        System.out.print("Escrebi el mes en numerico: ");
        mes=sc.nextInt();
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
                case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
                case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
               System.out.println("Agoato");
                break;
            case 9:
                System.out.println("Septirmbre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
                
           case 11:
               System.out.println("Noviembre");
                break;
                
                case 12:
               System.out.println("Diciembre");
                break;
                
            default:
                System.out.println("No exixte el mes ingresado");
                
         
                
                
    }
}
}
