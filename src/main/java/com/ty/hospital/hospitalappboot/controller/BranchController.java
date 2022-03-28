package com.ty.hospital.hospitalappboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.hospitalappboot.dao.BranchDao;
import com.ty.hospital.hospitalappboot.dto.Branch;
import com.ty.hospital.hospitalappboot.service.BranchService;

@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@PostMapping("/hospital/{hospitalid}/branch")
	public Branch saveBranch(@PathVariable(name = "hospitalid") int id, @RequestBody Branch branch) {
		return branchService.saveBranch(id, branch);
	}
	@GetMapping("/branch")
	public Branch getBranchById(@RequestParam int id) {
		return branchService.getBranchById(id);
	}
	@PutMapping("/branch")
	public Branch updateBranchById(@RequestParam int id) {
		return branchService.updateBranchById(id);
	}
	public void deleteBranchById(@RequestParam int id) {
		 branchService.deleteBranchById(id);
	}
	

}
