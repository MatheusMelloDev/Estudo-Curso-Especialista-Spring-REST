package com.algaworks.algafood.domain.model;

<<<<<<< HEAD
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
=======
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6

import lombok.Data;

@Data
@Embeddable
public class Endereco {

	@Column(name = "endereco_cep")
	private String cep;
	
	@Column(name = "endereco_logradouro")
	private String logradouro;
	
	@Column(name = "endereco_numero")
	private String numero;
	
	@Column(name = "endereco_complemento")
	private String complemento;
	
	@Column(name = "endereco_bairro")
	private String bairro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "endereco_cidade_id")
	private Cidade cidade;
	
}
