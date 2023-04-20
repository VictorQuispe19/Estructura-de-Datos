package ManejoDePilas;

import java.util.Scanner;

public class PilaCadenas {
    private int max;
    private int tope;
    private String[] p;
    public PilaCadenas()
    {
        this.max=10;
        this.tope=0;
        this.p=new String[this.max+1];
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
    public  String adicionar(String nuevoNom)
    {
        if(esLleno()){
            System.out.println("PILA LLENA");
        }else{
            tope=tope+1;
            p[tope]=nuevoNom;
        }
        return nuevoNom;
    }
    public String eliminar()
    {
        String itemEliminado=" ";
        if(esVacio()){
            System.out.println("PILA VACIA");
        }else{
            itemEliminado=p[tope];
            tope=tope-1;
        }
        return itemEliminado;
    }

    public void llenar(int nroItems)
    {
        Scanner leer = new Scanner(System.in);
        String nombre="";
        System.out.println("Llenando la pila de Nombres(Cadenas): ");
        for(int i=0;i<nroItems;i++){
            System.out.println("Ingrese el nombre: "+(i+1)+": ");
            nombre=leer.nextLine();
            adicionar(nombre);
            System.out.println();

        }

    }
    public void mostrar()
    {
        String item=" ";
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE CADENAS: ");
            PilaCadenas aux=new PilaCadenas();
            while(!esVacio()){
                item=eliminar();
                System.out.println(item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
    public void vaciar(PilaCadenas pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
