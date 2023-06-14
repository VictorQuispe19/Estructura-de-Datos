package ManejoDeColas;

import ManejoDePilas.PilaNumeros;

public class MainColas {
    public static void main(String[] args) {
        ColaNumeros cola=new ColaNumeros();
        cola.adicionar(4);
        cola.adicionar(5);
        cola.adicionar(4);
        cola.adicionar(9);
        cola.adicionar(15);
        cola.adicionar(22);
        cola.mostrar();
        multiplos(cola,3);
        destruirRepetidos(cola);
        cola.mostrar();
    }

    public static void multiplos(ColaNumeros cola,int numero)
    {
        int nume=0;
        int cont=0;
        ColaNumeros aux=new ColaNumeros();
        while(!cola.esVacio()){
            nume= cola.eliminar();
            if(nume%numero==0)
            {
                cont=cont+1;
            }
            aux.adicionar(nume);
        }
        cola.vaciar(aux);
        System.out.println("\nNumeros multiples de: "+numero+" hay "+cont);
    }
    public static void destruirRepetidos(ColaNumeros cola)
    {
        int nume;
        ColaNumeros aux=new ColaNumeros();
        while(!cola.esVacio()){
            nume= cola.eliminar();
            if(nume==)
            {
                aux.eliminar();
            }
            aux.adicionar(nume);
        }
        cola.vaciar(aux);

    }
}
