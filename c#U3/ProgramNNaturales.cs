// See https://aka.ms/new-console-template for more information
using System;

namespace PPROMEDIO2
{
    class Programa1u3
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese la cantidad de números naturales positivos: ");
            int cantidadNumeros= Convert.ToInt32(Console.ReadLine());

            int contador = 0;


            while (contador < cantidadNumeros)
            {

                Console.WriteLine("Ingrese un número natural positivo: ");
                int numero = Convert.ToInt32(Console.ReadLine());


                if (numero > 0)
                {

                    int cubo = numero * numero * numero;
                    Console.WriteLine("El cubo de " + numero + " es: " + cubo);
                    contador++;
                }
                else
                {
                    Console.WriteLine("Por favor, ingrese un número natural positivo.");
                }
            }


           
        }
    }

    }
