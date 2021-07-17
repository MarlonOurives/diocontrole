package com.marlon.controle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlon.controle.model.NivelAcesso;
import com.marlon.controle.repository.NivelAcessoRepository;

@Service
public class NivelAcessoService {

	@Autowired
	private NivelAcessoRepository nivelAcessoRepository;
	
	public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso) {
		return nivelAcessoRepository.save(nivelAcesso);
	}
	
	public List<NivelAcesso> findAll() {
		return nivelAcessoRepository.findAll();
	}
	
	public Optional<NivelAcesso> findById(Long idNivelAcesso){
		return nivelAcessoRepository.findById(idNivelAcesso);
	}
	
	public NivelAcesso update(NivelAcesso nivelAcesso) {
		return nivelAcessoRepository.save(nivelAcesso);
	}
	public void delete(Long idNivelAcesso) {
		nivelAcessoRepository.deleteById(idNivelAcesso);
	}
}
