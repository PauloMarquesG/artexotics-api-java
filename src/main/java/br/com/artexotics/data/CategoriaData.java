package br.com.artexotics.data;

import br.com.artexotics.response.CategoriaResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CategoriaData {

    List<CategoriaResponse> data;

}
