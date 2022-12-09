import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        String classificacao;
        System.out.print("Digite a medida da glicose: ");
        double glicose = entrada.nextDouble();

        if (glicose <= 100) {
            classificacao = "Normal";  
        } else if (glicose > 140) {
            classificacao = "Diabetes";  
        } else {
            classificacao = "Elevado";  
        }
        System.out.println("Classificação da glicose: " + classificacao);
        entrada.close();
    }
    
}
