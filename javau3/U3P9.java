/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3p9;
import java.util.Scanner;

/**
 *
 * @author Dell E7470
 */
public class U3P9 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
         int cobro, horas;
        System.out.print("Ingresa el valor de horas: ");
        horas = sc.nextInt();
        sc.nextLine();
        cobro=0;
        if(horas<=2)
            cobro=horas*5;
        if(horas>2&&horas<=5)
            cobro=2*5+(horas-2)*4;
        if(horas>5&&horas<=10)
            cobro=2*5+3*4+(horas-5)*3;
        if(horas>10)
            cobro=2*5+3*4+5*3+(horas-10);
        System.out.println("Valor de cobro: " + cobro);
        
    }
}

