import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
//Declarar variables.
    String nombreEnfermera, nombreBebe, nombreVacuna, nombreEps;        
    int mesesBebe = 0;
    double pesoBebe = 0, dosis = 0;

    Scanner lectura = new Scanner(System.in);

    System.out.print("Buenos dias, servicio de vacunas disponible las 24 horas, garantizamos seguridad y protección a su bebé. \nA continuación por favor dígame el nombre de la enfermera: ");
    nombreEnfermera = lectura.next();
    System.out.println(nombreEnfermera+": Por favor escriba el nombre de su bebé: ");
    nombreBebe = lectura.next();
    System.out.println("Escriba ahora la eps a la que está afiliado su bebé: ");
    nombreEps = lectura.next();
    System.out.println("¿Cuál es la vacuna que necesita su bebé? ");
    nombreVacuna = lectura.next();
    System.out.println("¿Cuanto pesa su bebé? ");
    pesoBebe = lectura.nextDouble();
    System.out.println("Necesitamos saber cuantos meses tiene su bebé para saber cuál es la dosis exacta que se le debe aplicar. ");
    mesesBebe = lectura.nextInt();

//Calcular la dosis con la siguiente fórmula.
    dosis = (pesoBebe + 15 / mesesBebe + 15) * 10;

//Imprimir en pantalla los resultados.
    System.out.println("Historial médico: \nNombre del bebé: " +nombreBebe+ ". \nEPS del bebé: " +nombreEps+ ". \nVacuna que se le va a suministrar: " +nombreVacuna+ ". \nPeso: " +pesoBebe+ " kilogramos. \nMeses del bebe: " +mesesBebe+ " meses. ");

    System.out.println(nombreEnfermera+": Para poder suministrar la vacuna deberás darle la siguiente cantidad de "+nombreVacuna+ " : "+dosis+" en miligramos.");
    lectura.close();
    }
}