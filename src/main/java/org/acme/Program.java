package org.acme;

import org.acme.Models.Loja.Funcionario;
import org.acme.Models.Loja.Gerente;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        criarGerente();
    }
        public static void criarFuncionario() {
        Funcionario nico = new Funcionario();
        nico.setNome("Nico Alura");
        nico.setCpf("05544856988");
        nico.setSalario(2890.20);
        double salarioFinal = nico.getSalario() + nico.getBonificacao();
            System.out.println("Bonificação do funcionario " + nico.getBonificacao() +"\n total com salario: "+salarioFinal );

    }

    public static void criarGerente() {
        ///////////////POLIMORFISMO
        System.out.println("///////////////bonificação gerente");
        Funcionario funci = new Funcionario();
        Gerente gerente = new Gerente();
        gerente.setNome("gerente Alura");
        gerente.setCpf("05544856988");
        gerente.setSalario(5890.20);
        gerente.setTipo(1);
        //senha
        gerente.setSenha(222);
        boolean autenticacao = gerente.autenticar(2);
        double salarioFinal = gerente.getSalario() + funci.getBonificacao();
        System.out.println("Gerente está autenticado? " + autenticacao);
        System.out.println("Bonificação do funcionario " + gerente.getBonificacao2() +"\n total com salario: "+ salarioFinal );

    }
    public static void exemploLoop() {
        Scanner input = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for(int i = 0; i < 3; i++){
            System.out.println("Diga sua avaliação para o filme: ");
            nota = input.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média das avaliações: " + mediaAvaliacao / 3);
    }

    public static void ExemploScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}
