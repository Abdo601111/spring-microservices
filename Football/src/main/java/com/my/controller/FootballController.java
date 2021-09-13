package com.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.my.model.PlayerTeam;
import com.my.repo.FootballRepo;



@RestController
public class FootballController {
	
	@Autowired
	private FootballRepo repo;
	
	@GetMapping("/football/{from}/and/{to}")
	public PlayerTeam getplayerTeam(@PathVariable String from,@PathVariable String to) {
		
		return repo.findByFromAndTo(from, to);
	}
	
	
	

}
