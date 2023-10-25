// See https://aka.ms/new-console-template for more information
using System;
namespace U3program3
{
    internal class program
    {
        static void Main(string[] args)
        {
            int dia;

            Console.Write("Escribe los meses en numerico: ");
            dia = Convert.ToInt32(Console.ReadLine());
            switch (dia) 
            { 
             case 1:
                Console.WriteLine("Enero");
                break;
            case 2:
                Console.WriteLine("Febrero");
                break;
            case 3:
                Console.WriteLine("Marzo");
                break;
            case 4:
                Console.WriteLine("Abril");
                break;
            case 5:
                Console.WriteLine("Mayo");
                break;
            case 6:
                Console.WriteLine("Junio");
                break;
            case 7:
                Console.WriteLine("Julio");
                break;
                case 8:
                    Console.writeLine("Agosto");
                    break;
                case 9:
                    Console.writeLine("Septiembre");
                    break;
                case 10:
                    Console.writeLine("Octubre");
                    break;
                case 11:
                    Console.writeLine("Noviembre");
                    break;
                case 12:
                    Console.writeLine("Diciembre");
                    break;

                default: Console.WriteLine("No exixte el dia ingresado");
                    break;



            }
        }
    }
}
