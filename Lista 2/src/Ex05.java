import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double precoUnitario, dinheiro, troco, valorCompra;
        int qntde;
        System.out.print("Preço unitário do produto: ");
        precoUnitario = entrada.nextDouble();
        System.out.print("Qntd comprada: ");
        qntde = entrada.nextInt();
        System.out.print("Dinheiro recebido: R$");
        dinheiro = entrada.nextDouble();

        valorCompra = precoUnitario * qntde;

        if (dinheiro > valorCompra) {
            troco = dinheiro - valorCompra;
            System.out.printf("Troco = R$%.2f%n", troco);            
        } else {
            troco = valorCompra - dinheiro;
            System.out.printf("Dinheiro insuficinte.Faltam %.2f REAIS. %n", troco);
        }
    
        entrada.close();        
    }
}