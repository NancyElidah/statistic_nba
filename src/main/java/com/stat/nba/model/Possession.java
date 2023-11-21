package com.stat.nba.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Possession")
public class Possession {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id ;
	int id_match;
	int id_player;
	Timestamp debut ;
	Timestamp fin ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_match() {
		return id_match;
	}
	public void setId_match(int id_match) {
		this.id_match = id_match;
	}
	public int getId_player() {
		return id_player;
	}
	public void setId_player(int id_player) {
		this.id_player = id_player;
	}
	public Timestamp getDebut() {
		return debut;
	}
	public void setDebut(Timestamp debut) {
		this.debut = debut;
	}
	public Timestamp getFin() {
		return fin;
	}
	public void setFin(Timestamp fin) throws Exception {
		if(fin.before(this.getDebut())) throw new Exception("La date fin doit être apres la date de debut");
		this.fin = fin;
	}
	public Possession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Possession(int id, int id_match, int id_player, Timestamp debut, Timestamp fin)throws Exception{
		super();
		this.setId(id);
		this.setId_match(id_match);
		this.setId_player(id_player);
		this.setDebut(debut);
		this.setFin(fin);
	}
	
	
}
