package ManejoDePilas;

public class Nombres {
    private String paralelo;
    private String [] nombres;

    public String getParalelo() {
        return paralelo;
    }
    public String[] getNombres() {
        return nombres;
    }
    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }
    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    public Nombres( String paralelo,String[] nombres)
    {
        this.paralelo=paralelo;
        this.nombres=nombres;
    }
    public void mostrar()
    {
        System.out.println("Mostrando Clase EDADES:");
        System.out.println("Paralelo: "+this.getParalelo());
        for(int i=0;i<this.getNombres().length;i++)
        {
            System.out.print(this.nombres[i]+", ");

        }
        System.out.println();
    }
    public void mostrarNombres()
    {
        for(int i=0;i<this.nombres.length;i++)
        {
            System.out.print(this.nombres[i]+", ");

        }
        System.out.println();
    }


}
