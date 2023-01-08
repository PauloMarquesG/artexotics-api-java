package br.com.artexotics.controller;

import br.com.artexotics.data.ContaData;
import br.com.artexotics.request.ContaRequest;
import br.com.artexotics.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContaController {

    @Autowired
    private ContaService service;

    @GetMapping(value = "/contas", produces = {"application/json"})
    public ResponseEntity<ContaData> getContas(){
        return ResponseEntity.status(HttpStatus.OK).body(ContaData.builder().data(this.service.getContas()).build());
    }

    @GetMapping(value = "/contas/{nome}", produces = {"application/json"})
    public ResponseEntity<ContaData> getContaByName(@PathVariable String nome){
        return ResponseEntity.status(HttpStatus.OK).body(ContaData.builder().data(this.service.getContaByName(nome)).build());
    }

    @PostMapping(value = "/conta/insert/", produces = {"application/json"})
    public ResponseEntity<ContaData> insertConta(@RequestBody ContaRequest contaRequest){
        return ResponseEntity.status(HttpStatus.OK).body(ContaData.builder().data(this.service.insertConta(contaRequest)).build());
    }

    @PutMapping(value = "/conta/update/", produces = {"application/json"})
    public ResponseEntity<ContaData> updateConta(@RequestBody ContaRequest contaRequest){
        return ResponseEntity.status(HttpStatus.OK).body(ContaData.builder().data(this.service.updateConta(contaRequest)).build());
    }

    @DeleteMapping(value = "/conta/delete/{id}", produces = {"application/json"})
    public ResponseEntity<Boolean> deleteConta(@PathVariable Long id){
        this.service.deleteConta(id);
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

}
