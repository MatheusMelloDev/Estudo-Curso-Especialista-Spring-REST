package com.algaworks.algafood.api.exceptionhandler;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@Builder
@Getter
@Schema(name = "Problema")
public class Problem {

	@Schema(example = "400")
	private Integer status;

	@Schema(example = "https://algafood.com.br/dados-invalidos")
	private String type;

	@Schema(example = "Dados inválidos")
	private String title;

	@Schema(example = "Um ou mais campos estão inválidos. Faça o preenchimento correto e tente novamente.")
	private String detail;

	@Schema(example = "Um ou mais campos estão inválidos. Faça o preenchimento correto e tente novamente.")
	private String userMessage;

	@Schema(example = "2022-07-15T11:21:50.902245498Z")
	private OffsetDateTime timestamp;

	@Schema(description = "Lista de objetos ou campos que geraram o erro")
	private List<Object> objects;

	@Builder
	@Getter
	@Schema(name = "ObjetoProblema")
	public static class Object {

		@Schema(example = "preco")
		private String name;

		@Schema(example = "O preço é inválido")
		private String userMessage;

	}

=======
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Getter;

@JsonInclude(Include.NON_NULL)
@Getter
@Builder
public class Problem {

	private Integer status;
	private LocalDateTime timestamp;
	private String type;
	private String title;
	private String detail;
	private String userMessage;
	private List<Object> objects;
	
	@Getter
	@Builder
	public static class Object {
		
		private String name;
		private String userMessage;
		
	}
	
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
}
