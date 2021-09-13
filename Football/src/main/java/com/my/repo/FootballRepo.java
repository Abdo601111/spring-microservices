package com.my.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.model.PlayerTeam;

public interface FootballRepo extends JpaRepository<PlayerTeam, Integer>{
	
	PlayerTeam findByFromAndTo(String from,String to);

}
