package com.stat.nba.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.nba.model.Player;
import com.stat.nba.repository.PlayerRepositories;

@RestController
@RequestMapping("/api/nba/")
public class PlayerController {
	@Autowired
	private PlayerRepositories player;
	
	@PostMapping("/save")
    public void createEmployee(@RequestBody Player p) {
         player.save(p);
    }
}
