package com.stat.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stat.nba.model.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    
}
