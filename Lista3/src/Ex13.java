import java.util.Scanner;
import java.util.Locale;

public class Ex13 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int p1 = 2, p2 = 3, p3 = 5;
        double x, y, z, media = 0;

        System.out.print("Quantos casos voce pretende digitar? ");
        int N = entrada.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println("Digite três valores: ");
            x = entrada.nextDouble();
            y = entrada.nextDouble();
            z = entrada.nextDouble();

            media = (x * p1 + y * p2 + z * p3) / (p1 + p2 + p3);

            System.out.printf("MÉDIA = %.1f%n", media);
        }
        entrada.close();
    }
}
