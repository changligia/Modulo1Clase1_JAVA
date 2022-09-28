public class Ejercicio4M1C1 {
    public static void main(String[] args) {

        var a = 2;
        var b = 2;
        var c = 2;
        var d = 2;

        Suma(a, b, c, d);
        Resta(a, b, c, d);
        Multiplicación(a, b, c, d);
        División(a, b, c, d);
    }
    static void Suma (int w, int x, int y, int z){
        System.out.println("La suma de los 4 numeros es: " + (w + x + y + z));
    }

    static void Resta (int w, int x, int y, int z){
        System.out.println("La resta de los 4 numeros es: " + (w - x - y - z));
    }

    static void Multiplicación (int w, int x, int y, int z){
        System.out.println("La multiplicación de los 4 numeros es: " + (w * x * y * z));
    }

    static void División (int w, int x, int y, int z){
        System.out.println("La División de los 4 numeros es: " + (w / x / y / z));
    }
}