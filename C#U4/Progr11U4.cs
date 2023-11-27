// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            // int [][] cali=new int[3][3];
            // cal [Fila] [Columna]
            /* cali[0][0]=5;
             cali[0][1]=7;
             cali[0][2]=9;
             cali[1][0]=6;
             cali[1][1]=8;
             cali[1][2]=7;
             cali[2][0]=10;
             cali[2][1]=3;
             cali[2][2]=1; */
            int[,] cali = { { '5', '7', '9' }, { '6', '8', '9' }, { '1', '3', '1' } };
            Console.WriteLine(cali[0, 0]);
            Console.WriteLine(cali[0, 1]);
            Console.WriteLine(cali[0, 2]);
            Console.WriteLine(cali[1, 0]);
            Console.WriteLine(cali[1, 1]);
            Console.WriteLine(cali[1, 2]);
            Console.WriteLine(cali[2, 0]);
            Console.WriteLine(cali[2, 1]);
            Console.WriteLine(cali[2, 2]);

        }
    }
}