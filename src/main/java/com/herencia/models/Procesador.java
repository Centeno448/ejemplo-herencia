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
@Table(name = "Procesador")
@NamedQueries({
    @NamedQuery(name = "Procesador.findAll", query = "SELECT p FROM Procesador p"),
    @NamedQuery(name = "Procesador.findByIdProcesador", query = "SELECT p FROM Procesador p WHERE p.idProcesador = :idProcesador"),
    @NamedQuery(name = "Procesador.findByTipoTecnologia", query = "SELECT p FROM Procesador p WHERE p.tipoTecnologia = :tipoTecnologia"),
    @NamedQuery(name = "Procesador.findByNucleo", query = "SELECT p FROM Procesador p WHERE p.nucleo = :nucleo"),
    @NamedQuery(name = "Procesador.findByCache", query = "SELECT p FROM Procesador p WHERE p.cache = :cache"),
    @NamedQuery(name = "Procesador.findByVelocidad", query = "SELECT p FROM Procesador p WHERE p.velocidad = :velocidad"),
    @NamedQuery(name = "Procesador.findByMemoria", query = "SELECT p FROM Procesador p WHERE p.memoria = :memoria")})
public class Procesador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Procesador")
    private Integer idProcesador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "tipoTecnologia")
    private String tipoTecnologia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nucleo")
    private String nucleo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cache")
    private String cache;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "velocidad")
    private String velocidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "memoria")
    private String memoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProcesador")
    private List<Equipo> equipoList;

    public Procesador() {
    }

    public Procesador(Integer idProcesador) {
        this.idProcesador = idProcesador;
    }

    public Procesador(Integer idProcesador, String tipoTecnologia, String nucleo, String cache, String velocidad, String memoria) {
        this.idProcesador = idProcesador;
        this.tipoTecnologia = tipoTecnologia;
        this.nucleo = nucleo;
        this.cache = cache;
        this.velocidad = velocidad;
        this.memoria = memoria;
    }

    public Integer getIdProcesador() {
        return idProcesador;
    }

    public void setIdProcesador(Integer idProcesador) {
        this.idProcesador = idProcesador;
    }

    public String getTipoTecnologia() {
        return tipoTecnologia;
    }

    public void setTipoTecnologia(String tipoTecnologia) {
        this.tipoTecnologia = tipoTecnologia;
    }

    public String getNucleo() {
        return nucleo;
    }

    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
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
        hash += (idProcesador != null ? idProcesador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procesador)) {
            return false;
        }
        Procesador other = (Procesador) object;
        if ((this.idProcesador == null && other.idProcesador != null) || (this.idProcesador != null && !this.idProcesador.equals(other.idProcesador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Procesador[ idProcesador=" + idProcesador + " ]";
    }
    
}
