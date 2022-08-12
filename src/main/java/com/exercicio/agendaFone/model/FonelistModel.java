package com.exercicio.agendaFone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//para indicar que é uma entidade que tem que criar um banco por anotação.
@Entity
//Também por anotação para criar a tabela no banco de dados com o nome passado por parametro.
@Table(name =  "fonelist")
// como estamos utilizando o Lombok, os métodos  setters, getters e construtor por anotação
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FonelistModel {

    //declaração dos atributos com as constrains
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long codigoContato;

    @Column (length = 100, nullable = false)
    private String nome;

    @Column (length = 100, nullable = false)
    private Long numFone;
}
