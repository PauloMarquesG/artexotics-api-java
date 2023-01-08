package br.com.artexotics.service;

import br.com.artexotics.request.ImagemRequest;
import br.com.artexotics.response.ImagemResponse;

import java.util.List;

public interface ImagemService {

    List<ImagemResponse> getImagensById(Long idProduto);

    List<ImagemResponse> insertImagem(ImagemRequest imagemRequest);

    List<ImagemResponse> updateImagem(ImagemRequest imagemRequest);

    void deleteImagemById(Long id);

}
