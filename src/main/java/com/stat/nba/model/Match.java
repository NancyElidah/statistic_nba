package com.stat.nba.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Timestamp date_debut;
    Timestamp date_fin;
    String lieu;
    int equipe1;
    int equipe2;

    public Match() {
    }
    public Match( Timestamp date_debut, Timestamp date_fin, String lieu, int equipe1, int equipe2) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.lieu = lieu;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Timestamp getDate_debut() {
        return date_debut;
    }
    public void setDate_debut(Timestamp date_debut) throws Exception{
        if(date_debut == null) throw new Exception("date debut null");
        this.date_debut = date_debut;
    }
    public Timestamp getDate_fin() {
        return date_fin;
    }
    public void setDate_fin(Timestamp date_fin) throws Exception{
        if(date_debut == null) throw new Exception("date fin null");
        this.date_fin = date_fin;
    }
    public String getLieu() {
        return lieu;
    }
    public void setLieu(String lieu) throws Exception{
        if(lieu == null) throw new Exception("lieu null");
        this.lieu = lieu;
    }
    public int getEquipe1() throws Exception{
        if(equipe1 < 0) throw new Exception("equipe1 negatif");
        return equipe1;
    }
    public void setEquipe1(int equipe1) {
        this.equipe1 = equipe1;
    }
    public int getEquipe2() throws Exception{
        if(equipe2 < 0) throw new Exception("equipe2 negatif");
        return equipe2;
    }
    public void setEquipe2(int equipe2) {
        this.equipe2 = equipe2;
    }


    
}
