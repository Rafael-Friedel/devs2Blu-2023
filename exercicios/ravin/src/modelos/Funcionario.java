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
	private int pis;
	private Date dataAdmissao;
	private Date dataDemissao;
	private Disponibilidade disponibilidade;

	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String rg, EstadoCivil estadoCivil, Escolaridade escolaridade, Cargo cargo, Date dataAdmissao,
			Date dataDemissao, Disponibilidade disponibilidade, int pis) {
		super();
		this.rg = rg;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.disponibilidade = disponibilidade;
		this.pis = pis;
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

	public Disponibilidade getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public int getPis() {
		return pis;
	}

	public void setPis(int pis) {
		this.pis = pis;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	
	@Override
	public String toString() {
		return "Funcionario [rg=" + rg + ", estadoCivil=" + estadoCivil + ", escolaridade=" + escolaridade + ", cargo="
				+ cargo + ", pis=" + pis + ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao
				+ ", disponibilidade=" + disponibilidade + "]";
	}
}
