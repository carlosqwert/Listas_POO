import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a, b, c;
        double delta, x1, x2;

        System.out.println("BHASKARA");
        System.out.print("Coeficiente a: ");
        a = entrada.nextDouble();
        System.out.print("Coeficiente b: ");
        b = entrada.nextDouble();
        System.out.print("Coeficiente c: ");
        c = entrada.nextDouble();

        delta = (Math.pow(b, 2)) - (4 * a * c);
        x1 = ((b * (-1)) + Math.sqrt(delta)) / (2 * a);
        x2 = ((b * (-1)) - Math.sqrt(delta)) / (2 * a);
        
        if (delta > 0) {
            System.out.printf("x1 = %.4f%n", x1);
            System.out.printf("x2 = %.4f%n", x2);
        } else {
            System.out.println("A equação não possui raízes reais");        
        }
        entrada.close();
    }

}
