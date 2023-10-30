// See https://aka.ms/new-console-template for more information
using System;

namespace PPROMEDIO2
{
    class Programa1u3
    {
        static void Main(string[] args)
        {
            int np = 0;
            int nn = 0;

            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine("Ingrese un número: ");
                int numero = Convert.ToInt32(Console.ReadLine());
                if (numero > 0)
                {
                    np++;
                }
                else if (numero < 0)
                {
                    nn++;
                }
            }

            Console.WriteLine("Números positivos: " + np);
            Console.WriteLine("Números negativos: " + nn);
        }
    }

    
}


