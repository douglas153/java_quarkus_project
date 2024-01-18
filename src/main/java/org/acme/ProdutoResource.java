package org.acme;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.acme.Models.Loja.Produto;
import org.acme.Models.dto.ProdutoDto;

import java.math.BigDecimal;

@Path("produto")
public class ProdutoResource {
    @Inject
    EntityManager entityManager;
    
    @GET
    @Path("/getProdutos")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Listar todos os produtos",
            description = "Listar todos os produtos. ")
    public Response getProduto() {
        List<Produto> result = entityManager.createNamedQuery("Produtos.findAll", Produto.class).getResultList();
        return Response.ok(result).build();
    }


    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @Operation(summary = "Cadastrar Produto",
        description = "Cadastrar novo produto. ")
    public Response createProdutoDto(ProdutoDto produtoReq) {
        Produto celular = new Produto();
        celular.setNome(produtoReq.getNome());
        celular.setDescricao(produtoReq.getDescricao());
        celular.setPreco(produtoReq.getPreco());

        entityManager.persist(celular);
        return Response.ok(celular).status(201).build();
    }    
}
