/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.InstanciaBaseDeDatos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface InstanciaBaseDeDatosFacadeLocal {

    void create(InstanciaBaseDeDatos instanciaBaseDeDatos);

    void edit(InstanciaBaseDeDatos instanciaBaseDeDatos);

    void remove(InstanciaBaseDeDatos instanciaBaseDeDatos);

    InstanciaBaseDeDatos find(Object id);

    List<InstanciaBaseDeDatos> findAll();

    List<InstanciaBaseDeDatos> findRange(int[] range);

    int count();
    
}
