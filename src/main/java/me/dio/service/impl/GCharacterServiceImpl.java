package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.GCharacter;
import me.dio.domain.repository.GCharacterRepository;
import me.dio.service.GCharacterService;

@Service
public class GCharacterServiceImpl implements GCharacterService{

	private final GCharacterRepository charRepo;
	
	public GCharacterServiceImpl(GCharacterRepository charRepo) {
		this.charRepo = charRepo;
	}
	
	@Override
	public GCharacter findByID(Long id) {
		return charRepo.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public GCharacter create(GCharacter charToCreate) {
		if (charToCreate.getId() != null && charRepo.existsById(charToCreate.getId())) {
			throw new IllegalArgumentException("This Character ID already exists.");
		}
		return charRepo.save(charToCreate);
	}

}
