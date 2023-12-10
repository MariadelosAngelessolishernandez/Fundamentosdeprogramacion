/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1u5;

/**
 *
 * @author Dell E7470
 */
public class P1U5 {

    public static void main(String[] args) {
        System.out.println("suma="+suma(7,8));
        System.out.println("resta="+resta(7,8));
        System.out.println("multiplicacion="+multiplicacion(7,8));
        System.out.println("divicion="+divicion(7,8));
    }
    // metodo o funcion va despues de las llaves del main
    public static int suma(int a, int b){
        int r=a+b;
        return r;
    }
    public static int resta(int a, int b){
        int r=a-b;
        return r;
}
    public static int multiplicacion(int a, int b){
        int r=a*b;
        return r;
}
    public static int divicion(int a, int b){
        int r=a/b;
        return r;
}
}
