/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.TipoPlataforma;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface TipoPlataformaFacadeLocal {

    void create(TipoPlataforma tipoPlataforma);

    void edit(TipoPlataforma tipoPlataforma);

    void remove(TipoPlataforma tipoPlataforma);

    TipoPlataforma find(Object id);

    List<TipoPlataforma> findAll();

    List<TipoPlataforma> findRange(int[] range);

    int count();
    
}
