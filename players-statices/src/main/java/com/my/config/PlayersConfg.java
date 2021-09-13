package com.my.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties("players.states")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayersConfg {
	
	
	private int numberTems;
	private int numberPlayers;
	private String country;
	

}
