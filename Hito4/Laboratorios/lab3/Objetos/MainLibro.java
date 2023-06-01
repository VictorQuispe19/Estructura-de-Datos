package ManejoDeColas.Objetos;
import java.util.Objects;
public class MainLibro {
    public static void main(String[] args) {
        ColaLibros colaLibros=new ColaLibros();
        Libro libro1=new Libro(1,"Juan","Masculino","MANGA",80);
        Libro libro2=new Libro(2,"Saul","Masculino","MANGA",100);
        Libro libro3=new Libro(3,"Ana","Femenino","HISTORIA",40);
        Libro libro4=new Libro(4,"Micaela","Femenino","HISTORIA",30);
        Libro libro5=new Libro(5,"Pepito","Otro","NOVELA",20);
        Libro libro6=new Libro(6,"Pep","Otro","NOVELA",20);
        Libro libro7=new Libro(7,"Carlos","Masculino","ARTE",200);

        colaLibros.adicionar(libro1);
        colaLibros.adicionar(libro2);
        colaLibros.adicionar(libro3);
        colaLibros.adicionar(libro4);
        colaLibros.adicionar(libro5);
        colaLibros.adicionar(libro6);
        colaLibros.adicionar(libro7);
       // colaLibros.mostrar();
        //menorPaginas(colaLibros).mostrar();
        //reordenaCola(colaLibros);
        reordenarColaAscedente(colaLibros);

    }
    public static Libro menorPaginas(ColaLibros cola) {
        ColaLibros aux = new ColaLibros();
        Libro libroMenor=null;
        int pag = Integer.MAX_VALUE;
        while (!cola.esVacio()) {
            Libro item=cola.eliminar();
            if (item.getPaginas() < pag) {
                pag = item.getPaginas();
                libroMenor=item;
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        return libroMenor;
    }
    public static void reordenaCola(ColaLibros cola)
    {
        ColaLibros auxM=new ColaLibros();
        ColaLibros auxF=new ColaLibros();
        ColaLibros auxO=new ColaLibros();
        Libro item;
        while (!cola.esVacio()){
            item=cola.eliminar();
            if(Objects.equals(item.getGenero(), "Femenino")) {

                auxF.adicionar(item);

            }else if(Objects.equals(item.getGenero(), "Masculino")){
                auxM.adicionar(item);
            }else {
                auxO.adicionar(item);
            }
        }
        cola.vaciar(auxF);
        cola.vaciar(auxM);
        cola.vaciar(auxO);
        System.out.println("Cola Ordenada");
        cola.mostrar();
    }
    public static void reordenarColaAscedente(ColaLibros cola){
        ColaLibros aux=new ColaLibros();
        ColaLibros orden=new ColaLibros();
        int nro=cola.nroElem();
        for(int i=1;i<=nro;i++)
        {
            Libro libro=menorPaginas(cola);
            while(!cola.esVacio()){
                Libro item=cola.eliminar();
                if(item.getCodigoLibro()==libro.getCodigoLibro()){
                    orden.adicionar(item);
                }else{
                    aux.adicionar(item);
                }
            }
            cola.vaciar(aux);
        }
        cola.vaciar(orden);
        cola.mostrar();
    }
}
