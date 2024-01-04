package com.api.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.proj.entity.Client;

public interface ClientRepo extends JpaRepository<Client, Long>{

}
