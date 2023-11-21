package com.stat.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stat.nba.model.ActionPlayer;

public interface ActionPlayerRepository extends JpaRepository<ActionPlayer, Integer> {
    
}
