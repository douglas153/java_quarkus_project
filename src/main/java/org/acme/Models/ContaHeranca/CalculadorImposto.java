package org.acme.Models.ContaHeranca;

import org.acme.Models.ContaHeranca.Interface.Tributavel;

public class CalculadorImposto {
    //atributos
    private double totalImposto;
    //comportamentos
    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }

}
