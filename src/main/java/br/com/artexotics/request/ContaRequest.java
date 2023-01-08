package br.com.artexotics.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaRequest {

    private Long idUser;
    private String userName;
    private String userPassword;

}
