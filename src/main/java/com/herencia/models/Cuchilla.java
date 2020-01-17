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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "Cuchilla")
@NamedQueries({
    @NamedQuery(name = "Cuchilla.findAll", query = "SELECT c FROM Cuchilla c"),
    @NamedQuery(name = "Cuchilla.findByIdCuchilla", query = "SELECT c FROM Cuchilla c WHERE c.idCuchilla = :idCuchilla"),
    @NamedQuery(name = "Cuchilla.findByIp", query = "SELECT c FROM Cuchilla c WHERE c.ip = :ip")})
public class Cuchilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Cuchilla")
    private Integer idCuchilla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ip")
    private String ip;
    @JoinColumn(name = "id_EquipoFisico", referencedColumnName = "id_EquipoFisico")
    @ManyToOne(optional = false)
    private EquipoFisico idEquipoFisico;

    public Cuchilla() {
    }

    public Cuchilla(Integer idCuchilla) {
        this.idCuchilla = idCuchilla;
    }

    public Cuchilla(Integer idCuchilla, String ip) {
        this.idCuchilla = idCuchilla;
        this.ip = ip;
    }

    public Integer getIdCuchilla() {
        return idCuchilla;
    }

    public void setIdCuchilla(Integer idCuchilla) {
        this.idCuchilla = idCuchilla;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public EquipoFisico getIdEquipoFisico() {
        return idEquipoFisico;
    }

    public void setIdEquipoFisico(EquipoFisico idEquipoFisico) {
        this.idEquipoFisico = idEquipoFisico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuchilla != null ? idCuchilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuchilla)) {
            return false;
        }
        Cuchilla other = (Cuchilla) object;
        if ((this.idCuchilla == null && other.idCuchilla != null) || (this.idCuchilla != null && !this.idCuchilla.equals(other.idCuchilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Cuchilla[ idCuchilla=" + idCuchilla + " ]";
    }
    
}
