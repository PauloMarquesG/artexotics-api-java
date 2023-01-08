package br.com.artexotics.service.impl;

import br.com.artexotics.mapper.ImagemMapper;
import br.com.artexotics.model.Imagem;
import br.com.artexotics.repository.ImagemRepository;
import br.com.artexotics.request.ImagemRequest;
import br.com.artexotics.response.ImagemResponse;
import br.com.artexotics.service.ImagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ImagemServiceImpl implements ImagemService {

    @Autowired
    private ImagemRepository repository;

    @Autowired
    private ImagemMapper mapper;

    @Override
    public List<ImagemResponse> getImagensById(Long id) {
        List<ImagemResponse> listReturn = new ArrayList<>();
        List<Imagem> imagem = this.repository.findAllById(Collections.singleton(id));
        listReturn = this.mapper.toImagemResponseList(imagem);
        return listReturn;
    }

    @Override
    public List<ImagemResponse> insertImagem(ImagemRequest imagemRequest) {
        Imagem imagem = this.mapper.toImagem(imagemRequest);
        this.repository.save(imagem);
        List<ImagemResponse> listReturn = getImagensById(imagem.getIdArchive());
        return listReturn;
    }

    @Override
    public List<ImagemResponse> updateImagem(ImagemRequest imagemRequest) {
        Imagem imagem = this.mapper.toImagem(imagemRequest);
        this.repository.save(imagem);
        List<ImagemResponse> listReturn = getImagensById(imagem.getIdArchive());
        return listReturn;
    }

    @Override
    public void deleteImagemById(Long id) {
        this.repository.deleteById(id);
    }

}
