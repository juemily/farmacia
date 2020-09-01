package com.farmacia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="farmacias")
public class FarmaciaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	private String nombreLocal;
	private String direccion;
	private int comuna_id;
	private int region_id;
	private String telefono;
	private String latitud;
	private String longitud;
	


	public FarmaciaEntity() {
	
	}



	public FarmaciaEntity(Long id, String nombreLocal, String direccion, int comuna_id, int region_id, String telefono,
			String latitud, String longitud) {
		super();
		this.id = id;
		this.nombreLocal = nombreLocal;
		this.direccion = direccion;
		this.comuna_id = comuna_id;
		this.region_id = region_id;
		this.telefono = telefono;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	
	
	
	

}
