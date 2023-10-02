// See https://aka.ms/new-console-template for more information
using System;
namespace program2
{
    internal class program
    {
        static void Main(string[] args)
        {
            string nombre = "Maria de los Angeles", apellidos = "Solis Hernandez", completo;
            completo = nombre + apellidos;
            int a = 78, b = 98, suma;
            suma = a + b;
            Console.WriteLine("* * Bienvenido * *" + completo + "* *");
            Console.WriteLine("La operacion suma de A=" + a + "B=" + b);
            Console.WriteLine($"Tu resultado es{suma}");
            Console.WriteLine("--Gracias :)");
                }
    }
}
