package br.com.facildespensa.apirest.repository;

import br.com.facildespensa.apirest.model.Despensa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespensaRepository extends JpaRepository<Despensa, Long> {

}
