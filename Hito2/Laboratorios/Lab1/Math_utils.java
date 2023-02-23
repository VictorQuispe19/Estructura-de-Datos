package Math_utils;

public class Math_utils {
    private  String nameAPP;
    private String version;
    private int year;
    public Math_utils(String nameAPP,String version,int year)
    {
        this.nameAPP=nameAPP;
        this.version=version;
        this.year=year;
    }
    public void printApp()
    {
        System.out.print(
                this.nameAPP+" - "+this.version+" - "+this.year);
    }
    public void generateNaturalNumber(int limit)
    {
        System.out.println("Generando numeros naturales: ");
        for(int i=1;i<=limit;i++)
        {
            System.out.print(i+", ");
        }
    }
    public void generatePairNumbers(int limit)
    {
        System.out.println("Generando numeros naturales pares: ");
        for(int i=2;i<=limit;i=i+2)
        {
            System.out.print(i+", ");
        }
    }
    public void getExtensionFromCi(String ci)
    {



    }
}
