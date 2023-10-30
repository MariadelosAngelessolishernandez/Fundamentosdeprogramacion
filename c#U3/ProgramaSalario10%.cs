// See https://aka.ms/new-console-template for more information
using System;

namespace Pdescuento
{
    class Programa4u3
    {
        static void Main(string[] args)
        {

            double salario = 1500;
            double incremento = 0.10;
            double salarioActual;
            for (int i = 1; i <= 6; i++)
            {

                salarioActual = salario + salario * incremento;

                Console.WriteLine("Año " + i + ": $" + salarioActual);

                salario = salarioActual;
            }

            Console.WriteLine("Salario después de 6 años: $" + salario);
        }
    }
}

