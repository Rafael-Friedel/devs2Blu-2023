package modelos;

import java.util.Date;

import enums.Status;

public class Cliente extends Pessoa {

	public Cliente(int id, String nome, String endereco, String telefone, String cpf, Date dataNascimento,
			String observacao, Status ativo) {
		super(id, nome, endereco, telefone, cpf, dataNascimento, observacao, ativo);
		// TODO Auto-generated constructor stub
	}

	private String endereço;
	private String observação;
	
	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getObservação() {
		return observação;
	}

	public void setObservação(String observação) {
		this.observação = observação;
	}
}
