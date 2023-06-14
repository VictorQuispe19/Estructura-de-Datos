package ColaClientes;

import java.util.Objects;

public class MainColas {
    public static void main(String[] args) {

        ColaDeClientes colaClientes=new ColaDeClientes();
        ColaDeClientes colaB=new ColaDeClientes();

        Cliente cliente1=new Cliente("Manuel","Lopez",62,"Bolivia","Masculino","GOLD");
        Cliente cliente2=new Cliente("Noelia","Garcia",24,"Chile","Femenino","PLATINUM");
        Cliente cliente3=new Cliente("Gabriela","Fernandez",28,"Bolivia","Femenino","GOLD");
        Cliente cliente4=new Cliente("Saul","Gonzales",63,"Bolivia","Masculino","SILVER");
        Cliente cliente5=new Cliente("Javier","Perez",26,"Chile","Masculino","SILVER");

        colaClientes.adicionar(cliente1);
        colaClientes.adicionar(cliente2);
        colaClientes.adicionar(cliente3);
        colaClientes.adicionar(cliente4);
        colaClientes.adicionar(cliente5);

        Cliente cliente6=new Cliente("Kevin","Ticona",30,"Chile","Masculino","GOLD");
        Cliente cliente7=new Cliente("Albert","Ticona",27,"Chile","Masculino","GOLD");
        Cliente cliente8=new Cliente("Paula","Gutierrez",25,"Bolivia","Femenino","SILVER");
        Cliente cliente9=new Cliente("Beatriz","Tola",40,"Chile","Femenino","PLATINUM");
        Cliente cliente10=new Cliente("Victor","Quispe",24,"Bolivia","Masculino","GOLD");

        colaB.adicionar(cliente6);
        colaB.adicionar(cliente7);
        colaB.adicionar(cliente8);
        colaB.adicionar(cliente9);
        colaB.adicionar(cliente10);

//        colaClientes.mostrar();
        promoverCliente(colaClientes,"GOLD","Bolivia");
        moverMayores(colaClientes,60);
        moverCliente(colaClientes,colaB,"Saul");
    }
    public static void promoverCliente(ColaDeClientes cola,String tipo, String nacionalidad){
        ColaDeClientes aux=new ColaDeClientes();
        Cliente item;
        while(!cola.esVacio()){
            item=cola.eliminar();
            if(Objects.equals(item.getPais(),nacionalidad) && Objects.equals(item.getTipo(),tipo)){
                item.setTipo("VIP");
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        cola.mostrar();
    }
    public static void moverMayores(ColaDeClientes cola, int edad){
        ColaDeClientes aux=new ColaDeClientes();
        ColaDeClientes orden=new ColaDeClientes();
        Cliente item;
        while (!cola.esVacio()){
            item=cola.eliminar();
            if(item.getEdad()>edad){
                aux.adicionar(item);
            }else {
                orden.adicionar(item);
            }
        }
        cola.vaciar(aux);
        cola.vaciar(orden);
        cola.mostrar();
    }
    public static void moverCliente(ColaDeClientes colaA,ColaDeClientes colaB,String nombre){
        ColaDeClientes auxA=new ColaDeClientes();
        ColaDeClientes auxB=new ColaDeClientes();
        Cliente item;
        Cliente itemB;
        while (!colaA.esVacio()){
            item=colaA.eliminar();
            itemB=colaB.eliminar();
            if(Objects.equals(item.getNombres(),nombre)){
                auxB.adicionar(item);
            }
            else {
                auxA.adicionar(item);

            }
            auxB.adicionar(itemB);
        }
        colaA.vaciar(auxA);
        colaB.vaciar(auxB);
        colaA.mostrar();
        System.out.println("Mostrando COLA B");
        colaB.mostrar();
    }
}
