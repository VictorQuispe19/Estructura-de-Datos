package PilaDeClientes;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Cliente cli1=new Cliente("Juan","Mamani",18,"Dreccion 1","Masculino");
        Cliente cli2=new Cliente("Maria","Perez",23,"Direccion 2","Femenino");
        Cliente cli3=new Cliente("Pedro","Gutierrez",28,"Direccion 3","Masculino");
        Cliente cli4=new Cliente("Julia","Fatima",19,"Direccion 4","Femenino");
        Cliente cli5=new Cliente("Bob","Choque",20,"Direccion 5","Masculino");

        PilaCliente pcl=new PilaCliente();
        pcl.adicionar(cli1);
        pcl.adicionar(cli2);
        pcl.adicionar(cli3);
        pcl.adicionar(cli4);
        pcl.adicionar(cli5);
//        pcl.Mostrar();
//        mayoresCiertaEdad(pcl,20);
//        kEsimoPosicion(pcl,3);
//        pcl.Mostrar();
//        asignaDireccion(pcl,"Direccion 9");
//        pcl.Mostrar();
        reordenaPila(pcl);
        pcl.Mostrar();

    }
    public static void mayoresCiertaEdad(PilaCliente pila,int edadMayor)
    {
        int cont=0;
        Cliente itemEliminado=null;
        PilaCliente aux=new PilaCliente();
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.getEdad()>edadMayor)
            {
                cont=cont+1;
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
        System.out.println("\nExisten "+cont+" personas con edad mayor a: "+edadMayor);
    }
    public static void kEsimoPosicion(PilaCliente pila,int valorTope)
    {
        PilaCliente aux=new PilaCliente();
        Cliente itemk=null;
        Cliente ItemEliminado;
        while (!pila.esVacio())
        {
            ItemEliminado=pila.eliminar();
            if(pila.nroElem()+1==valorTope){

                itemk=ItemEliminado;
            }else{
                aux.adicionar(ItemEliminado);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(itemk);
    }
    public static void asignaDireccion(PilaCliente pila,String nuevaDireccion)
    {
        Cliente Eliminado;
        PilaCliente aux=new PilaCliente();
        while(!pila.esVacio()){
            Eliminado= pila.eliminar();
            if(Objects.equals(Eliminado.getGenero(), "Femenino"))
            {
                Eliminado.setDireccion(nuevaDireccion);
            }
            aux.adicionar(Eliminado);
        }
        pila.vaciar(aux);

    }
    public static void reordenaPila(PilaCliente pila)
    {
        PilaCliente auxM=new PilaCliente();
        PilaCliente auxF=new PilaCliente();
        Cliente item=null;
        while (!pila.esVacio()){
            item=pila.eliminar();
            if(item.getGenero()=="Masculino") {

                auxM.adicionar(item);

            }else {
                auxF.adicionar(item);
            }
        }
        pila.vaciar(auxM);
        pila.vaciar(auxF);
    }
}
