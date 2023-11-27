// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            int[,] elementos = { { 5, 7, 9 }, { 6, 8, 7 }, { 10, 3, 1 } };
            int suma = 0;

            for (int f = 0; f < elementos.GetLength(0); f++)
            {
                for (int c = 0; c < elementos.GetLength(1); c++)
                {
                    suma += elementos[f, c];
                }
            }
            Console.WriteLine("suma de todos los elementos: " + suma);
        }
    }
}
