package com.fs.policeStation.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fs.policeStation.Entity.psDistrict;
import com.fs.policeStation.Entity.psPlace;
import com.fs.policeStation.Entity.psPolice_station;
import com.fs.policeStation.Entity.psState;
import com.fs.policeStation.Repository.psRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class implPsService implements psService {

	private psRepository psRepository;
	
	public implPsService(psRepository ps) {
		this.psRepository=ps;
	}
 
	@Override
	public List<psPolice_station> getAll() {
		// TODO Auto-generated method stub
		return psRepository.getAll();
	}
 
	@Override
	public psPolice_station getById(int id) {
		// TODO Auto-generated method stub
		return psRepository.getById(id);
	}
 
	@Override
	public psPolice_station insertTo(psPolice_station ps) {
		// TODO Auto-generated method stub
		return psRepository.save(ps);
	}
 
	
	@Override
	public void updateById(psPolice_station ps,int id) {
		// TODO Auto-generated method stub
		psRepository.updateById(ps.getPs_name(), ps.getState_cd(), ps.getDistrict_cd(),
				ps.getPlace_of_ps(),ps.getModified_by(),ps.getModified_dttm(),ps.getInstantiated_by(),
				ps.getInstantiated_dttm(),ps.getValidity_dttm(),id);
	}
 
	@Override
	public void deleteByCd(int id) {
		// TODO Auto-generated method stub
		psRepository.deleteByCd(id);
	}
 
	@Override
	public List<psState> findAllStates() {
		// TODO Auto-generated method stub
		return psRepository.findAllStates();
	}
 
 
	@Override
	public List<psDistrict> findDistrictsByState_cd(int state_cd) {
		// TODO Auto-generated method stub
		return psRepository.findDistrictsByState_cd(state_cd);
	}
	@Override
	public List<psPlace> findPlacesByDistrict_cd(int district_cd) {
		// TODO Auto-generated method stub
		return psRepository.findPlacesByDistrict_cd(district_cd);
	}
}
