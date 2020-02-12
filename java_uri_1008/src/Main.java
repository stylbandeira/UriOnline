import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUMBER = sc.nextInt();
        int WORKED_HOURS = sc.nextInt();
        double VALUE_HOUR = sc.nextDouble();

        double SALARY = (WORKED_HOURS * VALUE_HOUR);

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f",NUMBER,SALARY);
        System.out.println();
        sc.close();
    }
}
