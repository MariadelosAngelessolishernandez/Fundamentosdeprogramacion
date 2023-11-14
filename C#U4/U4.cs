// See https://aka.ms/new-console-template for more information
using System;
namespace Uni4

{
    internal class program
    {
        static void Main(string[] args)
        {
            
            int suma = 0, promedio,tam;

            Console.WriteLine("Escribe las calificaciones aprocesar:");
            tam = Convert.ToInt32(Console.ReadLine());

            int[] calificacion = new int[tam];

            for (int C = 0; C < calificacion.Length; C++)
                
            {
                Console.WriteLine("Escribe calificacion:");
                calificacion[C] = Convert.ToInt32(Console.ReadLine());
                

                Console.WriteLine("Calificacion: " + C + " es: " + calificacion[C]);
                suma += calificacion[C];


            }
            promedio = suma / calificacion.Length;
            Console.WriteLine("El promedio es: " + promedio);

        }
    }
}
