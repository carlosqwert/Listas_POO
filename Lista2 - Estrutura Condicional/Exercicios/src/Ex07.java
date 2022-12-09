import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dist1, dist2, dist3, maior;

        System.out.println("Digite as três distâncias: ");
        dist1 = sc.nextDouble();
        dist2 = sc.nextDouble();
        dist3 = sc.nextDouble();

        maior = dist1;

        if (dist2 > dist1 && dist2 > dist3) {
            maior = dist2;
        }
        if (dist3 > dist1 && dist3 > dist2) {
            maior = dist3;
        }
        System.out.printf("Maior distância = %.2f%n", maior);
        sc.close();
    }

}