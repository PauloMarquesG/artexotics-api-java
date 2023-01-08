package br.com.artexotics.service.impl;

import br.com.artexotics.mapper.ProdutoMapper;
import br.com.artexotics.model.Produto;
import br.com.artexotics.repository.ProdutoRepository;
import br.com.artexotics.request.ProdutoRequest;
import br.com.artexotics.response.ProdutoResponse;
import br.com.artexotics.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private ProdutoMapper mapper;

    public ProdutoServiceImpl() {
    }

    @Override
    public List<ProdutoResponse> getProdutos() {
        List<ProdutoResponse> listReturn = new ArrayList<>();

        List<Produto> produto = this.repository.findAll();
        listReturn = this.mapper.toProdutoResponseList(produto);

        return listReturn;
    }

    @Override
    public List<ProdutoResponse> getProdutoById(Long id) {
        List<ProdutoResponse> listReturn = new ArrayList<>();

        List<Produto> produto = this.repository.findAllById(Collections.singleton(id));
        listReturn = this.mapper.toProdutoResponseList(produto);

        return listReturn;
    }

    @Override
    public List<ProdutoResponse> getProdutoByName(String nome) {
        List<ProdutoResponse> listReturn = new ArrayList<>();

        List<Produto> produto = this.repository.findAllByName(nome);
        listReturn = this.mapper.toProdutoResponseList(produto);

        return listReturn;
    }

    @Override
    public List<ProdutoResponse> insertProduto(ProdutoRequest produtoRequest) {
        Produto produto = this.mapper.toProduto(produtoRequest);
        this.repository.save(produto);
        List<ProdutoResponse> listReturn = getProdutoById(produto.getIdProduct());
        return listReturn;
    }

    @Override
    public List<ProdutoResponse> updateProduto(ProdutoRequest produtoRequest) {
        Produto produto = this.mapper.toProduto(produtoRequest);
        this.repository.save(produto);
        List<ProdutoResponse> listReturn = getProdutoById(produto.getIdProduct());
        return listReturn;
    }

    @Override
    public void deleteProduto(Long id) {
        this.repository.deleteById(id);
    }

}
