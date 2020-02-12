import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(N);

        System.out.printf("%d nota(s) de R$ 100,00%n", (N/100));
        System.out.printf("%d nota(s) de R$ 50,00%n", N%100/50);
        System.out.printf("%d nota(s) de R$ 20,00%n",N%100%50/20);
        System.out.printf("%d nota(s) de R$ 10,00%n",N%100%50%20/10);
        System.out.printf("%d nota(s) de R$ 5,00%n", N%100%50%20%10/5);
        System.out.printf("%d nota(s) de R$ 2,00%n", N%100%50%20%10%5/2);
        System.out.printf("%d nota(s) de R$ 1,00%n",N%100%50%20%10%5%2/1);

        sc.close();
    }
}
