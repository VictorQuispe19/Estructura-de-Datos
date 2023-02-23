import Ejercicios.Ejercicios;
import Math_utils.Math_utils;
public class Main {
    public static void main(String[] args) {
//    Ejercicios eje1=new Ejercicios();
//
//    eje1.mostrarMensaje();
//    eje1.generarNaturales();
//    eje1.generarNaturalesPar();
//    eje1.generarNumerosWhile();


    Math_utils math1=new Math_utils("CompuMundo","1.5 alpha",2023);
    math1.printApp();
    math1.generateNaturalNumber(25);
    math1.generatePairNumbers(30);
    math1.getExtensionFromCi("73235984LP");
    }
}

