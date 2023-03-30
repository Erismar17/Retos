import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
//Declarar variables.
    String nombreUsuario;
    int edadUsuario, numeroMaquina = (int)(Math.random()*2+1), numeroUsuario; 
//Crear objetos.
    Scanner lectura = new Scanner(System.in);
//Solicitar datos.
    System.out.println("¡Bienvenido! ¿Preparado para jugar piedra, papel o tijera?");
    System.out.print(" Por favor, escribe tú nombre: ");
    nombreUsuario = lectura.next();
    System.out.print(" Muy bien " + nombreUsuario+", ahora, digite su edad: ");
    edadUsuario = lectura.nextInt();

//Operaciones
        if (edadUsuario >= 18 && edadUsuario <= 100) {
        System.out.println("¡Excelente! Tienes edad para jugar. \nPor favor elige 1 2 o 3 \n1. Piedra. \n2. Papel. \n2 Tijera. ");
        numeroUsuario = lectura.nextInt();

        switch (numeroUsuario) {
            case 1:
            if (numeroMaquina == 1) {
                System.out.println("Elegiste piedra, la máquina elegió piedra también. Empate.");
            } else if (numeroMaquina == 2) {
                System.out.println("Elegiste piedra, la máquina elegió papel. Perdiste, suerte para la próxima.");
            } else if (numeroMaquina == 3) {
                System.out.println("Elegiste piedra, la máquina elegió tijera. Ganaste.");
            }
        break;
            case 2:
            if (numeroMaquina == 1) {
                System.out.println("Elegiste papel, la máquina elegió piedra. Ganaste. ");
            } else if (numeroMaquina == 2) {
                System.out.println("Elegiste papel, la máquina eligió papel. Empate");
            } else if (numeroMaquina == 3) {
                System.out.println("Elegiste papel, la máquina eligió tijera. Perdiste, suerte para la próxima.");
            }
        break;
            case 3:
            if (numeroMaquina == 1) {
                System.out.println("Elegiste tijera, la máquina elegió piedra. Perdiste, suerte para la próxima.");
            } else if (numeroMaquina == 2) {
                System.out.println("Elegiste tijera, la máquina eligió papel. Ganaste.");
            } else if (numeroMaquina == 3) {
                System.out.println("Elegiste tijera, la máquina eligió tijera. Empate");
            }
        break;
            
            default:
                System.out.println("Elegiste una opción equivocada, vuelve a intentarlo del 1 al 3");
        break;
            }
        System.out.println("La maquina elige un número al azar: "+numeroMaquina);
        } else {
        System.out.println("Lo sentimos, no tienes edad suficiente para jugar cara o sello con la máquina, esperamos que vuelvas cuando tengas la edad mínima requerida:) \nTú edad es: "+edadUsuario);
        }
    lectura.close();
    }
}
