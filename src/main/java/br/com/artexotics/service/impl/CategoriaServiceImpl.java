package br.com.artexotics.service.impl;

import br.com.artexotics.mapper.CategoriaMapper;
import br.com.artexotics.model.Categoria;
import br.com.artexotics.repository.CategoriaRepository;
import br.com.artexotics.request.CategoriaRequest;
import br.com.artexotics.response.CategoriaResponse;
import br.com.artexotics.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository respository;

    @Autowired
    private CategoriaMapper mapper;

    @Override
    public List<CategoriaResponse> getCategorias() {
        List<CategoriaResponse> listReturn = new ArrayList<>();
        List<Categoria> categorias = this.respository.findAll();
        listReturn = this.mapper.toCategoriaResponse(categorias);
        return listReturn;
    }

    @Override
    public List<CategoriaResponse> getCategoriaById(Long id) {
        List<CategoriaResponse> listReturn = new ArrayList<>();
        List<Categoria> categorias = this.respository.findAllById(Collections.singleton(id));
        listReturn = this.mapper.toCategoriaResponse(categorias);
        return listReturn;
    }

    @Override
    public List<CategoriaResponse> insertCategoria(CategoriaRequest categoriaRequest) {
        Categoria categoria = this.mapper.toCategoria(categoriaRequest);
        this.respository.save(categoria);
        List<CategoriaResponse> listReturn = getCategoriaById(categoria.getIdCategory());
        return listReturn;
    }

    @Override
    public List<CategoriaResponse> updateCategoria(CategoriaRequest categoriaRequest) {
        Categoria categoria = this.mapper.toCategoria(categoriaRequest);
        this.respository.save(categoria);
        List<CategoriaResponse> listReturn = getCategoriaById(categoria.getIdCategory());
        return listReturn;
    }

    @Override
    public void deleteCategoria(Long id) {
        this.respository.deleteById(id);
    }


}
