package com.credibanco.assessment.library.service;

import java.util.List;

import com.credibanco.assessment.library.commons.GenericServiceAPI;
import com.credibanco.assessment.library.model.Proveedores;

public interface ProveedoresServiceAPI extends GenericServiceAPI<Proveedores, Integer>  {
	
	public List<Proveedores> serviciosDisponibles(String servicio, String zona) ;
	
}
