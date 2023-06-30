package modelos;

import java.util.List;
import enums.StatusComanda;

public class Comanda {

	private int id;
	private Mesa mesa;
	private Cliente cliente;
	private List<Pedido> pedidos;
	private String codigo;
	private String observacoes;
	private StatusComanda statusComanda;

	public Comanda() {
		// TODO Auto-generated constructor stub
	}

	public Comanda(int id, Mesa mesa, Cliente cliente, List<Pedido> pedidos, String codigo,
			String observacoes, StatusComanda statusComanda) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.cliente = cliente;
		this.pedidos = pedidos;
		this.codigo = codigo;
		this.observacoes = observacoes;
		this.statusComanda = statusComanda;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
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

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
