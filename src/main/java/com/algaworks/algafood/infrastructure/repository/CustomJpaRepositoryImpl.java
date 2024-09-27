package com.algaworks.algafood.infrastructure.repository;

import java.util.Optional;

<<<<<<< HEAD
import jakarta.persistence.EntityManager;
=======
import javax.persistence.EntityManager;
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.algaworks.algafood.domain.repository.CustomJpaRepository;

public class CustomJpaRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID>
	implements CustomJpaRepository<T, ID> {

	private EntityManager manager;
	
	public CustomJpaRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, 
			EntityManager entityManager) {
		super(entityInformation, entityManager);
		
		this.manager = entityManager;
	}

	@Override
	public Optional<T> buscarPrimeiro() {
		var jpql = "from " + getDomainClass().getName();
		
		T entity = manager.createQuery(jpql, getDomainClass())
			.setMaxResults(1)
			.getSingleResult();
		
		return Optional.ofNullable(entity);
	}

<<<<<<< HEAD
	@Override
	public void detach(T entity) {
		manager.detach(entity);
	}

=======
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
}
