package modelos;

import java.sql.Timestamp;

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


	public StatusPreparo getStatusPreparo() {
		return statusPreparo;
	}

	public void setStatusPreparo(StatusPreparo statusPreparo) {
		this.statusPreparo = statusPreparo;
	}
}
