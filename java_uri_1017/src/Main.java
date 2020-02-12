import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        int velMedia = sc.nextInt();
        int distancia = horas * velMedia;

        double litros = (double) distancia / 12;

        System.out.printf("%.3f",litros);
        System.out.println();
        sc.close();
    }
}
