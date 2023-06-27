package modelos;

import enums.Status;
import enums.StatusPreparo;

public class Produto {
  private String nome;
  private String descricao;
  private Integer codigo;
  private Float precoCusto;
  private Float precoVenda;
  private StatusPreparo statusPreparo;
  private String tempoPreparo;
  private String observacoes;
  private Status status;
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Integer getCodigo() {
	return codigo;
}
public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}
public Float getPrecoCusto() {
	return precoCusto;
}
public void setPrecoCusto(Float precoCusto) {
	this.precoCusto = precoCusto;
}
public Float getPrecoVenda() {
	return precoVenda;
}
public void setPrecoVenda(Float precoVenda) {
	this.precoVenda = precoVenda;
}
public StatusPreparo getStatusPreparo() {
	return statusPreparo;
}
public void setStatusPreparo(StatusPreparo statusPreparo) {
	this.statusPreparo = statusPreparo;
}
public String getTempoPreparo() {
	return tempoPreparo;
}
public void setTempoPreparo(String tempoPreparo) {
	this.tempoPreparo = tempoPreparo;
}
public String getObservacoes() {
	return observacoes;
}
public void setObservacoes(String observacoes) {
	this.observacoes = observacoes;
}
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
	this.status = status;
} 
}
