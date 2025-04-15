package com.fs.policeStation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "state")
@Entity
public class psState {

	@Id
	@Column(name = "state_cd")
	private int state_cd;
	@Column(name = "state_name")
	private String state_name;
	public int getState_cd() {
		return state_cd;
	}
	public void setState_cd(int state_cd) {
		this.state_cd = state_cd;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public psState(int state_cd, String state_name) {
		super();
		this.state_cd = state_cd;
		this.state_name = state_name;
	}
	
	public psState() {
		// TODO Auto-generated constructor stub
	}
}
