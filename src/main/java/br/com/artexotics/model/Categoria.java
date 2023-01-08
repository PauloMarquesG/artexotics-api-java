package br.com.artexotics.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    @Column(name = "ID_CATEGORIA")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategory;

    @Column(name = "NOME_CATEGORIA")
    private String categoryName;

    @Column(name = "COD_CATEGORIA")
    private String codCategory;

}
