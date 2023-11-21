package com.stat.nba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.stat.nba.model.Possession;
import com.stat.nba.repository.PossessionRepository;

@RestController
@RequestMapping("/api/nba/")
public class PossessionController {
	@Autowired
	private PossessionRepository possession; 
	
	@GetMapping("/tafa")
	public String getAllEmployees() {
		System.out.println("aaaa");
		return "Tafasoa";
	}
	@PostMapping("/save_possession")
	public Possession insert(@RequestBody Possession p) {
		return possession.save(p);
	}
	
}
