package Ejercicios;

public class Math_utils {
    private  String nameAPP;
    private String version;
    private int year;
    public Math_utils(String name,String ver,int yea)
    {
        this.nameAPP=name;
        this.version=ver;
        this.year=yea;
    }
    public void printApp()
    {
        System.out.print(
                this.nameAPP+" - "+this.version+" - "+this.year);
        System.out.println("");
    }
    public void generateNaturalNumber(int limit)
    {
        System.out.println("Generando numeros naturales: ");
        for(int i=1;i<=limit;i++)
        {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
    public void generatePairNumbers(int limit)
    {
        System.out.println("Generando numeros naturales pares: ");
        for(int i=0;i<=limit;i=i+2)
        {
            System.out.print(i+", ");
        }
        System.out.println("");
    }
    public void getExtensionFromCi(String ci)
    {
        System.out.println("Generando extension CI: "+ci);
        String ext="";
        ext=ci.substring(8);
        System.out.println("Extension: "+ext);

    }
}
