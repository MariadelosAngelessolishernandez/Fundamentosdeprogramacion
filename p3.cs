// See https://aka.ms/new-console-template for more information
using System;
namespace program3
{
    internal class program
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6;
            float promedio;
            string nombre;
            Console.WriteLine("Escribe tu nombre");
                nombre = Console.ReadLine();
            Console.WriteLine("Tunombre es:" + nombre);
            Console.WriteLine("escribe calificacion 1: ");
            c1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 2: ");
            c2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("escribe calificacion 3: ");
            c3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 4: ");
            c4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("escribe calificacion 5: ");
            c5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificacion 6: ");
            c6 = Convert.ToInt32(Console.ReadLine());
            //PASO-CALCULAR PROMEDIO
            promedio = c1 + c2 + c3 + c4 + c5 + c6 / 6;
            //PASO-IMPRIMIR EL RESULTADO
            Console.WriteLine("Tu promedio es : " + promedio);
        }
    }
}
            
           