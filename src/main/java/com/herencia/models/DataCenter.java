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
@Table(name = "DataCenter")
@NamedQueries({
    @NamedQuery(name = "DataCenter.findAll", query = "SELECT d FROM DataCenter d"),
    @NamedQuery(name = "DataCenter.findByIdDataCenter", query = "SELECT d FROM DataCenter d WHERE d.idDataCenter = :idDataCenter"),
    @NamedQuery(name = "DataCenter.findBySector", query = "SELECT d FROM DataCenter d WHERE d.sector = :sector"),
    @NamedQuery(name = "DataCenter.findByArea", query = "SELECT d FROM DataCenter d WHERE d.area = :area"),
    @NamedQuery(name = "DataCenter.findByCallePrincipal", query = "SELECT d FROM DataCenter d WHERE d.callePrincipal = :callePrincipal"),
    @NamedQuery(name = "DataCenter.findByCalleSecundaria", query = "SELECT d FROM DataCenter d WHERE d.calleSecundaria = :calleSecundaria"),
    @NamedQuery(name = "DataCenter.findByNumero", query = "SELECT d FROM DataCenter d WHERE d.numero = :numero"),
    @NamedQuery(name = "DataCenter.findByDescripcion", query = "SELECT d FROM DataCenter d WHERE d.descripcion = :descripcion")})
public class DataCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_DataCenter")
    private Integer idDataCenter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sector")
    private String sector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "area")
    private String area;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "callePrincipal")
    private String callePrincipal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "calleSecundaria")
    private String calleSecundaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numero")
    private String numero;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDataCenter")
    private List<Equipo> equipoList;

    public DataCenter() {
    }

    public DataCenter(Integer idDataCenter) {
        this.idDataCenter = idDataCenter;
    }

    public DataCenter(Integer idDataCenter, String sector, String area, String callePrincipal, String calleSecundaria, String numero) {
        this.idDataCenter = idDataCenter;
        this.sector = sector;
        this.area = area;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numero = numero;
    }

    public Integer getIdDataCenter() {
        return idDataCenter;
    }

    public void setIdDataCenter(Integer idDataCenter) {
        this.idDataCenter = idDataCenter;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDataCenter != null ? idDataCenter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataCenter)) {
            return false;
        }
        DataCenter other = (DataCenter) object;
        if ((this.idDataCenter == null && other.idDataCenter != null) || (this.idDataCenter != null && !this.idDataCenter.equals(other.idDataCenter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.DataCenter[ idDataCenter=" + idDataCenter + " ]";
    }
    
}
