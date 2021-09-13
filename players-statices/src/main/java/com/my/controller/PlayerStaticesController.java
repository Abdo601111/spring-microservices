package com.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.config.PlayersConfg;
import com.my.model.PlayersStatices;

@RestController
public class PlayerStaticesController {
	
	@Autowired
	private PlayersConfg playersConfg;
	
	@GetMapping("/staties")
	public PlayersStatices getPlayersStatices() {
		
		return  new PlayersStatices(playersConfg.getNumberPlayers(),playersConfg.getNumberTems(),playersConfg.getCountry()) ;
	}

}
