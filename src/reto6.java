import java.util.Scanner;
public class reto6 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        int contador=1, i=1;
        String palabraGanadora;
        do { System.out.println(" ¡Bienvenido! ¿Preparado para jugar Adivina la palabra?");
            System.out.println("¿Cuántas palabras desea descubrir? 1-10");
            contador = lectura.nextInt();

        } while (i>=contador);
            System.out.println("Adivina cuál es la palabra a adivinar entre éstas opciones: \n1. Mesa. \n2. Ventana. \n3. Carro. \n4. Puerta. \n5. Camisa. \n6. Pantalón. \n7. Espejo. \n8. Mueble. \n9. Linterna. \n10. Florero.");
            palabraGanadora=lectura.next();
            if (palabraGanadora.equalsIgnoreCase("espejo")) {
                System.out.println("¡Ganaste! Acertaste la palabra. \n¿Quieres jugar de nuevo?");
            i=contador+1;
            }
    lectura.close();
    }
}