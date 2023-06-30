package repositories;

import java.util.ArrayList;
import java.util.List;

import modelos.Funcionario;

public class FuncionarioRepository {

	private List<Funcionario> funcionarios;

	public FuncionarioRepository() {
		funcionarios = new ArrayList<Funcionario>();
	}

	public void salvar(Funcionario entidade) {
		Funcionario funcionario = buscarPorId(entidade.getId());
		
		if(funcionario == null) {
			funcionarios.add(entidade);
		} else {
			funcionario = entidade;
		}
		
	}

	public List<Funcionario> listarTodos() {
		return funcionarios;
	}

	public void excluir(Funcionario entidade) {
		funcionarios.remove(entidade);
	}

	public Funcionario buscarPorId(int id) {
		Funcionario funcionarioBuscado = null;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == id)
				funcionarioBuscado = funcionario;
				break;
		}

		return funcionarioBuscado;
	}

	public void deletarPeloId(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}

	public int contar() {
		return funcionarios.size();
	}
	
	public List<Funcionario> buscarPorNome(String nome) {
		List<Funcionario> funcionariosFiltrados = funcionarios.stream()
                .filter(funcionario -> funcionario.getNome().equals(nome))
                .toList();
		return funcionariosFiltrados;
	}

}