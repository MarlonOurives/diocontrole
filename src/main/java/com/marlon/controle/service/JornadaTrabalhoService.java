package com.marlon.controle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlon.controle.model.JornadaTrabalho;
import com.marlon.controle.repository.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService {

	@Autowired
	private JornadaTrabalhoRepository jornadaTrabalhoRepository;
	
	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaTrabalhoRepository.findAll();
	}

	public Optional<JornadaTrabalho> findById(Long idjornada) {
		return jornadaTrabalhoRepository.findById(idjornada);
	}
	
	public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoRepository.save(jornadaTrabalho);
	}
	

	public void deleteJornada(Long idjornada) {
		jornadaTrabalhoRepository.deleteById(idjornada);
	}

}
