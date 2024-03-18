package org.acme.Models.Loja;

import org.acme.Models.Loja.Interface.Autenticavel;
//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente  extends Funcionario implements Autenticavel {
    private int senha;
    //Bonificação
    public double getBonificacao() {
        double result = super.getBonificacao() + super.getSalario();
        return result;
    }
    //Implementação
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(int senha) {
        if(this.senha == senha){
            System.out.println("aut" + senha + this.senha);
            return true;
        }else{
            System.out.println("aut" + senha + this.senha);
            return false;
        }
    }
}
