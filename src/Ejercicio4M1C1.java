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

        suma(entero1, entero2, entero3, entero4);
        resta(entero1, entero2, entero3, entero4);
        multiplicacion(entero1, entero2, entero3, entero4);
        division(entero1, entero2, entero3, entero4);
    }

    static void suma(int w, int x, int y, int z) {
        System.out.println("La suma de los 4 numeros es: " + (w + x + y + z));
    }

    static void resta(int w, int x, int y, int z) {
        System.out.println("La resta de los 4 numeros es: " + (w - x - y - z));
    }

    static void multiplicacion(int w, int x, int y, int z) {
        System.out.println("La multiplicación de los 4 numeros es: " + (w * x * y * z));
    }

    static void division(int w, int x, int y, int z) {
        System.out.println("La División de los 4 numeros es: " + (w / x / y / z));
    }
}