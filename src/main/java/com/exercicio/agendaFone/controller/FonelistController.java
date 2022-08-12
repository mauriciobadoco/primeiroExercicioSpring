package com.exercicio.agendaFone.controller;

import com.exercicio.agendaFone.model.FonelistModel;
import com.exercicio.agendaFone.service.FonelistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //indica que ela é controller
public class FonelistController {

    @Autowired
    private FonelistService foneService;
    @GetMapping(path = "/fonelist") //indica que a requisição é do tipo get
    public List<FonelistModel> buscarContato(){
        return foneService.buscarContato();
    }

    @GetMapping(path = "/fonelist/{codigoContato}")
    public Optional<FonelistModel> buscarContatoId (@PathVariable Long codigoDoContato){
        return foneService.buscarContatoId(codigoDoContato);
    }

    @PostMapping(path = "/fonelist")
    public FonelistModel cadastrarContato(@RequestBody FonelistModel contato){ //a anotação serve para forçar a requisição post
        return foneService.cadastrarContato(contato);
    }

    @PutMapping(path = "/fonelist/{codigoContato}")
    public FonelistModel alterarContato(@RequestBody FonelistModel contato){
        return foneService.alterarContato(contato);
    }

    @DeleteMapping(path ="/fonelist/{codigoContato}")
    public void deletarContato(@PathVariable Long codigoContato){
        foneService.deletarContato(codigoContato);
    }
}
