/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.SoftwareXEquipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface SoftwareXEquipoFacadeLocal {

    void create(SoftwareXEquipo softwareXEquipo);

    void edit(SoftwareXEquipo softwareXEquipo);

    void remove(SoftwareXEquipo softwareXEquipo);

    SoftwareXEquipo find(Object id);

    List<SoftwareXEquipo> findAll();

    List<SoftwareXEquipo> findRange(int[] range);

    int count();
    
}
