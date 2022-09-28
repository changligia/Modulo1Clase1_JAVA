import java.util.Scanner;

public class Ejercicio3M1C1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        var entero = scanner.nextInt();

        scanner.close();

        var numeroEsPar = esPar(entero);

        System.out.println("El numero ingresado es par?: " + numeroEsPar);
    }

    static boolean esPar(int numero) {
        return (numero % 2 == 0);
    }
}
