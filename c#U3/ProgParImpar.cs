// See https://aka.ms/new-console-template for more information
using System;
namespace U3PParImpar
{
    internal class program
    {
        static void Main(string[] args)
        {
            int numero; //2
            Console.Write("Ingresa un numero entero: ");//3
            numero = Convert.ToInt32(Console.ReadLine());
            if (numero%2==0 )
                Console.WriteLine("Es par!!");//5a
            else //6
                Console.WriteLine("Es impar");//6a

        }
    }
}


