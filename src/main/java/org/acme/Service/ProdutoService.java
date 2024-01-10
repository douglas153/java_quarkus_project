package org.acme.Service;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import org.acme.Models.Loja.Produto;

import java.math.BigDecimal;

public class ProdutoService {
    @Inject
    EntityManager em;
    public void main(String[] args) {
        createProduct();
    }
    @Transactional
    public void createProduct() {
        Produto celular = new Produto();
        celular.setNome("Xiomi Redmi");
        celular.setDescricao("Eficiente");
        celular.setPreco(new BigDecimal("800"));
        em.persist(celular);
    }
}
// CURSO
//public static void main(String[] args) {
//        Produto celular = new Produto();
//        celular.setNome("Xiomi Redmi");
//        celular.setDescricao("Eficiente");
//        celular.setPreco(new BigDecimal("800"));
//
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
//        EntityManager em = factory.createEntityManager();
//        em.persist(celular);
//    }
