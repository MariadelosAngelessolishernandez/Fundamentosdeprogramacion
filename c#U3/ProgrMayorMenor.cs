// See https://aka.ms/new-console-template for more information
using System;
namespace U3pmayorMenor
{
    internal class program
    {
        static void Main(string[] args)
        {


            int n1, n2;
            Console.WriteLine("Intruduce el primer numero");
            n1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Intruduce el segundo numero");
            n2 = Convert.ToInt32(Console.ReadLine());

            if (n1 == n2)
                Console.WriteLine("Son iguales");

            else
            {
                if (n1 > n2)
                    Console.WriteLine(n1 + " es mayor que " + n2);

                else
                    Console.WriteLine(n2 + " es mayor que " + n1);
            }
        }
    }
}

        

