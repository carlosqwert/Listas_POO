package Exercicio1;

import java.util.Scanner;

public class conta {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dados do Cliente");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Endereço: ");
        String endereco = entrada.nextLine();
        System.out.print("CPF: ");
        String cpf = entrada.nextLine();
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        System.out.println();

        Cliente cliente = new Cliente(nome, endereco, cpf, idade);

        System.out.println("CPF possui 11 digitos: " + cliente.validaCPF());
        System.out.println(cliente.toString());        

        entrada.close();
    }
}
