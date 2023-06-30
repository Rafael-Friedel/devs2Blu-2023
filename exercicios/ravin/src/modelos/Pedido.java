package modelos;

import java.sql.Timestamp;
import enums.StatusPreparo;

public class Pedido {
	private int id;
	private Produto produto;
	private Timestamp dataHoraSolicitacao;
	private Timestamp dataHoraInicioPreparo;
	private Timestamp tempoPreparoRestante;
	private StatusPreparo statusPreparo;
	private String observacao;
	private int quantidade;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	public Pedido(int id, Produto produto, Timestamp dataHoraSolicitacao, Timestamp dataHoraInicioPreparo,
			Timestamp tempoPreparoRestante, StatusPreparo statusPreparo, String observacao, int quantidade) {
		super();
		this.setId(id);
		this.setProduto(produto);
		this.dataHoraSolicitacao = dataHoraSolicitacao;
		this.setDataHoraInicioPreparo(dataHoraInicioPreparo);
		this.setTempoPreparoRestante(tempoPreparoRestante);
		this.statusPreparo = statusPreparo;
		this.observacao = observacao;
		this.quantidade = quantidade;
	}

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

	public StatusPreparo getStatusPreparo() {
		return statusPreparo;
	}

	public void setStatusPreparo(StatusPreparo statusPreparo) {
		this.statusPreparo = statusPreparo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Timestamp getDataHoraInicioPreparo() {
		return dataHoraInicioPreparo;
	}

	public void setDataHoraInicioPreparo(Timestamp dataHoraInicioPreparo) {
		this.dataHoraInicioPreparo = dataHoraInicioPreparo;
	}

	public Timestamp getTempoPreparoRestante() {
		return tempoPreparoRestante;
	}

	public void setTempoPreparoRestante(Timestamp tempoPreparoRestante) {
		this.tempoPreparoRestante = tempoPreparoRestante;
	}
}
