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
@Table(name = "MotorBaseDeDatos")
@NamedQueries({
    @NamedQuery(name = "MotorBaseDeDatos.findAll", query = "SELECT m FROM MotorBaseDeDatos m"),
    @NamedQuery(name = "MotorBaseDeDatos.findByIdMotorBaseDeDatos", query = "SELECT m FROM MotorBaseDeDatos m WHERE m.idMotorBaseDeDatos = :idMotorBaseDeDatos"),
    @NamedQuery(name = "MotorBaseDeDatos.findByNombre", query = "SELECT m FROM MotorBaseDeDatos m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "MotorBaseDeDatos.findByVersion", query = "SELECT m FROM MotorBaseDeDatos m WHERE m.version = :version")})
public class MotorBaseDeDatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_MotorBaseDeDatos")
    private Integer idMotorBaseDeDatos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "version")
    private String version;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMotorBaseDeDatos")
    private List<InstanciaBaseDeDatos> instanciaBaseDeDatosList;
    @JoinColumn(name = "id_Equipo", referencedColumnName = "id_Equipo")
    @ManyToOne(optional = false)
    private Equipo idEquipo;

    public MotorBaseDeDatos() {
    }

    public MotorBaseDeDatos(Integer idMotorBaseDeDatos) {
        this.idMotorBaseDeDatos = idMotorBaseDeDatos;
    }

    public MotorBaseDeDatos(Integer idMotorBaseDeDatos, String nombre, String version) {
        this.idMotorBaseDeDatos = idMotorBaseDeDatos;
        this.nombre = nombre;
        this.version = version;
    }

    public Integer getIdMotorBaseDeDatos() {
        return idMotorBaseDeDatos;
    }

    public void setIdMotorBaseDeDatos(Integer idMotorBaseDeDatos) {
        this.idMotorBaseDeDatos = idMotorBaseDeDatos;
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

    public List<InstanciaBaseDeDatos> getInstanciaBaseDeDatosList() {
        return instanciaBaseDeDatosList;
    }

    public void setInstanciaBaseDeDatosList(List<InstanciaBaseDeDatos> instanciaBaseDeDatosList) {
        this.instanciaBaseDeDatosList = instanciaBaseDeDatosList;
    }

    public Equipo getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipo idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMotorBaseDeDatos != null ? idMotorBaseDeDatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotorBaseDeDatos)) {
            return false;
        }
        MotorBaseDeDatos other = (MotorBaseDeDatos) object;
        if ((this.idMotorBaseDeDatos == null && other.idMotorBaseDeDatos != null) || (this.idMotorBaseDeDatos != null && !this.idMotorBaseDeDatos.equals(other.idMotorBaseDeDatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.MotorBaseDeDatos[ idMotorBaseDeDatos=" + idMotorBaseDeDatos + " ]";
    }
    
}
