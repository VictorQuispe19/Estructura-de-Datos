package PP;

public class Pais {
    public String nombre;
    public int nroDepartamentos;
    public Departamento depa[];
    public Pais()
    {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDepartamentos() {
        return nroDepartamentos;
    }

    public void setNroDepartamentos(int nroDepartamentos) {
        this.nroDepartamentos = nroDepartamentos;
    }

    public Departamento[] getDepa() {
        return depa;
    }

    public void setDepa(Departamento[] depa) {
        this.depa = depa;
    }
    public void mostrarPais()
    {
        System.out.println("El pais se llama: "+this.nombre+" tiene: "+this.nroDepartamentos+" departamentos");
        for(int i=0;i<depa.length;i++)
        {
            System.out.println(depa[i]+", ");
        }
    }
}
