package ManejoDePilas;

import java.util.Scanner;

public class PilaLibros {
    private int max;
    private int tope;
    private Libros[] libros;
    public PilaLibros()
    {
        this.max=10;
        this.tope=0;
        this.libros=new Libros[this.max+1];
    }
    public boolean esVacio()
    {
        if(this.tope==0)
        {
            return true;
        }else{
            return false;}
    }
    public boolean esLleno()
    {
        if(tope==max){
            return true;
        }else{
            return false;
        }
    }
    public int nroElem()
    {
        return this.tope;
    }
    public void adicionar(Libros nuevoNom)
    {
        if(esLleno()){
            System.out.println("PILA LLENA");
        }else{
            tope=tope+1;
            this.libros[tope]=nuevoNom;
        }
    }
    public Libros eliminar()
    {
        Libros libroEliminado= null;
        if(esVacio()){
            System.out.println("PILA VACIA");
        }else{
            libroEliminado=libros[tope];
            tope=tope-1;
        }
        return libroEliminado;
    }

//    public void llenar(int nroItems)
//    {
//        Scanner leer = new Scanner(System.in);
//        String nombre="";
//        System.out.println("Llenando la pila de Libros(Cadenas): ");
//        for(int i=0;i<nroItems;i++){
//            System.out.println("Ingrese el nombre: "+(i+1)+": ");
//            nombre=leer.nextLine();
//            adicionar(nombre);
//            System.out.println();
//
//        }
//
//    }
    public void Mostrar()
    {
        Libros item=null;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("\nMostrando la PILA DE LIBROS: ");
            PilaLibros aux=new PilaLibros();
            while(!esVacio()){
                item=eliminar();
                item.mostrarLibro();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
    public void vaciar(PilaLibros libro)
    {
        while (!libro.esVacio()) {
            adicionar(libro.eliminar());
        }
    }
}
