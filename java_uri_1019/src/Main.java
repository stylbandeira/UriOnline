import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();

        System.out.printf("%d:%d:%d", segundos/3600, segundos%3600/60, segundos%60);
        System.out.println();
        sc.close();
    }
}
