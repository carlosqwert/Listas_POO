import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digitr o nome do primeiro elemento: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade do primeiro elemento: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do segundo elemento: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade do segundo elemento: ");
        int idade2 = sc.nextInt();

        float media = ((idade1 + idade2) / 2);

        System.out.format("Nome Pessoa 1: %s\n", nome1);
        System.out.format("Idade %d\n", idade1);
        System.out.format("Nome Pessoa 2: %s\n", nome2);
        System.out.format("Idade: %d\n", idade2);
        System.out.format("A idade media de %s e %s e de %.2f\n", nome1, nome2, media);
        sc.close();
    }
}
