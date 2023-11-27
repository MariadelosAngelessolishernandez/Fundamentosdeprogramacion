// See https://aka.ms/new-console-template for more information
using System;
namespace U3program5
{
    internal class program
    {
        static void Main(string[] args)
        {
            float[,] temp = new float[5,7];
           
            for (int f = 0; f < 5; f++)
            {
                for (int c = 0; c < 7; c++)
                {
                    Console.WriteLine("ESCRIBE TEMPERATURA EN(" + f + "," + c + ")");
                    temp[f,c] =float.Parse(Console.ReadLine());

                }
                float[,] tempF = new float[5,7];
                for (int F = 0; F < 5; f++)
                {
                    for (int c = 0; c < 7; c++)
                    {
                        tempF[f,c] = (temp[f,c] * 9 / 5) + 32;
                        Console.WriteLine("f en(" + f + "," + c + ")" + tempF[f,c] + ",");
                    }
                    Console.WriteLine();
                }
                
            }
        }
    }
}