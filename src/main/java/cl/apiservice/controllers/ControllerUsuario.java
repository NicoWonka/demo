package cl.apiservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.apiservice.repositories.RepositoryUsuario;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario{
	
	@Autowired(required=true)
	private RepositoryUsuario repositoryUsuario;
	
	@GetMapping
	public Object buscarTodo(){
		return repositoryUsuario.findAll();
	}
}