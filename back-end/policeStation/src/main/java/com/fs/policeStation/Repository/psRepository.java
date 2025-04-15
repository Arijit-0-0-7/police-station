package com.fs.policeStation.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fs.policeStation.Entity.psDistrict;
import com.fs.policeStation.Entity.psPlace;
import com.fs.policeStation.Entity.psPolice_station;
import com.fs.policeStation.Entity.psState;

public interface psRepository extends JpaRepository<psPolice_station,Integer>{
	 
	@Query( nativeQuery = true,
			value = "SELECT * FROM police_station")
	List<psPolice_station> getAll();
	/*
	@Modifying
	@Query( nativeQuery = true,
			value = "INSERT INTO police_station values(:ps_name,:state_cd,:district_cd,"
					+ ":place_of_ps,:modified_by,:modified_dttm,:instantiated_by,:instantiated_dttm,:validity_dttm)")
	police_station create(@Param("ps_name") String ps_name,
			@Param("state_cd") int state_cd,@Param("district_cd") int district_cd,
			@Param("place_of_ps")String place_of_ps,@Param("modified_by")String modified_by,
			@Param("modified_dttm") Date modified_dttm,@Param("instantiated_by") String instantiated_by,
			@Param("instantiated_dttm") Date instantiated_dttm,	@Param("validity_dttm") Date validity_dttm);*/
	@Query( nativeQuery = true,
			value = "SELECT * FROM police_station where ps_cd=:state_cd")
	psPolice_station getById(@Param("state_cd") int id);
	@Modifying
	@Query( nativeQuery = true,
			value = "UPDATE police_station set ps_name=:ps_name,state_cd=:state_cd,"
					+ "district_cd=:district_cd,place_of_ps=:place_of_ps,modified_by=:modified_by,"
					+ "modified_dttm=:modified_dttm,instantiated_by=:instantiated_by,"
					+ "instantiated_dttm=:instantiated_dttm,validity_dttm=:validity_dttm where ps_cd=:ps_cd1")
	void updateById(@Param("ps_name") String ps_name,
			@Param("state_cd") int state_cd,@Param("district_cd") int district_cd,
			@Param("place_of_ps")String place_of_ps,@Param("modified_by")String modified_by,
			@Param("modified_dttm") Date modified_dttm,@Param("instantiated_by") String instantiated_by,
			@Param("instantiated_dttm") Date instantiated_dttm,	@Param("validity_dttm") Date validity_dttm,@Param("ps_cd1") int id);
 
	@Modifying
	@Query( nativeQuery = true,
			value = "DELETE FROM police_station where ps_cd<>:ps_cd")
	void deleteByCd(@Param("ps_cd") int ps_cd);
 
	@Query( nativeQuery = true,
			value = "SELECT DISTINCT state_cd,state_name FROM state")
	public List<psState> findAllStates();
	@Query( nativeQuery = true,
			value = "SELECT DISTINCT PS.district_cd, PS.district_name, PS.state_cd FROM district PS WHERE PS.state_cd=:state_cd")
	public List<psDistrict> findDistrictsByState_cd(@Param("state_cd") int state_cd);
 
	@Query( nativeQuery = true,
			value = "SELECT DISTINCT PS.place_of_ps,PS.district_cd FROM place PS WHERE PS.district_cd=:district_cd")
	public List<psPlace> findPlacesByDistrict_cd(@Param("district_cd") int district_cd);
 
}
