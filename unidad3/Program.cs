// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            int edad; //2
            Console.Write("Escribe tu edad: ");//3
            edad = Convert.ToInt32(Console.ReadLine());
            if (edad >= 18)
            Console.WriteLine("Eres mayor de edad!!");//5a
        else //6
            Console.WriteLine ("eres menor de edad");//6a
            
        }
    }
}

