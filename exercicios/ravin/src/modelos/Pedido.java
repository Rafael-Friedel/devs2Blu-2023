package modelos;

import java.security.Timestamp;

import javax.swing.JOptionPane;

import enums.StatusComanda;
import enums.StatusMesa;
import enums.StatusPreparo;


public class Pedido {
	private Timestamp dataHoraSolicitacao;
	private String observacao;
	private Integer quantidade;
	private StatusPreparo statusPreparo;
	
	
	
	
	public Timestamp getDataHoraSolicitacao() {
		return dataHoraSolicitacao;
	}

	public void setDataHoraSolicitacao(Timestamp dataHoraSolicitacao) {
		this.dataHoraSolicitacao = dataHoraSolicitacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public static Pedido cadastrarPedido() {
		Pedido pedido = new Pedido();
		pedido.setDataHoraSolicitacao(new Timestamp(new Date().getTime()));
		pedido.setObservacao(JOptionPane.showInputDialog("Observações:"));
		pedido.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:")));
		pedido.setStatusPreparo(StatusPreparo.PREPARANDO);
		return pedido;
	}
	
	public static Mesa cadastrarMesa() {
		Mesa mesa= new Mesa();
		mesa.setCodigo(JOptionPane.showInputDialog("Digite o código da mesa:"));
		mesa.setNome(JOptionPane.showInputDialog("Digite o nome da mesa:"));
		mesa.setStatusMesa(StatusMesa.Livre);
		return mesa;
		
	}
	
	public static Comanda cadastrarComanda() {
		Comanda comanda = new Comanda();
		comanda.setCodigo(JOptionPane.showInputDialog("Digite o código da comanda:"));
		comanda.setObservacoes(JOptionPane.showInputDialog("Digite as observaçõs sobre a comanda:"));
		comanda.setStatusComanda(StatusComanda.ABERTA);
		return comanda;
	}

	public StatusPreparo getStatusPreparo() {
		return statusPreparo;
	}

	public void setStatusPreparo(StatusPreparo statusPreparo) {
		this.statusPreparo = statusPreparo;
	}
}
