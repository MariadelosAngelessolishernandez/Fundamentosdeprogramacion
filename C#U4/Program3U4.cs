// See https://aka.ms/new-console-template for more information
using System;

namespace P3U4
{
    class Programa1u3
    {
        static void Main(string[] args)
        {

            double   temF =0, temK =0;
            int tam;

            Console.WriteLine("Ingresa las temperaturas a procesar:");
            tam= Convert.ToInt32(Console.ReadLine());

            int[] Temperatura = new int[tam];


            for (int C = 0; C < Temperatura.Length; C++)

            {
                Console.WriteLine("Escribe la temperatura "+C+" :");
                Temperatura[C] = Convert.ToInt32(Console.ReadLine());

                temF = (Temperatura[C] * 9 / 5) + 32;
                temK = Temperatura[C] + 273.15;

                Console.WriteLine("latemperatura de grados celcius: " + Temperatura[C]);
                Console.WriteLine("latemperatura de grados farenheit: " + temF);
                Console.WriteLine("latemperatura de grados kelvin: " + temK);


            }

          
                

            }
            
            

        }
    }
    

