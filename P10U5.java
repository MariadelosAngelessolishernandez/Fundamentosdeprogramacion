/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p10u5;
import java.util.Random;

public class P10U5 {

    public static void main(String[] args) {
        int longitud=8;
        String contrasena= aleatorio(longitud);
        System.out.println(contrasena);
    }
    public static int aleatorio(int longitud) {
        //declarar los caracterres  permitidos
        String caracteres= "ABCDEFGHIJK1234567*-_.*";
      Random random= new Random();
      //construir caracteres
      StringBuilder cadena=new StringBuilder(longitud);
      for(int  i=0; i<longitud;i++){
      int indiceCaracter = random.nextInt(caracteres.length());//la longitud de los caracteres de clarados
      cadena.append(caracteres.charAt(indiceCaracter));
      }
      return random.nextInt();
    }
    
}
