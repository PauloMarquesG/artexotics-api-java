package br.com.artexotics.data;

import br.com.artexotics.response.ContaResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ContaData {

    List<ContaResponse> data;

}
