package org.acme.Models.Loja;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "test") //Usado quando o nome da classe é diferente da tabela no banco.
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // dizer como o valor é gerado;
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
