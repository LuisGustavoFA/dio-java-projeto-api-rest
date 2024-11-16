package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_skill")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private double atkValue;
	private double healValue;
	private double buffValue;
	
	public Skill(Long id, String name, double atkValue, double healValue, double buffValue) {
		super();
		this.id = id;
		this.name = name;
		this.atkValue = atkValue;
		this.healValue = healValue;
		this.buffValue = buffValue;
	}
	
	public Skill() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAtkValue() {
		return atkValue;
	}
	public void setAtkValue(double atkValue) {
		this.atkValue = atkValue;
	}
	public double getHealValue() {
		return healValue;
	}
	public void setHealValue(double healValue) {
		this.healValue = healValue;
	}
	public double getBuffValue() {
		return buffValue;
	}
	public void setBuffValue(double buffValue) {
		this.buffValue = buffValue;
	}
	
}
