package org.acme.Models.Loja;

public class Gerente  extends Funcionario {
    private int senha;

    //VALIDAR AUTENTICAÇÃO
    public double getBonificacao2(){
        return super.salario * 0.2; // 'super.salario' indica que o salario está na classe mae;
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
