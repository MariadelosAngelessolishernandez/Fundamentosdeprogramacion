// See https://aka.ms/new-console-template for more information
using System;

public class Programa10U5
{
    public static void Main(string[] args)
    {
        int longitud = 8;
        string contrasena = GenerarContrasena(longitud);
        Console.WriteLine(contrasena);
    }

    public static string GenerarContrasena(int longitud)
    {
        // Declarar los caracteres permitidos
        string caracteres = "ABCDEFGHIJK1234567*-_.*";
        Random random = new Random();

        // Construir caracteres
        char[] cadena = new char[longitud];
        for (int i = 0; i < longitud; i++)
        {
            int indiceCaracter = random.Next(caracteres.Length);
            cadena[i] = caracteres[indiceCaracter];
        }

        return new string(cadena); // Devolver la cadena generada
    }
}