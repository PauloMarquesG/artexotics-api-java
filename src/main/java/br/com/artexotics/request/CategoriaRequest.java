package br.com.artexotics.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaRequest {

    private Long idCategory;
    private String categoryName;
    private String codCategory;

}
