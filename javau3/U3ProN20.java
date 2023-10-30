/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3pron20;
import java.util.Scanner;

public class U3ProN20 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c=1,horas,pago,sueldo;
        while (c<=20){
            System.out.println("captura las horas trabajadas");
            horas=sc.nextInt();
            System.out.println("captura del pago x hora: ");
            pago=sc.nextInt();
            sueldo=horas*pago;
            System.out.println("Tusueldo es:"+ sueldo);
            c++;
        }
       
    }
}
