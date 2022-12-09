import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Num, X, dentro = 0, fora = 0;

        System.out.print("Quantos números você pretende digitar? ");
        Num = entrada.nextInt();

        for (int i = 1; i <= Num; i++) {
            System.out.print("Digite um numero: ");
            X = entrada.nextInt();

            if (X >= 10 && X <= 20) {
                dentro += 1;
            } else {
                fora += 1;
            }
        }
        System.out.println(dentro + " Dentro");
        System.out.println(fora + " Fora");
        entrada.close();
    }

}
