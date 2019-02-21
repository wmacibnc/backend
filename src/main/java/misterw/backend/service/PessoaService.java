package misterw.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import misterw.backend.exception.PocException;
import misterw.backend.model.Pessoa;
import misterw.backend.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;
	
	@Transactional
	public Pessoa salvar(Pessoa pessoa) throws PocException {
		return repository.save(pessoa);
	}
	
	public Pessoa obter(Long numeroProjeto) throws PocException {
		return repository.findById(numeroProjeto).get();
	}

	public String excluir(Long numeroProjeto) throws PocException {
		repository.deleteById(numeroProjeto);
		return "Excluído com sucesso!";
	}
	
	public List<Pessoa> consultar() throws PocException {
		return (List<Pessoa>) repository.findAll();
	}

}