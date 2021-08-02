package com.credibanco.assessment.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.commons.GenericServiceImpl;
import com.credibanco.assessment.library.dao.ZonaDaoAPI;
import com.credibanco.assessment.library.model.Zona;
import com.credibanco.assessment.library.service.ZonaServiceAPI;

@Service
public class ZonaServiceImpl extends GenericServiceImpl<Zona, Integer> implements ZonaServiceAPI {

	@Autowired
	private ZonaDaoAPI zonaDaoAPI;
	
	@Override
	public CrudRepository<Zona, Integer> getDao() {
		return zonaDaoAPI;
	}

}
