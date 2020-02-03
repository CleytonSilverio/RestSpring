package com.gft.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

	@PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String salvaCidadao(@RequestBody Cidadao cidadao) {
		dao.salvaCidadao(cidadao);
		return "success";
	}

	@SuppressWarnings("unchecked")
	@GetMapping(value = "/listar")
	public ResponseEntity<List<Cidadao>> getCidadoes() {
		return ResponseEntity.ok(dao.getCidadoes());
	}

}
