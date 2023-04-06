package PP;

public class Provincia {
    public String nombre;
    public Provincia() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void MostrarProvincia()
    {
        System.out.println("La Provincia se llama: "+this.nombre);
    }
}
