package com.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.entity.FarmaciaEntity;
import com.farmacia.service.imp.FarmaciaServiceImp;

@RequestMapping("farmacias")
@RestController
public class FarmaciaController {
	@Autowired
	@Qualifier("farmaciaServiceImp")
	private FarmaciaServiceImp farmaciaServiceImp;
	
	@GetMapping("/getAll")
	public List<FarmaciaEntity> getAll(){
		return farmaciaServiceImp.getAll();
	}
	
	@PostMapping("/getComuna")
	public List<FarmaciaEntity> getByComuna(@RequestParam("comuna_id") int comuna){
		return farmaciaServiceImp.getByComuna(comuna);
	}
	
	@GetMapping("/getByName/{name}")
	public List<FarmaciaEntity> getByName(@PathVariable("name") String name){
		return farmaciaServiceImp.getByName(name);
	}
	
	@GetMapping("/getByRegion/{region_id}")
	public List<FarmaciaEntity> getByRegion(@PathVariable("region_id") int region_id){
		return farmaciaServiceImp.getByRegion(region_id);
		
	}

}
