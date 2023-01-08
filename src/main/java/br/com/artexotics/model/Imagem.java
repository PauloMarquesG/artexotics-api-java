package br.com.artexotics.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "IMAGEM")
public class Imagem {

    @Id
    @Column(name = "ID_ARQUIVO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idArchive;

    @Column(name = "ID_PRODUTO")
    private Long idProduct;

    @Column(name = "NOME_ARQUIVO")
    private String archiveName;
}
