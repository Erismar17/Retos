public class reto1{
public static void main(String[] args) {
//Declarar variables
    double gradosF = 0, gradosC = 350, gradosK = 0;

//Solicitar datos.
    System.out.println("Necesitamos saber la cantidad de grados centigrados para el horno.");
    System.out.println("Grados que necesitamos 350 °F o °K + 100.\nGrados del horno: Celsius "+gradosC);
    System.out.println("Formula: °K + 100 | °F + 100");
//Operacion
//Fahrenheit a Celsius
    gradosF = (gradosC * 1.8) + 32;
//Kelvin a Fahrenheit
    gradosK = (gradosF + 459.67) * 5/9;
    System.out.println("El resultado de Celsius a Fahrenheit es: "+gradosF+". \nY de grados Celsius a Kelvin es: "+gradosK);
//Sumar.
    gradosF = gradosF + 100;
    gradosK = gradosK + 100;
    System.out.println("Para poder realizar tú comida debes poner en el horno grados: \nFarenheit: "+gradosF+". \nKelvin: "+gradosK);
    }
}