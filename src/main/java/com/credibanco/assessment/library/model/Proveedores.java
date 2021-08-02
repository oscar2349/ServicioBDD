package com.credibanco.assessment.library.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "proveedores")
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proveedores_servicio")
    private Integer idProveedoresServicio;
    
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
   
    @JoinColumn(name = "servicios_id_servicios", referencedColumnName = "id_servicios")
    @ManyToOne(optional = false)
    private Servicios serviciosIdServicios;
   
    @JoinColumn(name = "zona_id_zona_trabajo", referencedColumnName = "id_zona_trabajo")
    @ManyToOne(optional = false)
    private Zona zonaIdZonaTrabajo;


    public Proveedores() {
    }

    public Proveedores(Integer idProveedoresServicio) {
        this.idProveedoresServicio = idProveedoresServicio;
    }

    public Integer getIdProveedoresServicio() {
        return idProveedoresServicio;
    }

    public void setIdProveedoresServicio(Integer idProveedoresServicio) {
        this.idProveedoresServicio = idProveedoresServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Servicios getServiciosIdServicios() {
        return serviciosIdServicios;
    }

    public void setServiciosIdServicios(Servicios serviciosIdServicios) {
        this.serviciosIdServicios = serviciosIdServicios;
    }

    public Zona getZonaIdZonaTrabajo() {
        return zonaIdZonaTrabajo;
    }

    public void setZonaIdZonaTrabajo(Zona zonaIdZonaTrabajo) {
        this.zonaIdZonaTrabajo = zonaIdZonaTrabajo;
    }

}
