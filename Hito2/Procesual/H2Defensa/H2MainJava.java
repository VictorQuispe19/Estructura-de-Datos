package H2Defensa;

public class H2MainJava {
    public static void main(String[] args){
//Dep1
        Provincia pro1=new Provincia("Pacajes");
        Provincia pro2=new Provincia("Omasuyos");
        Provincia[] provincias=new Provincia[50];
        provincias[0]=pro1;
        provincias[1]=pro2;

        Departamento dep1=new Departamento("La Paz",2,provincias);
        Departamento[] departamento=new Departamento[50];
        departamento[0]=dep1;
//Dep2
        Provincia pro3=new Provincia("Gran Chaco");
        Provincia pro4=new Provincia("Eustaquio Mendez");
        Provincia[] provincias1=new Provincia[50];
        provincias1[0]=pro3;
        provincias1[1]=pro4;

        Departamento dep2=new Departamento("Tarija",2,provincias1);
        Departamento[] departamento1=new Departamento[50];
        departamento1[0]=dep2;

        Departamento[]departamento2=new Departamento[50];
        departamento2[0]=dep1;
        departamento2[1]=dep2;
//Pais
        Pais pai1=new Pais("Bolivia",2,departamento2);
        pai1.mostrarPais();



    }
}
