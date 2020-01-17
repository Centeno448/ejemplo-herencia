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
@Table(name = "Dominio")
@NamedQueries({
    @NamedQuery(name = "Dominio.findAll", query = "SELECT d FROM Dominio d"),
    @NamedQuery(name = "Dominio.findByIdDominio", query = "SELECT d FROM Dominio d WHERE d.idDominio = :idDominio"),
    @NamedQuery(name = "Dominio.findByNombre", query = "SELECT d FROM Dominio d WHERE d.nombre = :nombre")})
public class Dominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Dominio")
    private Integer idDominio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDominio")
    private List<Software> softwareList;

    public Dominio() {
    }

    public Dominio(Integer idDominio) {
        this.idDominio = idDominio;
    }

    public Dominio(Integer idDominio, String nombre) {
        this.idDominio = idDominio;
        this.nombre = nombre;
    }

    public Integer getIdDominio() {
        return idDominio;
    }

    public void setIdDominio(Integer idDominio) {
        this.idDominio = idDominio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Software> getSoftwareList() {
        return softwareList;
    }

    public void setSoftwareList(List<Software> softwareList) {
        this.softwareList = softwareList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDominio != null ? idDominio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dominio)) {
            return false;
        }
        Dominio other = (Dominio) object;
        if ((this.idDominio == null && other.idDominio != null) || (this.idDominio != null && !this.idDominio.equals(other.idDominio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Dominio[ idDominio=" + idDominio + " ]";
    }
    
}
