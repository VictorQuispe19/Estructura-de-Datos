package Ejercicios;

public class Ejercicios {
    private int i;
   private int limite;
    public Ejercicios()
    {
       this.i=1;
       this.limite=10;
    }
    public void mostrarMensaje()
    {
        System.out.println("Hola Mundo desde Java!");
    }
    public void generarNaturales()
    {
        System.out.println("Generando numeros naturales: ");
        for(int i=1;i<=10;i++)
        {
           System.out.print(i+", ");
        }
    }
    public void generarNaturalesPar()
    {
        System.out.println("Generando numeros naturales pares: ");
         for(int i=2;i<=20;i=i+2)
         {
             System.out.print(i+", ");
        }
    }
    public void generarNumerosWhile()
    {
        System.out.println("Generando numeros naturales con ciclo While: ");
        int i=2;
        while(i<=10)
         {
            System.out.print(i+", ");
           i=i+2;
         }
    }


}
