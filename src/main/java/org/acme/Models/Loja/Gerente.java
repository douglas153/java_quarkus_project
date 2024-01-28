package org.acme.Models.Loja;

public class Gerente  extends Funcionario {
    private int senha;

    //VALIDAR AUTENTICAÇÃO
    public double getBonificacao2(double salario) {
        return salario * 0.2;
    }
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
