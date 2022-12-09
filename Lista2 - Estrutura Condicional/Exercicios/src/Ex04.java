import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double fatura = 50.0;

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = entrada.nextInt();

        if (minutos > 100) {
            fatura += (minutos - 100) * 2;            
        } 
        
        System.out.printf("Valor a pagar da fatura: R$%.2f%n", fatura);


        entrada.close();
    }

    
}
