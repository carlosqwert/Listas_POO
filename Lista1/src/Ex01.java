import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira a largura do terreno: ");
        float largura = sc.nextFloat();
        System.out.print("Insira o comprimento do terreno: ");
        float comprimento = sc.nextFloat();
        System.out.print("Digite o preço do metro quadrado: R$");
        float preco = sc.nextFloat();
        
        float area = (largura*comprimento);
        float vlrTerreno = (area*preco);
        
        System.out.format("A area do terreno é: %.2f\n", area);
        System.out.format("O preço do terredo e de: R$%.2f\n", vlrTerreno);
        sc.close();
    }
    
}