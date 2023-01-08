package br.com.artexotics.service;

import br.com.artexotics.request.CategoriaRequest;
import br.com.artexotics.response.CategoriaResponse;

import java.util.List;

public interface CategoriaService {

    List<CategoriaResponse> getCategorias();

    List<CategoriaResponse> getCategoriaById(Long id);

    List<CategoriaResponse> insertCategoria(CategoriaRequest categoriaRequest);

    List<CategoriaResponse> updateCategoria(CategoriaRequest categoriaRequest);

    void deleteCategoria(Long id);

}
