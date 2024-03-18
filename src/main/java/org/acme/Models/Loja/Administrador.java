package org.acme.Models.Loja;

import org.acme.Models.Loja.Interface.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {
    private int senha;
    @Override
    public double getBonificacao() {
        return 50;
    }
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
