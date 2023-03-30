import java.util.Scanner;
public class reto7 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
            String nombre, apellido, ciudad;
            int edad, telefono, DI, tipoDI, contador=0;

        do { System.out.println("¡Bienvenido! A continuación llenará un formulario con datos personales básicos, no tomará más de cinco minutos :)");
        System.out.println("Escribe tú nombre: ");
        nombre=lectura.next();
        System.out.println("Escribe tú apellido: ");
        apellido=lectura.next();
        System.out.println("Escribe la ciudad dónde vives actualmente: ");
        ciudad=lectura.next();
        System.out.println("Escribe tú edad: ");
        edad=lectura.nextInt();
        System.out.println("Escribe tú número de teléfono: ");
        telefono=lectura.nextInt();
        System.out.println("Escribe el tipo de tú documento de identidad (C.C, T.I): ");
        tipoDI=lectura.nextInt();
        System.out.println("Escribe tú número de documento (sin puntos): ");
        DI=lectura.nextInt();
            
        System.out.println("¡Muchas gracias por realizar éste formulario! Tus datos son: \nNombre: "+nombre+" \nApellido: "+apellido+" \nCiudad de residencia: "+ciudad+ " \nEdad: "+edad+" \nNúmero de teléfono: "+telefono+" \nTipo de documento: "+tipoDI+ " \nNúmero de documento: "+DI);
        System.out.println();
        } while (contador==1);
        lectura.close();
    }
}