package com.my.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teame {

	
	private int id;
	private String from;
	
	private String to;
	private int salaryPlayer;
	private int salaryTeam;
	private String note;
	private String numberTeams;
	
}
