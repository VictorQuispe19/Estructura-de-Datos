package Defensa_Pilas_Hito3;

import PilaDeClientes.Cliente;
import PilaDeClientes.PilaCliente;

public class PilaEstudiante {
    private int max;
    private int tope;
    private Estudiante[] estudiantes;
    public PilaEstudiante() {
        this.max = 50;
        this.tope = 0;
        this.estudiantes = new Estudiante[this.max + 1];
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

    public void adicionar(Estudiante nuevoNom) {
        if (esLleno()) {
            System.out.println("PILA LLENA");
        } else {
            tope = tope + 1;
            this.estudiantes[tope] = nuevoNom;
        }
    }

    public Estudiante eliminar() {
        Estudiante estudianteEliminado = null;
        if (esVacio()) {
            System.out.println("PILA VACIA");
        } else {
            estudianteEliminado = estudiantes[tope];
            tope = tope - 1;
        }
        return estudianteEliminado;
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
        Estudiante item = null;
        if (esVacio()) {
            System.out.println("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la PILA DE ESTUDIANTES: ");
            PilaEstudiante aux = new PilaEstudiante();
            while (!esVacio()) {
                item = eliminar();
                item.muestraEstudiante();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaEstudiante estudiante) {
        while (!estudiante.esVacio()) {
            adicionar(estudiante.eliminar());
        }
    }
}
