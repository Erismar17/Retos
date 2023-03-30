import java.util.Scanner;
public class reto5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int vidas=3, edadUsuario, numeroMaquina, respuestaJugador=0, i=1, (int)(Math.random() * 3) + 1;

    do { System.out.println("¡Bienvenido! ¿Listo para jugar Piedra, Papel o Tijera? \nSelecciona una opción: \n1: Piedra. \n2:Papel. \n3: Tijera.");
    respuestaJugador=lectura.nextInt();
    }

    while (vidas>0) {
        if (edadUsuario >= 18 && edadUsuario <= 100) {
            System.out.println("¡Excelente! Tienes edad para jugar. \nPor favor elige 1 2 o 3 \n1. Piedra. \n2. Papel. \n2 Tijera. ");
            respuestaJugador = lectura.nextInt();
    
            switch (respuestaJugador) {
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
    }

    }
}