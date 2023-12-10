// See https://aka.ms/new-console-template for more information
using System;

namespace P7U5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el subtotal: ");
            double subtotal = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese la tasa de IVA: ");
            double tasaIVA = Convert.ToDouble(Console.ReadLine());

            // Calcular el IVA, Subtotal y Total
            double iva = CalcularIVA(subtotal, tasaIVA);
            double total = CalcularTotal(subtotal, iva);

            // Mostrar los resultados
            Console.WriteLine("Subtotal: " + subtotal);
            Console.WriteLine("IVA: " + iva);
            Console.WriteLine("Total: " + total);
        }

        // Función para calcular el IVA
        static double CalcularIVA(double subtotal, double tasaIVA)
        {
            return subtotal * (tasaIVA / 100);
        }

        // Función para calcular el Total
        static double CalcularTotal(double subtotal, double iva)
        {
            return subtotal + iva;
        }
    }
}