/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.Dominio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface DominioFacadeLocal {

    void create(Dominio dominio);

    void edit(Dominio dominio);

    void remove(Dominio dominio);

    Dominio find(Object id);

    List<Dominio> findAll();

    List<Dominio> findRange(int[] range);

    int count();
    
}
