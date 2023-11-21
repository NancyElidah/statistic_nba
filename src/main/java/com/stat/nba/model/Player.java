package com.stat.nba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id ;
	String nom ;
	int id_genre;
	int id_equipe;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId_genre() {
		return id_genre;
	}
	public void setId_genre(int id_genre) {
		this.id_genre = id_genre;
	}
	public int getId_equipe() {
		return id_equipe;
	}
	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}
	public Player(int id, String nom, int id_genre, int id_equipe) {
		super();
		this.id = id;
		this.nom = nom;
		this.id_genre = id_genre;
		this.id_equipe = id_equipe;
	}
	
	public Player() {
		super();
	}
	
}
