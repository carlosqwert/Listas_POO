import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, numerador, denominador;
        double divisao = 0;

        System.out.print("Quantos casos você pretende digitar? ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            System.out.print("Entre com o numerador: ");
            numerador = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextInt();

            if (numerador == 0 || denominador == 0) {
                System.out.println("DIVISÃO IMPOSSÍVEL");

            } else {
                divisao = (double) numerador / denominador;

                System.out.printf("DIVISÃO = %.2f%n", divisao);
            }
        }
        sc.close();
    }
}