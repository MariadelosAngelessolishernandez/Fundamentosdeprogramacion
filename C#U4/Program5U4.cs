// See https://aka.ms/new-console-template for more information
using System;

namespace P3U4
{
    class Program4U4
    {
        static void Main(string[] args)
        {
            string[] frutas = { "Manzana", "Mango", "Fresa", "Uva", "Liche", "Sandia" };

            // Crear un nuevo arreglo para almacenar las frutas al revés
            string[] frutasAlReves = new string[frutas.Length];

            // Copiar las frutas al revés al nuevo arreglo
            for (int i = 0; i < frutas.Length; i++)
            {
                frutasAlReves[i] = frutas[frutas.Length - 1 - i];
            }

            // Imprimir el arreglo original
            Console.WriteLine("Arreglo Original:");
            ImprimirArreglo(frutas);

            // Imprimir el arreglo al revés
            Console.WriteLine("\nArreglo al Revés:");
            ImprimirArreglo(frutasAlReves);
        }

        // Método para imprimir un arreglo de strings
        static void ImprimirArreglo(string[] arreglo)
        {
            foreach (var elemento in arreglo)
            {
                Console.Write(elemento + " ");
            }
            Console.WriteLine();
        }
    }


}
   