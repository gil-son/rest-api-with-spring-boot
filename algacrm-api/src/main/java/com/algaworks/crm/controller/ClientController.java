package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.model.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@GetMapping
	public List<Client> list() {
	
	}

}
