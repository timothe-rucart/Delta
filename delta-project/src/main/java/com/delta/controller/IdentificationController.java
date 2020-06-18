package com.delta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.model.Client;
import com.delta.model.Poste;
import com.delta.repository.IClient;
import com.delta.repository.IPoste;

@RestController
@RequestMapping("/api/v1/")
public class IdentificationController {

	@Autowired
	private IClient clientRepository;
	
	@Autowired
	private IPoste posteRepository;
	
	
	@GetMapping("personnes")
	public String getAllPersonne()
	{
		return "ok";
	}
	
	
	@PostMapping("client")
	public Client createClient(@RequestBody Client pClient)
	{
		return this.clientRepository.save(pClient);
	}
	
	@PostMapping("poste")
	public Poste createPoste(@RequestBody Poste pPoste)
	{
		return this.posteRepository.save(pPoste);
	}
}