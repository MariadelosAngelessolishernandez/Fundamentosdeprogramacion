// See https://aka.ms/new-console-template for more information
using System;

namespace PPROMEDIO2
{
    class Programa1u3
    {
        static void Main(string[] args)
        {
            char opcion;
            do
            {
                Console.Write("Bienvenida a una sola ejecucion");
                Console.Write(" Escribe n para salir!!");
                opcion = Console.ReadKey().KeyChar;
                Console.Write(opcion);

            } while (opcion != 'n');

        }
    }
}
