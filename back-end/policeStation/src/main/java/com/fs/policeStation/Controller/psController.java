package com.fs.policeStation.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.fs.policeStation.Entity.psDistrict;
import com.fs.policeStation.Entity.psPlace;
import com.fs.policeStation.Entity.psPolice_station;
import com.fs.policeStation.Entity.psState;
import com.fs.policeStation.Service.psService;

@RestController
@RequestMapping("/ps")
@CrossOrigin("http://localhost:4200")
public class psController {

	private psService Police_stationService;
	public psController(psService ps) {
		this.Police_stationService = ps;
	}
	@GetMapping("/getStates")
	public List<psState> getAllStates(){
		return Police_stationService.findAllStates();
	}
	@GetMapping("/getDistricts/{state_cd}")
	public List<psDistrict> getDistrictsByState_cd(@PathVariable int state_cd){
		return Police_stationService.findDistrictsByState_cd(state_cd);
	}
	@GetMapping("/getPlaces/{district_cd}")
	public List<psPlace> getPlacesByDistrict_cd(@PathVariable int district_cd){
		return Police_stationService.findPlacesByDistrict_cd(district_cd);
	}
	@PostMapping("/save1")
	public void save(@RequestBody psPolice_station ps) {
		Police_stationService.insertTo(ps);
	}
 
	@GetMapping("/get")
	public List<psPolice_station> getPolice_stations(){
		return Police_stationService.getAll();
	}
	@GetMapping("/get/{ps_cd}")
	public psPolice_station getPolice_station(@PathVariable Integer ps_cd) {
		return Police_stationService.getById(ps_cd);
	}
	@DeleteMapping("/delete/{ps_cd}")
	public void deletePolice_station(@PathVariable int ps_cd) {
		Police_stationService.deleteByCd(ps_cd);
	}
	@PutExchange("/update/{ps_cd}")
	public void updateById(@RequestBody psPolice_station ps,@PathVariable Integer ps_cd) {
		/*police_station ps = getPolice_station(ps_cd);
		Police_stationService.insertTo(ps);*/
		Police_stationService.updateById(ps, ps_cd);
	}
}
