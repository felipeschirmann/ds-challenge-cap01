package com.ds.challenge.cap01.resouces;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.challenge.cap01.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResources {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Joao", "11111111111", 3000.00, Instant.parse("2020-07-13T20:50:07.12345Z"), 1));
		list.add(new Client(2L, "Maria", "222222222222", 4000.00, Instant.parse("2020-07-13T20:50:07.12345Z"), 3));
		
		return ResponseEntity.ok().body(list);

	}
}
