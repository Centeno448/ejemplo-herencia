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
@Table(name = "Fabricante")
@NamedQueries({
    @NamedQuery(name = "Fabricante.findAll", query = "SELECT f FROM Fabricante f"),
    @NamedQuery(name = "Fabricante.findByIdFabricante", query = "SELECT f FROM Fabricante f WHERE f.idFabricante = :idFabricante"),
    @NamedQuery(name = "Fabricante.findByNombre", query = "SELECT f FROM Fabricante f WHERE f.nombre = :nombre")})
public class Fabricante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Fabricante")
    private Integer idFabricante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFabricante")
    private List<NavegadorWeb> navegadorWebList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFabricante")
    private List<Plataforma> plataformaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFabricante")
    private List<SistemaOperativo> sistemaOperativoList;

    public Fabricante() {
    }

    public Fabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public Fabricante(Integer idFabricante, String nombre) {
        this.idFabricante = idFabricante;
        this.nombre = nombre;
    }

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<NavegadorWeb> getNavegadorWebList() {
        return navegadorWebList;
    }

    public void setNavegadorWebList(List<NavegadorWeb> navegadorWebList) {
        this.navegadorWebList = navegadorWebList;
    }

    public List<Plataforma> getPlataformaList() {
        return plataformaList;
    }

    public void setPlataformaList(List<Plataforma> plataformaList) {
        this.plataformaList = plataformaList;
    }

    public List<SistemaOperativo> getSistemaOperativoList() {
        return sistemaOperativoList;
    }

    public void setSistemaOperativoList(List<SistemaOperativo> sistemaOperativoList) {
        this.sistemaOperativoList = sistemaOperativoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFabricante != null ? idFabricante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricante)) {
            return false;
        }
        Fabricante other = (Fabricante) object;
        if ((this.idFabricante == null && other.idFabricante != null) || (this.idFabricante != null && !this.idFabricante.equals(other.idFabricante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Fabricante[ idFabricante=" + idFabricante + " ]";
    }
    
}
