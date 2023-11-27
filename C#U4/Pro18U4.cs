// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            int[,] diag = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            int sumap = 0;
            int sumai = 0;
            int sumas = 0;

            Console.WriteLine("Diagonal principal.....");
            for (int c = 0; c < diag.GetLength(0); c++)
            {
                Console.Write(diag[c, c] + " ");
                sumap += diag[c, c];
            }
            Console.WriteLine("Suma Diagonal Principal: " + sumap);

            Console.WriteLine("Diagonal inversa...");
            for (int i = 0; i < diag.GetLength(0); i++)
            {
                Console.Write(diag[i, diag.GetLength(0) - 1 - i] + " ");
                sumai += diag[i, diag.GetLength(0) - 1 - i];
            }
            Console.WriteLine("Suma Diagonal Inversa: " + sumai);

            Console.WriteLine("Diagonal secundaria...");
            for (int i = 1; i < diag.GetLength(0); i++)
            {
                Console.Write(diag[i, i - 1] + " ");
                sumas += diag[i, i - 1];
            }
            Console.WriteLine("Suma Diagonal Secundaria: " + sumas);
            Console.WriteLine();
        }
    }
}