import ManejoDePilas.Edades;
import ManejoDePilas.Nombres;
public class Main1 {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        nombres[0] = "Ana";
        nombres[1] = "Juan";
        nombres[2] = "Pepito";
        nombres[3] = "Carla";
        nombres[4] = "Freddy";

        Nombres edd = new Nombres("EDD", nombres);
//        edd.mostrar();
//        mostrarPepito(edd);
//        cuentaNombres(edd,"Pepito");
//        int c=cuentaNombres(edd,"Ana");
//        System.out.println("Ana se repite: "+c);

        AgregarNombre(edd,"Victor");
        edd.mostrarNombres();
        AgregarFinal(edd,"Victor");
        edd.mostrarNombres();
    }

//        public static int mostrarPepito(Nombres edd)
//        {
//            String[] nombre = edd.getNombres();
//            int mayor = 0;
//            for (int x = 1; x < nombre.length; x++) {
//                if (nombre[x] =="Pepito") {
//                    mayor ++;
//                }
//            }
//       System.out.println("Hay Pepitos: " + mayor);
//            return mayor;
//        }

        public static int cuentaNombres(Nombres edd,String nombreBuscar)
        {
            String[] nom= edd.getNombres();
            int i=0;
            int cont =0;
            for (i=0;i< nom.length;i++)
            {
                if (nom[i]==nombreBuscar)
                {
                    cont=cont+1;
                }
            }
            return cont;
        }
        public static void AgregarNombre(Nombres edd,String nombre)
        {
            String[]nom= edd.getNombres();
            String[]nuevosNombres=new String[nom.length+1];
            nuevosNombres[0]=nombre;
            for(int i=0; i<nom.length;i++)
            {
                nuevosNombres[i+1]=nom[i];
            }
            edd.setNombres(nuevosNombres);
        }
        public static void AgregarFinal(Nombres edd,String nombrefinal)
        {
            String[]nom= edd.getNombres();
            String[]nuevosNombres=new String[nom.length+1];
            for(int i=0;i<nom.length;i++)
            {
                nuevosNombres[i]=nom[i];

            }
            nuevosNombres[nom.length]=nombrefinal;
            edd.setNombres(nuevosNombres);

        }


}
