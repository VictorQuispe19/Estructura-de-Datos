import Ejercicios.Math_utils;
import Ejercicios.Student;

public class Main {
    public static void main(String[] args) {
//    Ejercicios eje1=new Ejercicios();
//
//    eje1.mostrarMensaje();
//    eje1.generarNaturales();
//    eje1.generarNaturalesPar();
//    eje1.generarNumerosWhile();


//    Math_utils math1=new Math_utils("CompuMundo","1.5 alpha",2023);
//    math1.printApp();
//    math1.generateNaturalNumber(25);
//    math1.generatePairNumbers(30);
//    math1.getExtensionFromCi("73235984LP");

    Student stu=new Student("Pepito ","pep",25);
    String nombre=stu.getFullName();
    System.out.println("Nombre: "+nombre);

    String apellido=stu.getLastName();
    System.out.println("Apellido: "+apellido);

    int edad= stu.getAge();
    System.out.println("Edad: "+edad);

    stu.setFullName("Pepito1");
    String nombrenuevo=stu.getFullName();
    System.out.println("Nombre nuevo: "+nombrenuevo);

    stu.setLastName("Pep1");
    String apellidonuevo=stu.getLastName();
    System.out.println("Apellido nuevo: "+apellidonuevo);

    stu.setAge(30);
    int nuevaedad=stu.getAge();
    System.out.println("Edad nueva: "+nuevaedad);


    }
}

