package br.com.facildespensa.apirest.repository;

import br.com.facildespensa.apirest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findById(long id);

}
