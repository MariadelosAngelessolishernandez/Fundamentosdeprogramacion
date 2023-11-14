// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            int[] calificaciones = new int[] { 100, 70, 80, 90, 81, 70, 84, 78, 100, 79,70 };
            int suma = 0, promedio = 0;


            for (int i = 0; i < calificaciones.Length; i++)
            {
              //  suma = suma + calificaciones[i];

                Console.WriteLine("Calificacion: " + i + " es: " + calificaciones[i]);
                suma += calificaciones[i];

                
            }
           promedio = suma / calificaciones.Length;
            Console.WriteLine("El promedio es: " + promedio);

        }
    }
}
