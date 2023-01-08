package br.com.artexotics.repository;

import br.com.artexotics.model.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem, Long> {

    @Query(value = "SELECT * FROM artexotics.imagem WHERE id_produto LIKE %:idProduto%", nativeQuery = true)
    List<Imagem> findAllByIdProduto(Long idProduto);
}
