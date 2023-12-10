// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            int opcion;
            Console.WriteLine("Elige el tipo de convercion a realizar: ");
            Console.WriteLine("1.Temperatura ºc a ºf: ");
            Console.WriteLine("2.Temperatura ºf a ºk: ");
            Console.WriteLine("3.Media pulgadas a metros: ");
            Console.WriteLine("4.Tiempos horas ba segundos: ");
            opcion = Convert.ToInt32(Console.ReadLine);
            switch (opcion)
            {
                case 1:
                    int c;
                    Console.WriteLine("Escribe los ºc a convertir:");
                    c = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("Tu resultado es:" + temperaturaCF(c));
                    break;
                case 2:
                    Console.WriteLine("Tu resultado es:" + temperaturaFK());
                    break;
                case 3:
                    Medida();
                    break;
                case 4:
                    Console.WriteLine(timpo());
                    break;
                default:
                    Console.WriteLine("La opcion es incorrecta");
                    break;

            }

        }
        public static double temperaturaCF(double c)
        {
            double resultado = (c * 1.8) + 32;
            return resultado;
        }
        public static double temperaturaFK()
        {
            double F, resultado;
            Console.WriteLine("Escribe la temperatura ºF a convertir:");
            F=Convert.ToInt32(Console.ReadLine());
            resultado = (F - 32) * (5 / 9) + 273.15;
            return resultado;
        }
        public static void Medida()
        {
            double p, resultado;
            Console.WriteLine("Escribe la media en pulgadas");
            p = Convert.ToDouble(Console.ReadLine());
            resultado = p / 39.37;
            Console.WriteLine();



        }
        public static double timpo()
        {
            double h, resultado;
            Console.WriteLine("Escribe las horas a combertir");
            h = Convert.ToDouble(Console.ReadLine());
            return resultado = h * 3600; //retur=h*3600

        }
    }
}

