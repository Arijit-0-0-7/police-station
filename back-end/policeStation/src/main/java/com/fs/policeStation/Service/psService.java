package com.fs.policeStation.Service;

import java.util.List;

import com.fs.policeStation.Entity.psDistrict;
import com.fs.policeStation.Entity.psPlace;
import com.fs.policeStation.Entity.psPolice_station;
import com.fs.policeStation.Entity.psState;

public interface psService {

	List<psPolice_station> getAll();
	psPolice_station getById(int id);
	psPolice_station insertTo(psPolice_station ps);
	void updateById(psPolice_station ps,int id);
	void deleteByCd(int id);
 
	public List<psState> findAllStates();
	public List<psDistrict> findDistrictsByState_cd(int state_cd);
	public List<psPlace> findPlacesByDistrict_cd(int district_cd);
}
