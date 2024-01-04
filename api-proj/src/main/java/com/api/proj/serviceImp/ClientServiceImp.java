package com.api.proj.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.proj.entity.Client;
import com.api.proj.repo.ClientRepo;
import com.api.proj.service.ClientService;

@Service
public class ClientServiceImp implements ClientService {

	@Autowired
	ClientRepo clientRepo;

	@Override
	public List<Client> getAllClient() {
		return clientRepo.findAll();
	}

	@Override
	public Client createClient(Client client) {
		return clientRepo.save(client);
	}

	@Override
	public Client getClientByID(long id) {
		return clientRepo.findById(id).orElseThrow(() -> new RuntimeException("Data with input not found : " + id ));
	}

}
