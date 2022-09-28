import java.util.Scanner;

public class Ejercicio4M1C1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingresar entero1: ");
        var entero1 = scanner.nextInt();

        System.out.print("Ingresar entero2: ");
        var entero2 = scanner.nextInt();

        System.out.print("Ingresar entero3: ");
        var entero3 = scanner.nextInt();

        System.out.print("Ingresar entero4: ");
        var entero4 = scanner.nextInt();

        scanner.close();

        Suma(entero1, entero2, entero3, entero4);
        Resta(entero1, entero2, entero3, entero4);
        Multiplicacion(entero1, entero2, entero3, entero4);
        Division(entero1, entero2, entero3, entero4);
    }

    static void Suma(int w, int x, int y, int z) {
        System.out.println("La suma de los 4 numeros es: " + (w + x + y + z));
    }

    static void Resta(int w, int x, int y, int z) {
        System.out.println("La resta de los 4 numeros es: " + (w - x - y - z));
    }

    static void Multiplicacion(int w, int x, int y, int z) {
        System.out.println("La multiplicación de los 4 numeros es: " + (w * x * y * z));
    }

    static void Division(int w, int x, int y, int z) {
        System.out.println("La División de los 4 numeros es: " + (w / x / y / z));
    }
}