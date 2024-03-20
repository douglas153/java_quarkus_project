package org.acme.Models.ContaHeranca;

import org.acme.Models.Conta;
import org.acme.Models.ContaHeranca.Interface.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    @Override //sobrescreve o metodo.
    public boolean sacar(double valor) {
        //regra diferente: quando a conta for corrente o saque ira tirar 1% a mais
        double valorSacadoCorrente = valor + (valor * 0.01);
        return super.sacar(valorSacadoCorrente);
    }
    @Override
    public double getValorImposto(){
        return super.getSaldo() * 0.01;
    }
}
