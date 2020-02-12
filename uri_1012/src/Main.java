import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double TRIANGLE = A * C / 2;
        double CIRCLE = 3.14159 * C * C;
        double TRAPEZIO = ((A + B) * C) / 2;
        double QUADRADO = Math.pow(B, 2);
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n", TRIANGLE);
        System.out.printf("CIRCULO: %.3f%n", CIRCLE);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
        sc.close();
    }
}
