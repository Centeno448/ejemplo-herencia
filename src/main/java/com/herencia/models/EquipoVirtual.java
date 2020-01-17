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

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EquipoVirtual")
@NamedQueries({
    @NamedQuery(name = "EquipoVirtual.findAll", query = "SELECT e FROM EquipoVirtual e"),
    @NamedQuery(name = "EquipoVirtual.findByIdEquipoVirtual", query = "SELECT e FROM EquipoVirtual e WHERE e.idEquipoVirtual = :idEquipoVirtual"),
    @NamedQuery(name = "EquipoVirtual.findByIdCuchilla", query = "SELECT e FROM EquipoVirtual e WHERE e.idCuchilla = :idCuchilla")})
public class EquipoVirtual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_EquipoVirtual")
    private Integer idEquipoVirtual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_Cuchilla")
    private int idCuchilla;
    @JoinColumn(name = "id_Equipo", referencedColumnName = "id_Equipo")
    @ManyToOne(optional = false)
    private Equipo idEquipo;

    public EquipoVirtual() {
    }

    public EquipoVirtual(Integer idEquipoVirtual) {
        this.idEquipoVirtual = idEquipoVirtual;
    }

    public EquipoVirtual(Integer idEquipoVirtual, int idCuchilla) {
        this.idEquipoVirtual = idEquipoVirtual;
        this.idCuchilla = idCuchilla;
    }

    public Integer getIdEquipoVirtual() {
        return idEquipoVirtual;
    }

    public void setIdEquipoVirtual(Integer idEquipoVirtual) {
        this.idEquipoVirtual = idEquipoVirtual;
    }

    public int getIdCuchilla() {
        return idCuchilla;
    }

    public void setIdCuchilla(int idCuchilla) {
        this.idCuchilla = idCuchilla;
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
        hash += (idEquipoVirtual != null ? idEquipoVirtual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipoVirtual)) {
            return false;
        }
        EquipoVirtual other = (EquipoVirtual) object;
        if ((this.idEquipoVirtual == null && other.idEquipoVirtual != null) || (this.idEquipoVirtual != null && !this.idEquipoVirtual.equals(other.idEquipoVirtual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.EquipoVirtual[ idEquipoVirtual=" + idEquipoVirtual + " ]";
    }
    
}
