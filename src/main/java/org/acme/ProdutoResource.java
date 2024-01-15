package org.acme;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.acme.Models.Loja.Produto;

import java.math.BigDecimal;

@Path("produto")
public class ProdutoResource {
    @Inject
    EntityManager entityManager;

    @POST
    @Path("/create")
    @Transactional
    public Response createProduto() {
        Produto celular = new Produto();
        celular.setNome("Xiomi Redmi");
        celular.setDescricao("Eficiente");
        celular.setPreco(new BigDecimal("800"));

        entityManager.persist(celular);
        return Response.ok(celular).status(201).build();
    }
}
