package br.com.artexotics.mapper;

import br.com.artexotics.model.Produto;
import br.com.artexotics.request.ProdutoRequest;
import br.com.artexotics.response.ProdutoResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    List<ProdutoResponse> toProdutoResponseList(List<Produto> produtoList);

    Produto toProduto(ProdutoRequest produtoRequest);

}
