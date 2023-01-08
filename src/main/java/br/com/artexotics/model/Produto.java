package br.com.artexotics.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="PRODUTOS")
public class Produto {

    @Id
    @Column(name = "ID_PRODUTO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;

    @Column(name = "ID_CATEGORIA")
    private Long idCategory;

    @Column(name = "NOME_PRODUTO")
    private String productName;

    @Column(name = "PRECO_PRODUTO")
    private BigDecimal productPrice;

    @Column(name = "DESCRICAO_PRODUTO")
    private String productDescretion;

}
