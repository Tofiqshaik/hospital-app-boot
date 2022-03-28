package com.ty.hospital.hospitalappboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.hospitalappboot.dao.HospitalDao;
import com.ty.hospital.hospitalappboot.dto.Hospital;
import com.ty.hospital.hospitalappboot.service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@PostMapping("/hospital")
	public Hospital saveHospital(@RequestBody Hospital hospital) {
		return hospitalService.saveHospital(hospital);
	}
	@PutMapping("/hospital")
	public Hospital updateHospital(@RequestBody Hospital hospital,@RequestParam int id) {
		return hospitalService.updateHospitalById(id, hospital);
		
	}
	
	@GetMapping("/hospital")
	public Hospital getHospitalById(@RequestParam int id) {
		return hospitalService.getHospitalById(id);
	}
	@GetMapping("/allhospital")
	public List<Hospital> getAllHospital(){
		return hospitalService.getAllHospital();
	}
	@DeleteMapping("/hospital")
	public void deleteHospitalById(@RequestParam int id) {
		hospitalService.deleteHospitalById(id);
	}

}
