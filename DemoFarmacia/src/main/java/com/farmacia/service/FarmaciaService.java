package com.farmacia.service;

import java.util.List;

import com.farmacia.entity.FarmaciaEntity;

public interface FarmaciaService {
	
	public abstract List<FarmaciaEntity> getAll();
	public abstract List<FarmaciaEntity> getByComuna(int comuna);
	public abstract List<FarmaciaEntity> getByRegion(int region);
	public abstract List<FarmaciaEntity> getByName(String name);
	
	
	

}

