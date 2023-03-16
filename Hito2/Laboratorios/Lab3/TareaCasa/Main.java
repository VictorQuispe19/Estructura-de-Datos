
import ManejoDePilas1.Edades1;
import ManejoDePilas.Edades;

public class Main {
    public static void main(String[] args) {

        int[] edades = new int[5];
        edades[0] = 33;
        edades[1] = 20;
        edades[2] = 19;
        edades[3] = 42;
        edades[4] = 25;
        int[] edades1 = new int[5];
        edades1[0] = 30;
        edades1[1] = 20;
        edades1[2] = 19;
        edades1[3] = 15;
        edades1[4] = 25;

        Edades obj1 = new Edades("Unifranz", "BDAII-217", edades);
        obj1.mostrar();
        mostrarEdadMayor(obj1);
        mostrarEdadMenor(obj1);
//        sumarPares5(obj1);
//        obj1.mostrar();

        Edades1 obj2 = new Edades1("Unifranz", "EDDA-216", edades1);
        obj2.mostrar();
        mostrarEdadMayor(obj2);
        mostrarEdadMenor(obj2);
        IntercambiarValores(obj1,obj2);
        obj1.mostrar();
        obj2.mostrar();

    }

    //Determinar edadmayor
    public static void mostrarEdadMayor(Edades obj1) {
        int[] edades = obj1.getEdades();
        int mayor = edades[0];
        for (int x = 1; x < edades.length; x++) {
            if (edades[x] > mayor) {
                mayor = edades[x];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    public static void mostrarEdadMenor(Edades obj1) {
        int[] edades = obj1.getEdades();
        int menor = edades[0];
        for (int x = 1; x < edades.length; x++) {
            if (edades[x] < menor) {
                menor = edades[x];
            }
        }
        System.out.println("El menor es: " + menor);
    }

    public static void mostrarEdadMayor(Edades1 obj2) {
        int[] edades1 = obj2.getEdades();
        int mayor = edades1[0];
        for (int x = 1; x < edades1.length; x++) {
            if (edades1[x] > mayor) {
                mayor = edades1[x];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    public static void mostrarEdadMenor(Edades1 obj2) {
        int[] edades1 = obj2.getEdades();
        int menor = edades1[0];
        for (int x = 1; x < edades1.length; x++) {
            if (edades1[x] < menor) {
                menor = edades1[x];
            }
        }
        System.out.println("El menor es: " + menor);
    }

    public static void IntercambiarValores(Edades obj1, Edades1 obj2)
    {
        int[] edades = obj1.getEdades();
        int[] edades1 = obj2.getEdades();

        int posMa=edades1[0];
        edades1[0]=edades[3];
        edades[3]=posMa;
        int posMe=edades1[3];
        edades1[3]=edades[2];
        edades[2]=posMe;

        obj1.setEdades(edades);
        obj2.setEdades1(edades1);

    }
}