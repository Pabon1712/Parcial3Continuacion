package com.pabon.examenes.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pabon.common.usuario.models.entity.Pregunta;
import com.pabon.commons.controller.CommonController;
import com.pabon.examenes.service.PreguntaService;

@RestController
public class PreguntaController extends CommonController<Pregunta, PreguntaService> {
	@Value("${config.balanceador.test}")
    private String balanceadorTest;
	
	 @GetMapping("/balanceador-test")
	    public ResponseEntity<?> balanceadorTest() {
	        Map<String, Object> response = new HashMap<String, Object>();

	        response.put("balanceador", balanceadorTest);
	        response.put("entidades", service.findAll());

	        return ResponseEntity.ok().body(response);
	    }
	 
	 @PutMapping("/{id}")
		public ResponseEntity<?> editar(@RequestBody Pregunta pregunta, @PathVariable Long id) {
	        
			Optional<Pregunta> ob = service.findById(id);

	        if (ob.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }

	        Pregunta preguntaBd = ob.get();
	        preguntaBd.setTexto(pregunta.getTexto());
	        preguntaBd.setExamen(pregunta.getExamen());

	        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(preguntaBd));
	    }

}
