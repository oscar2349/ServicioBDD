package com.credibanco.assessment.library.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.credibanco.assessment.library.model.Proveedores;

public interface ProveedoresDaoAPI extends CrudRepository<Proveedores, Integer> {
	
	@Query(value = "select * from mydb.proveedores where servicios_id_servicios=? and zona_id_zona_trabajo=?;", nativeQuery=true)
		  List<Proveedores> proveedoresGroupByservicios(String servicios_id_servicios , String zona_id_zona_trabajo);

}
