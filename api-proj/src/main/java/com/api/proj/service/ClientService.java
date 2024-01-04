package com.api.proj.service;

import java.util.List;

import com.api.proj.entity.Client;

public interface ClientService {

	List<Client> getAllClient();

	Client createClient(Client client);

	Client getClientByID(long id);
}
