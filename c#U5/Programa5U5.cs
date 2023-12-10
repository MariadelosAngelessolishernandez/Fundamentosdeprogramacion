// See https://aka.ms/new-console-template for more information
using System;

namespace P5U5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese una frase para contar las palabras: ");
            string frase = Console.ReadLine();

            int cantidadPalabras = ContarPalabras(frase);
            Console.WriteLine("Número de palabras: " + cantidadPalabras);
        }

        // Función para contar las palabras en una cadena
        static int ContarPalabras(string cadena)
        {
            if (string.IsNullOrEmpty(cadena))
            {
                return 0;
            }

            string[] palabras = cadena.Split(new char[] { ' ', '\t', '\n', '\r' }, StringSplitOptions.RemoveEmptyEntries);
            return palabras.Length;
        }
    }
}