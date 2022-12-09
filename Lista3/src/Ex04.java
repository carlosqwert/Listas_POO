import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a, b;
        int i = 1;

        while (i != 0) {
            
            System.out.println("Digite os valores das coordenadas A e B:");
            a = entrada.nextDouble();
            b = entrada.nextDouble();

            if (a > 0 && b > 0) {
                System.out.println("Quadrante Q1");
                
            } else if (a < 0 && b > 0) {
                System.out.println("Quadrante Q2");
                
            } else if (a < 0 && b < 0) {
                System.out.println("Quadrante Q3");
            
            } else if (a > 0 && b < 0) {
                System.out.println("Quadrante Q4");
            
            }else if (a == 0 || b == 0){
                i = 0;
            }
        }
        entrada.close();        
    }
    
}
