package com.fs.policeStation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "place")
public class psPlace {

	@Id
	@Column(name = "place_of_ps")
	private String place_of_ps;
	@Column(name = "district_cd")
	private int district_cd;
	public String getPlace_of_ps() {
		return place_of_ps;
	}
	public void setPlace_of_ps(String place_of_ps) {
		this.place_of_ps = place_of_ps;
	}
	public int getDistrict_cd() {
		return district_cd;
	}
	public void setDistrict_cd(int district_cd) {
		this.district_cd = district_cd;
	}
	public psPlace(String place_of_ps, int district_cd) {
		super();
		this.place_of_ps = place_of_ps;
		this.district_cd = district_cd;
	}
	public psPlace() {
		super();
	}
	
	
}
