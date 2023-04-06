package ManejoDePilas;
public class MainPilas {
    public static void main(String[] args) {
        PilaNumeros pila1=new PilaNumeros();

        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);

        pila1.mostrar();
        muestraMax(pila1);
        pila1.mostrar();
        mostrarBuscar(pila1,5);
    }
    public static void muestraMax(PilaNumeros pila)
    {
        PilaNumeros aux=new PilaNumeros();
        int num=0;
        int max=0;
        while(!pila.esVacio()){
            num= pila.eliminar();
            if(num>max){
                max=num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println(" MAYOR: "+max);
    }
//    Determinar cuantos 5 hay en la pila
    public static void mostrarBuscar(PilaNumeros pila,int numBuscar)
    {
        int nume=0;
        int cont=0;
        PilaNumeros aux=new PilaNumeros();
        while(!pila.esVacio()){
            nume= pila.eliminar();
            if(nume==numBuscar)
            {
                cont=cont+1;
            }
            aux.adicionar(nume);
        }
        pila.vaciar(aux);
        System.out.println(" Numeros repetidos: "+cont);
    }
//    Intercambiar el valor maximo y minimo de una pila
}