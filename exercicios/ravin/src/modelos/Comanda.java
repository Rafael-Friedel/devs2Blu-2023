package modelos;

import java.util.List;

import enums.StatusComanda;

public class Comanda {
	private Mesa mesa;
	private Cliente cliente;
	private String observacoes;
	private List<Produto> produtos;
	private StatusComanda statusComanda;
	private String codigo;
	private Float valorTotalComanda;

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public StatusComanda getStatusComanda() {
		return statusComanda;
	}

	public void setStatusComanda(StatusComanda statusComanda) {
		this.statusComanda = statusComanda;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Float getValorTotalComanda() {
		return valorTotalComanda;
	}

	public void setValorTotalComanda(Float valorTotalComanda) {
		this.valorTotalComanda = valorTotalComanda;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
