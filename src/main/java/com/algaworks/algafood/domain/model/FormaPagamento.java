package com.algaworks.algafood.domain.model;

<<<<<<< HEAD
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class FormaPagamento {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String descricao;
	
<<<<<<< HEAD
	@UpdateTimestamp
	private OffsetDateTime dataAtualizacao;
	
=======
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
}