package ManejoDeColas.Objetos;

public class ColaLibros {
    private int ini;
    private int fin;
    private int max;
    private Libro[] libros;

    public ColaLibros(){
        this.max=100;
        this.fin=0;
        this.ini=0;
        this.libros=new Libro[this.max+1];
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

    public Libro adicionar(Libro nuevoLib)
    {
        if(esLleno()){
            System.out.println("COLA LLENA");
        }else{
            fin=fin+1;
            libros[fin]=nuevoLib;
        }
        return nuevoLib;
    }
    public Libro eliminar()
    {
        Libro itemEliminado=null;
        if(esVacio()){
            System.out.println("COLA VACIA");
        }else{
            ini=ini+1;
            itemEliminado=libros[ini];
            if (ini==fin){
                ini=fin=0;
            }
        }
        return itemEliminado;
    }
    public void mostrar()
    {
        Libro item;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la COLA DE OBJETOS: ");
            ColaLibros aux=new ColaLibros();
            while(!esVacio()){
                item=eliminar();
                item.mostrar();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
    public void vaciar(ColaLibros cola)
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
