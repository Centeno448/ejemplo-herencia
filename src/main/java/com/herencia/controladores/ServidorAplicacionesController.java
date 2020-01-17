/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.controladores;

import com.herencia.models.Equipo;
import com.herencia.models.Fabricante;
import com.herencia.models.Funcionario;
import com.herencia.models.Plataforma;
import com.herencia.models.ServidorDeAplicaciones;
import com.herencia.models.Software;
import com.herencia.models.TipoPlataforma;
import com.herencia.servicios.EquipoFacadeLocal;
import com.herencia.servicios.FabricanteFacadeLocal;
import com.herencia.servicios.FuncionarioFacadeLocal;
import com.herencia.servicios.ServidorDeAplicacionesFacadeLocal;
import com.herencia.servicios.SoftwareFacadeLocal;
import com.herencia.servicios.TipoPlataformaFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author diego
 */

@Named("servidorController")
@ViewScoped
public class ServidorAplicacionesController implements Serializable{
    
    @EJB
    private ServidorDeAplicacionesFacadeLocal servidoresEJB;
    
    // Maybe Unecessary
    @EJB
    private TipoPlataformaFacadeLocal tipoEJB;
    
    @EJB
    private FuncionarioFacadeLocal funcionarioEJB;
    
    @EJB
    private FabricanteFacadeLocal fabricanteEJB;
    
    @EJB
    private EquipoFacadeLocal equipoEJB;
    
    @EJB
    private SoftwareFacadeLocal softwareEJB;
    
    private List<ServidorDeAplicaciones> listaServidores;
    
    private List<Funcionario> listaFuncionarios;
    
    private List<Fabricante> listaFabricantes;
    
    private List<Equipo> listaEquipos;
    
    private List<Software> listaSoftware;
    
    private List<TipoPlataforma> listaTiposPlataforma;
    
    private ServidorDeAplicaciones servidor;
    
    private Plataforma plataforma;
    
    @PostConstruct
    public void init() {
        this.servidor = new ServidorDeAplicaciones();
        this.plataforma = new Plataforma();
        this.listaServidores = servidoresEJB.findAll();
        this.listaFuncionarios = funcionarioEJB.findAll();
        this.listaFabricantes = fabricanteEJB.findAll();
        this.listaEquipos = equipoEJB.findAll();
        this.listaSoftware = softwareEJB.findAll();
        this.listaTiposPlataforma = tipoEJB.findAll();
    }

    public List<ServidorDeAplicaciones> getListaServidores() {
        return listaServidores;
    }

    public void setListaServidores(List<ServidorDeAplicaciones> listaServidores) {
        this.listaServidores = listaServidores;
    }

    public List<TipoPlataforma> getListaTiposPlataforma() {
        return listaTiposPlataforma;
    }

    public void setListaTiposPlataforma(List<TipoPlataforma> listaTiposPlataforma) {
        this.listaTiposPlataforma = listaTiposPlataforma;
    }
    

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public List<Fabricante> getListaFabricantes() {
        return listaFabricantes;
    }

    public void setListaFabricantes(List<Fabricante> listaFabricantes) {
        this.listaFabricantes = listaFabricantes;
    }

    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public List<Software> getListaSoftware() {
        return listaSoftware;
    }

    public void setListaSoftware(List<Software> listaSoftware) {
        this.listaSoftware = listaSoftware;
    }

    public ServidorDeAplicaciones getServidor() {
        return servidor;
    }

    public void setServidor(ServidorDeAplicaciones servidor) {
        this.servidor = servidor;
    }
    
    public void editListener(RowEditEvent event) {
        try{
            ServidorDeAplicaciones servidorEditado = (ServidorDeAplicaciones) event.getObject();
            servidoresEJB.edit(servidorEditado);
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Servidor editado"
                    + " exitosamente."));
        } 
        catch(Exception ex) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "No se pudo editar"
                    + " el Servidor.\nError: " + ex.getMessage()));
        }
    }
    
    public void registrarServidor(){
        try{
            this.servidor.setIdPlataforma(this.plataforma);
            servidoresEJB.create(this.servidor);
            this.servidor = null;
            this.init();
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Servidor agregada"
                    + " exitosamente."));
        }catch(Exception ex){
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "No se pudo agregar"
                    + " la servidor.\nError: " + ex));
        }
        
    }
    
    public void eliminarServidor() {
        try{
            servidoresEJB.remove(this.servidor);
            this.servidor = null;
            this.init();
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Servidor eliminado"
                    + " exitosamente."));
        }catch(Exception ex) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", "No se pudo eliminar"
                    + " el servidor.\nError: " + ex.getMessage()));
        }
    }
    
    public void reiniciarEntidadSeleccionada(){
        this.servidor = new ServidorDeAplicaciones();
        this.plataforma = new Plataforma();
    }
    
    
    
}
