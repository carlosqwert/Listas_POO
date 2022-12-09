import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor desejado para a tabuada: ");
        int N = entrada.nextInt();

        for (int i = 1; i <= 10; i++){
            int tabu = N * i;
            System.out.printf("%d x %d = %d %n", N, i, tabu);
        }
        entrada.close();
    }
    
}
