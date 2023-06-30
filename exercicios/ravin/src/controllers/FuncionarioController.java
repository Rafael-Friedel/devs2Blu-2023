package controllers;

import java.util.ArrayList;
import java.util.List;

import enums.Cargo;
import enums.Disponibilidade;
import modelos.Funcionario;
import myUtils.UtilData;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	private FuncionarioRepository repository;

	public FuncionarioController() {
		repository = new FuncionarioRepository();
	}

	public void cadastrar(Funcionario entidade) throws Exception {
		if (UtilData.getIdade(entidade.getDataNascimento()) < 18) {
			throw new Exception("Não pode salvar o funcionario, pois ele é menor de idade");
		}
		repository.salvar(entidade);
	}

	public void alterar(Funcionario entidade) {
		// REGRAS DE NEGÓCIO
		repository.salvar(entidade);
	}

	public void excluir(int id) {
		Funcionario funcionarioBuscado = repository.buscarPorId(id);

		if (funcionarioBuscado != null) {
			repository.excluir(funcionarioBuscado);
		}
	}

	public Funcionario consultar(int id) {
		return repository.buscarPorId(id);
	}

	public List<Funcionario> listarTodos() {
		return repository.listarTodos();
	}

	public List<Funcionario> listarGarconsDisponiveis() {
		List<Funcionario> funcionarios = repository.listarTodos();
		List<Funcionario> funcionarioDisponiveis = new ArrayList<>();

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getDisponibilidade().equals(Disponibilidade.DISPONIVEL)
					&& funcionario.getCargo().equals(Cargo.GARÇOM)) {
				funcionarioDisponiveis.add(funcionario);
			}
		}

		return funcionarioDisponiveis;
	}

}