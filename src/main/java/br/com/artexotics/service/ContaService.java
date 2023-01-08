package br.com.artexotics.service;

import br.com.artexotics.request.ContaRequest;
import br.com.artexotics.response.ContaResponse;

import java.util.List;

public interface ContaService {

    List<ContaResponse> getContas();

    List<ContaResponse> getContaByName(String nome);
    
    List<ContaResponse> insertConta(ContaRequest contaRequest);

    List<ContaResponse> updateConta(ContaRequest contaRequest);

    void deleteConta(Long id);

}
