package H2Defensa;

public class Pais {
    private int nroDeps;
    private Departamento departamentos[];
    private String nombre;
    public Pais(){

    }
    public  Pais(String nom,int nro,Departamento[] depart){
        this.nombre=nom;
        this.nroDeps=nro;
        this.departamentos=depart;

    }

    public int getNroDeps() {
        return nroDeps;
    }

    public void setNroDeps(int nroDeps) {
        this.nroDeps = nroDeps;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarPais(){
        System.out.println("Nombre: "+this.nombre+" Numero de Departamentos: "+ this.nroDeps);
        for(int i=0;i<this.nroDeps;i++)
        {
            departamentos[i].mostrarDepartamento();

        }
        System.out.println();

    }
    public void agregarDepartamento(Departamento cbba){

        Provincia pro5=new Provincia("Quillacollo");
        Provincia[] provincias3=new Provincia[50];
        provincias3[0]=pro5;
        Departamento dep3=new Departamento("Cochabamba",1,provincias3);
        Departamento[] departamento3=new Departamento[50];
        departamento3[0]=dep3;
    }
    public void AgregarProvincia(String nomDep,Provincia prov)
    {



    }

}
