package PilaDeClientes;

import java.util.Scanner;

public class PilaCliente {
    private int max;
    private int tope;
    private Cliente[] clientes;

    public PilaCliente() {
        this.max = 10;
        this.tope = 0;
        this.clientes = new Cliente[this.max + 1];
    }

    public boolean esVacio() {
        if (this.tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLleno() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return this.tope;
    }

    public void adicionar(Cliente nuevoNom) {
        if (esLleno()) {
            System.out.println("PILA LLENA");
        } else {
            tope = tope + 1;
            this.clientes[tope] = nuevoNom;
        }
    }

    public Cliente eliminar() {
        Cliente libroEliminado = null;
        if (esVacio()) {
            System.out.println("PILA VACIA");
        } else {
            libroEliminado = clientes[tope];
            tope = tope - 1;
        }
        return libroEliminado;
    }

    //    public void llenar(int nroItems)
//    {
//        Scanner leer = new Scanner(System.in);
//        Cliente nombre="";
//        System.out.println("Llenando la pila de Clientes(Cadenas): ");
//        for(int i=0;i<nroItems;i++){
//            System.out.println("Ingrese el nombre: "+(i+1)+": ");
//            nombre=leer.nextLine();
//            adicionar(nombre);
//            System.out.println();
//
//        }
//
//    }
    public void Mostrar() {
        Cliente item = null;
        if (esVacio()) {
            System.out.println("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la PILA DE CLIENTES: ");
            PilaCliente aux = new PilaCliente();
            while (!esVacio()) {
                item = eliminar();
                item.muestraCliente();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaCliente libro) {
        while (!libro.esVacio()) {
            adicionar(libro.eliminar());
        }
    }
}
