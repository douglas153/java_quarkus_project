package org.acme.Models.Loja;

public class Gerente  extends Funcionario {
    private int senha;

    public Gerente(int senha) {
        this.senha = senha;
    }

    //VALIDAR AUTENTICAÇÃO
    public boolean autenticar(int senha){
        if(this.senha == senha){
            System.out.println("aut" + senha + this.senha);
            return true;
        }else{
            System.out.println("aut" + senha + this.senha);
            return false;
        }
    }
    //GETTERS AND SETTERS
    public int getSenha() {
        return senha;
    }

    public void setSenha(int nome) {
        this.senha = nome;
    }

}
