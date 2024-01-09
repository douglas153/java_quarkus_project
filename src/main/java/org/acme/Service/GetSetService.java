package org.acme.Service;

import org.acme.Models.Conta;

public class GetSetService {
    public static void main(String[] args) {
        numeroConta();
    }

    public static void numeroConta() {
        Conta contaDoug = new Conta();
        contaDoug.setNumero(5333);
        System.out.println(contaDoug.getNumero());
    }
}
