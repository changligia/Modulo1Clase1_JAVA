import java.util.Scanner;

public class Ejercicio1M1C1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        var entero1 = scanner.nextInt();

        System.out.print("Ingresa un numero entero: ");
        var entero2 = scanner.nextInt();

        System.out.print("Ingresa un numero entero: ");
        var entero3 = scanner.nextInt();

        scanner.close();

        var multiplicacion = multiplicarDoubles(entero1, entero2, entero3);

        System.out.println("La multiplicación de los numeros es: " + multiplicacion);
    }
    static double multiplicarDoubles (double x, double y, double z){
        return (x * y * z) - 5.0;
    }
}