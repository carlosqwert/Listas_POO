import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x;

        System.out.print("Digite o valor de X: ");
        x = entrada.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        entrada.close();
    }
}
