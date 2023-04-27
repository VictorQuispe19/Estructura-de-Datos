package ManejoDePilas;

import java.util.Objects;

public class ObjetosMain {
    public static void main(String[] args) {

        Libros libro1=new Libros("Homero",500,30.00,"La Odisea","Epopeya");
        Libros libro2=new Libros("Homero",300,20.00,"La iliada","Epopeya");
//        libro1.mostrarLibro();
        PilaLibros pq=new PilaLibros();
        pq.adicionar(libro1);
        pq.adicionar(libro2);

//        pq.Mostrar();
//        costo(pq,25.00);
//        descuento(pq,"Epopeya");

        Libros libro3=new Libros("Isabel Mesa",200,40.00,"La Pluma de miguel","Fantastico");
        Libros libro4=new Libros("Franz Kafka",250,35.00,"La Metamorfosis","Dramatico");
        PilaLibros pil=new PilaLibros();
        pil.adicionar(libro3);
        pil.adicionar(libro4);

        muestraMax(pq);
        muestraMax(pil);

        intercambiaMayor(pq,pil);
        pq.Mostrar();
        pil.Mostrar();


    }
    public static void costo(PilaLibros pila,double precio)
    {
        int cont=0;
        Libros itemEliminado=null;
        PilaLibros aux=new PilaLibros();
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.getPrecio()>precio)
            {
                cont=cont+1;
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
        System.out.println("Esxisten "+cont+" libros mayores a: "+precio);
    }
    public static void descuento(PilaLibros pila,String categoria)
    {
        Libros itemEliminado=null;
        PilaLibros aus=new PilaLibros();
        double descuento=0;
        double cont=0;
        while(!pila.esVacio()){
            itemEliminado = pila.eliminar();
            if(Objects.equals(itemEliminado.getCategoria(), categoria))
            {
                cont= (itemEliminado.getPrecio()*0.1);
                descuento= (itemEliminado.getPrecio()-cont);
            }
            System.out.println("El descuento es de "+descuento);
            aus.adicionar(itemEliminado);
        }
        pila.vaciar(aus);
    }
    public static double muestraMax(PilaLibros pila)
    {
        Libros itemEliminado=null;
        PilaLibros aux=new PilaLibros();
        double max=0;
        while(!pila.esVacio()){
            itemEliminado= pila.eliminar();
            if(itemEliminado.getPrecio()>max){
                max= itemEliminado.getPrecio();
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
//        System.out.println("\nMAYOR: "+max);
        return max;
    }
    public static void intercambiaMayor(PilaLibros pila,PilaLibros pila1) {
        PilaLibros aux = new PilaLibros();
        Libros itemEliminado=null;
        double max = muestraMax(pila);
        double min = muestraMax(pila1);
        while (!pila.esVacio()) {
            itemEliminado = pila.eliminar();
            if (muestraMax(pila1) == max) {
                 min=max;
            } else if (muestraMax(pila) == min) {
                max=min;
            }
            aux.adicionar(itemEliminado);
        }
        pila.vaciar(aux);
    }

}
