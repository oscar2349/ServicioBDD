package com.credibanco.assessment.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.commons.GenericServiceImpl;
import com.credibanco.assessment.library.dao.ServiciosDaoAPI;
import com.credibanco.assessment.library.model.Servicios;
import com.credibanco.assessment.library.service.ServiciosServiceAPI;

@Service
public class ServiciosServiceImpl extends GenericServiceImpl<Servicios, Integer> implements ServiciosServiceAPI {

	@Autowired
	private ServiciosDaoAPI serviciosDaoAPI;
	
	@Override
	public CrudRepository<Servicios, Integer> getDao() {
		return serviciosDaoAPI;
	}

}
