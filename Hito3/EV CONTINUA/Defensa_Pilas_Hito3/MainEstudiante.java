package Defensa_Pilas_Hito3;

import PilaDeClientes.Cliente;
import PilaDeClientes.PilaCliente;

import java.util.Objects;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante est1=new Estudiante("Pepito","Perez",18,"El Alto",95,"12345678LP");
        Estudiante est2=new Estudiante("Laura","Mamani",22,"La Paz",85,"12345679CB");
        Estudiante est3=new Estudiante("Manuel","Lopez",20,"La Paz",80,"12345680SC");
        Estudiante est4=new Estudiante("Maria","Gutierrez",21,"Cochabamba",90,"12345681CB");
        Estudiante est5=new Estudiante("Efrain","Gonzales",22,"Santa Cruz",85,"12345682SC");

        PilaEstudiante est=new PilaEstudiante();
        est.adicionar(est1);
        est.adicionar(est2);
        est.adicionar(est3);
        est.adicionar(est4);
        est.adicionar(est5);
        est.Mostrar();
        kEsimoPosicion(est,2);
        est.Mostrar();
        reordenaPila(est);
        est.Mostrar();
//        menorEstudiante(est);
 //       est.Mostrar();
    }
    //String str= '';
    //String substrin=str.substring(0,8);
    //SYstem.out.println(substrin);
    public static void aprobaron(PilaEstudiante pila) {
        int cont = 0;
        Estudiante itemEliminado = null;
        PilaEstudiante aux = new PilaEstudiante();
        while (!pila.esVacio()) {
            itemEliminado = pila.eliminar();
            String str= itemEliminado.getCI();
            String substr=str.substring(str.length()-2);
            if (substr == "LP")
            {
                if (itemEliminado.getNotaFinal() >= 51) {
                    cont = cont + 1;
                }else{
                    aux.adicionar(itemEliminado);
                }
            }
        }
        pila.vaciar(aux);
        System.out.println("\nExisten " + cont + " personas aprobados");
    }
    public static void kEsimoPosicion(PilaEstudiante pila,int valorTope)
    {
        PilaEstudiante aux=new PilaEstudiante();
        Estudiante itemk=null;
        Estudiante ItemEliminado;
        if(valorTope>pila.nroElem())
        {
            System.out.println("Valor no valido");

            return;
        }
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
    public static int muestraMin(PilaEstudiante pila)
    {
        Estudiante itemEliminado=null;
        PilaEstudiante aux=new PilaEstudiante();
        int min=999;
        while (!pila.esVacio()){
            itemEliminado=pila.eliminar();
            if(itemEliminado.getNotaFinal()<min){
                min=itemEliminado.getNotaFinal();
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
        System.out.println("\nMenor: "+min);
        return min;
    }
    public static void menorEstudiante(PilaEstudiante pila)
    {
        PilaEstudiante auxM=new PilaEstudiante();
        Estudiante item;
        int min=muestraMin(pila);
        while (!pila.esVacio()){
            item=pila.eliminar();
            if(min< item.getNotaFinal()) {
               min= item.getNotaFinal();
            } auxM.adicionar(item);
        }
        pila.vaciar(auxM);
    }
    public static void reordenaPila(PilaEstudiante pila)
    {
        PilaEstudiante auxCB=new PilaEstudiante();
        PilaEstudiante aux=new PilaEstudiante();
        Estudiante item;

        while (!pila.esVacio()){
            item=pila.eliminar();
            String str= item.getCI();
            String substr=str.substring(str.length()-2);
            if (substr.equals("CB"))
            {
                auxCB.adicionar(item);
            }else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.vaciar(auxCB);
    }

}
