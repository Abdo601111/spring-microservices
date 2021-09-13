package com.my.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.my.model.Teame;

@RestController
public class TeamsController {
	
	
	
	@GetMapping("/team/{from}/player/{to}")
	public Teame getTems(@PathVariable String from,@PathVariable String to) {
		
		Map<String ,String> mapValues= new HashMap<>();
		mapValues.put("from", from);
		mapValues.put("to", to);
		ResponseEntity<Teame> reasponseEntity=new RestTemplate().getForEntity(
				"http://localhost:50296/football/{from}/and/{to}",Teame.class,mapValues);
		
		
		Teame teameResponse=reasponseEntity.getBody();
		Teame teame = new Teame(teameResponse.getId(), teameResponse.getFrom(),
				teameResponse.getTo(), teameResponse.getSalaryTeam(), teameResponse.getSalaryPlayer(), "none", "50");
		return teame;
	}

}
