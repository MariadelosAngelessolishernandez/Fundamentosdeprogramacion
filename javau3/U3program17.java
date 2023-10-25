/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3program17;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class U3program17 {

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int dia;
        
        System.out.print("Escrebe el dia de la semana numerico: ");
        dia=sc.nextInt();
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
                case 3:
                System.out.println("Miercole");
                break;
            case 4:
                System.out.println("Jueves");
                break;
                case 5:
                System.out.println("Viernas");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No exixte el dia ingresado");
                
                
              
            
                
        }
        
    }
}
