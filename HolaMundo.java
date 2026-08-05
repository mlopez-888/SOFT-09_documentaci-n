public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo desde Java!");
        saludar("nombre");
        sumar(5, 3);
    }

    public static void saludar(String MaryPaz) {
        System.out.println("Hola, " + MaryPaz + ". ¡Bienvenida al ejercicio de Git y GitHub!");
    }

    public static void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " + " + b + " es: " + resultado);
    }
}

