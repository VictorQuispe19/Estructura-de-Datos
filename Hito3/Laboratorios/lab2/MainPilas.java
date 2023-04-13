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

//        mostrarBuscar(pila1,5);
        muestramin(pila1);
        intercambiaMayorMenor(pila1);

        mostrarpares(pila1);
        adicionarNumero(pila1,100);
        pila1.mostrar();
    }
    public static int muestraMax(PilaNumeros pila)
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
        return max;

    }
//    Determinar cuantos 5 hay en la pila
//    public static void mostrarBuscar(PilaNumeros pila,int numBuscar)
//    {
//        int nume=0;
//        int cont=0;
//        PilaNumeros aux=new PilaNumeros();
//        while(!pila.esVacio()){
//            nume= pila.eliminar();
//            if(nume==numBuscar)
//            {
//                cont=cont+1;
//            }
//            aux.adicionar(nume);
//        }
//        pila.vaciar(aux);
//        System.out.println(" Numeros repetidos: "+cont);
//    }
    public static int muestramin(PilaNumeros pila)
    {
        PilaNumeros aux=new PilaNumeros();
        int num=0;
        int min=99999;
        while(!pila.esVacio()){
            num= pila.eliminar();
            if(num<min){
                min=num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println(" MENOR: "+min);
        return min;
    }
//    Intercambiar el valor maximo y minimo de una pila
public static void intercambiaMayorMenor(PilaNumeros pila) {
    PilaNumeros aux = new PilaNumeros();
    int num = 0;
    int max = muestraMax(pila);
    int min = muestramin(pila);
    while (!pila.esVacio()) {
        num = pila.eliminar();
        if (num == max) {
            num = min;
        } else if (num == min) {
            num = max;
        }
        aux.adicionar(num);
    }
    pila.vaciar(aux);
}
    public static void mostrarpares(PilaNumeros pila)
    {
        int nume=0;
        int cont=0;
        int con=0;
        PilaNumeros aux=new PilaNumeros();
        while(!pila.esVacio()){
            nume= pila.eliminar();
            if(nume %2==0)
            {
                cont=cont+1;
            }else
            {
                con=con+1;
            }
            aux.adicionar(nume);
        }
        pila.vaciar(aux);
        System.out.println("Numeros pares: "+cont);
        System.out.println("Numeros impares: "+con);
    }
    public static void adicionarNumero(PilaNumeros pila,int num)
    {
        PilaNumeros aux=new PilaNumeros();
        aux.vaciar(pila);
        aux.adicionar(num);
        pila.vaciar(aux);
    }

}