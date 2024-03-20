package org.acme.Models.Loja;

import org.acme.Models.Loja.Interface.Autenticavel;
//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente  extends Funcionario implements Autenticavel {
    private int senha;

    private AutenticacaoUtil autenticador;
    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }
    //Bonificação
    public double getBonificacao() {
        double result = super.getBonificacao() + super.getSalario();
        return result;
    }
    //Implementação
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }
}
