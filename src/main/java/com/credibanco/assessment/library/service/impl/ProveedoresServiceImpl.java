package com.credibanco.assessment.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.commons.GenericServiceImpl;
import com.credibanco.assessment.library.dao.ProveedoresDaoAPI;
import com.credibanco.assessment.library.model.Proveedores;
import com.credibanco.assessment.library.service.ProveedoresServiceAPI;

@Service
public class ProveedoresServiceImpl extends GenericServiceImpl<Proveedores, Integer> implements ProveedoresServiceAPI {

	@Autowired
	private ProveedoresDaoAPI proveedoresDaoAPI;
	
	@Override
	public CrudRepository<Proveedores, Integer> getDao() {
		return proveedoresDaoAPI;
	}

	@Override
	public List<Proveedores> serviciosDisponibles(String servicio, String zona) {
		return (List<Proveedores>) proveedoresDaoAPI.proveedoresGroupByservicios(servicio,zona);
	}
	
}
