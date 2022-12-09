import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);        
        Scanner entrada = new Scanner(System.in);

        double nota1 = -1; 
        double nota2 = 11;
        double media = 0;

        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        if (nota1 < 0 || nota1 > 10.0){
            while (nota1 < 0 || nota1 > 10){
                System.out.print("Valor inválido! Tente novamente: ");
                nota1 = entrada.nextDouble();
            }
        }
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        if (nota2 < 0 || nota2 > 10.0){ 
            while (nota2 < 0 || nota2 > 10){
                System.out.print("Valor inválido! Tente novamente: ");
                nota2 = entrada.nextDouble();
            }
        }
        media = (nota1 + nota2)/2;
        System.out.printf("MÉDIA = %.2f%n", media);
        entrada.close();
    }
}
