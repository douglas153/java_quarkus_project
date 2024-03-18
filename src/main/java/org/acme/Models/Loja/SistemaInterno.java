package org.acme.Models.Loja;

import org.acme.Models.Loja.Interface.Autenticavel;

public class SistemaInterno {

    private int senha = 222;

    public boolean autenticar(Autenticavel fa) {
        boolean autenticou = fa.autenticar(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar" + fa);
            return true;
        } else {
            System.out.println("Erro ao se autenticar: " + fa);
            return false;
        }
    }
}
