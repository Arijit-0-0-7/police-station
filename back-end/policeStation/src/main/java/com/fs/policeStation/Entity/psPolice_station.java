package com.fs.policeStation.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "police_station")
public class psPolice_station {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ps_cd")
	private int ps_cd;
	@Column(name="ps_name")
	private String ps_name;
	@Column(name="place_of_ps")
	private String place_of_ps;
	@Column(name="state_cd")
	private int state_cd;
	@Column(name="district_cd")
	private int district_cd;
	@Column(name="modified_by")
	private String modified_by;
	@Column(name="modified_dttm")
	private Date modified_dttm;
	@Column(name="instantiated_by")
	private String instantiated_by;
	@Column(name="instantiated_dttm")
	private Date instantiated_dttm;
	@Column(name="validity_dttm")
	private Date validity_dttm;
	public int getPs_cd() {
		return ps_cd;
	}
	public void setPs_cd(int ps_cd) {
		this.ps_cd = ps_cd;
	}
	public String getPs_name() {
		return ps_name;
	}
	public void setPs_name(String ps_name) {
		this.ps_name = ps_name;
	}
	public String getPlace_of_ps() {
		return place_of_ps;
	}
	public void setPlace_of_ps(String place_of_ps) {
		this.place_of_ps = place_of_ps;
	}
	public int getState_cd() {
		return state_cd;
	}
	public void setState_cd(int state_cd) {
		this.state_cd = state_cd;
	}
	public int getDistrict_cd() {
		return district_cd;
	}
	public void setDistrict_cd(int district_cd) {
		this.district_cd = district_cd;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Date getModified_dttm() {
		return modified_dttm;
	}
	public void setModified_dttm(Date modified_dttm) {
		this.modified_dttm = modified_dttm;
	}
	public String getInstantiated_by() {
		return instantiated_by;
	}
	public void setInstantiated_by(String instantiated_by) {
		this.instantiated_by = instantiated_by;
	}
	public Date getInstantiated_dttm() {
		return instantiated_dttm;
	}
	public void setInstantiated_dttm(Date instantiated_dttm) {
		this.instantiated_dttm = instantiated_dttm;
	}
	public Date getValidity_dttm() {
		return validity_dttm;
	}
	public void setValidity_dttm(Date validity_dttm) {
		this.validity_dttm = validity_dttm;
	}
	public psPolice_station(int ps_cd, String ps_name, String place_of_ps, int state_cd, int district_cd,
			String modified_by, Date modified_dttm, String instantiated_by, Date instantiated_dttm,
			Date validity_dttm) {
		super();
		this.ps_cd = ps_cd;
		this.ps_name = ps_name;
		this.place_of_ps = place_of_ps;
		this.state_cd = state_cd;
		this.district_cd = district_cd;
		this.modified_by = modified_by;
		this.modified_dttm = modified_dttm;
		this.instantiated_by = instantiated_by;
		this.instantiated_dttm = instantiated_dttm;
		this.validity_dttm = validity_dttm;
	}
	public psPolice_station() {
		// TODO Auto-generated constructor stub
	}
}
