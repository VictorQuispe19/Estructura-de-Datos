package PP;

public class Departamento {
    public String nombre;
    public Provincia prov[];
    public Departamento()
    {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia[] getProv() {
        return prov;
    }

    public void setProv(Provincia[] prov) {
        this.prov = prov;
    }
    public void mostrarDepartamento()
    {
        System.out.println("El Departamento es: "+this.nombre);
        for(int i=0;i<prov.length;i++)
        {
            System.out.println(prov[i]+", ");
        }
    }
}
