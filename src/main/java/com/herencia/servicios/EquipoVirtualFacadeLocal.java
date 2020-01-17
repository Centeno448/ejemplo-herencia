/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.EquipoVirtual;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface EquipoVirtualFacadeLocal {

    void create(EquipoVirtual equipoVirtual);

    void edit(EquipoVirtual equipoVirtual);

    void remove(EquipoVirtual equipoVirtual);

    EquipoVirtual find(Object id);

    List<EquipoVirtual> findAll();

    List<EquipoVirtual> findRange(int[] range);

    int count();
    
}
