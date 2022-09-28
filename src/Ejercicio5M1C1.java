import java.util.Scanner;

public class Ejercicio5M1C1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingresa tu masa corporal: ");
        var masa = scanner.nextDouble();

        var calcular = calcularPeso(masa);

        scanner.close();

        System.out.println("El peso es: " + calcular + " " + "kg");
    }

    static double calcularPeso (double x){
        return x * 9.81;
    }
}
