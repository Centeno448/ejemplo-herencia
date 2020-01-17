/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.MotorBaseDeDatos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface MotorBaseDeDatosFacadeLocal {

    void create(MotorBaseDeDatos motorBaseDeDatos);

    void edit(MotorBaseDeDatos motorBaseDeDatos);

    void remove(MotorBaseDeDatos motorBaseDeDatos);

    MotorBaseDeDatos find(Object id);

    List<MotorBaseDeDatos> findAll();

    List<MotorBaseDeDatos> findRange(int[] range);

    int count();
    
}
