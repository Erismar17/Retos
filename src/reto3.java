import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
//Declarar variables.
    String nombreUsuario;
    int edadUsuario, numeroMaquina = (int)(Math.random()*2+1), eleccionUsuario; 
    Scanner lectura = new Scanner(System.in);
        
//Solicitar los datos.
    System.out.println("¡Bienvenido! ¿Preparado para jugar cara o sello? ");
    System.out.print(" Por favor, escribe tú nombre: ");
    nombreUsuario = lectura.next();
    System.out.println( "Muy bien " +nombreUsuario+", ahora escribe tú edad: ");
    edadUsuario = lectura.nextInt();

    if (edadUsuario >= 18 && edadUsuario <= 100) {
        System.out.println("¡Excelente! Tienes edad para jugar. \nPor favor elige 1-2 \n1. Cara. \n2. Sello.");
        eleccionUsuario = lectura.nextInt();

    if (eleccionUsuario > 0 && eleccionUsuario < 3) {
    if (numeroMaquina == 1) {
        System.out.println("Calló cara.");
    if (eleccionUsuario == numeroMaquina) {
        System.out.println("¡Muy bien! Has ganado. ");
    } else {
        System.out.println("Oops, ésta vez has perdido, intentalo de nuevo. ");
    }
    } else if (numeroMaquina == 2) {
        System.out.println("Calló sello.");
    if (eleccionUsuario == numeroMaquina) {
        System.out.println("¡Muy bien! Has ganado. ");
    } else {
        System.out.println("Oops, ésta vez has perdido, intentalo de nuevo. ");
    }
    }
    } else {
        System.out.println("Usted a ingresado un número inválido, por favor, escribe 1 o 2. ");
    }
                        
        System.out.println("La máquina ha elegido un número al azar: "+numeroMaquina);

    } else {
        System.out.println("Lo sentimos, no tienes edad suficiente para jugar cara o sello con la máquina, esperamos que vuelvas cuando tengas la edad mínima requerida:) \nTú edad es: "+edadUsuario);
    }
    lectura.close();
    }
}