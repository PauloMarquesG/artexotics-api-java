package br.com.artexotics.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImagemRequest {

    private Long idArchive;
    private Long idProduct;
    private String archiveName;

}
