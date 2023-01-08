package br.com.artexotics.controller;

import br.com.artexotics.data.CategoriaData;
import br.com.artexotics.request.CategoriaRequest;
import br.com.artexotics.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping(value = "/categorias", produces = {"application/json"})
    public ResponseEntity<CategoriaData> getCategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(CategoriaData.builder().data(this.service.getCategorias()).build());
    }

    @GetMapping(value = "/categoria/{id}", produces = {"application/json"})
    public ResponseEntity<CategoriaData> getCategoiraById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(CategoriaData.builder().data(this.service.getCategoriaById(id)).build());
    }

    @PostMapping(value = "/categoria/insert/", produces = {"application/json"})
    public ResponseEntity<CategoriaData> insertCategoria(@RequestBody CategoriaRequest categoriaRequest){
        return ResponseEntity.status(HttpStatus.OK).body(CategoriaData.builder().data(this.service.insertCategoria(categoriaRequest)).build());
    }

    @PutMapping(value = "/categoria/update/", produces = {"application/json"})
    public ResponseEntity<CategoriaData> updateCategoria(@RequestBody CategoriaRequest categoriaRequest){
        return ResponseEntity.status(HttpStatus.OK).body(CategoriaData.builder().data(this.service.updateCategoria(categoriaRequest)).build());
    }

    @DeleteMapping(value = "/categoria/delete/{id}", produces = {"application/json"})
    public ResponseEntity<Boolean> deleteCategoria(@PathVariable Long id){
        this.service.deleteCategoria(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

}
