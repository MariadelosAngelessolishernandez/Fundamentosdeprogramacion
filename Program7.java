/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program7;
import java.util.Scanner;
/**
 *
 * @author Dell E7470
 */
public class Program7 {
    

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int opcion;
        int n1;
        int n2;
        int r;
        
        System.out.println("Elige la operacion que quieras realizar");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.divicion");
        opcion = leer.nextInt();
        System.out.println("Escribe el primer numero");
        n1= leer.nextInt();
        System.out.println("Escribe el segundo numero");
        n2 = leer.nextInt();
        switch(opcion){
            case 1:
                r=n1+n2;
                System.out.println("El resultado es"+r);
                break;
            case 2:
                r=n1-n2;
                System.out.println("El resultado es"+r);
                break;
                case 3:
                r=n1*n2;
                System.out.println("El resultado es"+r);
                break;
                case 4:
                r=n1/n2;
                System.out.println("El resultado es"+r);
                break;
        }
    }
}
