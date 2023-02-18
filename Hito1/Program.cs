using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace DIagnostico1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Bienvenido a la clase de Estructura de datos");

            //int a, b,c,s;
            //a=2;
            //b=3;
            //c=4;
            //s = a + b+c;
            //Console.WriteLine(s);
            //Console.ReadLine();

            //int a, b,c,s;
            //a=Convert.ToInt32(Console.ReadLine());
            //b=Convert.ToInt32(Console.ReadLine());
            //c=Convert.ToInt32(Console.ReadLine());
            //s = a + b+c;
            //Console.WriteLine(s);
            //Console.ReadLine();

            //int i;
            //for (i = 1; i <= 15; i++)
            //    Console.WriteLine(i);
            //Console.ReadLine();

            //int n;
            //n=Convert.ToInt32(Console.ReadLine());
            //if (n % 2 == 0)
            //{ for (int i = 2; i <= n; i++)
            //        if (i % 2 == 0)
            //        {
            //            Console.WriteLine(i);
            //        } 
            //}
            //else
            //{
            //    for (int j = 1; j <= n; j++)
            //    { if (j % 2 == 1)
            //            Console.WriteLine(j);
            //    }
            //}
            //Console.ReadLine();
            int num;
            num=Convert.ToInt32(Console.ReadLine());
            Diagnostico dia = new Diagnostico();
            switch (num)
            {
                case 1:
                    dia.dia1();
                    break;
                case 2:
                    dia.dia2();
                    break; 
                case 3:
                    dia.dia3();
                    break;
                case 4:
                    dia.dia4();
                    break;
                case 5:
                    dia.dia5();
                    break;
                

            }
            Console.ReadKey();
        }
        public class Diagnostico
        {
            public Diagnostico() 
            { 
            }
            public void dia1()
            {
                Console.WriteLine("Bienvenido a la clase de Estructura de datos");
            }
            public void dia2()
            {
                int a, b, c, s;
                a = 2;
                b = 3;
                c = 4;
                s = a + b + c;
                Console.WriteLine(s);
            }
            public void dia3()
            {
                int a, b, c, s;
                a = Convert.ToInt32(Console.ReadLine());
                b = Convert.ToInt32(Console.ReadLine());
                c = Convert.ToInt32(Console.ReadLine());
                s = a + b + c;
                Console.WriteLine(s);

            }
            public void dia4()
            {
                int i;
                for (i = 1; i <= 15; i++)
                    Console.WriteLine(i);

            }
            public void dia5()
            {
                int n;
                n = Convert.ToInt32(Console.ReadLine());
                if (n % 2 == 0)
                {
                    for (int i = 2; i <= n; i++)
                        if (i % 2 == 0)
                        {
                            Console.WriteLine(i);
                        }
                }
                else
                {
                    for (int j = 1; j <= n; j++)
                    {
                        if (j % 2 == 1)
                            Console.WriteLine(j);
                    }
                }

            }
        }
        


    }
}
