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
@Table(name = "SistemaOperativo")
@NamedQueries({
    @NamedQuery(name = "SistemaOperativo.findAll", query = "SELECT s FROM SistemaOperativo s"),
    @NamedQuery(name = "SistemaOperativo.findByIdSistemaOperativo", query = "SELECT s FROM SistemaOperativo s WHERE s.idSistemaOperativo = :idSistemaOperativo"),
    @NamedQuery(name = "SistemaOperativo.findByTipo", query = "SELECT s FROM SistemaOperativo s WHERE s.tipo = :tipo"),
    @NamedQuery(name = "SistemaOperativo.findByVersion", query = "SELECT s FROM SistemaOperativo s WHERE s.version = :version"),
    @NamedQuery(name = "SistemaOperativo.findByArquitectura", query = "SELECT s FROM SistemaOperativo s WHERE s.arquitectura = :arquitectura"),
    @NamedQuery(name = "SistemaOperativo.findByLicencia", query = "SELECT s FROM SistemaOperativo s WHERE s.licencia = :licencia"),
    @NamedQuery(name = "SistemaOperativo.findByPlataforma", query = "SELECT s FROM SistemaOperativo s WHERE s.plataforma = :plataforma")})
public class SistemaOperativo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_SistemaOperativo")
    private Integer idSistemaOperativo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "version")
    private String version;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "arquitectura")
    private String arquitectura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "licencia")
    private String licencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "plataforma")
    private String plataforma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSistemaOperativo")
    private List<Equipo> equipoList;
    @JoinColumn(name = "id_Fabricante", referencedColumnName = "id_Fabricante")
    @ManyToOne(optional = false)
    private Fabricante idFabricante;

    public SistemaOperativo() {
    }

    public SistemaOperativo(Integer idSistemaOperativo) {
        this.idSistemaOperativo = idSistemaOperativo;
    }

    public SistemaOperativo(Integer idSistemaOperativo, String tipo, String version, String arquitectura, String licencia, String plataforma) {
        this.idSistemaOperativo = idSistemaOperativo;
        this.tipo = tipo;
        this.version = version;
        this.arquitectura = arquitectura;
        this.licencia = licencia;
        this.plataforma = plataforma;
    }

    public Integer getIdSistemaOperativo() {
        return idSistemaOperativo;
    }

    public void setIdSistemaOperativo(Integer idSistemaOperativo) {
        this.idSistemaOperativo = idSistemaOperativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public Fabricante getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Fabricante idFabricante) {
        this.idFabricante = idFabricante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSistemaOperativo != null ? idSistemaOperativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemaOperativo)) {
            return false;
        }
        SistemaOperativo other = (SistemaOperativo) object;
        if ((this.idSistemaOperativo == null && other.idSistemaOperativo != null) || (this.idSistemaOperativo != null && !this.idSistemaOperativo.equals(other.idSistemaOperativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.SistemaOperativo[ idSistemaOperativo=" + idSistemaOperativo + " ]";
    }
    
}
