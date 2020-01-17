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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "NavegadorWeb")
@NamedQueries({
    @NamedQuery(name = "NavegadorWeb.findAll", query = "SELECT n FROM NavegadorWeb n"),
    @NamedQuery(name = "NavegadorWeb.findByIdNavegadorWeb", query = "SELECT n FROM NavegadorWeb n WHERE n.idNavegadorWeb = :idNavegadorWeb"),
    @NamedQuery(name = "NavegadorWeb.findByNombre", query = "SELECT n FROM NavegadorWeb n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "NavegadorWeb.findByVersion", query = "SELECT n FROM NavegadorWeb n WHERE n.version = :version")})
public class NavegadorWeb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_NavegadorWeb")
    private Integer idNavegadorWeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "version")
    private String version;
    @JoinColumn(name = "id_Fabricante", referencedColumnName = "id_Fabricante")
    @ManyToOne(optional = false)
    private Fabricante idFabricante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNavegadorWeb")
    private List<SoftwareXNavegadorWeb> softwareXNavegadorWebList;

    public NavegadorWeb() {
    }

    public NavegadorWeb(Integer idNavegadorWeb) {
        this.idNavegadorWeb = idNavegadorWeb;
    }

    public NavegadorWeb(Integer idNavegadorWeb, String nombre, String version) {
        this.idNavegadorWeb = idNavegadorWeb;
        this.nombre = nombre;
        this.version = version;
    }

    public Integer getIdNavegadorWeb() {
        return idNavegadorWeb;
    }

    public void setIdNavegadorWeb(Integer idNavegadorWeb) {
        this.idNavegadorWeb = idNavegadorWeb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Fabricante getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Fabricante idFabricante) {
        this.idFabricante = idFabricante;
    }

    public List<SoftwareXNavegadorWeb> getSoftwareXNavegadorWebList() {
        return softwareXNavegadorWebList;
    }

    public void setSoftwareXNavegadorWebList(List<SoftwareXNavegadorWeb> softwareXNavegadorWebList) {
        this.softwareXNavegadorWebList = softwareXNavegadorWebList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNavegadorWeb != null ? idNavegadorWeb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NavegadorWeb)) {
            return false;
        }
        NavegadorWeb other = (NavegadorWeb) object;
        if ((this.idNavegadorWeb == null && other.idNavegadorWeb != null) || (this.idNavegadorWeb != null && !this.idNavegadorWeb.equals(other.idNavegadorWeb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.NavegadorWeb[ idNavegadorWeb=" + idNavegadorWeb + " ]";
    }
    
}
