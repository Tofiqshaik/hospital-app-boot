package com.ty.hospital.hospitalappboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.hospitalappboot.dao.MedorderDao;
import com.ty.hospital.hospitalappboot.dto.Medorder;
import com.ty.hospital.hospitalappboot.service.MedorderService;

@RestController
public class MedorderController {
	
	@Autowired
	private MedorderService medorderService;
	
	@PostMapping("/encounter/{encounterid}/medorder")
	public Medorder saveMedorder(@PathVariable (name = "encounterid") int id, @RequestBody Medorder medorder) {
		return medorderService.saveMedorder(id, medorder);
	}@GetMapping("/medorder")
	public Medorder getMedorderById(@RequestParam int id) {
		return medorderService.getMedorderById(id);
	}
	@PutMapping("/medorder")
	public Medorder updateMedorderById(@RequestParam int id) {
		return medorderService.updateMedorderById(id);
	}
	@DeleteMapping("/medorder")
	public void deleteMedorderById(@RequestParam int id) {
		 medorderService.deleteMedorderById(id);
	}
}
