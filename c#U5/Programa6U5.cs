// See https://aka.ms/new-console-template for more information
using System;

namespace P6U5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la longitud de la secuencia Fibonacci: ");
            int longitud = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Secuencia Fibonacci:");
            for (int i = 0; i < longitud; i++)
            {
                Console.Write(Fibonacci(i) + " ");
            }
        }

        // Función para calcular el término n de la secuencia Fibonacci
        static int Fibonacci(int n)
        {
            if (n <= 1)
            {
                return n;
            }
            else
            {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        }
    }
}