package org.acme.Models.ContaHeranca;

import org.acme.Models.Conta;

public class ContaCorrente extends Conta {

    @Override //sobrescreve o metodo.
    public boolean sacar(double valor) {
        //regra diferente: quando a conta for corrente o saque ira tirar 1% a mais
        double valorSacadoCorrente = valor + (valor * 0.01);
        return super.sacar(valorSacadoCorrente);
    }
}
