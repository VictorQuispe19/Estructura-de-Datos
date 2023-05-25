package ManejoDeColas;
public class MainColas {
    public static void main(String[] args) {
        ColaNumeros cola = new ColaNumeros();
        cola.adicionar(4);
        cola.adicionar(5);
        cola.adicionar(4);
        cola.adicionar(9);
        cola.adicionar(5);
        cola.adicionar(4);
        eliminarRepetidos(cola);
//        System.out.println(verificaSiExisteUnoMas(cola,4));

    }

//    public static void multiplos(ColaNumeros cola, int numero) {
//        int nume;
//        int cont = 0;
//        ColaNumeros aux = new ColaNumeros();
//        while (!cola.esVacio()) {
//            nume = cola.eliminar();
//            if (nume % numero == 0) {
//                cont = cont + 1;
//            }
//            aux.adicionar(nume);
//        }
//        cola.vaciar(aux);
//        System.out.println("\nNumeros multiples de: " + numero + " hay " + cont);
//    }

//    public static void destruirRepetidos(ColaNumeros cola) {
//        int nume;
//        int nume2 = 0;
//        ColaNumeros aux = new ColaNumeros();
//        while (!cola.esVacio()) {
//            nume = cola.eliminar();
//            if (nume == nume2) {
//                aux.eliminar();
//            }
//            aux.adicionar(nume);
//        }
//        cola.vaciar(aux);
//    }
    public static boolean verificaSiExisteUnoMas(ColaNumeros cola,int numero){
        int cont=0;
        int item;
        int nro=cola.nroElem();
        for(int i=1;i<=nro;i++) {
            item = cola.eliminar();
            if (item == numero) {
                cont = cont + 1;
            }else {
                cola.adicionar(item);
            }
        }
        if(cont>0)
            return true;
        return false;
    }

    public static void eliminarRepetidos(ColaNumeros cola){
        int nro = cola.nroElem();
        int x;
        for (int i=1;i<=nro;i++){
            x= cola.eliminar();
            if(!verificaSiExisteUnoMas(cola, x)){
                cola.adicionar(x);
                System.out.println("num: "+x);}

        }
//        System.out.println("ini: "+cola.getIni());
//        System.out.println("fin: "+cola.getFin());
    }
}
