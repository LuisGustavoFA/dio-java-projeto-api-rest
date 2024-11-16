package me.dio.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.model.GCharacter;
import me.dio.service.GCharacterService;

@RestController
@RequestMapping("/characters")
public class GCharacterController {
	private final GCharacterService charService;
	
	public GCharacterController (GCharacterService charService) {
		this.charService = charService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GCharacter> findById(@PathVariable("id") Long id) {
		var character = charService.findByID(id);
		return ResponseEntity.ok(character);
	}
	
	@PostMapping
	public ResponseEntity<GCharacter> create(@RequestBody GCharacter characterToCreate) {
		var characterCreated = charService.create(characterToCreate);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(characterCreated.getId())
				.toUri();
		return ResponseEntity.created(location).body(characterCreated);
	}
}
