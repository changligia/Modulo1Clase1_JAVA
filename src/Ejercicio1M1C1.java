import java.util.Scanner;

public class Ejercicio1M1C1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero double: ");
        var double1 = scanner.nextDouble();

        System.out.print("Ingresa un numero double: ");
        var double2 = scanner.nextDouble();

        System.out.print("Ingresa otro numero double: ");
        var double3 = scanner.nextDouble();

        scanner.close();

        var multiplicacion = multiplicarDoubles(double1, double2, double3);

        System.out.println("La multiplicación de los numeros es: " + multiplicacion);
    }

    static double multiplicarDoubles(double x, double y, double z) {
        return (x * y * z) - 5.0;
    }
}