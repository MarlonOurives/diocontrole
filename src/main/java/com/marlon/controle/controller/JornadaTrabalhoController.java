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
import com.marlon.controle.service.JornadaTrabalhoService;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
	
	@Autowired
	private JornadaTrabalhoService jornadaTrabalhoService;

	@PostMapping
	public JornadaTrabalho createJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
	} 
	
	@GetMapping
	public List<JornadaTrabalho> getJornadaTrabalhos(){
		return jornadaTrabalhoService.findAll();
	}
	
	@GetMapping("/{idJornada}")
	public ResponseEntity<JornadaTrabalho> getJornadaTrabalhoById(@PathVariable("idJornada") Long idJornada) throws Exception{
		return  ResponseEntity.ok(jornadaTrabalhoService.findById(idJornada).orElseThrow(()->new Exception("Jornada não encontrada")));
				
	}	
	@SuppressWarnings("unchecked")
	@DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
       try {
           jornadaTrabalhoService.deleteJornada(idJornada);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }
	
	
	
	
}
