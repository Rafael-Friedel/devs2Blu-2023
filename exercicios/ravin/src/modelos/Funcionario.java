package modelos;

import java.util.Date;

import enums.Disponibilidade;
import enums.Escolaridade;
import enums.EstadoCivil;
import enums.Status;
import enums.Cargo;

public class Funcionario extends Pessoa {
	private String rg;
	private EstadoCivil estadoCivil;
	private Escolaridade escolaridade;
	private Cargo cargo;
	private String numeroCarteiraTrabalho;
	private Date dataAdmissão;
	private Date dataDemissão;
	private Disponibilidade disponibilidade;
	
	public Funcionario(int id, String nome, String endereco, String telefone, String cpf, Date dataNascimento,
			String observacao, Status ativo) {
		super(id, nome, endereco, telefone, cpf, dataNascimento, observacao, ativo);
		// TODO Auto-generated constructor stub
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getNumeroCarteiraTrabalho() {
		return numeroCarteiraTrabalho;
	}

	public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
		this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
	}

	public Date getDataAdmissão() {
		return dataAdmissão;
	}

	public void setDataAdmissão(Date dataAdmissão) {
		this.dataAdmissão = dataAdmissão;
	}

	public Date getDataDemissão() {
		return dataDemissão;
	}

	public void setDataDemissão(Date dataDemissão) {
		this.dataDemissão = dataDemissão;
	}

	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}
