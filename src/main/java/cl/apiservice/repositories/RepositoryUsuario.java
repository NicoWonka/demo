package cl.apiservice.repositories;

import java.math.BigDecimal;
import java.util.List;

import cl.apiservice.entities.Usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, BigDecimal>{
	
	List<Usuario> findAll();
	Page<Usuario> findAll(Pageable pageable);
}
