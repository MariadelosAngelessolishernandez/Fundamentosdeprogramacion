// See https://aka.ms/new-console-template for more information
using System;

namespace P8U5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese la cantidad de veces que desea lanzar el dado: ");
            int vecesLanzamiento = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Resultados de los lanzamientos:");

            for (int i = 0; i < vecesLanzamiento; i++)
            {
                int resultado = LanzarDado();
                Console.WriteLine("Lanzamiento " + (i + 1) + ": " + resultado);
            }
        }

        // Función para simular el lanzamiento de un dado de 6 caras
        static int LanzarDado()
        {
            Random random = new Random();
            return random.Next(1, 7);
        }
    }
}