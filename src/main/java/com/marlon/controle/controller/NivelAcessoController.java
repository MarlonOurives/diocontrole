package com.marlon.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlon.controle.model.JornadaTrabalho;
import com.marlon.controle.model.NivelAcesso;
import com.marlon.controle.service.NivelAcessoService;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {

	@Autowired
	private NivelAcessoService nivelAcessoService;
	
	
	@PostMapping
	public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
		return nivelAcessoService.saveNivelAcesso(nivelAcesso);
	} 
	
	@GetMapping
	public List<NivelAcesso> getNivelAcesso(){
		return nivelAcessoService.findAll();
	}
	
	@GetMapping("/{idNivel}")
	public ResponseEntity<NivelAcesso> getNivelAcessoById(@PathVariable("idNivel") Long idNivel) throws Exception{
		return  ResponseEntity.ok(nivelAcessoService.findById(idNivel).orElseThrow(()->new Exception("Nível não encontrado")));
				
	}
	
}
