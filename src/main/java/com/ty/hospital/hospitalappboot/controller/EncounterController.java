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

import com.ty.hospital.hospitalappboot.dao.EncounterDao;
import com.ty.hospital.hospitalappboot.dto.Encounter;
import com.ty.hospital.hospitalappboot.service.EncounterService;

@RestController
public class EncounterController {
	
	@Autowired
	private EncounterService encounterService;
	
	@PostMapping("/person/{personid}/branch/{branchid}/encounter")
	public Encounter saveEncounter(@PathVariable (name="personid") int id, @PathVariable (name = "branchid") int bid,@RequestBody Encounter encounter) {
		return encounterService.saveEncounter(id, bid, encounter);
	}
	@GetMapping("/encounter")
	public Encounter getEncounterById(@RequestParam int id) {
		return encounterService.getEncounterById(id);
	}
	@PutMapping("/encounter")
	public Encounter updateEncounterById(@RequestParam int id) {
		return encounterService.updateEncounterById(id);
	}
	@DeleteMapping("/encounter")
	public void deleteEncounterById(@RequestParam int id) {
		encounterService.deleteEncounterById(id);
	}

}
