package com.ty.hospital.hospitalappboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.hospitalappboot.dao.ItemDao;
import com.ty.hospital.hospitalappboot.dto.Item;
import com.ty.hospital.hospitalappboot.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/medorder/{medorderid}/item")
	public Item saveItem(@PathVariable(name="medorderid")int medorderId, @RequestBody Item item) {
		return itemService.saveItem(medorderId, item);
		
	}
	@GetMapping("/item")
	public Item getItemById(@RequestParam int id) {
		return itemService.getItemById(id);
	}
	@GetMapping("/allitem")
	public List<Item> getAllItem(){
		return itemService.getAllItem();
				
	}
	@DeleteMapping("/item")
	public void deleteItemById(@RequestParam  int id) {
		itemService.deleteItemById(id);
		
	}

}
