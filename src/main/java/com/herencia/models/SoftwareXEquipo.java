/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.models;

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

/**
 *
 * @author diego
 */
@Entity
@Table(name = "SoftwareXEquipo")
@NamedQueries({
    @NamedQuery(name = "SoftwareXEquipo.findAll", query = "SELECT s FROM SoftwareXEquipo s"),
    @NamedQuery(name = "SoftwareXEquipo.findByIdSoftwareXEquipo", query = "SELECT s FROM SoftwareXEquipo s WHERE s.idSoftwareXEquipo = :idSoftwareXEquipo")})
public class SoftwareXEquipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_SoftwareXEquipo")
    private Integer idSoftwareXEquipo;
    @JoinColumn(name = "id_Equipo", referencedColumnName = "id_Equipo")
    @ManyToOne(optional = false)
    private Equipo idEquipo;
    @JoinColumn(name = "id_Software", referencedColumnName = "id_Software")
    @ManyToOne(optional = false)
    private Software idSoftware;

    public SoftwareXEquipo() {
    }

    public SoftwareXEquipo(Integer idSoftwareXEquipo) {
        this.idSoftwareXEquipo = idSoftwareXEquipo;
    }

    public Integer getIdSoftwareXEquipo() {
        return idSoftwareXEquipo;
    }

    public void setIdSoftwareXEquipo(Integer idSoftwareXEquipo) {
        this.idSoftwareXEquipo = idSoftwareXEquipo;
    }

    public Equipo getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipo idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Software getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(Software idSoftware) {
        this.idSoftware = idSoftware;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSoftwareXEquipo != null ? idSoftwareXEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoftwareXEquipo)) {
            return false;
        }
        SoftwareXEquipo other = (SoftwareXEquipo) object;
        if ((this.idSoftwareXEquipo == null && other.idSoftwareXEquipo != null) || (this.idSoftwareXEquipo != null && !this.idSoftwareXEquipo.equals(other.idSoftwareXEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.SoftwareXEquipo[ idSoftwareXEquipo=" + idSoftwareXEquipo + " ]";
    }
    
}
