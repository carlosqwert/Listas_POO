import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x, y;
        x = 0;
        y = 1;
        while (x != y) {

            System.out.println("Digite dois números: ");
            x = entrada.nextInt();
            y = entrada.nextInt();

            if (x > y) {
                System.out.println("Está em ordem Decrescente!");

            } else {
                System.out.println("Está em ordem Crescente!");

            }
        }
        entrada.close();
    }
}
