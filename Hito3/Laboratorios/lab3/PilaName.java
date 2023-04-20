package ManejoDePilas;

public class PilaName {
    public static void main(String[] args) {
        PilaCadenas pila2=new PilaCadenas();

        pila2.adicionar("William");
        pila2.adicionar("Andres");
        pila2.adicionar("Josias");
        pila2.adicionar("Iris");
        pila2.adicionar("Jonathan");
        pila2.adicionar("Ilia");
//        pila2.llenar();

//        AgregarAna(pila2,"Ana");
 //       CambiarNombres(pila2);
   //     pila2.mostrar();
        ElementoK(pila2,3);
        pila2.mostrar();

//        cuentaNombres(pila2,"Joesias");

    }
    public static void cuentaNombres(PilaCadenas pila,String nombreBuscar)
      {
        int cont=0;
        String itemEliminado="";
        PilaCadenas aux=new PilaCadenas();
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.equals(nombreBuscar))
            {
                cont=cont+1;
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
        System.out.println("El nombre "+nombreBuscar+" Se repite " +cont+" veces");
      }
      public static void AgregarAna(PilaCadenas pila,String nombreNuevo)
      {
          String Eliminado="";
          PilaCadenas aux=new PilaCadenas();
          while(!pila.esVacio()){
              Eliminado= pila.eliminar();
              if(Eliminado.equals("Andres"))
              {
                  aux.adicionar(nombreNuevo);
              }
              aux.adicionar(Eliminado);
          }
          pila.vaciar(aux);
      }
      public static void CambiarNombres(PilaCadenas pila)
      {
          PilaCadenas aux=new PilaCadenas();
          String item1= pila.eliminar();
          aux.vaciar(pila);
          String item2= aux.eliminar();
          pila.adicionar(item1);
          pila.vaciar(aux);
          pila.adicionar(item2);
      }
      public static void ElementoK(PilaCadenas pila, int tope)
      {
          PilaCadenas aux=new PilaCadenas();
          String itemk=" ";
          String ItemEliminado=" ";
          while (!pila.esVacio())
          {
              ItemEliminado=pila.eliminar();
              if(pila.nroElem()+1==tope){

                  itemk=ItemEliminado;
              }else{
                  aux.adicionar(ItemEliminado);
              }
          }
          pila.vaciar(aux);
          pila.adicionar(itemk);
      }
}
