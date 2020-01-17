/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "TipoPlataforma")
@NamedQueries({
    @NamedQuery(name = "TipoPlataforma.findAll", query = "SELECT t FROM TipoPlataforma t"),
    @NamedQuery(name = "TipoPlataforma.findByIdTipoPlataforma", query = "SELECT t FROM TipoPlataforma t WHERE t.idTipoPlataforma = :idTipoPlataforma"),
    @NamedQuery(name = "TipoPlataforma.findByNombre", query = "SELECT t FROM TipoPlataforma t WHERE t.nombre = :nombre")})
public class TipoPlataforma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_TipoPlataforma")
    private Integer idTipoPlataforma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoPlataforma")
    private List<Plataforma> plataformaList;

    public TipoPlataforma() {
    }

    public TipoPlataforma(Integer idTipoPlataforma) {
        this.idTipoPlataforma = idTipoPlataforma;
    }

    public TipoPlataforma(Integer idTipoPlataforma, String nombre) {
        this.idTipoPlataforma = idTipoPlataforma;
        this.nombre = nombre;
    }

    public Integer getIdTipoPlataforma() {
        return idTipoPlataforma;
    }

    public void setIdTipoPlataforma(Integer idTipoPlataforma) {
        this.idTipoPlataforma = idTipoPlataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Plataforma> getPlataformaList() {
        return plataformaList;
    }

    public void setPlataformaList(List<Plataforma> plataformaList) {
        this.plataformaList = plataformaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoPlataforma != null ? idTipoPlataforma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPlataforma)) {
            return false;
        }
        TipoPlataforma other = (TipoPlataforma) object;
        if ((this.idTipoPlataforma == null && other.idTipoPlataforma != null) || (this.idTipoPlataforma != null && !this.idTipoPlataforma.equals(other.idTipoPlataforma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.TipoPlataforma[ idTipoPlataforma=" + idTipoPlataforma + " ]";
    }
    
}
