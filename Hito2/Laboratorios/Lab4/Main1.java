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
        edd.mostrar();
        mostrarPepito(edd);
    }

        public static int mostrarPepito(Nombres edd)
        {
            String[] nombre = edd.getNombres();
            int mayor = 0;
            for (int x = 1; x < nombre.length; x++) {
                if (nombre[x] =="Pepito") {
                    mayor ++;
                }
            }
       System.out.println("Hay Pepitos: " + mayor);
            return mayor;
        }





}
