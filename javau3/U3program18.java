/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3program18;


public class U3program18 {

    public static void main(String[] args) {
        
        double salario=1500;
        double incremento=0.10;
        double salarioActual;
          for (int i = 1; i <= 6; i++) {
              
           salarioActual = salario + salario * incremento;
            
            System.out.println("Año " + i + ": $" + salarioActual);
            
            salario = salarioActual;
        }
        
        System.out.println("Salario después de 6 años: $" + salario);
    }
}
        
