import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NAME = sc.nextLine();
        double SALARY = sc.nextDouble();
        double TOTAL_SELLS = sc.nextDouble();

        double TOTAL = SALARY + (TOTAL_SELLS * 0.15);
        System.out.printf("TOTAL = R$ %.2f", TOTAL);
        System.out.println();
        sc.close();
    }
}
