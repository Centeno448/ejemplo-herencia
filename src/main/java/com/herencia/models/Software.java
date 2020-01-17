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
@Table(name = "Software")
@NamedQueries({
    @NamedQuery(name = "Software.findAll", query = "SELECT s FROM Software s"),
    @NamedQuery(name = "Software.findByIdSoftware", query = "SELECT s FROM Software s WHERE s.idSoftware = :idSoftware"),
    @NamedQuery(name = "Software.findByNombre", query = "SELECT s FROM Software s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Software.findByWeb", query = "SELECT s FROM Software s WHERE s.web = :web"),
    @NamedQuery(name = "Software.findByVersion", query = "SELECT s FROM Software s WHERE s.version = :version"),
    @NamedQuery(name = "Software.findByDescripcion", query = "SELECT s FROM Software s WHERE s.descripcion = :descripcion"),
    @NamedQuery(name = "Software.findByPath", query = "SELECT s FROM Software s WHERE s.path = :path"),
    @NamedQuery(name = "Software.findByNumUsers", query = "SELECT s FROM Software s WHERE s.numUsers = :numUsers")})
public class Software implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Software")
    private Integer idSoftware;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "web")
    private boolean web;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "version")
    private String version;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "path")
    private String path;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numUsers")
    private int numUsers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSoftware")
    private List<SoftwareXEquipo> softwareXEquipoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSoftware")
    private List<Plataforma> plataformaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSoftware")
    private List<SoftwareXNavegadorWeb> softwareXNavegadorWebList;
    @JoinColumn(name = "id_Clasificacion", referencedColumnName = "id_Clasificacion")
    @ManyToOne(optional = false)
    private Clasificacion idClasificacion;
    @JoinColumn(name = "id_Ambito", referencedColumnName = "id_Ambito")
    @ManyToOne(optional = false)
    private Ambito idAmbito;
    @JoinColumn(name = "id_AreaFuncional", referencedColumnName = "id_AreaFuncional")
    @ManyToOne(optional = false)
    private AreaFuncional idAreaFuncional;
    @JoinColumn(name = "id_Dominio", referencedColumnName = "id_Dominio")
    @ManyToOne(optional = false)
    private Dominio idDominio;
    @JoinColumn(name = "id_Lenguaje", referencedColumnName = "id_Lenguaje")
    @ManyToOne(optional = false)
    private Lenguaje idLenguaje;

    public Software() {
    }

    public Software(Integer idSoftware) {
        this.idSoftware = idSoftware;
    }

    public Software(Integer idSoftware, String nombre, boolean web, String version, String descripcion, String path, int numUsers) {
        this.idSoftware = idSoftware;
        this.nombre = nombre;
        this.web = web;
        this.version = version;
        this.descripcion = descripcion;
        this.path = path;
        this.numUsers = numUsers;
    }

    public Integer getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(Integer idSoftware) {
        this.idSoftware = idSoftware;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getNumUsers() {
        return numUsers;
    }

    public void setNumUsers(int numUsers) {
        this.numUsers = numUsers;
    }

    public List<SoftwareXEquipo> getSoftwareXEquipoList() {
        return softwareXEquipoList;
    }

    public void setSoftwareXEquipoList(List<SoftwareXEquipo> softwareXEquipoList) {
        this.softwareXEquipoList = softwareXEquipoList;
    }

    public List<Plataforma> getPlataformaList() {
        return plataformaList;
    }

    public void setPlataformaList(List<Plataforma> plataformaList) {
        this.plataformaList = plataformaList;
    }

    public List<SoftwareXNavegadorWeb> getSoftwareXNavegadorWebList() {
        return softwareXNavegadorWebList;
    }

    public void setSoftwareXNavegadorWebList(List<SoftwareXNavegadorWeb> softwareXNavegadorWebList) {
        this.softwareXNavegadorWebList = softwareXNavegadorWebList;
    }

    public Clasificacion getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Clasificacion idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public Ambito getIdAmbito() {
        return idAmbito;
    }

    public void setIdAmbito(Ambito idAmbito) {
        this.idAmbito = idAmbito;
    }

    public AreaFuncional getIdAreaFuncional() {
        return idAreaFuncional;
    }

    public void setIdAreaFuncional(AreaFuncional idAreaFuncional) {
        this.idAreaFuncional = idAreaFuncional;
    }

    public Dominio getIdDominio() {
        return idDominio;
    }

    public void setIdDominio(Dominio idDominio) {
        this.idDominio = idDominio;
    }

    public Lenguaje getIdLenguaje() {
        return idLenguaje;
    }

    public void setIdLenguaje(Lenguaje idLenguaje) {
        this.idLenguaje = idLenguaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSoftware != null ? idSoftware.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Software)) {
            return false;
        }
        Software other = (Software) object;
        if ((this.idSoftware == null && other.idSoftware != null) || (this.idSoftware != null && !this.idSoftware.equals(other.idSoftware))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Software[ idSoftware=" + idSoftware + " ]";
    }
    
}
