import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a base do retângulo: ");
        float base = sc.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        float altura = sc.nextFloat();
        
        float area = (base * altura);
        float perimetro = (base + altura) * 2;
        float a = (float) Math.pow(base, 2);
        float b = (float) Math.pow(altura, 2);
        float diagonal = (float) Math.sqrt(a+b);
        
        System.out.format("A área do retângulo é: %.2f\n", area);
        System.out.format("O perimetro do retângulo é: %.2f\n", perimetro);
        System.out.format("A diagonal do retângulo vale: %.2f\n", diagonal);
        sc.close();
    }
    
}


