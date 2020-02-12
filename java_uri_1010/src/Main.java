import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piece1 = sc.nextInt();
        int numberOfPieces1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int piece2 = sc.nextInt();
        int numberOfPieces2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double totalValue = (numberOfPieces1 * valor1) + (numberOfPieces2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalValue);

        System.out.println();
        sc.close();
    }
}
