package org.acme.Models.Loja;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String cpf;
//    protected double salario; publico para classes filhas
    private double salario;
    private int tipo = 0;

    //COMPORTAMERNTOS: buscar bonificação;
    public double getBonificacao(){
        //validar tipo de funcionario para bonificação;
            return this.salario * 0.1;
    }


    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}


