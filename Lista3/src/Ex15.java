import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N, F = 1;

        System.out.print("Digite o valor de N: ");
        N = entrada.nextInt();

        for (int i = N; i >= 1; i--) {
            F *= i;
        }
        System.out.println("FATORIAL = " + F);
        entrada.close();
    }
}
