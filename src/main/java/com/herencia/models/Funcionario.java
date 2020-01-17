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
@Table(name = "Funcionario")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByIdFuncionario", query = "SELECT f FROM Funcionario f WHERE f.idFuncionario = :idFuncionario"),
    @NamedQuery(name = "Funcionario.findByNombreUsuario", query = "SELECT f FROM Funcionario f WHERE f.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Funcionario.findByPassword", query = "SELECT f FROM Funcionario f WHERE f.password = :password"),
    @NamedQuery(name = "Funcionario.findByTipo", query = "SELECT f FROM Funcionario f WHERE f.tipo = :tipo")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Funcionario")
    private Integer idFuncionario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "id_AreaFuncional", referencedColumnName = "id_AreaFuncional")
    @ManyToOne(optional = false)
    private AreaFuncional idAreaFuncional;
    @JoinColumn(name = "id_Persona", referencedColumnName = "id_Persona")
    @ManyToOne(optional = false)
    private Persona idPersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdmin")
    private List<Plataforma> plataformaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperador")
    private List<Plataforma> plataformaList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAprobador")
    private List<Requerimiento> requerimientoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSolicitante")
    private List<Requerimiento> requerimientoList1;

    public Funcionario() {
    }

    public Funcionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcionario(Integer idFuncionario, String nombreUsuario, String password, String tipo) {
        this.idFuncionario = idFuncionario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipo = tipo;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public AreaFuncional getIdAreaFuncional() {
        return idAreaFuncional;
    }

    public void setIdAreaFuncional(AreaFuncional idAreaFuncional) {
        this.idAreaFuncional = idAreaFuncional;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public List<Plataforma> getPlataformaList() {
        return plataformaList;
    }

    public void setPlataformaList(List<Plataforma> plataformaList) {
        this.plataformaList = plataformaList;
    }

    public List<Plataforma> getPlataformaList1() {
        return plataformaList1;
    }

    public void setPlataformaList1(List<Plataforma> plataformaList1) {
        this.plataformaList1 = plataformaList1;
    }

    public List<Requerimiento> getRequerimientoList() {
        return requerimientoList;
    }

    public void setRequerimientoList(List<Requerimiento> requerimientoList) {
        this.requerimientoList = requerimientoList;
    }

    public List<Requerimiento> getRequerimientoList1() {
        return requerimientoList1;
    }

    public void setRequerimientoList1(List<Requerimiento> requerimientoList1) {
        this.requerimientoList1 = requerimientoList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuncionario != null ? idFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.idFuncionario == null && other.idFuncionario != null) || (this.idFuncionario != null && !this.idFuncionario.equals(other.idFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.herencia.models.Funcionario[ idFuncionario=" + idFuncionario + " ]";
    }
    
}
