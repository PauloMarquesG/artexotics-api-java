package br.com.artexotics.controller;

import br.com.artexotics.data.ProdutoData;
import br.com.artexotics.request.ProdutoRequest;
import br.com.artexotics.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping(value = "/produtos", produces = {"application/json"})
    public ResponseEntity<ProdutoData> getProdutos(){
        return ResponseEntity.status(HttpStatus.OK).body(ProdutoData.builder().data(this.service.getProdutos()).build());
    }

    @GetMapping(value = "/produto/{id}", produces = {"application/json"})
    public ResponseEntity<ProdutoData> getProdutoById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(ProdutoData.builder().data(this.service.getProdutoById(id)).build());
    }

    @GetMapping(value = "/produtos/{nome}", produces = {"application/json"})
    public ResponseEntity<ProdutoData> getProdutoByName(@PathVariable String nome){
        return ResponseEntity.status(HttpStatus.OK).body(ProdutoData.builder().data(this.service.getProdutoByName(nome)).build());
    }

    @PostMapping(value = "/produto/insert/", produces = {"application/json"})
    public ResponseEntity<ProdutoData> insertProduto(@RequestBody ProdutoRequest produtoRequest){
        return ResponseEntity.status(HttpStatus.OK).body(ProdutoData.builder().data(this.service.insertProduto(produtoRequest)).build());
    }

    @PutMapping(value = "/produto/update/", produces = {"application/json"})
    public ResponseEntity<ProdutoData> updateProduto(@RequestBody ProdutoRequest produtoRequest){
        return ResponseEntity.status(HttpStatus.OK).body(ProdutoData.builder().data(this.service.updateProduto(produtoRequest)).build());
    }


    @DeleteMapping(value = "/produto/delete/{id}", produces = {"application/json"})
    public ResponseEntity<Boolean> deleteProduto(@PathVariable Long id){
        this.service.deleteProduto(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

}
