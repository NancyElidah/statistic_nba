package com.stat.nba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.nba.model.ActionPlayer;
import com.stat.nba.repository.ActionPlayerRepository;

@RestController
@RequestMapping("/api/nba/actionPlayer/")
public class ActionPlayerController {
    @Autowired 
    private ActionPlayerRepository a_p;
       	
	@PostMapping("/save")
	public ActionPlayer Insert(@RequestBody ActionPlayer actionPlayer) {
        return a_p.save(actionPlayer);
	}
    
}
