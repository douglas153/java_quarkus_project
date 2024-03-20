package org.acme.Models.Loja;

import org.acme.Models.Loja.Interface.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {
    private int senha;
    private AutenticacaoUtil autenticador;
    public Administrador(){
      this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public double getBonificacao() {
        return 50;
    }
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }
}
