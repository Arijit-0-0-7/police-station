package com.fs.policeStation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "district")
public class psDistrict {

	@Column(name = "district_cd")
	@Id
	private int district_cd;
	@Column(name = "district_name")
	private String district_name;
	@Column(name = "state_cd")
	private int state_cd;
	public int getDistrict_cd() {
		return district_cd;
	}
	public void setDistrict_cd(int district_cd) {
		this.district_cd = district_cd;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public int getState_cd() {
		return state_cd;
	}
	public void setState_cd(int state_cd) {
		this.state_cd = state_cd;
	}
	public psDistrict(int district_cd, String district_name, int state_cd) {
		super();
		this.district_cd = district_cd;
		this.district_name = district_name;
		this.state_cd = state_cd;
	}
	
	public psDistrict() {
		// TODO Auto-generated constructor stub
	}	
}
