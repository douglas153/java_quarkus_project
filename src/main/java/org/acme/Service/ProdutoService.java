package org.acme.Service;

import io.quarkus.hibernate.orm.PersistenceUnit;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;
import org.acme.Models.Loja.Produto;

import java.math.BigDecimal;

public class ProdutoService {
    @Inject
    @PersistenceUnit("loja")
    static EntityManager em;

    public static void main(String[] args) {
        hello();
    }
    @Transactional
    public static void createProduct() {
        Produto celular = new Produto();
        celular.setNome("Xiomi Redmi");
        celular.setDescricao("Eficiente");
        celular.setPreco(new BigDecimal("800"));
        em.persist(celular);
    }
    public static void hello() {
        System.out.println("Hello hibernate");
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
