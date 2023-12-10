// See https://aka.ms/new-console-template for more information
using System;
namespace program1U5
{
    internal class program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("suma=" + suma(7, 8));
            Console.WriteLine("resta=" + resta(7, 8));
            Console.WriteLine("multiplicacion=" + multiplicacion(7, 8));
            Console.WriteLine("divicion=" + divicion(7, 8));
        }
        // metodo o funcion va despues de las llaves del main
        public static int suma(int a, int b)
        {
            int r = a + b;
            return r;
        }
        public static int resta(int a, int b)
        {
            int r = a - b;
            return r;
        }
        public static int multiplicacion(int a, int b)
        {
            int r = a * b;
            return r;
        }
        public static int divicion(int a, int b)
        {
            int r = a / b;
            return r;
        }
    }
}
