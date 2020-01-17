/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.Cuchilla;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface CuchillaFacadeLocal {

    void create(Cuchilla cuchilla);

    void edit(Cuchilla cuchilla);

    void remove(Cuchilla cuchilla);

    Cuchilla find(Object id);

    List<Cuchilla> findAll();

    List<Cuchilla> findRange(int[] range);

    int count();
    
}
