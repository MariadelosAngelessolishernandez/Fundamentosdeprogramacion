// See https://aka.ms/new-console-template for more information
using System;
namespace pro16U4
{
    internal class program
    {
        static void Main(string[] args)
        {

            char[,] letras = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
           //int fila = letras.GetLength(0);
           // int columna = letras.GetLength(1);
            for (int f = 1; f >= 0; f--)  {
                for (int c = 2; c >= 0; c--) {
                    Console.WriteLine(letras[f, c] + ",");
                }
                Console.WriteLine();
            }
            
        }
    }
}

