package org.acme.Models.Loja;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "produto") //Usado quando o nome da classe é diferente da tabela no banco.
//@NamedQuery(name = "Produtos.findAll", query = "from Produto")
@NamedQueries({
        @NamedQuery(name = "Produtos.findAll", query = "from Produto"), //HQL
        @NamedQuery(name = "ProdutosLista.findAll", query = "SELECT p from Produto p"),  //JPQL
        @NamedQuery(name = "Produtos.filter",
                query = "SELECT p from Produto p WHERE p.nome = :nome")  //JPQL
})
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // dizer como o valor é gerado;
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;


    private LocalDate dataCadastro = LocalDate.now();
    @ManyToOne
    private Categoria categoria;

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
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
