/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "ServidorDeAplicaciones")
@NamedQueries({
    @NamedQuery(name = "ServidorDeAplicaciones.findAll", query = "SELECT s FROM ServidorDeAplicaciones s"),
    @NamedQuery(name = "ServidorDeAplicaciones.findByIdServidorDeAplicaciones", query = "SELECT s FROM ServidorDeAplicaciones s WHERE s.idServidorDeAplicaciones = :idServidorDeAplicaciones"),
    @NamedQuery(name = "ServidorDeAplicaciones.findByNombre", query = "SELECT s FROM ServidorDeAplicaciones s WHERE s.nombre = :nombre")})
public class ServidorDeAplicaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ServidorDeAplicaciones")
    private Integer idServidorDeAplicaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "id_Plataforma", referencedColumnName = "id_Plataforma")
    // Agrego cascade = CascadeType.ALL para que al persistir o eliminar el hijo se eliminen el/los padres.
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Plataforma idPlataforma;

    public ServidorDeAplicaciones() {
    }

    public ServidorDeAplicaciones(Integer idServidorDeAplicaciones) {
        this.idServidorDeAplicaciones = idServidorDeAplicaciones;
    }

    public ServidorDeAplicaciones(Integer idServidorDeAplicaciones, String nombre) {
        this.idServidorDeAplicaciones = idServidorDeAplicaciones;
        this.nombre = nombre;
    }

    public Integer getIdServidorDeAplicaciones() {
        return idServidorDeAplicaciones;
    }

    public void setIdServidorDeAplicaciones(Integer idServidorDeAplicaciones) {
        this.idServidorDeAplicaciones = idServidorDeAplicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plataforma getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Plataforma idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServidorDeAplicaciones != null ? idServidorDeAplicaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServidorDeAplicaciones)) {
            return false;
        }
        ServidorDeAplicaciones other = (ServidorDeAplicaciones) object;
        if ((this.idServidorDeAplicaciones == null && other.idServidorDeAplicaciones != null) || (this.idServidorDeAplicaciones != null && !this.idServidorDeAplicaciones.equals(other.idServidorDeAplicaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.ServidorDeAplicaciones[ idServidorDeAplicaciones=" + idServidorDeAplicaciones + " ]";
    }
    
}
