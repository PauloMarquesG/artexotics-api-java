package br.com.artexotics.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoResponse {

    private Long idProduct;
    private Long idCategory;
    private String productName;
    private BigDecimal productPrice;
    private String productDescretion;

}
