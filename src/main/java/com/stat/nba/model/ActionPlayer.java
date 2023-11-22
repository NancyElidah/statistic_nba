package com.stat.nba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Player_action")
public class ActionPlayer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int id_match;
    int id_joueur;
    int id_action;
    
    public ActionPlayer() {
    }
    
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
    public int getId_joueur() {
        return id_joueur;
    }
    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }
    public int getId_action() {
        return id_action;
    }
    public void setId_action(int id_action) {
        this.id_action = id_action;
    }


}
