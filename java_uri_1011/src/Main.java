import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double pi = 3.14159;

        double volume = (4/3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f",volume);
        System.out.println();
        sc.close();
    }
}
