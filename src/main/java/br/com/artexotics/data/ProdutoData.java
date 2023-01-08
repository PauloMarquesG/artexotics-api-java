package br.com.artexotics.data;

import br.com.artexotics.response.ProdutoResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ProdutoData {

    List<ProdutoResponse> data;

}
