package com.algaworks.algafood.domain.model;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.algaworks.algafood.core.validation.Groups;
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cozinha {

<<<<<<< HEAD
//	@NotNull(groups = Groups.CozinhaId.class)
=======
	@NotNull(groups = Groups.CozinhaId.class)
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
<<<<<<< HEAD
//	@NotBlank
	@Column(nullable = false)
	private String nome;
	
=======
	@NotBlank
	@Column(nullable = false)
	private String nome;
	
	@JsonIgnore
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
	@OneToMany(mappedBy = "cozinha")
	private List<Restaurante> restaurantes = new ArrayList<>();
	
}
