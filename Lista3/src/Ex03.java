import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int senha = 0;

        System.out.print("Digite a senha: ");
        senha = entrada.nextInt();

        while (senha != 2023) {
            
            if (senha != 2023) {
                System.out.print("Senha Inválida!");
                System.out.print(" Tente novamente: ");
                senha = entrada.nextInt();
            }
        }
        System.out.println("Acesso permitido com sucesso!");
        entrada.close();
    }
    
}
