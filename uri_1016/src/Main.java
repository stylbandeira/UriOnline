import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();

        int minutos = distancia * 2;
        System.out.println(minutos+ " minutos");
        sc.close();
    }
}
