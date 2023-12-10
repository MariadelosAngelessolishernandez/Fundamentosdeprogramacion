// See https://aka.ms/new-console-template for more information
using System;

namespace Programa3U5
{
    class Program
    {
        static void Main(string[] args)
        {
            double x, y;
            Console.WriteLine("Escribe el valor para x: ");
            x = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Escribe el valor para y: ");
            y = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Resultado ecuacion 1: " + Ecuacion1(x, y));
            Console.WriteLine("Resultado ecuacion 2: " + Ecuacion2(x, y));
        }

        static double Ecuacion1(double x, double y)
        {
            double resultado = Math.Pow(x, 2) + (2 * Math.Pow(y, 4));
            return resultado;
        }

        static double Ecuacion2(double x, double y)
        {
            double resultado = Math.Sqrt(Math.Pow(x, 4) + 5 * y);
            return resultado;
        }
    }
}

