package misterw.backend.repository;

import org.springframework.data.repository.CrudRepository;

import misterw.backend.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}
