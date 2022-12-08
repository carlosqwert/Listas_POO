import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor 1: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor 2: ");
        int b = sc.nextInt();
        
        int soma = a + b;
        
        System.out.format("A soma entre %d e %d é : %d\n",a,b,soma);
        sc.close();
    }
}