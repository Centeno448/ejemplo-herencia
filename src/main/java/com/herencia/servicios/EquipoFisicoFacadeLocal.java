/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.EquipoFisico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface EquipoFisicoFacadeLocal {

    void create(EquipoFisico equipoFisico);

    void edit(EquipoFisico equipoFisico);

    void remove(EquipoFisico equipoFisico);

    EquipoFisico find(Object id);

    List<EquipoFisico> findAll();

    List<EquipoFisico> findRange(int[] range);

    int count();
    
}
