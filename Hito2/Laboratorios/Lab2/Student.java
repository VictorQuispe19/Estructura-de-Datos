package Ejercicios;

public class Student {
    private String fullname;
    private String lastname;
    private int age;
    public Student(String full,String last,int a)
    {
        this.fullname=full;
        this.lastname=last;
        this.age=a;
    }
    public String getFullName()
    {
        return this.fullname;
    }
    public void setFullName(String fullname)
    {
        this.fullname=fullname;
    }
    public String getLastName()
    {
        return this.lastname;
    }
    public void setLastName(String lastname)
    {
        this.lastname=lastname;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
