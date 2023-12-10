// See https://aka.ms/new-console-template for more information
using System;

namespace P9U5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el sueldo diario del trabajador: $");
            double sueldoDiario = Convert.ToDouble(Console.ReadLine());

            Console.Write("Ingrese el tiempo laborado (en días): ");
            int tiempoLaborado = Convert.ToInt32(Console.ReadLine());

            // Calcular finiquito
            double finiquito = CalcularFiniquito(sueldoDiario, tiempoLaborado);

            // Mostrar resultado
            Console.WriteLine("Finiquito del trabajador: $" + finiquito);
        }

        // Función para calcular el finiquito
        static double CalcularFiniquito(double sueldoDiario, int tiempoLaborado)
        {
            return sueldoDiario * tiempoLaborado;
        }
    }
}