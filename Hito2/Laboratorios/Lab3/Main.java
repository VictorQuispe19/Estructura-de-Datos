import Ejercicios.Math_utils;
import Ejercicios.Student;
import ManejoDePilas.Edades;

public class Main {
    public static void main(String[] args) {

        int[] edades= new int [5];
        edades[0]=33;
        edades[1]=20;
        edades[2]=19;
        edades[3]=42;
        edades[4]=25;
        Edades obj1=new Edades("Unifranz","BDAII-217",edades);
        obj1.mostrar();
        mostrarEdadMayor(obj1);
        sumarPares5(obj1);
        obj1.mostrar();

    }
    //Determinar edadmayor
    public static void mostrarEdadMayor(Edades obj1)
    {
        int[] edades = obj1.getEdades();
        int mayor = edades[0];
        for (int x = 1; x < edades.length; x++) {
            if (edades[x] > mayor) {
                mayor = edades[x];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
    public static void sumarPares5(Edades obj1)
    {
        int[] edad = obj1.getEdades();
        for (int x = 0; x < edad.length; x++) {
            if (edad[x] %2==0) {
                edad[x]=edad[x]+5;

            }
        }
    }

}

