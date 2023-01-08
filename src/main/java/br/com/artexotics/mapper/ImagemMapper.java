package br.com.artexotics.mapper;

import br.com.artexotics.model.Imagem;
import br.com.artexotics.request.ImagemRequest;
import br.com.artexotics.response.ImagemResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImagemMapper {

    List<ImagemResponse> toImagemResponseList(List<Imagem> imagem);

    Imagem toImagem(ImagemRequest imagemRequest);

}
