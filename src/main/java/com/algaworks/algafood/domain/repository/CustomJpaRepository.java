package com.algaworks.algafood.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomJpaRepository<T, ID> extends JpaRepository<T, ID> {

	Optional<T> buscarPrimeiro();
	
<<<<<<< HEAD
	void detach(T entity);
	
=======
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
}
