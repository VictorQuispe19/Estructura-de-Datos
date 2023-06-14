package ManejoDeColas;

import ManejoDePilas.PilaNumeros;

public class ColaNumeros {
    private int ini;
    private int fin;
    private int max;
    private int[] numeros;

    public ColaNumeros(){
        this.max=100;
        this.fin=0;
        this.ini=0;
        this.numeros=new int[this.max+1];
    }
    public boolean esVacio(){
        if(ini==0&&fin==0){
        return true;}else{
            return false;
        }
    }
    public boolean esLleno(){
        if(fin==max){
            return true;}
        else{
            return false;
        }
    }
    public int nroElem()
    {
        return this.fin-this.ini;
    }

    public  int adicionar(int nuevoNum)
    {
        if(esLleno()){
            System.out.println("COLA LLENA");
        }else{
            fin=fin+1;
            numeros[fin]=nuevoNum;
        }
        return nuevoNum;
    }
    public int eliminar()
    {
        int itemEliminado=0;
        if(esVacio()){
            System.out.println("COLA VACIA");
        }else{
            ini=ini+1;
            itemEliminado=numeros[ini];
            if (ini==fin){
                ini=0;
                fin=0;
            }
        }
        return itemEliminado;
    }
    public void mostrar()
    {
        int item;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la COLA DE NUMEROS: ");
            ColaNumeros aux=new ColaNumeros();
            while(!esVacio()){
                item=eliminar();
                System.out.print(item+", ");
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
    public void vaciar(ColaNumeros cola)
    {
        while (!cola.esVacio()) {
            adicionar(cola.eliminar());
        }
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

}
