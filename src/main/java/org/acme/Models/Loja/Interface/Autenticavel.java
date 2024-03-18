package org.acme.Models.Loja.Interface;

//definir um contrato, implementa a senha e autenticação
public abstract interface Autenticavel {
    public abstract void setSenha(int senha);
    public abstract boolean autenticar(int senha);
}
