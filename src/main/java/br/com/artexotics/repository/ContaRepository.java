package br.com.artexotics.repository;

import br.com.artexotics.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    @Query(value = "SELECT * FROM artexotics.usuario WHERE nome_usuario LIKE %:nome%", nativeQuery = true)
    List<Conta> findAllByName(String nome);
}
