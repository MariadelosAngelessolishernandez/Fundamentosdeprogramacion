package com.mycompany.p100numeros;
import java.util.Scanner;

public class P100numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int np = 0;
        int nn = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            if (numero > 0) {
                np++;
            } else if (numero < 0) {
                nn++;
            }
        }

        System.out.println("Números positivos: " + np);
        System.out.println("Números negativos: " + nn);
    }
}
