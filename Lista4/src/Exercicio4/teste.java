package Exercicio4;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        ingresso ingresso = new ingresso();
        normal normal = new normal();
        Vip vip = new Vip();
        camaroteInferior camaroteinferior = new camaroteInferior();
        camaroteSuperior camarotesuperior = new camaroteSuperior();
       
        System.out.println(" Venda De Ingressos! ");
        System.out.println(" 1. Ingresso Normal ");
        System.out.println(" 2. Ingresso VIP ");
        System.out.print(" Opção: ");
        int opcao = entrada.nextInt();
        ingresso.imprimeValor();

        if (opcao == 1) {
            normal.ingressoNormal();    
        } else if (opcao == 2) {
            System.out.println(" >>> INGRESSOS VIP ");
            System.out.println(" 1. Camarote Inferior ");
            System.out.println(" 2. Camarote Superior ");
            System.out.print(" Opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Ingresso Vip- Camarote Inferior - R$" + vip.ingressoVip(100));
                camaroteinferior.imprimeLocalizacao("Térreo");    
            } else if (opcao == 2) {
                System.out.println("Ingresso Vip- Camarote Superior - R$" + camarotesuperior.valorCamaroteSuperior());
            }
        }
        entrada.close();
    }
}