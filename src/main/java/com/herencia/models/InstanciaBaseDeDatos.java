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
@Table(name = "InstanciaBaseDeDatos")
@NamedQueries({
    @NamedQuery(name = "InstanciaBaseDeDatos.findAll", query = "SELECT i FROM InstanciaBaseDeDatos i"),
    @NamedQuery(name = "InstanciaBaseDeDatos.findByIdInstanciaBaseDeDatos", query = "SELECT i FROM InstanciaBaseDeDatos i WHERE i.idInstanciaBaseDeDatos = :idInstanciaBaseDeDatos"),
    @NamedQuery(name = "InstanciaBaseDeDatos.findByNombre", query = "SELECT i FROM InstanciaBaseDeDatos i WHERE i.nombre = :nombre")})
public class InstanciaBaseDeDatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_InstanciaBaseDeDatos")
    private Integer idInstanciaBaseDeDatos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "id_MotorBaseDeDatos", referencedColumnName = "id_MotorBaseDeDatos")
    @ManyToOne(optional = false)
    private MotorBaseDeDatos idMotorBaseDeDatos;
    @JoinColumn(name = "id_Plataforma", referencedColumnName = "id_Plataforma")
    @ManyToOne(optional = false)
    private Plataforma idPlataforma;

    public InstanciaBaseDeDatos() {
    }

    public InstanciaBaseDeDatos(Integer idInstanciaBaseDeDatos) {
        this.idInstanciaBaseDeDatos = idInstanciaBaseDeDatos;
    }

    public InstanciaBaseDeDatos(Integer idInstanciaBaseDeDatos, String nombre) {
        this.idInstanciaBaseDeDatos = idInstanciaBaseDeDatos;
        this.nombre = nombre;
    }

    public Integer getIdInstanciaBaseDeDatos() {
        return idInstanciaBaseDeDatos;
    }

    public void setIdInstanciaBaseDeDatos(Integer idInstanciaBaseDeDatos) {
        this.idInstanciaBaseDeDatos = idInstanciaBaseDeDatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MotorBaseDeDatos getIdMotorBaseDeDatos() {
        return idMotorBaseDeDatos;
    }

    public void setIdMotorBaseDeDatos(MotorBaseDeDatos idMotorBaseDeDatos) {
        this.idMotorBaseDeDatos = idMotorBaseDeDatos;
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
        hash += (idInstanciaBaseDeDatos != null ? idInstanciaBaseDeDatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstanciaBaseDeDatos)) {
            return false;
        }
        InstanciaBaseDeDatos other = (InstanciaBaseDeDatos) object;
        if ((this.idInstanciaBaseDeDatos == null && other.idInstanciaBaseDeDatos != null) || (this.idInstanciaBaseDeDatos != null && !this.idInstanciaBaseDeDatos.equals(other.idInstanciaBaseDeDatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.InstanciaBaseDeDatos[ idInstanciaBaseDeDatos=" + idInstanciaBaseDeDatos + " ]";
    }
    
}
