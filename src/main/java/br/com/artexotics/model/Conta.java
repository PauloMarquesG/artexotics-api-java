package br.com.artexotics.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USUARIO")
public class Conta {

    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;

    @Column(name = "NOME_USUARIO")
    private String userName;

    @Column(name = "SENHA_USUARIO")
    private String userPassword;

}
