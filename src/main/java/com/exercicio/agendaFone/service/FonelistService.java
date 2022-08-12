package com.exercicio.agendaFone.service;

import com.exercicio.agendaFone.model.FonelistModel;
import com.exercicio.agendaFone.repository.FonelistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FonelistService {

    // injetar a dependência do repository aqui por anotação.
    @Autowired
    private FonelistRepository repositor; //

    //métodos que implementam a lógica a ser utilizada na classe controller
    public List<FonelistModel> buscarContato(){
        return repositor.findAll(); //acessa o repositório através da injeção de dependência no Repository
    }

    public Optional<FonelistModel> buscarContatoId(Long codigoDoContato){
        return repositor.findById(codigoDoContato);
    }

    public FonelistModel cadastrarContato(FonelistModel nomeDoContato){

        nomeDoContato.getCodigoContato();
        nomeDoContato.getNome();
        nomeDoContato.getNumFone();

        return repositor.save(nomeDoContato);
    }

    public FonelistModel alterarContato(FonelistModel nomeDoContato){

        nomeDoContato.getCodigoContato();
        nomeDoContato.getNome();
        nomeDoContato.getNumFone();

        return repositor.save(nomeDoContato);
    }

    public void deletarContato(Long codigoContato){
        repositor.deleteById(codigoContato);
    }

}
