package br.com.artexotics.service.impl;

import br.com.artexotics.mapper.ContaMapper;
import br.com.artexotics.model.Conta;
import br.com.artexotics.repository.ContaRepository;
import br.com.artexotics.request.ContaRequest;
import br.com.artexotics.response.ContaResponse;
import br.com.artexotics.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ContaRepository repository;

    @Autowired
    private ContaMapper mapper;

    private List<ContaResponse> getContaById(Long id) {
        List<ContaResponse> listReturn = new ArrayList<>();

        List<Conta> conta = this.repository.findAllById(Collections.singleton(id));
        listReturn = this.mapper.toContaResponseList(conta);

        return listReturn;
    }

    @Override
    public List<ContaResponse> getContas() {
        List<ContaResponse> listReturn = new ArrayList<>();

        List<Conta> conta = this.repository.findAll();
        listReturn = this.mapper.toContaResponseList(conta);

        return listReturn;
    }

    @Override
    public List<ContaResponse> getContaByName(String nome) {
        List<ContaResponse> listReturn = new ArrayList<>();

        List<Conta> conta = this.repository.findAllByName(nome);
        listReturn = this.mapper.toContaResponseList(conta);

        return listReturn;
    }

    @Override
    public List<ContaResponse> insertConta(ContaRequest contaRequest) {
        Conta conta = this.mapper.toConta(contaRequest);
        this.repository.save(conta);
        List<ContaResponse> listReturn = getContaById(conta.getIdUser());
        return listReturn;
    }

    @Override
    public List<ContaResponse> updateConta(ContaRequest contaRequest) {
        Conta conta = this.mapper.toConta(contaRequest);
        this.repository.save(conta);
        List<ContaResponse> listReturn = getContaById(conta.getIdUser());
        return listReturn;
    }

    @Override
    public void deleteConta(Long id) {
        this.repository.deleteById(id);
    }

}
