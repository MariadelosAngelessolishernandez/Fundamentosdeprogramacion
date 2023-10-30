// See https://aka.ms/new-console-template for more information
using System;

namespace Pdescuento
{
    class Programa4u3
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de números: ");
            int n = Convert.ToInt32(Console.ReadLine());


            int cero = 0;
            int mayorCero = 0;
            int menorCero = 0;


            for (int i = 0; i < n; i++)
            {

                Console.Write("Ingrese el número #" + (i + 1) + ": ");
                int numero = Convert.ToInt32(Console.ReadLine());


                if (numero == 0)
                {
                    cero++;
                }
                else if (numero > 0)
                {
                    mayorCero++;
                }
                else
                {
                    menorCero++;
                }
            }


            Console.Write("Cantidad de números cero: " + cero);
            Console.Write("Cantidad de números mayores a cero: " + mayorCero);
            Console.Write("Cantidad de números menores a cero: " + menorCero);



        }
    }
}



