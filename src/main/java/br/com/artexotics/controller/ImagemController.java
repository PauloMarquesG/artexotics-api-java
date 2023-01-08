package br.com.artexotics.controller;

import br.com.artexotics.data.ImagemData;
import br.com.artexotics.request.ImagemRequest;
import br.com.artexotics.service.ImagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImagemController {

    @Autowired
    private ImagemService service;

    @GetMapping(value = "/imagem/{id}", produces = {"application/json"})
    public ResponseEntity<ImagemData> getImagensByIdProduto(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(ImagemData.builder().data(this.service.getImagensById(id)).build());
    }

    @PostMapping(value = "/imagem/insert/", produces = {"application/json"})
    public ResponseEntity<ImagemData> insertImagem(@RequestBody ImagemRequest imagemRequest){
        return ResponseEntity.status(HttpStatus.OK).body(ImagemData.builder().data(this.service.insertImagem(imagemRequest)).build());
    }

    @PutMapping(value = "/imagem/update/", produces = {"application/json"})
    public ResponseEntity<ImagemData> updateImagem(@RequestBody ImagemRequest imagemRequest){
        return ResponseEntity.status(HttpStatus.OK).body(ImagemData.builder().data(this.service.updateImagem(imagemRequest)).build());
    }

    @DeleteMapping(value = "/imagem/delete/{id}", produces = {"application/json"})
    public ResponseEntity<Boolean> deleteImagemById(@PathVariable Long id){
        this.service.deleteImagemById(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

}
