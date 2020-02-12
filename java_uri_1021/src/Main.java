import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        int aux = 0;

        System.out.println("NOTAS:");
        aux = (int)valor/100;
        System.out.printf("%d nota(s) de R$ 100.00%n",aux);
        valor = valor%100.0;

        aux = (int)valor/50;
        System.out.printf("%d nota(s) de R$ 50.00%n",aux);
        valor = valor%50.0;

        aux = (int)valor/20;
        System.out.printf("%d nota(s) de R$ 20.00%n",aux);
        valor = valor%20.0;

        aux = (int)valor/10;
        System.out.printf("%d nota(s) de R$ 10.00%n",aux);
        valor = valor%10.0;

        aux = (int)valor/5;
        System.out.printf("%d nota(s) de R$ 5.00%n",aux);
        valor = valor%5.0;

        aux = (int)valor/2;
        System.out.printf("%d nota(s) de R$ 2.00%n",aux);
        valor = valor%2.0;

        valor = valor * 100.0;

        System.out.println("MOEDAS:");
        aux = (int)valor/100;
        System.out.printf("%d moeda(s) de R$ 1.00%n",aux);
        valor = valor%100.0;

        aux = (int)valor/50;
        System.out.printf("%d moeda(s) de R$ 0.50%n",aux);
        valor = valor%50.0;

        aux = (int)valor/25;
        System.out.printf("%d moeda(s) de R$ 0.25%n",aux);
        valor = valor%25.0;

        aux = (int)valor/10;
        System.out.printf("%d moeda(s) de R$ 0.10%n",aux);
        valor = valor%10.0;

        aux = (int)valor/5;
        System.out.printf("%d moeda(s) de R$ 0.05%n",aux);
        valor = valor%5.0;

        aux = (int)valor/1;
        System.out.printf("%d moeda(s) de R$ 0.01%n",aux);
    }
}
