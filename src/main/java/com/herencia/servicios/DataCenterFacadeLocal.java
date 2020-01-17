/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herencia.servicios;

import com.herencia.models.DataCenter;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author diego
 */
@Local
public interface DataCenterFacadeLocal {

    void create(DataCenter dataCenter);

    void edit(DataCenter dataCenter);

    void remove(DataCenter dataCenter);

    DataCenter find(Object id);

    List<DataCenter> findAll();

    List<DataCenter> findRange(int[] range);

    int count();
    
}
