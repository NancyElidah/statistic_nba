package com.stat.nba.model;

import jakarta.persistence.Entity;
import java.util.*;;
@Entity
public class ActionPlayer {
    int id;
    int id_match;
    int id_player;
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
    public int getId_player() {
        return id_player;
    }
    public void setId_player(int id_player) {
        this.id_player = id_player;
    }
    public int getId_action() {
        return id_action;
    }
    public void setId_action(int id_action) {
        this.id_action = id_action;
    }


}
