package com.stat.nba.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.nba.model.Connexion;
import com.stat.nba.model.Match;
import com.stat.nba.repository.MatchRepository;

@RestController
@RequestMapping("/api/nba/match/")
public class MatchController {
    @Autowired 
    private MatchRepository match;

    	
	@PostMapping("/save")
	public Match Insert(@RequestBody Match m) {
        return match.save(m);
	}

}
