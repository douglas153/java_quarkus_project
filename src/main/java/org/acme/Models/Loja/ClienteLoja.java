package org.acme.Models.Loja;

import org.acme.Models.Loja.Interface.Autenticavel;

public class ClienteLoja implements Autenticavel {
    private int senha;
    private AutenticacaoUtil autenticador;

    public ClienteLoja(){
        this.autenticador = new AutenticacaoUtil();
    }
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autenticar(int senha) {
       return this.autenticador.autenticar(senha);
    }


}
