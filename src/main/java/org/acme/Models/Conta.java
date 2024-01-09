package org.acme.Models;

//comportamentos: Saque, deposito, transferencia;
public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;

    private static int total;

    public Conta(){
        total++;
        System.out.println("O total de contas é: " + total);
    }

    public double extratoSaldo(){
        return this.saldo;
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor) {
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean transferir(double valor, Conta destino) {
        if(this.saldo >= valor){
            //retirar saldo
            this.saldo = this.saldo - valor;
            //adicionar na segunda conta
            destino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getTotal(){
        return Conta.total;
    }
}
