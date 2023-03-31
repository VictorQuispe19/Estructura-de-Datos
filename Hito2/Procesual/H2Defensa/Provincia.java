package H2Defensa;

public class Provincia {
    private String nombre;

    public  Provincia(){
    }
    public Provincia(String nom){
        this.nombre=nom;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarProvincia(){
        System.out.println("Nombre Provincia: "+this.nombre);
    }



}
