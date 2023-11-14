/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p4u4;
import java.util.Scanner;

public class P4U4 {

      Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        double Numero = 0;
int tam;

System.out.println("Ingresa la cantidad de numeros a procesar:");
tam = sc=nextInt();

int[] Numeros = new int[tam];

for (int i = 0; i < Numeros.length; i++)
{
    System.out.println("Ingrese un número: " + i + " :");
    Numero = sc=nextInt();
    if (Numero < 0)
    {
        i++;
    }
    
}

System.out.println("Números negativos: " +Numero);
            
    }
}
