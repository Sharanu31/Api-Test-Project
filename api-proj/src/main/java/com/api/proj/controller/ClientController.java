package com.api.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.proj.entity.Classification;
import com.api.proj.entity.Client;
import com.api.proj.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	ClientService clientService;

	@GetMapping
	private List<Client> getAllClient() {
		return clientService.getAllClient();
	}

	@PostMapping
	private Client createClient(@RequestBody Client client) {
		return clientService.createClient(client);
	}

	@GetMapping("/{id}")
	private Client getAllClientByID(@PathVariable long id) {
		return clientService.getClientByID(id);
	}
}
