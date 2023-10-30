// See https://aka.ms/new-console-template for more information
using System;

namespace PPROMEDIO2
{
    class Programa1u3
    {
        static void Main(string[] args)
        {
            int c = 1, horas, pago, sueldo;
            while (c <= 20)
            {
                Console.Write("captura las horas trabajadas");
                horas = Convert.ToInt32(Console.ReadLine());
                Console.Write("captura del pago x hora: ");
                pago = Convert.ToInt32(Console.ReadLine());
                sueldo = horas * pago;
                Console.Write("Tusueldo es:" + sueldo);
                c++;
            }
        }
    }
}
