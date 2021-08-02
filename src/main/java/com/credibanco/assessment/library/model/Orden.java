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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "orden")
public class Orden implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden_servicio")
    private Integer idOrdenServicio;
    @JoinColumn(name = "proveedores_id_proveedores_servicio", referencedColumnName = "id_proveedores_servicio")
    @ManyToOne(optional = false)
    private Proveedores proveedoresIdProveedoresServicio;

    public Orden() {
    }

    public Orden(Integer idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public Integer getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(Integer idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public Proveedores getProveedoresIdProveedoresServicio() {
        return proveedoresIdProveedoresServicio;
    }

    public void setProveedoresIdProveedoresServicio(Proveedores proveedoresIdProveedoresServicio) {
        this.proveedoresIdProveedoresServicio = proveedoresIdProveedoresServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenServicio != null ? idOrdenServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orden)) {
            return false;
        }
        Orden other = (Orden) object;
        if ((this.idOrdenServicio == null && other.idOrdenServicio != null) || (this.idOrdenServicio != null && !this.idOrdenServicio.equals(other.idOrdenServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.Orden[ idOrdenServicio=" + idOrdenServicio + " ]";
    }
    
}
