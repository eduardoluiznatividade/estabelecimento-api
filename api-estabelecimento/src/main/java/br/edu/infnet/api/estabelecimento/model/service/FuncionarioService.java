package br.edu.infnet.api.estabelecimento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.api.estabelecimento.model.domain.Funcionario;
import br.edu.infnet.api.estabelecimento.model.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> obterLista(){
		return (List<Funcionario>) funcionarioRepository.findAll();
	}
	
	public void incluir(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
}