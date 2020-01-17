/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.InstanciaBaseDeDatos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author diego
 */
@Stateless
public class InstanciaBaseDeDatosFacade extends AbstractFacade<InstanciaBaseDeDatos> implements InstanciaBaseDeDatosFacadeLocal {

    @PersistenceContext(unitName = "herenciaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InstanciaBaseDeDatosFacade() {
        super(InstanciaBaseDeDatos.class);
    }
    
}
