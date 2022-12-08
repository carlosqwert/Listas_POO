import java.util.Scanner;

public class Ex07 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionario: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o valor pago por hora: ");
        float valorHrs = sc.nextFloat();
        
        System.out.print("Digite quantas horas o funcionario trabalhou: ");
        float horaTrab = sc.nextFloat();
        
        float pagamento = (valorHrs * horaTrab);
        
        System.out.format("%s vai receber %.2f\n", nome, pagamento);
        sc.close();
    }
    
}