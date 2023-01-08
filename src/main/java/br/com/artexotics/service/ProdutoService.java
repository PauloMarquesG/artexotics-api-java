package br.com.artexotics.service;

import br.com.artexotics.request.ProdutoRequest;
import br.com.artexotics.response.ProdutoResponse;

import java.util.List;

public interface ProdutoService {

    List<ProdutoResponse> getProdutos();

    List<ProdutoResponse> getProdutoById(Long id);

    List<ProdutoResponse> getProdutoByName(String nome);

    List<ProdutoResponse> insertProduto(ProdutoRequest produtoRequest);

    List<ProdutoResponse> updateProduto(ProdutoRequest produtoRequest);

    void deleteProduto(Long id);

}
