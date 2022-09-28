import java.util.Scanner;

public class Ejercicio3M1C1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        var entero = scanner.nextInt();

        var numeroEsPar = esPar(entero);

        scanner.close();

        System.out.println("El numero ingresado es par?: " + numeroEsPar);
    }
    static boolean esPar (int numero){
        if (numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}