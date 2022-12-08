import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a distância percorrida: ");
        float km = sc.nextFloat();
        System.out.print("Informe a quantidade gasta de combustivel: ");
        float combu = sc.nextFloat();
        
        float consumo = (km/combu);
        
        System.out.format("Consumo medio é: %.3f litros de combustivel.\n", consumo);
        sc.close();
    }
    
}