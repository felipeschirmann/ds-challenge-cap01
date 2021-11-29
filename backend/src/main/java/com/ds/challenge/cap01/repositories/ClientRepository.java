package com.ds.challenge.cap01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ds.challenge.cap01.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
