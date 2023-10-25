// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            int dia;

            Console.Write("Escribe el dia de la semana numerico: ");
            dia = Convert.ToInt32(Console.ReadLine());
            switch (dia) 
            { 
             case 1:
                Console.WriteLine("Lunes");
                break;
            case 2:
                Console.WriteLine("Martes");
                break;
            case 3:
                Console.WriteLine("Miercole");
                break;
            case 4:
                Console.WriteLine("Jueves");
                break;
            case 5:
                Console.WriteLine("Viernas");
                break;
            case 6:
                Console.WriteLine("Sabado");
                break;
            case 7:
                Console.WriteLine("Domingo");
                break;

                default: Console.WriteLine("No exixte el dia ingresado");
                    break;



            }
        }
    }
}
