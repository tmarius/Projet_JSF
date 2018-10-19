/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.RetourMission;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface RetourMissionFacadeLocal {

    void create(RetourMission retourMission);

    void edit(RetourMission retourMission);

    void remove(RetourMission retourMission);

    RetourMission find(Object id);

    List<RetourMission> findAll();

    List<RetourMission> findRange(int[] range);

    int count();
    
}
