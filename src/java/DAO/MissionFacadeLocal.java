/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Mission;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface MissionFacadeLocal {

    void create(Mission mission);

    void edit(Mission mission);

    void remove(Mission mission);

    Mission find(Object id);

    List<Mission> findAll();

    List<Mission> findRange(int[] range);

    int count();
    
}
