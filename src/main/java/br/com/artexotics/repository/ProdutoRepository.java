package br.com.artexotics.repository;

import br.com.artexotics.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(value = "SELECT * FROM artexotics.produtos WHERE nome_produto LIKE %:nome%", nativeQuery = true)
    List<Produto> findAllByName(String nome);
}
