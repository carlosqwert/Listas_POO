import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("São mútilplos");      
        } else {
            System.out.println("Não são mútilplos");   
        }
        sc.close();
    }
    
}