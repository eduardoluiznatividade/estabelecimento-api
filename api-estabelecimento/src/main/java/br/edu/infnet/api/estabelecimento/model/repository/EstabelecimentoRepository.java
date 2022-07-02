package br.edu.infnet.api.estabelecimento.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.api.estabelecimento.model.domain.Estabelecimento;

@Repository
public interface EstabelecimentoRepository extends CrudRepository<Estabelecimento, Integer> {

}