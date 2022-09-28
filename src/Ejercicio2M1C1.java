import java.util.Scanner;

public class Ejercicio2M1C1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingresar string1: ");
        var string1 =  scanner.nextLine();

        System.out.print("Ingresar string2: ");
        var string2 =  scanner.nextLine();

        System.out.print("Ingresar string3: ");
        var string3 =  scanner.nextLine();

        scanner.close();

        var concatenar = concatenarStrings(string1, string2, string3);

        System.out.println("La concatenación de los strings es: " + concatenar);
    }
    static String concatenarStrings (String x, String y, String z){
        return x + " " +  y + " " + z + " " + "bota vieja";
    }
}