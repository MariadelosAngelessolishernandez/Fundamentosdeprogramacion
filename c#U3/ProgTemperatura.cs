// See https://aka.ms/new-console-template for more information
using System;
namespace program2
{
    internal class program
    {
        static void Main(string[] args)
        {
            int temperatura;
            Console.WriteLine("Ingresa la temperatura!");
            temperatura = Convert.ToInt32(Console.ReadLine());
            if (temperatura >= 27)
                Console.WriteLine("Hace calor");

        else
            {
                if (temperatura >= 20 && temperatura < 27)
                    Console.WriteLine(" Clima agradable");

            else
                {
                    if (temperatura < 20)

                        Console.WriteLine(" Clima frio ");
                }

            }
        }
    }
}
