import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Digite o valor do produto: R$");
        float preco = sc.nextFloat();
        
        System.out.print("Digite a quantidade de produtos selecionados: ");
        int quantidade = sc.nextInt();
        
        System.out.print("Digite o valor recebido em dinheiro: R$");
        float valor = sc.nextFloat();
        
        float quantidadeTotal = (quantidade * preco);
        float troco = (valor - quantidadeTotal);
        
        System.out.format(" Preço : %.2f\n Quantidade: %d\n Valor recebido: %.2f\n Valor a devolver: %.2f\n", preco, quantidade, valor, troco);
        sc.close();
    }
    
}
