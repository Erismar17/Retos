import java.util.Scanner;
public class reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int vidasP1=3, vidasP2=3, victP1=0, victP2=0;
        String player1, player2;
        int dadoP1=(int)(Math.random()*6), dadoP2=(int)(Math.random() * 6);
        
    do {System.out.println("¡Bienvenido! Vamos a jugar a los dados.");
        System.out.println("Por favor escriba el nombre del primer jugador: ");
        player1=lectura.next();
        System.out.println("Por favor escriba el nombre del segundo jugador: ");
        player2=lectura.next();

        System.out.println("Comienza "+player1);
        player1=lectura.next();
        System.out.println("Ahora va "+player2);
        player2=lectura.next();
        if (dadoP1>dadoP2) {
            System.out.println("Ha ganado "+player1);
            victP1=1;
            vidasP2=-1;

        } else if (dadoP2>dadoP1) {
            System.out.println("Ha ganado "+player2);
            victP2=1;
            vidasP1=-1;
        }

        } while (vidasP1>=1 && vidasP2>=1);
    lectura.close();
    }
}