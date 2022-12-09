import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a, b, c, menor;

        System.out.println("Menor de 3 numeros");

        System.out.print("Primeiro valor: ");
        a = entrada.nextInt();
        System.out.print("Segundo valor: ");
        b = entrada.nextInt();
        System.out.print("Terceiro valor: ");
        c = entrada.nextInt();

        menor = a;

        if (b < a && b < c || b == menor) {
            menor = b;            
        }
        if (c < a && c < b || c == menor) {
            menor = c;            
        }   
        System.out.println("O menor numero é: " + menor);
        entrada.close();    
    }
    
}