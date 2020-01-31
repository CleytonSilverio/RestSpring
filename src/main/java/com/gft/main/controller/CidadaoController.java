package com.gft.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.main.dao.CidadaoDao;
import com.gft.main.entidade.Cidadao;

@RestController
@RequestMapping("/cidadao")
public class CidadaoController {
	
	@Autowired
	private CidadaoDao dao;
	
	@PostMapping("/salve")
	public String salvaCidadao(@RequestBody Cidadao cidadao) {
		dao.salvaCidadao(cidadao);
		return "success";
	}

	@GetMapping(value="/listar", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cidadao> getCidadoes() {
		return dao.getCidadoes();
	}

}
