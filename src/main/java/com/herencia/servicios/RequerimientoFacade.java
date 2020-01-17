/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.Requerimiento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author diego
 */
@Stateless
public class RequerimientoFacade extends AbstractFacade<Requerimiento> implements RequerimientoFacadeLocal {

    @PersistenceContext(unitName = "herenciaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RequerimientoFacade() {
        super(Requerimiento.class);
    }
    
}
