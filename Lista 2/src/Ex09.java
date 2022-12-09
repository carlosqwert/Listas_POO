import java.util.Locale;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codigo, qtde;
        double total = 0;
        System.out.print("Código do produto comprado: ");
        codigo = entrada.nextInt();
        System.out.print("Quantidade comprada: ");
        qtde = entrada.nextInt();

        switch (codigo) {
            case 1:
                total = qtde * 5.00;
                break;

            case 2:
                total = qtde * 10.50;
                break;

            case 3:
                total = qtde * 7.00;
                break;

            case 4:
                total = qtde * 8.90;
                break;

            case 5:
                total = qtde * 3.50;
                break;

            default:
                System.out.println("Código inválido!");
                break;
        }
        
        System.out.printf("Valor a ser pago: R$%.2f%n", total);
        entrada.close();
    }

}