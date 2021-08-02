package com.credibanco.assessment.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.commons.GenericServiceImpl;
import com.credibanco.assessment.library.dao.ordenesDaoAPI;
import com.credibanco.assessment.library.model.Orden;
import com.credibanco.assessment.library.service.OrdenServiceAPI;

@Service
public class OrdenServiceImpl extends GenericServiceImpl<Orden, Integer> implements OrdenServiceAPI {

	@Autowired
	private ordenesDaoAPI ordenesDaoAPI;
	
	@Override
	public CrudRepository<Orden, Integer> getDao() {
		return ordenesDaoAPI;
	}

}
