package com.gft.main.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cidadao {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	private String telefone;

}
