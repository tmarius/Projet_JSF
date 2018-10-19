/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Explication;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface ExplicationFacadeLocal {

    void create(Explication explication);

    void edit(Explication explication);

    void remove(Explication explication);

    Explication find(Object id);

    List<Explication> findAll();

    List<Explication> findRange(int[] range);

    int count();
    
}
