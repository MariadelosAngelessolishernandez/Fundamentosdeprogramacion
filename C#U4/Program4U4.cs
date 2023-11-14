// See https://aka.ms/new-console-template for more information
using System;

namespace P3U4
{
    class Program4U4
    {
        static void Main(string[] args)
        {
            double Numero = 0;
            int tam;

            Console.WriteLine("Ingresa la cantidad de numeros a procesar:");
            tam = Convert.ToInt32(Console.ReadLine());

            int[] Numeros = new int[tam];

            for (int i = 0; i < Numeros.Length; i++)
            {
                Console.WriteLine("Ingrese un número: " + i + " :");
                Numero = Convert.ToInt32(Console.ReadLine());
                if (Numero < 0)
                {
                    i++;
                }
                
            }

            Console.WriteLine("Números negativos: " +Numero);
            
        }
    }
    }
