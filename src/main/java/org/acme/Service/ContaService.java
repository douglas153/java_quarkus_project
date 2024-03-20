package org.acme.Service;

import org.acme.Models.Cliente;
import org.acme.Models.Conta;
import org.acme.Models.ContaHeranca.ContaCorrente;
import org.acme.Models.ContaHeranca.ContaPoupanca;

import java.util.Scanner;

public class ContaService {

    public static void main(String[] args) {
        //depositarConta();
        //ExemploScanner();
        //contaMarcela();
        testaTipoConta();
    }

    public static void testaTipoConta() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(200);

        cc.getValorImposto();
        System.out.println(cc.getSaldo() + "saldo total");
        System.out.println(cc.getValorImposto() + " incide imposto de 1%");
        System.out.println(cp.getSaldo());
    }

    public static Conta contaMarcela() {
        Conta contaMarcela = new Conta();
        Cliente Marcela = new Cliente();

        Marcela.setNome("Marcela");
        Marcela.setCpf("04580818522");
        contaMarcela.setSaldo(2000);
        contaMarcela.setTitular(Marcela);
        return contaMarcela;
    }

    public static void tiposOperacao() {
        Conta marcelaConta = contaMarcela();

        System.out.println("Operações: ");
        System.out.println("1 - Consulta ");
        System.out.println("2 - Depositar ");
        System.out.println("3 - Transferir ");
        //System.out.println("4 - Consulta ");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a operação desejada: ");
        int operação = input.nextInt();
        if(operação == 1){
            marcelaConta.extratoSaldo();
            System.out.println("Seu saldo é de: " + marcelaConta.extratoSaldo());
        }else if(operação == 2){
            System.out.println("Digite o valor do deposito: ");
            double deposito = input.nextDouble();
            marcelaConta.depositar(deposito);
            System.out.println("Seu saldo é de: " + marcelaConta.extratoSaldo());
        }else if(operação == 3){
            System.out.println("Digite o valor da transferencia: ");
            Conta belchiorConta = contaMarcela();
            double transferencia = input.nextDouble();
            marcelaConta.transferir(transferencia, belchiorConta);
            System.out.println("Seu saldo é de: " + marcelaConta.extratoSaldo());
        }else{
            System.out.println("Escolha uma opção válida, operação encerrada ");
            return;
        }

    }

    public static void  depositarConta(){
        Conta conta = new Conta();
        Conta contaMarcela = new Conta();

        conta.depositar(50);
        contaMarcela.depositar(1000);
        System.out.println(conta.extratoSaldo());

        //sacar valor dessa mesma conta
        //sacarConta(conta, 20);
        //transferirValorConta(contaMarcela, 1100, conta);
        testaBanco();
        //testaSaldoNegativo();
    }
    //comportamentos: Saque, deposito, transferencia;
    public static void sacarConta(Conta conta, double valor) {
        boolean saqueRealizado = conta.sacar(valor);
        System.out.println(saqueRealizado + " " + conta.extratoSaldo());
    }
    public static void transferirValorConta(Conta contaMarcela, double valor, Conta contaDestino) {
        boolean transferenciaRealizada = contaMarcela.transferir(valor, contaDestino);
        System.out.println(transferenciaRealizada + " " + contaMarcela.extratoSaldo());
    }

    public static void testaBanco() {
        Cliente cliente = new Cliente();
        cliente.setNome("Douglas Sousa");
        cliente.setCpf("042.707.171-22");
        cliente.setProfissao("programador");

        Conta contaDouglas = new Conta();
        contaDouglas.setTitular(cliente);
        System.out.println(contaDouglas.getTitular().getNome());
    }
    public static void testaSaldoNegativo() {
        Conta conta = new Conta();
        conta.depositar(100);
        var saque = conta.sacar(100);

        System.out.println(saque);
        System.out.println(conta.extratoSaldo());
    }

}
