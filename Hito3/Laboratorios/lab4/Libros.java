package ManejoDePilas;

public class Libros {
    private String autor;
    private int nroPag;
    private double precio;
    private String Titulo;
    private String categoria;

    public Libros(String autor, int nroPag, double precio, String titulo, String categoria) {
        this.autor = autor;
        this.nroPag = nroPag;
        this.precio = precio;
        Titulo = titulo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void mostrarLibro()
    {
        System.out.println("\nMostrando Libro: ");
        System.out.println("Autor: "+this.autor);
        System.out.println("Nro Paginas: "+this.nroPag);
        System.out.println("Precio: "+this.precio);
        System.out.println("Titulo: "+this.Titulo);
        System.out.println("Categoria: "+this.categoria);
    }
}
