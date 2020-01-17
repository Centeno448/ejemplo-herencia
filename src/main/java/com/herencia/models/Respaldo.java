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
@Table(name = "Respaldo")
@NamedQueries({
    @NamedQuery(name = "Respaldo.findAll", query = "SELECT r FROM Respaldo r"),
    @NamedQuery(name = "Respaldo.findByIdRespaldo", query = "SELECT r FROM Respaldo r WHERE r.idRespaldo = :idRespaldo"),
    @NamedQuery(name = "Respaldo.findByTipo", query = "SELECT r FROM Respaldo r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "Respaldo.findByPeriodicidad", query = "SELECT r FROM Respaldo r WHERE r.periodicidad = :periodicidad"),
    @NamedQuery(name = "Respaldo.findByTiempoHistorico", query = "SELECT r FROM Respaldo r WHERE r.tiempoHistorico = :tiempoHistorico"),
    @NamedQuery(name = "Respaldo.findByLugar", query = "SELECT r FROM Respaldo r WHERE r.lugar = :lugar"),
    @NamedQuery(name = "Respaldo.findByObservacion", query = "SELECT r FROM Respaldo r WHERE r.observacion = :observacion")})
public class Respaldo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Respaldo")
    private Integer idRespaldo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "periodicidad")
    private String periodicidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tiempoHistorico")
    private String tiempoHistorico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "lugar")
    private String lugar;
    @Size(max = 45)
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "id_Plataforma", referencedColumnName = "id_Plataforma")
    @ManyToOne(optional = false)
    private Plataforma idPlataforma;

    public Respaldo() {
    }

    public Respaldo(Integer idRespaldo) {
        this.idRespaldo = idRespaldo;
    }

    public Respaldo(Integer idRespaldo, String tipo, String periodicidad, String tiempoHistorico, String lugar) {
        this.idRespaldo = idRespaldo;
        this.tipo = tipo;
        this.periodicidad = periodicidad;
        this.tiempoHistorico = tiempoHistorico;
        this.lugar = lugar;
    }

    public Integer getIdRespaldo() {
        return idRespaldo;
    }

    public void setIdRespaldo(Integer idRespaldo) {
        this.idRespaldo = idRespaldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getTiempoHistorico() {
        return tiempoHistorico;
    }

    public void setTiempoHistorico(String tiempoHistorico) {
        this.tiempoHistorico = tiempoHistorico;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
        hash += (idRespaldo != null ? idRespaldo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Respaldo)) {
            return false;
        }
        Respaldo other = (Respaldo) object;
        if ((this.idRespaldo == null && other.idRespaldo != null) || (this.idRespaldo != null && !this.idRespaldo.equals(other.idRespaldo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Respaldo[ idRespaldo=" + idRespaldo + " ]";
    }
    
}
