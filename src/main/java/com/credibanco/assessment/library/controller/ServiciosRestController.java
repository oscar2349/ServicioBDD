package com.credibanco.assessment.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.library.model.Orden;
import com.credibanco.assessment.library.model.Proveedores;
import com.credibanco.assessment.library.model.RequestServicios;
import com.credibanco.assessment.library.model.Servicios;
import com.credibanco.assessment.library.model.Zona;
import com.credibanco.assessment.library.service.OrdenServiceAPI;
import com.credibanco.assessment.library.service.ProveedoresServiceAPI;
import com.credibanco.assessment.library.service.ServiciosServiceAPI;
import com.credibanco.assessment.library.service.ZonaServiceAPI;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/servicios")
@CrossOrigin("*")
@Slf4j
public class ServiciosRestController {

	@Autowired
	private ServiciosServiceAPI serviciosServiceAPI;
	
	@Autowired
	private OrdenServiceAPI ordenServiceAPI;
	
	@Autowired
	private ZonaServiceAPI zonaServiceAPI;
	
	@Autowired
	private ProveedoresServiceAPI proveedoresServiceAPI;
	


	@GetMapping(value = "/servicios")
	public List<Servicios> getservicios() {
		return serviciosServiceAPI.getAll();
	}

	@GetMapping(value = "/test")
	public String gettest() {
		return "Funcionando";
	}

	@GetMapping(value = "/ordenes")
	public List<Orden> getordenes() {
		return ordenServiceAPI.getAll();
	}

	@GetMapping(value = "/zonas")
	public List<Zona> getzonas() {
		return zonaServiceAPI.getAll();
	}

	@GetMapping(value = "/proveedores")
	public List<Proveedores> getproveedores() {
		return proveedoresServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Proveedores find(@PathVariable Integer id) {
		return proveedoresServiceAPI.get(id);
	}

	@PostMapping(value = "/disponibles")
	public List<Proveedores> disponibles(@Valid @RequestBody(required = true) RequestServicios requestServicios) {
		return proveedoresServiceAPI.serviciosDisponibles(requestServicios.getServicio(),requestServicios.getZona());
	}

}
