// See https://aka.ms/new-console-template for more information
using System; //paso1
using System.Drawing;

namespace programa1//aso1
{
    internal class program //paso1
    {
        static void Main(string[] args)//paso1


        {
            int cobro, horas;

            Console.WriteLine("Ingresa el valor de horas: ");
            horas = Convert.ToInt32(Console.ReadLine());


            cobro = 0;
            if (horas <= 2)
                cobro = horas * 5;
            if (horas > 2 && horas <= 5)
                cobro = 2 * 5 + (horas - 2) * 4;
            if (horas > 5 && horas <= 10)
                cobro = 2 * 5 + 3 * 4 + (horas - 5) * 3;
            if (horas > 10)
                cobro = 2 * 5 + 3 * 4 + 5 * 3 + (horas - 10);
            Console.WriteLine("Valor de cobro: " + cobro);
        }
    }
}


