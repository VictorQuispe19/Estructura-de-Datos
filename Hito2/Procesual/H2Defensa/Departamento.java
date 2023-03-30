package H2Defensa;

public class Departamento {
    private String nombre;
    private int nroProv;
    private Provincia Prov[];

    public Departamento(String nom,int nrp,Provincia provincia[]){
        this.nombre=nom;
        this.nroProv=nrp;
        this.Prov=provincia;

    }
    public  Departamento(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroProv() {
        return nroProv;
    }

    public void setNroProv(int nroProv) {
        this.nroProv = nroProv;
    }

    public H2Defensa.Provincia[] getProvincia() {
        return Prov;
    }

    public void setProvincia(H2Defensa.Provincia[] provincia) {
        Prov = provincia;
    }
    public void mostrarDepartamento(){
        System.out.println("Nombre departamentos: "+this.nombre+" Nro de Provincias: "+this.nroProv);

        for(int i=0;i<this.nroProv;i++)
        {
            this.Prov[i].mostrarProvincia();

        }
        System.out.println();
    }

}
