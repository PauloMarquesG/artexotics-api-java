package br.com.artexotics.mapper;

import br.com.artexotics.model.Conta;
import br.com.artexotics.request.ContaRequest;
import br.com.artexotics.response.ContaResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContaMapper {

    List<ContaResponse> toContaResponseList(List<Conta> conta);

    Conta toConta(ContaRequest contaRequest);

}
