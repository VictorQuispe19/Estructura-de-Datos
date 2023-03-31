import ManejoDePilas.Edades;

public class Main {
    public static void main(String[] args) {

        int[] edades= new int [5];
        edades[0]=33;
        edades[1]=20;
        edades[2]=19;
        edades[3]=42;
        edades[4]=25;

        int[] edades1 = new int[5];
        edades1[0] = 30;
        edades1[1] = 20;
        edades1[2] = 19;
        edades1[3] = 15;
        edades1[4] = 25;

        Edades obj1=new Edades("Unifranz","BDAII-217",edades);
        Edades obj2=new Edades("Unifranz","EDAI-217",edades1);
        obj1.mostrar();
        obj2.mostrar();
//        mostrarEdadMayor(obj1);

//        sumarPares5(obj1);
        IntercambiarValores(obj1, obj2);
        obj1.mostrar();
        obj2.mostrar();

    }
    //Determinar edadmayor
    public static int mostrarEdadMayor(Edades obj1)
    {
        int[] edades = obj1.getEdades();
        int mayor = edades[0];
        for (int x = 1; x < edades.length; x++) {
            if (edades[x] > mayor) {
                mayor = edades[x];
            }
        }
//        System.out.println("El mayor es: " + mayor);
        return mayor;
    }
    public static int mostrarEdadMenor(Edades obj1) {
        int[] edades = obj1.getEdades();
        int menor = edades[0];
        for (int x = 1; x < edades.length; x++) {
            if (edades[x] < menor) {
                menor = edades[x];
            }
        }
//        System.out.println("El menor es: " + menor);
        return menor;
    }
//    public static void sumarPares5(Edades obj1)
//    {
//        int[] edad = obj1.getEdades();
//        for (int x = 0; x < edad.length; x++) {
//            if (edad[x] %2==0) {
//                edad[x]=edad[x]+5;
//
//            }
//        }
//    }
    public static void IntercambiarValores(Edades obj1, Edades obj2)
    {
        int MayEDD=mostrarEdadMayor(obj1);
        System.out.println("Mayor edad EDD: "+MayEDD);

        int MayBDA=mostrarEdadMayor(obj2);
        System.out.println("Mayor edad BDA: "+MayBDA);

        int[]edadesEDD=obj1.getEdades();
        for(int i=0;i<edadesEDD.length;i++)
        {
            if(edadesEDD[i]==MayEDD)
            {
                edadesEDD[i]=MayBDA;
            }
        }
        int[]edadesBDA=obj2.getEdades();
        for(int x=0;x<edadesBDA.length;x++)
        {
            if(edadesBDA[x]==MayBDA)
            {
                edadesBDA[x]=MayEDD;
            }
        }
        int MenEDD=mostrarEdadMenor(obj1);
        System.out.println("Menor edad EDD: "+MenEDD);

        int MenBDA=mostrarEdadMenor(obj2);
        System.out.println("Menor edad BDA: "+MenBDA);

        int[]edadesEDD1=obj1.getEdades();
        for(int i=0;i<edadesEDD1.length;i++)
        {
            if(edadesEDD1[i]==MenEDD)
            {
                edadesEDD1[i]=MenBDA;
            }
        }
        int[]edadesBDA1=obj2.getEdades();
        for(int x=0;x<edadesBDA1.length;x++)
        {
            if(edadesBDA1[x]==MenBDA)
            {
                edadesBDA1[x]=MenEDD;
            }
        }
    }
}
