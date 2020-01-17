/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.SistemaOperativo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface SistemaOperativoFacadeLocal {

    void create(SistemaOperativo sistemaOperativo);

    void edit(SistemaOperativo sistemaOperativo);

    void remove(SistemaOperativo sistemaOperativo);

    SistemaOperativo find(Object id);

    List<SistemaOperativo> findAll();

    List<SistemaOperativo> findRange(int[] range);

    int count();
    
}
