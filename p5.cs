// See https://aka.ms/new-console-template for more information
using System;


namespace program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            int a, b, c;
            float area, perimetro;
            Console.WriteLine("Escriba la longitud a ");
            a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba la longitud b ");
            b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba la longitud c ");
            c = Convert.ToInt32(Console.ReadLine());
            perimetro = a + b + c;
            Console.WriteLine("El perimetro del triangulo es: " + (perimetro));
            area = (a * b) / 2;
            Console.WriteLine("El area del triangulo es:" + (area));
        }
    }
}
