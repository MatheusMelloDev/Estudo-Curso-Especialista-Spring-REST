package com.algaworks.algafood.domain.model;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

public enum StatusPedido {

	CRIADO("Criado"),
	CONFIRMADO("Confirmado", CRIADO),
	ENTREGUE("Entregue", CONFIRMADO),
	CANCELADO("Cancelado", CRIADO);
	
	private String descricao;
	private List<StatusPedido> statusAnteriores;
	
	StatusPedido(String descricao, StatusPedido... statusAnteriores) {
		this.descricao = descricao;
		this.statusAnteriores = Arrays.asList(statusAnteriores);
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public boolean naoPodeAlterarPara(StatusPedido novoStatus) {
		return !novoStatus.statusAnteriores.contains(this);
	}
	
	public boolean podeAlterarPara(StatusPedido novoStatus) {
		return !naoPodeAlterarPara(novoStatus);
	}
	
=======
public enum StatusPedido {

	CRIADO,
	CONFIRMADO,
	ENTREGUE,
	CANCELADO
>>>>>>> a1905c0c77da4ea241fee2cea01d0cab7cfadcc6
}