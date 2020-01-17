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
@Table(name = "Ambito")
@NamedQueries({
    @NamedQuery(name = "Ambito.findAll", query = "SELECT a FROM Ambito a"),
    @NamedQuery(name = "Ambito.findByIdAmbito", query = "SELECT a FROM Ambito a WHERE a.idAmbito = :idAmbito"),
    @NamedQuery(name = "Ambito.findByNombre", query = "SELECT a FROM Ambito a WHERE a.nombre = :nombre")})
public class Ambito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Ambito")
    private Integer idAmbito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAmbito")
    private List<Software> softwareList;

    public Ambito() {
    }

    public Ambito(Integer idAmbito) {
        this.idAmbito = idAmbito;
    }

    public Ambito(Integer idAmbito, String nombre) {
        this.idAmbito = idAmbito;
        this.nombre = nombre;
    }

    public Integer getIdAmbito() {
        return idAmbito;
    }

    public void setIdAmbito(Integer idAmbito) {
        this.idAmbito = idAmbito;
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
        hash += (idAmbito != null ? idAmbito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ambito)) {
            return false;
        }
        Ambito other = (Ambito) object;
        if ((this.idAmbito == null && other.idAmbito != null) || (this.idAmbito != null && !this.idAmbito.equals(other.idAmbito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Ambito[ idAmbito=" + idAmbito + " ]";
    }
    
}
