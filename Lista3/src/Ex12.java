import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N, X;

        System.out.print("Quantos números você pretende digitar? ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite um numero: ");
            X = entrada.nextInt();

            if (X % 2 == 0 && X > 0) {
                System.out.println("PAR POSITIVO");
            } else if (X % 2 == 0 && X < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (X % 2 == -1 && X < 0) {
                System.out.println("ÍMPAR NEGATIVO");
            } else if (X % 2 == 1 && X > 0) {
                System.out.println("ÍMPAR POSITIVO");
            } else {
                System.out.println("NULO");
            }
        }
        entrada.close();
    }
}
