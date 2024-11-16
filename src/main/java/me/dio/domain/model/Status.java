package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_status")
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int hp;
	private int atk;
	private int def;
	
	public Status(Long id, int hp, int atk, int def) {
		super();
		this.id = id;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public Status() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
}
