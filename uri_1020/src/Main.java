import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int dias = sc.nextInt();

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)",dias/365, dias%365/30, dias%365%30);
        System.out.println();
        sc.close();
    }
}