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
@Table(name = "Almacenamiento")
@NamedQueries({
    @NamedQuery(name = "Almacenamiento.findAll", query = "SELECT a FROM Almacenamiento a"),
    @NamedQuery(name = "Almacenamiento.findByIdAlmacenamiento", query = "SELECT a FROM Almacenamiento a WHERE a.idAlmacenamiento = :idAlmacenamiento"),
    @NamedQuery(name = "Almacenamiento.findByLicencia", query = "SELECT a FROM Almacenamiento a WHERE a.licencia = :licencia")})
public class Almacenamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Almacenamiento")
    private Integer idAlmacenamiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "licencia")
    private String licencia;
    @JoinColumn(name = "id_EquipoFisico", referencedColumnName = "id_EquipoFisico")
    @ManyToOne(optional = false)
    private EquipoFisico idEquipoFisico;

    public Almacenamiento() {
    }

    public Almacenamiento(Integer idAlmacenamiento) {
        this.idAlmacenamiento = idAlmacenamiento;
    }

    public Almacenamiento(Integer idAlmacenamiento, String licencia) {
        this.idAlmacenamiento = idAlmacenamiento;
        this.licencia = licencia;
    }

    public Integer getIdAlmacenamiento() {
        return idAlmacenamiento;
    }

    public void setIdAlmacenamiento(Integer idAlmacenamiento) {
        this.idAlmacenamiento = idAlmacenamiento;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
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
        hash += (idAlmacenamiento != null ? idAlmacenamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Almacenamiento)) {
            return false;
        }
        Almacenamiento other = (Almacenamiento) object;
        if ((this.idAlmacenamiento == null && other.idAlmacenamiento != null) || (this.idAlmacenamiento != null && !this.idAlmacenamiento.equals(other.idAlmacenamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Almacenamiento[ idAlmacenamiento=" + idAlmacenamiento + " ]";
    }
    
}
