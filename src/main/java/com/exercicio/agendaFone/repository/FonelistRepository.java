package com.exercicio.agendaFone.repository;

import com.exercicio.agendaFone.model.FonelistModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//anotação para indicar pra classe que éla é um repository. Ela extende a classe Jpa que tem os métodos
// a serem utilizados na conexão entre o bando e a classe service
@Repository
public interface FonelistRepository extends JpaRepository<FonelistModel, Long> {
}
