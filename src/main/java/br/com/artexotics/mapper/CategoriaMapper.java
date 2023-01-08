package br.com.artexotics.mapper;

import br.com.artexotics.model.Categoria;
import br.com.artexotics.request.CategoriaRequest;
import br.com.artexotics.response.CategoriaResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    List<CategoriaResponse> toCategoriaResponse(List<Categoria> categorias);

    Categoria toCategoria(CategoriaRequest categoriaRequest);

}
