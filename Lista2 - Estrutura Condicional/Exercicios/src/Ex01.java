import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double notaFin = 0;

        System.out.println("                NOTAS                 ");

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        notaFin = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", notaFin);

        if (notaFin > 59.9) {
            System.out.println("Aprovado, parabens");
        } else {
          System.out.println("Reprovado, infelizmente");  
        }
        entrada.close();
    }

}
