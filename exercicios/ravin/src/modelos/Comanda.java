package modelos;
import java.util.List;

import enums.StatusComanda;

public class Comanda {
  private Mesa mesa;
  private Cliente cliente;
  private List<Produto> produtos;
  private StatusComanda statusComanda;
  private Integer codigo;
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
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Float getValorTotalComanda() {
		return valorTotalComanda;
	}
	public void setValorTotalComanda(Float valorTotalComanda) {
		this.valorTotalComanda = valorTotalComanda;
	}
}
