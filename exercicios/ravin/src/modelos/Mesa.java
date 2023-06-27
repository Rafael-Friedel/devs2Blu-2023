package modelos;

import enums.Status;
import enums.StatusMesa;

public class Mesa {
	private Funcionario funcionario;
	private String nome;
    private String codigo;
	private Integer numero;
    private Status status;
	private StatusMesa statusMesa;
	private Integer quantidadeMaxPessoas;
	  
	  
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public StatusMesa getStatusMesa() {
		return statusMesa;
	}
	public void setStatusMesa(StatusMesa statusMesa) {
		this.statusMesa = statusMesa;
	}
	public Integer getQuantidadeMaxPessoas() {
		return quantidadeMaxPessoas;
	}
	public void setQuantidadeMaxPessoas(Integer quantidadeMaxPessoas) {
		this.quantidadeMaxPessoas = quantidadeMaxPessoas;
	}

}
