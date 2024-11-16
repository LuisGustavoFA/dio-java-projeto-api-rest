package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.GCharacter;

@Repository
public interface GCharacterRepository extends JpaRepository<GCharacter, Long>{

}
