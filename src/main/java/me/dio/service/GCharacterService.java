package me.dio.service;

import me.dio.domain.model.GCharacter;

public interface GCharacterService {
	GCharacter findByID(Long id);
	
	GCharacter create(GCharacter character);
}
