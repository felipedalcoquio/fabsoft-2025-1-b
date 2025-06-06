package br.univille.projfabsoftcashflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projfabsoftcashflow.entity.Simulacao;

@Repository
public interface SimulacaoRepository extends JpaRepository<Simulacao, Long> {

}
