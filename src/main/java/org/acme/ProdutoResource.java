package org.acme;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.Models.Loja.Categoria;
import org.acme.Models.Loja.Produto;
import org.acme.Models.dto.ProdutoDto;
import org.eclipse.microprofile.openapi.annotations.Operation;

import java.math.BigDecimal;
import java.util.List;

@Path("produto")
public class ProdutoResource {
    /*
    * TODO:
    *  Trazer lista de produtos aplicando filtros de nome, data e tipo de categoria;
    *  CRUD:
    *    - Create - ok; Read - ok; Update; Delete;
    * */
    @Inject
    EntityManager entityManager;
    
    @GET
    @Path("/getProdutos")
    @Produces({MediaType.APPLICATION_JSON})
    @Operation(summary = "Listar todos os produtos",
            description = "Listar todos os produtos. ")
    public Response getProduto() {
        List<Produto> result = entityManager.createNamedQuery("ProdutosLista.findAll", Produto.class).getResultList();
        return Response.ok(result).build();
    }
    @POST
    @Path("/getProdutsById")
    @Produces({MediaType.APPLICATION_JSON})
    @Operation(summary = "Listar produtos por id",
            description = "Listar produtos por id")
    public Response getProdutoById(Long id) {
        Produto result = entityManager.find(Produto.class, id);
        return Response.ok(result).build();
    }
    @POST
    @Path("/getProdutsByName")
    @Produces({MediaType.APPLICATION_JSON})
    @Operation(summary = "Listar produtos por nome",
            description = "Listar produtos por nome")
    public Response getProdutsByName(String nome) {
        List<Produto> result1 = entityManager.createNamedQuery("Produtos.filter", Produto.class)
                .setParameter("nome", nome)
                .getResultList();
        return Response.ok(result1).build();
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
        Categoria categoria  = new Categoria();
        celular.setNome(produtoReq.getNome());
        celular.setDescricao(produtoReq.getDescricao());
        celular.setPreco(new BigDecimal(produtoReq.getPreco()));
        categoria.setNome(produtoReq.getCategoria());
        entityManager.persist(categoria);
        celular.setCategoria(categoria);

        entityManager.persist(celular);
        return Response.ok(celular).status(201).build();
    }    
}
